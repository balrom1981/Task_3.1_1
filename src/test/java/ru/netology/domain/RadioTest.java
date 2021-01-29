package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStationAndVolume() {
        Radio radio = new Radio(5, 5);
        assertEquals(5, radio.getCurrentStation());
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio(11, 50);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationMin() {
        Radio radio = new Radio(-1, 50);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio(5, 101);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentVolumeMin() {
        Radio radio = new Radio(5, -1);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void nextStationAndNextVolume() {
        Radio radio = new Radio(6, 5);
        radio.NextStation();
        radio.NextVolume();
        assertEquals(7, radio.getCurrentStation());
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void nextStationAndNextVolumeMax() {
        Radio radio = new Radio(10, 100);
        radio.NextStation();
        radio.NextVolume();
        assertEquals(0, radio.getCurrentStation());
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void previousStationAndPreviousVolume() {
        Radio radio = new Radio(5, 50);
        radio.PreviousStation();
        radio.PreviousVolume();
        assertEquals(4, radio.getCurrentStation());
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void previousStationAndPreviousVolumeMin() {
        Radio radio = new Radio(0, 0);
        radio.PreviousStation();
        radio.PreviousVolume();
        assertEquals(10, radio.getCurrentStation());
        assertEquals(0, radio.getCurrentVolume());
    }


}
