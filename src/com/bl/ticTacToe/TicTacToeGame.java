package com.bl.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
    private static char[] board;
    private static char playerLetter;
    private static char computerLetter;

    /*creating board  with empty spaces*/
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    /* method to select letter of your choice */
    public static char chooseYourLetter() {
        Scanner scanner = new Scanner(System.in);
        char playerLetter = scanner.next().toUpperCase().charAt(0);
        if (playerLetter != 'X' && playerLetter != 'O') {
            System.out.print("Invalid Input Please enter O or X:");
            chooseYourLetter();
        }
        return playerLetter;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        /*createBoard method will create board with empty spaces*/
        board = createBoard();
        System.out.print("choose your letter(X or O):");
        playerLetter = chooseYourLetter(); /* selecting letter for player*/
        computerLetter = playerLetter == 'X' ? 'O' : 'X';/*if player has got X then computer will get O & vice-versa*/
    }
}