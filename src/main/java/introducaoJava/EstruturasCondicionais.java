package introducaoJava;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int nota = 70;
        String graduacao;

        /*
        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Não aprovado.");
        }
        */

        if (nota >= 80) {
            graduacao = "Graduação A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "Graduação B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "Graduação C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "Graduação D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado");
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
}
