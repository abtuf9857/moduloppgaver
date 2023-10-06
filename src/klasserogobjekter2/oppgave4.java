package klasserogobjekter2;

class Klokke {
    private int timer;
    private int minutter;
    private int sekunder;

    

    public Klokke (int timer, int minutter, int sekunder){
        this.timer=timer;
        this.minutter=minutter;
        this.sekunder=sekunder;

    }
    public int getTimer() {
        return timer;
    }

    public void setTimer(int time) {
        if(timer>=0 && timer <=24){
        this.timer = time;
            }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if (minutter>=0 && minutter<=59) {
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if (sekunder>=0 && sekunder<=59){
        this.sekunder = sekunder;
        }
    }

}

