package Class;

import java.util.ArrayList;

public abstract class Account {
    protected int id;
    protected String name;
    protected String mail;
    protected boolean isActive;
    protected ArrayList<Movimentation> movimentations;

    public Account(int id, String name, String mail){
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.isActive = true;
        this.movimentations = new ArrayList<Movimentation>();
    }

<<<<<<< Updated upstream
    public abstract void withdraw();

    public abstract void deposit();
=======
    public abstract void withdraw(int accountId, double amount);
    public abstract void deposit(int accountId, double amount);
>>>>>>> Stashed changes

    /** 
     * Esse método é responsável por criar uma movimentação
     * do fluxo feito e adicionar a lista de Movimentações da conta.
     * 
     */
    public void saveMovimentation(Movimentation movimentation){
        movimentations.add(movimentation);
    }
}
