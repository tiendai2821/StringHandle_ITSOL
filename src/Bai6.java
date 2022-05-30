import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String [] aString = new String[n+5];
        int index = 0;
        while (st.hasMoreTokens()){
            String temp = st.nextToken();
            aString[index] = temp;
            index++;
        }
        for(int i = 0; i<index-1; i++){

            for(int j = 0; j<index-i-1; j++){

                if(aString[j].compareTo(aString[j+1]) > 0){
                    String temp = aString[j];
                    aString[j] = aString[j+1];
                    aString[j+1] =temp;
                }
            }
        }

        for(int i = 0; i<index; i++){
            System.out.println(aString[i]);
        }
    }
}
