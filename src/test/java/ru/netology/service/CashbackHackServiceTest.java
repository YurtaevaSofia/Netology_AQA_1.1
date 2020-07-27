package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCountWhenLessThan1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountWhenMoreThan1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCountWhen1000() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}