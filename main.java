import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int jumlahBaris = 10;
        String kalimatBaru = "Deklarasi tipe data String";
        int[] empatAngka = { 7, 10, 20, 23 };

        String[][] alfabet = {
                { "p", "s", "n" },
                { "w", "l", "b" },
                { "f", "r", "e" }
        };

        LinkedList<Integer> listAngka = new LinkedList<>(Arrays.asList(26, 8, 23, 24, 16));

        System.out.println("{");
        for (int i = 0; i < alfabet.length; i++) {
            System.out.print("  { ");
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j]);
                if (j < alfabet[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(" }");
            if (i < alfabet.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("}");

        System.out.print("[ ");
        for (int i = 0; i < listAngka.size(); i++) {
            System.out.print(listAngka.get(i));
            if (i < listAngka.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        int jumlahElemen = listAngka.size();
        System.out.println("Jumlah elemen dalam listAngka: " + jumlahElemen);
    }
}
