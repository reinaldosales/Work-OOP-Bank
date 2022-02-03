import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Boolean controle = true;
        
        while (controle) {
            String opcaoMenu = exibeMenuComValor();

            switch (opcaoMenu) {
                case "1":
                    System.out.println("Adicionar nova conta");
                    
                    break;

                case "2":
                    System.out.println("Buscar conta");
                    break;

                case "3":
                    System.out.println("Saque");
                    break;

                case "4":
                    System.out.println("Depósito");
                    break;

                case "5":
                    System.out.println("Transferência");
                    break;

                case "6":
                    System.out.println("Saldo");
                    break;

                case "7":
                    System.out.println("Emitir extrato");
                    break;

                case "8":
                    System.out.println("Ativar/Desativar conta");
                    break;

                case "9":
                    System.out.println("Emitir lista de contas");
                    break;
                case "10":
                    System.out.println("Encerrando sessão...");
                    controle = false;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }

    }

    public static String exibeMenuComValor() {
        Scanner input = new Scanner(System.in);

        System.out.println(">>>>>>>>>>>> MENU <<<<<<<<<<<<");
        System.out.println("1 - Adicionar nova conta");
        System.out.println("2 - Buscar conta");
        System.out.println("3 - Saque");
        System.out.println("4 - Depósito");
        System.out.println("5 - Transferência");
        System.out.println("6 - Saldo");
        System.out.println("7 - Emitir extrato");
        System.out.println("8 - Ativar/Desativar conta");
        System.out.println("9 - Emitir lista de contas");
        System.out.println("10 - Sair");
        System.out.print("\nEscolha uma opção: ");

        String opcaoMenu = input.nextLine();

        return opcaoMenu.toString();
    }

}
