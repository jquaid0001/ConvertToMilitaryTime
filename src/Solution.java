import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // format the string as 12hr time
        DateFormat twelveHourFormat = new SimpleDateFormat("hh:mm:ssaa");
        // format the twelveHour date as 24hr
        DateFormat twentyFourHourFormat = new SimpleDateFormat("HH:mm:ss");
        Date twelveHour = null;

        try {
            twelveHour = twelveHourFormat.parse(s);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        if (twelveHour != null) {
            return twentyFourHourFormat.format(twelveHour);
        }

        return "Error converting time to 24 hour";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);
        System.out.println(result);

        bufferedReader.close();
    }
}
