public class MotoristaIniciante extends Motorista {
    private static final double PERCENTUAL_RECEBIDO = 0.75;
    private static final double TAXA_INATIVIDADE = 50.0;
    private static final int MINIMO_CORRIDAS_SEM_TAXA = 5;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorTotalBruto() * PERCENTUAL_RECEBIDO;

        if (getQuantidadeCorridasRealizadas() < MINIMO_CORRIDAS_SEM_TAXA) {
            pagamentoLiquido -= TAXA_INATIVIDADE;
        }

        return pagamentoLiquido;
    }
}
