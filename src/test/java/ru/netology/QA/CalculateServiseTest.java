package ru.netology.QA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiseTest {
    @Test
    public void shouldCalculateMoneyMonths1() {
        CalculateServise service = new CalculateServise();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        int actual = service.calculation(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMoneyMonths2() {
        CalculateServise service = new CalculateServise();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}