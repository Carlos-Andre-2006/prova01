public class Main {
    public static void main(String[] args) {
        MotoristaIniciante motoristaIniciante = new MotoristaIniciante("Ana Souza", "ABC-1D23");
        MotoristaPremium motoristaPremium = new MotoristaPremium("Bruno Lima", "DEF-4G56");
        MotoristaParceiroFrotista motoristaFrotista = new MotoristaParceiroFrotista("Carla Mendes", "GHI-7J89");

        motoristaIniciante.registrarCorrida(42.50);
        motoristaIniciante.registrarCorrida(38.00);
        motoristaIniciante.registrarCorrida(55.75);

        motoristaPremium.registrarCorrida(80.00);
        motoristaPremium.registrarCorrida(120.50);
        motoristaPremium.registrarCorrida(64.90);
        motoristaPremium.registrarCorrida(95.00);

        motoristaFrotista.registrarCorrida(400.00);
        motoristaFrotista.registrarCorrida(520.00);
        motoristaFrotista.registrarCorrida(310.00);

        imprimirExtrato(motoristaIniciante);
        imprimirExtrato(motoristaPremium);
        imprimirExtrato(motoristaFrotista);
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("========================================");
        System.out.println("Holerite / Extrato do Motorista");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa: " + motorista.getPlacaVeiculo());
        System.out.println("Corridas no mes: " + motorista.getQuantidadeCorridasRealizadas());
        System.out.printf("Valor bruto: R$ %.2f%n", motorista.getValorTotalBruto());
        System.out.printf("Valor liquido a receber: R$ %.2f%n", motorista.calcularPagamentoLiquido());
        System.out.println("========================================");
        System.out.println();
    }
}
