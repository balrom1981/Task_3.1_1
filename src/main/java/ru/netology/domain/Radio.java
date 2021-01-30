package ru.netology.domain;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter


public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public Radio(int currentStation, int currentVolume) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;

    }
//
//    public int getMaxStation() {
//        return maxStation;
//    }
//
//    public void setMaxStation(int maxStation) {
//        this.maxStation = maxStation;
//    }
//
//    public int getMinStation() {
//        return minStation;
//    }
//
//    public void setMinStation(int minStation) {
//        this.minStation = minStation;
//    }
//
//    public int getMaxVolume() {
//        return maxVolume;
//    }
//
//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }
//
//    public int getMinVolume() {
//        return minVolume;
//    }
//
//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }
//
//    public long getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        this.currentVolume = currentVolume;
//
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentStation(int currentStation) {
//
//        this.currentStation = currentStation;
//    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void previousStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void previousVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}
