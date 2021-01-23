package ru.netology.domain;

public class Radio {
    int maxStation = 9;
    int minStation = 0;
    int maxVolume = 10;
    int minVolume = 0;


    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        return currentStation;
    }

    public int getCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int setPlusOneStation(int[] station, int numberStation) {
        int currentStation;
        if (numberStation < station.length - 1) {
            currentStation = station[numberStation+1];
        } else {
            currentStation = minStation;
        }

        return currentStation;
    }

    public int setMinusOneStation(int[] station, int numberStation) {
        int currentStation;
        if (numberStation > 0) {
            currentStation = station[numberStation-1];
        } else {
            currentStation = maxStation;
        }

        return currentStation;


    }
}