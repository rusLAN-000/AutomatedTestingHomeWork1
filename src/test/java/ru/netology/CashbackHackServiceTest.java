package ru.netology;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void remain() {
        int purchase = 900;

        int expected = 100;
        int actual = service.remain(purchase);
        assertEquals(expected, actual);
    }

    @Test
    public void purchaseEquals1000() {
        int purchase = 1000;

        int expected = 0;
        int actual = service.remain(purchase);
        assertEquals(expected, actual);
    }

    @Test
    public void purchaseMore1000() {
        int purchase = 1200;

        int expected = 800;
        int actual = service.remain(purchase);
        assertEquals(expected, actual);
    }
}