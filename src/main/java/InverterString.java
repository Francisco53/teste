import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String palavra = sc.nextLine();

        //char[] chars = palavra.toCharArray();

        for (int x = palavra.length() - 1; x >= 0; x--) {
            System.out.print(palavra.charAt(x));
        }


    }
}
