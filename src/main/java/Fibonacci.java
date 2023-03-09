import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;       int primeiro = 0, segundo = 1, proximo;
        boolean fibonacci = false;

        System.out.println("Digite um número: ");
        numero = ler.nextInt();

        for (int i = 3; i <= numero; i++) {
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            if(numero == proximo){
                fibonacci = true;
            }
        }

        System.out.println();

        if (fibonacci){
            System.out.println("Pertence  a sequência Fibonacci.");
        }else{
            System.out.println("Não pertence a sequência Fibonacci.");
        }
    }
}
