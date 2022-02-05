package Class;

public class AccountCompanyPerson extends Account{
    public String taxNumber;
    private String stateRegistration;
    private double balance;

    public AccountCompanyPerson(int id, String name, String mail, String taxNumber, String stateRegistration){
        super(id, name, mail);
        this.taxNumber = taxNumber;
        this.stateRegistration = stateRegistration;
        this.balance = 0.0;
    }

    @Override
    public void deposit(){
        
    }

    @Override
    public void withdraw(){

    }

    /** 
     * Reescrita do método toString, trazendo todos os
     * dados da conta do tipo Pessoa Juridica.
     * 
     * @return Id, nome do portador, e-mail do portador, CNPJ do portador, Inscrição Estadual, status da conta e saldo.
     */
    @Override
    public String toString() {
        return this.id + " "
        + this.name + " "
        + this.mail + " "
        + this.taxNumber + " "
        + this.stateRegistration + " "
        + this.isActive + " "
        + this.balance;
    }
}
