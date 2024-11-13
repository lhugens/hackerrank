public class Solution {

    public static String timeConversion(String s) {
        // Write your code here

        String format = s.substring(s.length() - 2);
        String time = s.substring(0, s.length() - 3);
        String hour = s.substring(0, 2);
        String minute = s.substring(3, 5);
        String second = s.substring(6,8);

        if(format.equals("AM")){
            if(time.equals("12:00:00")){
                return "00:00:00";
            }
            return time;
        }

        int hourInt = (Integer.parseInt(hour) + 12) % 24;

        time = hourInt + ":" + minute + ":" + second;
        return time;

    }

    public static void main(String[] args) {

        String s;

        s = "12:00:00:AM";
        System.out.println(timeConversion(s));

        s = "02:00:00:AM";
        System.out.println(timeConversion(s));

        s = "02:00:00:PM";
        System.out.println(timeConversion(s));

    }

}
