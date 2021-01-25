package ru.netology.domain;

public class Radio {
    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentVolume;
    private int currentStation;


    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }


    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }


    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    /* Возможность переключать каналы вверх по стрелкам на пульте */
    public int getNextStation() {
        return currentStation;
    }

    public void setNextStation(int currentStation) {
        if (currentStation < maxStation) {
            currentStation++;
        }
        else return;
        this.currentStation = currentStation;
    }

    /* Возможность переключать каналы вниз по стрелкам на пульте */
    public int getPreviousStation() {
        return currentStation;
    }


    public void setPreviousStation(int currentStation) {
        if (currentStation > minStation) {
            currentStation--;
        }
        else currentStation=maxStation;
        this.currentStation = currentStation;
    }

    /* Возможность переключать громкость вверх по стрелкам на пульте */
    public int getNextVolume() {
        return currentVolume;
    }

    public void setNextVolume(int currentVolume) {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        else currentVolume=maxVolume;
        this.currentVolume = currentVolume;
    }

    /* Возможность переключать громкость вниз по стрелкам на пульте */
    public int getPreviousVolume() {
        return currentVolume;
    }

    public void setPreviousVolume(int currentVolume) {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        else return;
        this.currentVolume = currentVolume;

    }
}

