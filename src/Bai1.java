import java.util.Scanner;

import static java.lang.Math.pow;

public class Bai1 {
    public static void main(String[] args) {

        for(int i = 100000; i<=pow(10,6)-1; i++){
            if(ktrathuannghich(i)){
                System.out.print(i + " ");
            }
        }

    }
    private static boolean ktrathuannghich(long n){
        String s = String.valueOf(n);
        StringBuilder s1 = new StringBuilder(s);
        String s2 = s1.reverse().toString();
        if(s.equals(s2)){

            return true;

        }
        return false;
    }

}
