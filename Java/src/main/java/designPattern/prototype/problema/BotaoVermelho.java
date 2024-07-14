package designPattern.prototype.problema;

import designPattern.prototype.Botao;
import designPattern.prototype.TipoBordaEnum;

public class BotaoVermelho extends Botao {
    public BotaoVermelho() {
        setCor("Vermelha");
        setAltura(30);
        setLargura(100);
        setTipoBorda(TipoBordaEnum.FINA);
    }
}
