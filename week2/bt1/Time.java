

public class Time {
    int hour;

    Time() { setTime(0); } // default constructor
    Time(int h) { setTime(h); }

    Time setTime(int h) {
        setHour(h);
        return this; // return value
    }

    Time setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
        return this;
    }

    int getHour() { return hour; }

    public int stringToScreen() {
        return hour;
    }

    // Phương thức main để chạy lớp Time độc lập
    public static void main(String[] args) {
        Time myTime = new Time(15);
        System.out.println("Hour: " + myTime.getHour());
        myTime.setHour(20);
        System.out.println("Updated Hour: " + myTime.getHour());
    }
}
