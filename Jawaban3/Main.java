package Jawaban3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LotreBoard game = new LotreBoard();
        boolean gameRunning = true;

        System.out.println("Welcome to E-Lotre GOsok");
        game.displayBoard();

        while (gameRunning) {
            System.out.println("Masukkan tebakan anda (garis dan kolom): ");
            int r = input.nextInt();
            int c = input.nextInt();

            if (r < 0 || r > 3 || c < 0 || c > 4) {
                System.out.println("Titik tidak valid");
                continue;
            }

            boolean hasil = game.guess(r, c);

            if (!hasil) {
                System.out.println("BOOM! DISINI ADA BOOM! GAME OVER.");
                game.displayBoard();
                gameRunning = false;
            } else {
                if (game.isWin()) {
                    System.out.print("Selamat KAmu MEnang!");
                    game.displayBoard();
                    gameRunning = false;
                } else {
                    game.displayBoard();
                }
            }
        }
        input.close();
    }
}

