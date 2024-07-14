package designPattern.strategy.solucao;

import designPattern.strategy.Funcionario;

public class ReajusteAnualSalarioComStrategy {
    public void calculaRejusteAnual(Funcionario funcionario, CalculadorReajusteAnualSalario calculador) {
        calculador.calcularReajusteAnual(funcionario);
    }
}
