package designPattern.adapter.problema;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(100000);

        if (client.validaSaldo(valorPretendidoParaSaque)) {
            client.saca(valorPretendidoParaSaque);
        }

        client.deposita(new BigDecimal(500));
    }
}
