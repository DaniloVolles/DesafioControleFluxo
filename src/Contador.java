import java.util.Scanner;

public class Contador {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o primeiro parâmetro");
        int p1 = INPUT.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int p2 = INPUT.nextInt();

        try {
            contar(p1, p2);

        } catch (ParametrosInvalidosException e) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    private static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1 >= p2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = p2 - p1;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + ( i + 1 ) + ".");
        }
    }
}