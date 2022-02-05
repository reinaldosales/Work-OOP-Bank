package Class;

import java.util.Calendar;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Utils {
    public static int generateAccountId(int totalAccounts) {
        totalAccounts = 1; // Alterar ainda!
        int id = 0;

        return id;
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

    public static void generateOperationLog(String msg) throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String creationHour = dateTimeFormatter.format(LocalDateTime.now());
        String file = "operationsLogs.txt";

        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.append(msg + " - " + creationHour);
        bw.newLine();
        bw.close();
    }

}
