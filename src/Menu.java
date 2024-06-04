import java.util.Scanner;

public class Menu {
    private Conversao conversao;
    private Scanner leitura;

    public Menu() {
        this.conversao = new Conversao();
        this.leitura = new Scanner(System.in);
    }

    public void iniciarMenu() {
        String escolha = "";

        while (!escolha.equals("7")) {
            System.out.println("*********************************");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Dolar ==>> Peso Argentino \n" +
                    "2 - Peso Argentino =>>> Dolar \n" +
                    "3 - Dolar ==>> Real Brasileiro \n" +
                    "4 - Real Brasileiro ==>> Dolar \n" +
                    "5 - Dolar ==> Peso Boliviano \n" +
                    "6 - Peso Boliviano ==> Dolar \n" +
                    "7 - Sair");
            System.out.println("*********************************");
            escolha = leitura.nextLine();

            switch (escolha) {
                case "1":
                    menuConversao("1");
                break;
                case "2":
                    menuConversao("2");
                    break;
                case "3":
                    menuConversao("3");
                    break;
                case "4":
                    menuConversao("4");
                    break;
                case "5":
                    menuConversao("5");
                    break;
                case "6":
                    menuConversao("6");
                    break;
                case "7":
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }

   }

   private void menuConversao(String opcao) {
       String basecode = "";
       String targetcode = "";
       String valor = "";

        if (opcao.equals("1")) {
            basecode = "USD";
            targetcode = "ARS";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        } else if (opcao.equals("2")) {
            basecode = "ARS";
            targetcode = "USD";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        } else if (opcao.equals("3")) {
            basecode = "USD";
            targetcode = "BRL";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        } else if (opcao.equals("4")) {
            basecode = "BRL";
            targetcode = "USD";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        } else if (opcao.equals("5")) {
            basecode = "USD";
            targetcode = "BOB";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        } else if (opcao.equals("6")) {
            basecode = "BOB";
            targetcode = "USD";
            System.out.println("Digite o valor a ser convertido!");
            valor = leitura.nextLine();
        }

       Moedas resultado = conversao.converterMoeda(basecode, targetcode, valor);
       System.out.println(resultado);
   }
}
