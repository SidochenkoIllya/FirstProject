package com.Illya.firstproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в Градусах Цельсия: ");
        int celsius = scanner.nextInt();
        System.out.println("Это эквивалентно: " + convertCelsiusToFahrenheit(celsius) + " градусам по Фаренгейту");
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double Fahrenheit = 9 / 5.0 * celsius + 32;
        return Fahrenheit;
    }
}
