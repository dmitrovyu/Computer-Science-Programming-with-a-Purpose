public class ThueMorseString {
    public static void main (String[] args){
       // int n= Integer.parseInt(args[0]);
        int n=30;
        String res = "0";
        String negres = "";
        int numOfIteration = 9;
        String row = "";
        for (int i=1; i<numOfIteration; i++) {
            for(int j=0; j<res.length(); j++){

                if (res.charAt(j) == '0') negres =negres + '1';
                else negres = negres + '0';
            }
         
            res = res + negres;
            negres = "";
        }
        System.out.println(res.length());
        for (int i=0; i < n; i++){
            for (int j=0; j< n; j++){
                if (res.charAt(i) == res.charAt(j)) row = row + "+  ";
                    else row = row + "-  ";
            }
            System.out.println(row);
            row ="";
        }
    }
}
