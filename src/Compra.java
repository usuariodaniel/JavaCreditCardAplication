public class Compra implements Comparable<Compra>{
    private String descicao;
    private double valor;

    public Compra(String descicao, double valor) {
        this.descicao = descicao;
        this.valor = valor;
    }

    public String getDescicao() {
        return descicao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: descicao = " + descicao +
               " valor = " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
