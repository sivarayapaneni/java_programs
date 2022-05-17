package Oops;

public class Car extends Speed {
    private int time;
    private  int distance;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public double speed1() {
        return distance / time;
    }
}
