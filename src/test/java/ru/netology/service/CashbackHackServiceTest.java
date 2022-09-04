package ru.netology.service;

import org.junit.Test;

import org.junit.Assert;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturnTheMissingAmountForBonusForJunitFour() {
        int sum = 1_500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousandForJunitFour() {
        int sum = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        Assert.assertEquals(expected, actual);

    }

//    @Test
//    public void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpectedForJunitFour() {
//        int sum = 1_000;
//
//        int expected = 0;
//        int actual = cashbackHackService.remain(sum);
//
//        Assert.assertEquals(expected, actual);
//    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheMissingAmountForBonusForJUnitJupiter() {
        int sum = 1_500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheMissingAmountForBonusIfTheActualAmountLessThanOneThousandFrJUnitJupiter() {
        int sum = 500;

        int expected = 500;
        int actual = cashbackHackService.remain(sum);

        Assertions.assertEquals(expected, actual);

    }

//    @org.junit.jupiter.api.Test
//    void shouldReturnTheMissingAmountForBonusIfTheActualAmountEqualsTheExpectedForJUnitJupiter() {
//        int sum = 1_000;
//
//        int expected = 0;
//        int actual = cashbackHackService.remain(sum);
//
//        Assertions.assertEquals(expected, actual);
//    }
}