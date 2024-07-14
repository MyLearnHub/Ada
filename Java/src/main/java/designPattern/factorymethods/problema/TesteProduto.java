package designPattern.factorymethods.problema;

import designPattern.factorymethods.ProdutoDigital;
import designPattern.factorymethods.ProdutoFisico;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
