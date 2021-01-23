package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    int[] station = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] volume = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void shouldSetCurrentStation() {
        int currentStation = 1;
        assertEquals(1, radio.setCurrentStation(currentStation));

    }

    @Test
    public void shouldSetCurrentStationLimitMax() {
        int currentStation = 11;
        assertEquals(0, radio.setCurrentStation(currentStation));
    }

    @Test
    public void shouldSetCurrentStationLimitMin() {
        int currentStation = -1;
        assertEquals(9, radio.setCurrentStation(currentStation));
    }

    @Test
    public void shouldPlusOneStation() {
        int numberStation = 0;
        assertEquals(1, radio.setPlusOneStation(station, numberStation));

    }

    @Test
    public void shouldPlusOneStationLimit() {
        int numberStation = 10;
        assertEquals(0, radio.setPlusOneStation(station, numberStation));
    }


        @Test
    public void shouldMinusOneStationLimit() {
        int numberStation = 0;
        assertEquals(9, radio.setMinusOneStation(station, numberStation));

    }

    @Test
    public void shouldMinusOneStation() {
        int numberStation = 1;
        assertEquals(0, radio.setMinusOneStation(station, numberStation));
    }


        @Test
    public void shouldPlusOneVolume(){
        int numberVolume = 5;
        assertEquals(6, radio.setPlusOneVolume(volume, numberVolume));

    }

    @Test
    public void shouldPlusOneVolumeLimit(){
        int numberVolume = 10;
        assertEquals(10, radio.setPlusOneVolume(volume, numberVolume));

    }

    @Test
    public void shouldMinusOneVolume() {
        int numberVolume = 4;
        assertEquals(3, radio.setMinusOneVolume(volume, numberVolume));

    }

    @Test
    public void shouldMinusOneVolumeLimit() {
        int numberVolume = 0;
        assertEquals(0, radio.setMinusOneVolume(volume, numberVolume));

    }
}