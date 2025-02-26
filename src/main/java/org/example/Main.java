package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and !");


        Scanner myObj = new Scanner(System.in);
        String userName;

// secomd commit
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);



        System.out.println(userName.toUpperCase());
        System.out.println(userName.toLowerCase());
    }
    }
