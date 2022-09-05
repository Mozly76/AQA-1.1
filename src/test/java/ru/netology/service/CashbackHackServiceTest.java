package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnTheMissingAmountForBonus() {
        int sum = 1_500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousand() {
        int sum = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpected() {
        int sum = 1_000;

        int expected = 0;
        int actual = cashbackHackService.remain(sum);

        assertEquals(expected, actual);
    }
}