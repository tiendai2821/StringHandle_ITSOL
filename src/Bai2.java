import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String tmp = "";
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(i%2 == 0){

                tmp+= Character.toUpperCase(a);
            }else {
                tmp += Character.toLowerCase(a);
            }
        }
        System.out.println(tmp);
    }
}
