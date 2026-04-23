package Jawaban3;

import java.util.Random;

public class LotreBoard {
    private char[][] board = new char[4][5];
    private boolean [][] revealed = new boolean[4][5];
    private int [][] data = new int [4][5];
    private int kotakAmanDibuka = 0;
    private final int TOTAL_AMAN = 18;

    public LotreBoard(){
        //inisialisasi papan
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                board [i][j] = '*';
                revealed[i][j] = false;
                data [i][j] = 0;
            }
        }
        generateBoard();
    }

    private void generateBoard(){
        Random rand = new Random();
        int bomDitempatkan = 0;
        while (bomDitempatkan < 2){
            int r = rand.nextInt(4);
            int c = rand.nextInt(5);
            if (data[r][c] == 0){
                data[r][c] = 1;
                bomDitempatkan++;
            }
        }
    }

    public void displayBoard(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean guess (int row, int col){
        //jika kotak sudah dibuka
        if (revealed [row][col]){
            System.out.println("Kotak sudah dibuka sebelumnya!");
            return true;
        }

        revealed[row][col] = true;
        if (data[row][col] == 1){
            board[row][col] ='X';
            return false;
        } else {
            board[row][col] = 'O';
            kotakAmanDibuka++;
            System.out.println("Kotak Aman");
            return true;
        }
    }

    public boolean isWin(){
        return kotakAmanDibuka == TOTAL_AMAN;
    }
}
