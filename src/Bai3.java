import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        s = s.replace(" ","");
        String temp = "";
        temp += Character.toUpperCase(s.charAt(0));
        temp = temp.concat(s.substring(1,s.length()).toLowerCase());
        System.out.println(temp);
    }
}
