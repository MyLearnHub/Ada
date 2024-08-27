package programacaoOrientadaObjeto;

import programacaoOrientadaObjeto.Animais.Cachorro;
import programacaoOrientadaObjeto.Animais.Gato;
import programacaoOrientadaObjeto.Animais.Passaro;
import programacaoOrientadaObjeto.Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", "Branco", 10, 10.5, 5, "nada");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}
