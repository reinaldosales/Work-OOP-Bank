public class PhysicalPersonAccount extends Account {
    private String cpf;
    private double saldo = 0;

    public PhysicalPersonAccount(String nome, String email,  String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }
     
    
    @Override
    public void deposito(double valor) {

    }

    @Override
    public void saque(double valor) {
        // TODO Auto-generated method stub

    }
}
