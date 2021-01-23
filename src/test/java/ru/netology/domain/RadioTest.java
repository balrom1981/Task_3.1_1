package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        int currentStation = -1;
        assertEquals(9, radio.setCurrentStation(currentStation));
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        int currentVolume = -1;
        assertEquals(0, radio.getCurrentVolume(currentVolume));

    }

    @Test
    public void shouldPlusOneStation() {
        Radio radio = new Radio();
        int[] station = {11, 1, 22, 3, 44, 5, 66, 7, 88, 9};
        int numberStation = 9;
        assertEquals(10, radio.setPlusOneStation(station, numberStation));

    }

    @Test
    public void shouldMinusOneStation() {
        Radio radio = new Radio();
        int[] station = {11, 1, 22, 3, 44, 5, 66, 7, 88, 9};
        int numberStation = 0;
        assertEquals(10, radio.setMinusOneStation(station, numberStation));

    }
}