public class VeiculoAVenda {
    private String tipo;
    private int ano;
    private double precodeVenda;

    public VeiculoAVenda(String tipo, int ano, double precodeVenda) {
        this.tipo = tipo;
        this.ano = ano;
        this.precodeVenda = precodeVenda;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecodeVenda() {
        return precodeVenda;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecodeVenda(double precodeVenda) {
        this.precodeVenda = precodeVenda;
    }

    public String exibirInfo() {
        return "Tipo: " + tipo + "\nAno: " + ano + "\nPreço de Venda: " + precodeVenda;
    }
}
