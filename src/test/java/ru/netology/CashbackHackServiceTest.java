package ru.netology;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int purchase = 900;

        int actual = service.remain(purchase);
        int expected = 100;
        assertEquals(expected, actual);
    }
}