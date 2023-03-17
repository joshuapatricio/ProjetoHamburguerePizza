public class Hamburguer {
    public String nome;
    public double valor;
    public Boolean seArtesanal;

    public Double CalculaValor(Boolean seArtesanal) {
        if (seArtesanal) {
            return valor + 8.00;
        }
        return valor;
    }

    public String ConsultarNome ()
    {
        return nome;
    }
}