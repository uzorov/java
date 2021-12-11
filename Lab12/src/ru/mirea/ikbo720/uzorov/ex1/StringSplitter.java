package ru.mirea.ikbo720.uzorov.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введитe паттерн:");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }
}
