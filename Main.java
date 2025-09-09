public class Main {
    //Creating a method that could be called at any time,with specified inputs
    public static double WordPerMinuteCalculator(int NumOfWordsTyped, double TimeInSeconds) {
        double WPM = NumOfWordsTyped / (TimeInSeconds/ 60); //converting time in seconds to minutes
        System.out.println("You Typed " + WPM + " Word/s Per Minute");
        return WPM;
    }
}