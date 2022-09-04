package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnTheMissingAmountForBonus() {
        int sum = 1_500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousand() {
        int sum = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(actual, expected);

    }

//    @Test
//    void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpected() {
//        int sum = 1_000;
//
//        int expected = 0;
//        int actual = cashbackHackService.remain(sum);
//
//        assertEquals(actual, expected);
//    }
}