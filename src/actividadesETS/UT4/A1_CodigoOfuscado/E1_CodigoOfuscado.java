package actividadesETS.UT4.A1_CodigoOfuscado;

import java.io.IOException;
import java.util.Scanner;

public class E1_CodigoOfuscado {
    public static void print(String message) {
        System.out.println(message);
    }

    public static int getFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            int factorial = 1;
            int userNumber = number;
            do {
                factorial *= userNumber;
                userNumber--;
            } while(userNumber > 0);
            return factorial;
        }
    }

    public static String mirrorString(String word) {
        String wordPalindrome = "";
        int countLetters = 0;
        do {
            wordPalindrome = word.charAt(countLetters) + wordPalindrome;
            countLetters++;
        } while (countLetters < word.length());
        wordPalindrome = word + wordPalindrome;
        return wordPalindrome;
    }

    public static int imprimirMenu(Scanner sc) {
        print("BIENVENIDO AL PROGRAMA OFUSCADO");
        print("-------------------------------");
        print("Elija una opcion:");
        print("1) Calcular factorial de un número");
        print("2) Convertir una palabra en palíndromo");
        print("3) Salir");
        print(">");
        String stringOption = sc.nextLine();
        int option = Integer.parseInt(stringOption);
        return option;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            option = imprimirMenu(sc);
            if (option == 1) {
                print("Inserte un número:");
                String stringNum = sc.nextLine();
                int num = Integer.parseInt(stringNum);
                int factorialNum = getFactorial(num);
                print("El resultado es:");
                print("" + factorialNum);
            } else {
                if (option == 2) {
                    print("Inserte una palabra:");
                    String word = sc.nextLine();
                    String mirrorWord = mirrorString(word);
                    print("El resultado es:");
                    print("" + mirrorWord);
                }
            }
        } while(option != 3);
    }
}



