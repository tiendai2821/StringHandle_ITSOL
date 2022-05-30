import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai4 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StringTokenizer t = new StringTokenizer(s);
        String maxWord = "";
        int index= 0;
        int indexmax = 0;
        while (t.hasMoreTokens()) {
            index ++;
            String tmp = t.nextToken();
            if(tmp.length()>maxWord.length()){
                indexmax = index;
                maxWord = tmp;
            }

        }
        System.out.println("Từ dài nhất trong chuỗi là: '"+ maxWord+"' -là từ thứ "+indexmax);
    }
}
