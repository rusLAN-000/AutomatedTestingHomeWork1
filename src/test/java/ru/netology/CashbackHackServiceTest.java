package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void remain() {
        int purchase = 900;

        int expected = 100;
        int actual = service.remain(purchase);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purchaseEquals1000() {
        int purchase = 1000;

        int expected = 0;
        int actual = service.remain(purchase);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void purchaseMore1000() {
        int purchase = 1200;

        int expected = 800;
        int actual = service.remain(purchase);
        Assertions.assertEquals(expected, actual);
    }
}