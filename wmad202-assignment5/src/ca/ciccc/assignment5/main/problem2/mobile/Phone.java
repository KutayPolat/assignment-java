package ca.ciccc.assignment5.main.problem2.mobile;

public class Phone {

    public void createAlarmTime() {
        Alarm alarm = new Alarm(3);
        alarm.setTime(4);
        System.out.println("alarm created at :"+ alarm.getTime());
    }
}
