/*
 * Convert any long integer number from base 10 to any another base (base 2 binary, base 8 oct, base 16 hexadecimal)
 * Input numbers are i as long integer number and k base of result
 * Output is number written in base k
 */

public class Kary {
    public static String ReverseString(String str) {
        String tempStr = "";
        for (int i = str.length(); i > 0; i = i - 1) {
            tempStr = tempStr + str.charAt(i - 1);
        }

        return tempStr;

    }

    public static void main(String[] arg) {
        long i = Long.parseLong(arg[0]);
        int k = Integer.parseInt(arg[1]);
        if (k < 2 || k > 16) {
            System.out.println("Base k is out of bonds");
            System.exit(k);
        }

        String result = "";
        String base = "";
        int temp = 1;

        while (i > 0) {
            temp = (int) (i % k);
            if (temp == 10)
                base = "A";
            else if (temp == 11)
                base = "B";
            else if (temp == 12)
                base = "C";
            else if (temp == 13)
                base = "D";
            else if (temp == 14)
                base = "E";
            else if (temp == 15)
                base = "F";
            else
                base = String.valueOf(i % k);
            result = result + base;
            i = i / k;

        }
        System.out.println("Input number: " + Long.parseLong(arg[0]) + " base 10");
        System.out.println("Result number: " + ReverseString(result) + " base " + Long.parseLong(arg[1]));
    }

}
