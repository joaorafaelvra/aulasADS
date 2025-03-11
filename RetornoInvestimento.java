public class RetornoInvestimento {
    public static void main(String[] args) {
        double investimento = 1000.0;
        int periodo = 12;
        double taxa = 0.01;

        double retorno = investimento * Math.pow(1 + taxa, periodo);

        System.out.println("Montante final: R$ " + String.format("%.2f", retorno));
    }
}
