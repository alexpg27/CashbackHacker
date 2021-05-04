package ru.netology.service;


import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void userPurchaseInTheAmountOf900() {
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void userPurchaseInTheAmountOf1000() {
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void userPurchaseInTheAmountOf1500() {
        int amount = 1500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }
}