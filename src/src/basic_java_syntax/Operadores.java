package basic_java_syntax;

public class Operadores {
    public static void main(String[] args) {
        int idade = 20;
        String maiorDeIdade = idade >= 18 ? "Maior de idade." : "Menor de idade.";

        System.out.println(maiorDeIdade);

        if (idade >= 16 && idade <= 18) {
            System.out.println("Você ainda pode ir no carrosel.");
        } else {
            System.out.println("Sinto muito, você não pode ir no carrossel.");
        }
    }
}
