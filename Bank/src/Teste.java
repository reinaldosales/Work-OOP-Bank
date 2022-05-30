
public class Teste{
    public static void main(String[] args){
        Bank bank = new Bank();
        String nome, email, cpf;
        Scanner input = new Scanner(System.in);

        System.out.println("Nome:");
        nome = input.nextLine();

        System.out.println("email:");
        email = input.nextLine();

        System.out.println("cpf:");
        cpf = input.nextLine();

        PhysicalPersonAccount ppa = new PhysicalPersonAccount(nome, email, cpf);

        bank.accountAdd(ppa);
        System.out.println(bank);

    }
}