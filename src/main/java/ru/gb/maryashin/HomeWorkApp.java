package ru.gb.maryashin;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nAppel");
    }

    public static void checkSumSign() {
        int a = 5, b = 15;
        int c = a + b;
        System.out.println("Сумма " + (c >= 0 ? "положительная" : "отрицательная"));
        }

    public static void printColor(){
        int value = -57;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 75, b = 35;
        System.out.println( (a >= b ? "a>=b" : "a<b"));
    }

    }

