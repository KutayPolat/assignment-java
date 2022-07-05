package ca.ciccc.assignment5.main.problem2.mobile;

public class Alarm {
    private Integer time;

    public Alarm(Integer time) {
        this.time = time;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer Time) {
        System.out.println("updated");
        this.time = Time;
    }
}
