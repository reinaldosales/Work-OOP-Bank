import java.util.ArrayList;

public abstract class Account {
    private static int codigo = 0;
    private String nome;
    private String email;
    private Boolean ativa = true;

    private ArrayList<Movement> move;

    public Account(String nome, String email, boolean ativa) {
        this.nome = nome;
        this.email = email;
        this.ativa = ativa;
        move = new ArrayList<Movement>();
    }

    public void geradorCodigo() {
        codigo++;
    }

    public void addMovement(Movement m) {
        move.add(m);
    }

    public abstract void saque(double valor);

    public abstract void deposito(double valor);

    @Override
    public String toString() {
        String s;
        s = String.format("Codigo: %05d Nome: %s Email: %s Ativo %b", nome, email, codigo, ativa);
        return s;
    }
}
