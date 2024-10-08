package designPattern.factorymethods.solucao;

import designPattern.factorymethods.Produto;
import designPattern.factorymethods.ProdutoDigital;
import designPattern.factorymethods.ProdutoFisico;
import designPattern.factorymethods.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de Produto não disponivel");

        }
    }
}
