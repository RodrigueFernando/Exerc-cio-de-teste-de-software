package org.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("largura da pagina");
        int X = scanner.nextInt();
        System.out.println("Altura da página");
        int Y = scanner.nextInt();
        System.out.println("Largura da primeira foto");
        int L1 = scanner.nextInt();
        System.out.println("Altura da primeira foto");
        int H1 = scanner.nextInt();
        System.out.println("Largura da segunda foto");
        int L2 = scanner.nextInt();
        System.out.println("Largura da segunda foto");
        int H2 = scanner.nextInt();
        Album Album = new Album(X, Y);
        if (Album.ColarFotos(L1, H1, L2, H2)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }

}