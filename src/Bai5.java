import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai5 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StringTokenizer t = new StringTokenizer(s);
        StringBuilder tmp = new StringBuilder("");
        int index = 0;
        String ho = "";
        String tendem = "";
        String ten = "";
        int len = t.countTokens();
        while(t.hasMoreTokens()){
            String temp = t.nextToken();
            if(index == 0) {
                ho += (temp+" ");
            }else if( index == len-1){
                ten += (temp+" ");
            }else {
                tendem+= (temp+" ");
            }
            index++;
        }
        s = ten+ho+tendem;
        System.out.println(s);
    }
}
