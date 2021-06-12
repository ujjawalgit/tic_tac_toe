package com.bl.ticTacToe;

public class TicTacToeGame {
    public static char[] board = new char[10];

    /*creating board  with empty spaces*/
    public static char[] createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        /*createBoard method will create board with empty spaces*/
        board = createBoard();
    }
}