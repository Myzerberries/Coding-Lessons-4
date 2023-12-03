public class Main {

    public static void main(String[] args) {

        int onlyInchesInput = 0;
        int feetInput = 6;
        int inchesInput = 0;

        System.out.println(convertToCentimeters(onlyInchesInput));
        System.out.println(convertToCentimeters(feetInput, inchesInput));
    }

    public static double convertToCentimeters(int heightInInches){
        double cmConversion = heightInInches * 2.54;
        return cmConversion;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches){
        int feetFromInches = heightInFeet * 12;
        int totalInches = feetFromInches + heightInInches;

        return convertToCentimeters(totalInches);
    }

}
