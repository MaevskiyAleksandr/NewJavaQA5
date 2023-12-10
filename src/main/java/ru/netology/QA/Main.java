package ru.netology.QA;

public class Main {
    public static void main(String[] args) {
        CalculateServise service = new CalculateServise();
        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int count = service.calculation(income, expenses, threshold);
        System.out.println(count);
    }
}