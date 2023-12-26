package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remain() {
        int purchase = 900;

        int actual = service.remain(purchase);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void purchaseEquals1000() {
        int purchase = 1000;

        int expected = 0;
        int actual = service.remain(purchase);
        assertEquals(expected, actual);
    }

    @Test
    void purchaseMore1000() {
        int purchase = 1200;

        int expected = 800;
        int actual = service.remain(purchase);
        assertEquals(expected, actual);
    }
}