public class Pizza {
    public String nome;
    public double valor;
    public Boolean possuiBorda;

    public Double CalculaValor(Boolean possuiBorda) {
        if (possuiBorda) {
            return valor + 5.50;
        }
        return valor;
    }
}
