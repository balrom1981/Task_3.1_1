package ru.netology.domain;

public class Radio {
    int maxStation = 9;
    int minStation = 0;
    int maxVolume = 10;
    int minVolume = 0;


    /* Возможность выставлять номера радиостанций с помощью пульта */

    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }

        return currentStation;
    }

    /* Возможность переключать каналы вверх по стрелкам на пульте */

    public int setPlusOneStation(int[] station, int numberStation) {
        int currentStation;
        if (numberStation < station.length - 1) {
            currentStation = station[numberStation+1];
        } else {
            currentStation = minStation;
        }
        return currentStation;
    }

    /* Возможность переключать каналы вниз по стрелкам на пульте */

    public int setMinusOneStation(int[] station, int numberStation) {
        int currentStation;
        if (numberStation > 0) {
            currentStation = station[numberStation-1];
        } else {
            currentStation = maxStation;
        }

        return currentStation;
    }

    /* Возможность увеличивать громкость вверх по стрелкам на пульте */

    public int setPlusOneVolume(int[] volume, int numberVolum) {
        int currentVolume;
        if (numberVolum < volume.length - 1) {
            currentVolume = volume[numberVolum+1];
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    /* Возможность уменьшать громкость вверх по стрелкам на пульте */

    public int setMinusOneVolume(int[] volume, int numberVolum) {
        int currentVolume;
        if (numberVolum > 0) {
            currentVolume = volume[numberVolum-1];
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }
}
