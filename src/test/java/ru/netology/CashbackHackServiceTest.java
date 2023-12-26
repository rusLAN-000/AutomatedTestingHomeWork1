package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();
        int purchase = 900;

        int expected = 100;
        int actual = service.remain(purchase);
        Assertions.assertEquals(expected, actual);
    }
}