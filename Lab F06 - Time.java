public class Time {
    // declares private variables
    private int hours;
    private int minutes;

    // sets variables to defaults
    public Time() {
        hours = 12;
        minutes = 0;
    }
    
    // military time in digit form (e.g. 2120)
    public Time(int h, int m) {
        if (h <= 23 && h >= 0) {
            hours = h;
        } else {
            hours = 0;
        }
        if (m <= 59 && m >= 0) {
            minutes = m;
        } else {
            minutes = 0;
        }
    }
    
    // converts it to a String
    public String toString() {
        String time = "";
        if (hours % 10 == hours) {
            time += "0" + hours;
        } else {
            time += hours;
        }
        if (minutes % 10 == minutes) {
            time += "0" + minutes;
        } else {
            time += minutes;
        }
        return time;
    }
    
    // converts it to normal time
    public String convert() {
        String time = toString();
        String min = time.charAt(2) + "" + time.charAt(3);
        if (time.indexOf('0') == 0 && time.charAt(1) != '0') {
            return (time.charAt(1) + ":" + min + " " + "am");
        } else if (time.charAt(1) > '0' && time.charAt(1) < '2') {
            return (hours + ":" + min + " " + "am");
        } else if (time.charAt(1) == '2') {
            return (hours + ":" + min + " " + "pm");
        }
        if (hours % 12 == 0) {
            return ("12:" + min + " " + "am");
        }
        return (hours % 12 + ":" + min + " " + "pm");
    }
    
    // increases time by one
    public void increment() {
        minutes += 1;
        if (minutes % 60 == 0) {
            hours += 1;
            minutes = 0;
        }
        if (hours % 24 == 0 && minutes % 60 == 0) {
            hours = 0;
            minutes = 0;
        }
    }
}