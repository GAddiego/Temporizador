package control;

import java.time.LocalDateTime;

public class Control {

    int hours;
    int minutes;
    
    public Control() {
        
        LocalDateTime localDate = LocalDateTime.now();
        hours = localDate.getHour();
        minutes = localDate.getMinute();
        System.out.println("hora: " + hours);
        System.out.println("minutos: " + minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    
}
