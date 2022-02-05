import java.util.Date;

public class Movement {
    private String descricao;
    private double valor;
    private Boolean credito = true;
    private Date data;

    public Movement(String descricao, double valor, boolean credito, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.credito = credito;
        this.data = data;
    }

    @Override
    public String toString() {
        String s;
        System.out.println(data);
        s = String.format("Descrição: %s Valor: %.2f Credito %b", descricao, valor, credito);
        return s;
    }
}
