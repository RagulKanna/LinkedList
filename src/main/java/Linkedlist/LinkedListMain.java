package Linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter \n 1 to add element at the start \n " +
                "\n choice: ");

        switch (sc.nextInt()) {
            case 1:
                Operations.addoperation();
                break;
        }
    }
}
