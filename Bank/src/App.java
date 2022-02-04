import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Boolean control = true;

        while (control) {
            String menuOption = showMenuAndGetOption();

            switch (menuOption) {
                case "1":
                    break;

                case "2":
                    break;

                case "3":
                    break;

                case "4":
                    break;

                case "5":
                    break;

                case "6":
                    break;

                case "7":
                    break;

                case "8":
                    break;

                case "9":
                    break;
                case "10":
                    System.out.println("Encerrando a sessão...");
                    control = false;
                    break;
                default:
                
                    break;
            }
        }

    }

    
    /** 
     * Esse método ele imprime o Menu no console,
     * bem como ele também pega o valor que usário digitar.
     * 
     * @return a opção que o usuário escolheu.
     */
    public static String showMenuAndGetOption() {
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

        String menuOption = input.nextLine();

        return menuOption.toString();
    }

}
