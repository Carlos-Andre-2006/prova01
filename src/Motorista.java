public abstract class Motorista {
    private String nome;
    private String placaVeiculo;
    private int quantidadeCorridasRealizadas;
    private double valorTotalBruto;

    public Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridasRealizadas = 0;
        this.valorTotalBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (valor <= 0) {
            return;
        }

        quantidadeCorridasRealizadas++;
        valorTotalBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridasRealizadas() {
        return quantidadeCorridasRealizadas;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }

    protected void adicionarAoValorTotalBruto(double valor) {
        valorTotalBruto += valor;
    }
}
