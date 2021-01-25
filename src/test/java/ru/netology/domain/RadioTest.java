package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

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
    public void setCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinVolume(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());

    }
    @Test
    public void setCurrentStationMin() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinVolume(0);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void setCurrentStationMax() {
        Radio radio = new Radio();
        assertEquals(0, radio.getCurrentStation());
        radio.setMaxStation(9);
        radio.setMinVolume(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());

    }


    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setNextStation(5);
        assertEquals(6, radio.getNextStation());

    }

    @Test
    public void setNextStationN() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setNextStation(10);
        assertEquals(0, radio.getNextStation());

    }

    @Test
    public void setPreviousStation() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setPreviousStation(5);
        assertEquals(4, radio.getPreviousStation());

    }

    @Test
    public void setPreviousStationN() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);
        radio.setPreviousStation(-1);
        assertEquals(9, radio.getPreviousStation());

    }

    @Test
    public void setNextVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setNextVolume(5);
        assertEquals(6, radio.getNextVolume());

    }

    @Test
    public void setNextVolumeN() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setNextVolume(11);
        assertEquals(10, radio.getNextVolume());

    }

    @Test
    public void setPreviousVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setPreviousVolume(5);
        assertEquals(4, radio.getPreviousVolume());

    }

    @Test
    public void setPreviousVolumeN() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        radio.setPreviousVolume(-1);
        assertEquals(0, radio.getPreviousVolume());

    }
}
