public class SecondsAndMinutesChallenge {
    public static void main(String[] args){

        getDurationString(-1);

    }

    public static void getDurationString(int seconds){
        if(seconds >= 0){
        int minutesFromSeconds = seconds / 60;
        int convertedMinutes = minutesFromSeconds % 60;
        int hoursFromMinutes = minutesFromSeconds / 60;
        int remainingSeconds = (seconds % 60);

        getDurationString(minutesFromSeconds, seconds);
        System.out.print(hoursFromMinutes + "h " + convertedMinutes + "m " + remainingSeconds + "s");
        }
        else System.out.print("Invalid entry");

    }

    public static void getDurationString(int minutes, int seconds){

        int minutesFromSeconds = seconds / 60;
        int convertedMinutes = minutesFromSeconds % 60;
        int hoursFromMinutes = minutesFromSeconds / 60;
        int remainingSeconds = (seconds % 60);


            if(minutesFromSeconds >=0 && remainingSeconds >=0 && remainingSeconds <=59) {
                System.out.println(hoursFromMinutes + "h " + convertedMinutes + "m " + remainingSeconds + "s");
            }
            else System.out.print("Invalid Output");



    }

}