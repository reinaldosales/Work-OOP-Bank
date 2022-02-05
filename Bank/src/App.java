import Class.Utils;
public class App {
    public static void main(String[] args) {

        Boolean control = true;

        try {
            Utils.generateOperationLog("Aplicação inicialiada");
        } catch (Exception e) {

        }

        while (control) {
            String menuOption = Utils.showMenuAndGetOption();

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
}
