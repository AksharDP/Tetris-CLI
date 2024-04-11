package me.aksharpatel;

import java.util.Random;

public class Tetris {
    int[][] board = new int[10][20];
    int[][][] pieces = {
        {
            {1, 1, 1, 1}
        },
        {
            {1, 1, 1},
            {0, 1, 0}
        },
        {
            {1, 1, 1},
            {1, 0, 0}
        },
        {
            {1, 1},
            {1, 1}
        },
        {
            {1, 1, 0},
            {0, 1, 1}
        },
        {
            {0, 1, 1},
            {1, 1, 0}
        },
        {
            {1, 1, 1},
            {0, 0, 1}
        }
    };
    int score = 0;
    int speed = 1;
    Random random = new Random();


    public Tetris() {

    }

    public void display() {
        for (int[] row : board) {
            for (int coordinate : row) {
                System.out.print(coordinate);
            }
            System.out.println();
        }
    }

    public int randomPiece() {
        return this.random.nextInt(pieces.length);
    }

    
}
