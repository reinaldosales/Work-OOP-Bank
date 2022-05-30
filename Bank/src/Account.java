public abstract class Account {
    private static int codigo = 0;
    private String nome;
    private String email;
    private Boolean ativa = true;

    private ArrayList<Movement> movementList;
    private Movement movement;

    public Account(String nome, String email) {
        this.nome = nome;
        this.email = email;
        movementList = new ArrayList<Movement>();
        movement = new Movement();
    }    
    
    public String getNome(){
        return nome;
    }

    public int getCode(){
        return codigo;
    }
    
    public void geradorCodigo() {
        codigo++;
    }

    public void addMovement(movement) {
        movementList.add(movement);
    }

    public abstract void saque(double valor);

    public abstract void deposito(double valor);

    @Override
    public String toString() {
        String s;
        s = String.format("Codigo: %05d Nome: %s Email: %s Ativo %b", codigo, nome, email, ativa);
        return s;
    }
}
