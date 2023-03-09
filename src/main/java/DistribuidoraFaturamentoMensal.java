public class DistribuidoraFaturamentoMensal {

    public static void main(String[] args) {

        double SP =  67836.43, RJ = 36678.66, MG = 29229.88, ES = 27165.48, Outros = 19849.53;

        double totalVendas  = SP +  RJ + MG + ES + Outros;

        double percentualSp = (SP * 100) / totalVendas;
        double percentualRj = (RJ * 100) / totalVendas;
        double percentualMg = (MG * 100) / totalVendas;
        double percentualEs = (ES * 100) / totalVendas;
        double percentualOutros = (Outros * 100) / totalVendas;

        System.out.printf("Percentual do estado SP: " + "%.2f%%\n",percentualSp);
        System.out.printf("Percentual do estado RJ: " + "%.2f%%\n",percentualRj);
        System.out.printf("Percentual do estado MG: " + "%.2f%%\n",percentualMg);
        System.out.printf("Percentual do estado ES: " + "%.2f%%\n",percentualEs);
        System.out.printf("Percentual do estado Outros: " + "%.2f%%\n",percentualOutros);

    }
}
