package ex3;

/**
 * Exercise 3: a time of day hh:mm:ss that always stays valid.
 */
public class Time {

    private static final int SECONDS_PER_DAY = 24 * 60 * 60;   // 86400

    private int hour;
    private int minute;
    private int second;

    // No-argument constructor: 00:00:00.
    public Time() {
        this(0, 0, 0);
    }

    // Parameterized constructor: hour must be in [0, 23], minute and second in [0, 59].
    // If any value is invalid the time is set to 00:00:00.
    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Invalid time " + hour + ":" + minute + ":" + second + ", set to 00:00:00.");
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    // Converts the current time to seconds since 00:00:00.
    private int toTotalSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    // Sets hour/minute/second from a number of seconds, wrapping around one day.
    private void setFromTotalSeconds(int total) {
        total = ((total % SECONDS_PER_DAY) + SECONDS_PER_DAY) % SECONDS_PER_DAY;
        hour = total / 3600;
        minute = (total % 3600) / 60;
        second = total % 60;
    }

    public void addSeconds(int seconds) {
        setFromTotalSeconds(toTotalSeconds() + seconds);
    }

    public void subtractSeconds(int seconds) {
        setFromTotalSeconds(toTotalSeconds() - seconds);
    }

    public void display() {
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
}
