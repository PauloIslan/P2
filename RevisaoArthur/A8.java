package RevisaoArthur;

import java.util.Scanner;
import java.util.ArrayList;

public class A8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        notas.add(10.0);
        notas.add(8.9);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(7.8);

        double maiorNota = notas.get(0);

        for (int i = 1; i < notas.size(); i++) {

            if (notas.get(i) > maiorNota) {
                maiorNota = notas.get(i);
            }
        }

        System.out.println("Maior nota: " + maiorNota);
        
        scanner.close();
    }
}