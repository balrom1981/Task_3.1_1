package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

    }

    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setCurrentStationMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

    }



    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentVolumeMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentVolume());
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(5);
        radio.NextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void nextStationMax() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(9);
        radio.NextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.NextVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeMax() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(10);
        radio.NextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(5);
        radio.PreviousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void previousStationMin() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setCurrentStation(0);
        radio.PreviousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void previousVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(5);
        radio.PreviousVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void previousVolumeMin() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setMaxVolume(10);
        radio.setCurrentVolume(0);
        radio.PreviousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}