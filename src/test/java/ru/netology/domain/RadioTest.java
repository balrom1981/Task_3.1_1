package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStationAndVolume() {
        Radio radio = new Radio(5, 5, 20);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(5, radio.getCurrentVolume());
        assertEquals(20, radio.getMaxStation());

    }

    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio(22, 50, 20);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationMin() {
        Radio radio = new Radio(-1, 50, 20);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio(5, 101, 20);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentVolumeMin() {
        Radio radio = new Radio(5, -1, 20);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(5, 50, 30);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio(20, 50, 20 );
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void NextVolume() {
        Radio radio = new Radio(5, 10, 20);
        radio.nexVolume();
        assertEquals(11, radio.getCurrentVolume());
    }

    @Test
    public void NextVolumeMax() {
        Radio radio = new Radio(5, 100, 20);
        radio.nexVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void previousStationAndPreviousVolume() {
        Radio radio = new Radio(10, 15, 20);
        radio.previousStation();
        radio.previousVolume();
        assertEquals(9, radio.getCurrentStation());
        assertEquals(14, radio.getCurrentVolume());
    }

    @Test
    public void previousStationAndPreviousVolumeMin() {
        Radio radio = new Radio(0, 0, 20);
        radio.previousStation();
        radio.previousVolume();
        assertEquals(20, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }


}
