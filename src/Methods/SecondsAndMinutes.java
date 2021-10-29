package Methods;

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        String time = getDurationString(65, 9);
        System.out.println(time);
        String times = getDurationString(3915);
        System.out.println(times);
    }
    private static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || ((seconds <0) || (seconds>59))){
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes/60;
        int min = minutes%60;

        String hours = Integer.toString(hour);
        String hoursString =  hours + "h";
        if(hour < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if(min < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString+ " "+minutesString+" "+secondsString+"";
    }
    private static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        int min = seconds/60;
        int rem = seconds%60;
        return getDurationString(min, rem);
    }
}
