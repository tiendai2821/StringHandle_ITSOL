import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        System.out.println("nhập vào s1");
        String s1 = new Scanner(System.in).nextLine();
        StringBuilder s = new StringBuilder(s1);
        System.out.println("nhập vào s2");
        String s2 = new Scanner(System.in).nextLine();

        int len2 = s2.length();
        boolean check = true;
        do{
            if(s.indexOf(s2)!=-1){
                int st = s.indexOf(s2);

                int end = len2 +st;

                s.delete(st,end);

            }else {
                check = false;
            }
        }while (check);
        System.out.println(s);
    }
}
