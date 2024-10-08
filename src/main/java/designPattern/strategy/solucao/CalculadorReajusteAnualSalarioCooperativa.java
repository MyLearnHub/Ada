package designPattern.strategy.solucao;

import designPattern.strategy.Funcionario;

import java.math.BigDecimal;

public class CalculadorReajusteAnualSalarioCooperativa implements CalculadorReajusteAnualSalario {
    @Override
    public void calcularReajusteAnual(Funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.07))));
    }
}
