package egg.introjava;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
