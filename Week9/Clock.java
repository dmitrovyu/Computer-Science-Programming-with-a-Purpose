import edu.princeton.cs.algs4.StdOut;

public class Clock {
    private int hours;
    private int minutes;
    private final int HOURS_PER_DAY = 24;
    private final int MINUTES_PER_HOUR = 60;

    public Clock(int h, int m) {
        if (h < 0 || h > HOURS_PER_DAY - 1 || m < 0 || m > MINUTES_PER_HOUR - 1)
            throw new IllegalArgumentException("Please enter the time in correct format HH, MM");
        hours = h;
        minutes = m;
    }

    public Clock(String time) {
        if (time.isEmpty() || time.length() != 5)
            throw new IllegalArgumentException("Please enter the time in correct format HH:MM");

        for (int i = 0; i < 5; i++) {
            if (i == 2 && time.charAt(2) != ':')
                throw new IllegalArgumentException("Please enter the time in correct format HH:MM");
            if (!Character.isDigit(time.charAt(i)) && i != 2)
                throw new IllegalArgumentException("Please enter the time in correct format HH:MM");
        }
        hours = Integer.parseInt(time.substring(0, 2));
        minutes = Integer.parseInt(time.substring(3, 5));
        if (hours < 0 || hours > HOURS_PER_DAY - 1 || minutes < 0 || minutes > MINUTES_PER_HOUR - 1)
            throw new IllegalArgumentException("Please enter the time in correct format HH, MM");

    }

    public String toString() {
        String time;
        if (hours < 10)
            time = "0" + hours;
        else
            time = String.valueOf(hours);
        time += ":";
        if (minutes < 10)
            time += "0" + minutes;
        else
            time += String.valueOf(minutes);
        return time;
    }

    public boolean isEarlierThan(Clock that) {
        if (this.hours > that.hours)
            return false;
        else if (this.hours == that.hours && this.minutes > that.minutes)
            return false;
        if (this.hours == that.hours && this.minutes == that.minutes)
            return false;

        return true;
    }

    public void tic() {
        minutes++;
        if (minutes > MINUTES_PER_HOUR - 1) {
            minutes = 0;
            hours++;
        }
        if (hours > HOURS_PER_DAY - 1)
            hours = 0;
    }

    public void toc(int delta) {
        if (delta < 0)
            throw new IllegalArgumentException("Please enter minutes larger than 0");

        hours += delta / MINUTES_PER_HOUR;
        minutes += delta % MINUTES_PER_HOUR;
        if (minutes > MINUTES_PER_HOUR - 1) {
            hours++;
            minutes = minutes % MINUTES_PER_HOUR;
        }
        if (hours > HOURS_PER_DAY - 1)
            hours = hours % HOURS_PER_DAY;

    }

    public static void main(String[] args) {
        Clock clock1 = new Clock("23:59");
        Clock clock2 = new Clock(23, 59);
        clock1.tic();
        clock2.toc(66);
        StdOut.println(clock1 + "---" + clock2);
        if (clock1.isEarlierThan(clock2))
            StdOut.println(clock1 + " is earlier than " + clock2);
        else
            StdOut.println(clock2 + " is earlier than " + clock1);

    }

}
