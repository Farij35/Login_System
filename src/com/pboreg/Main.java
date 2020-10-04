package com.pboreg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Program Login
        // Nama : Farij Altaf Syah
        // NIM : 2019071010

        // Username : AdminInf123
        // Password : 12345

        Scanner userInput = new Scanner(System.in);
        String userName;
        String password;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Masukkan Username dan Password anda : ");
            System.out.print("Username : ");
            userName = userInput.nextLine();
            System.out.print("Password : ");
            password = userInput.nextLine();

            if (userName.equals("AdminInf123")) {
                if (password.equals("12345")){
                    System.out.println("\nLogin Berhasil");
                    break;
                }
            } else {
                if (i < 3) {
                    System.out.println("\nUsername atau Password anda salah, silahkan coba lagi\n");
                }
                else if (i == 3){
                    System.out.println("\nAnda telah memasukkan Username dan Password yang salah sebanyak 3x, akun anda diblokir\n");
                }
                continue;
            }
        }
    }
}
