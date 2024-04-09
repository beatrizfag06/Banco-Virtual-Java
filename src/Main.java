import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Tipo da conta: ");
        String conta = sc.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();

        String info = """
                ===============================================
                Dados do cliente: 
                Nome: %s
                Tipo da conta: %s
                Saldo: %.2f
                ===============================================""".formatted(nome, conta, saldo);

        System.out.println(info);

        String menu = """
                
                Operações 
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println(menu);

        System.out.println("Digite a opção desejada: ");
        int opcao = sc.nextInt();

        while (opcao != 4){

            if (opcao == 1){
                System.out.println(String.format("Seu saldo é: %.2f", saldo));

            }else if (opcao == 2 ){
                System.out.println("Digite o valor a ser recebido: ");
                double valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
                System.out.println(String.format("valor atual: = %.2f", saldo));

            }else if (opcao == 3){
                System.out.println("Digite o valor a ser enviado: ");
                double valorEnviar = sc.nextDouble();
                if (valorEnviar > saldo){
                    System.out.println("Não é possível enviar esse valor.");
                }else{
                    saldo -= valorEnviar;
                }

                System.out.println(String.format("Valor atual: %.2f ", saldo));
            }else{
                System.out.println("Opção inválida!");
            }

            System.out.println(menu);

            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
        }
        System.out.println("Agradecemos a preferência!");

    }
}