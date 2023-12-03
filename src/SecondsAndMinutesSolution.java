public class SecondsAndMinutesSolution {

    public static void main(String[] args){

    System.out.println(getDurationString(3945));
    System.out.println(getDurationString(65, 45));
    System.out.println(getDurationString(65, 145));

    }
// In my solution, I did not return value as a String as I thought it wouldn't return with int values.
// Concatenating int values with string values CAN be returned as a string.
    public static String getDurationString(int seconds){

        if(seconds <0){
            return "Invalid data for second";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);

    }
//Keep in mind creating a parameter in a method creates a variable as well.
    public static String getDurationString(int minutes, int seconds){
        if(seconds <0){
            return "Invalid data for minutes";
        }

        if(seconds <=0 || seconds >= 59){
            return "Must be between 0 and 59";
        }
        //int minutes = seconds / 60;  <-------This can be removed since it was declared as a parameter.
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }

}
