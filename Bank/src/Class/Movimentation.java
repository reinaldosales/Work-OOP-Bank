package Class;

import java.util.Date;

public class Movimentation {
    private String description;
    private double amount;
    private Date creationDate;
    private boolean isCredit;  

    public Movimentation(String description, double amount, Date creationDate, boolean isCredit){
        this.description = description;
        this.amount = amount;
        this.creationDate = creationDate;
        this.isCredit = isCredit;
    }

    /** 
     * Reescrita do método toString, trazendo todos os
     * dados da movimentação de uma conta.
     * 
     * @return Descrição da movimentação, quantia da movimentação, data da movimentação e se foi crédito ou débito.
     */
    @Override
    public String toString() {
        return this.description + " "
        + this.amount + " "
        + this.creationDate + " "
        + this.isCredit;
    }
}
