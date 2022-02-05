package Class;

public class AccountLegalPerson extends Account {
    private String socialSecurity;
    private double balance;

    public AccountLegalPerson(int id, String name, String mail, String socialSecurity){
        super(id, name, mail);
        this.socialSecurity = socialSecurity;
        this.balance = 0.0;
    }


    @Override
    public void deposit(int accountId, double amount) {
        Account account = new Bank().getAccountById(accountId);
        if(account != null) {
            if(account instanceof AccountLegalPerson){
                balance += amount;
            }
        }
    }

    @Override
    public void withdraw(int accountId, double amount){
        Account account = new Bank().getAccountById(accountId);
        if(account != null) {
            if(account instanceof AccountLegalPerson){
                balance -= amount;   
            }
        }
    }

    
    /** 
     * Reescrita do método toString, trazendo todos os
     * dados da conta do tipo Pessoa Física.
     * 
     * @return Id, nome do portador, e-mail do portador, CPF do portador, status da conta e saldo.
     */
    @Override
    public String toString() {
        return this.id + " "
        + this.name + " "
        + this.mail + " "
        + this.socialSecurity + " "
        + this.isActive + " "
        + this.balance;
    }
}
