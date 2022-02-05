public class PhysicalPersonAccount extends Account {
    private String cpf;
    private double saldo;

    public PhysicalPersonAccount(String nome, String email, Boolean ativa, String cpf, double saldo) {
        super(nome, email, ativa);
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public void deposito(double valor) {

    }

    @Override
    public void saque(double valor) {
        // TODO Auto-generated method stub

    }
}
