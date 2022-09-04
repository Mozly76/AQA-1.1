package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    void shouldReturnTheMissingAmountForBonus() {
        int sum = 1_500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousand() {
        int sum = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(expected, actual);

    }

//    @Test
//    void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpected() {
//        int sum = 1_000;
//
//        int expected = 00;
//        int actual = cashbackHackService.remain(sum);
//
//        assertEquals(expected, actual);
//    }
}