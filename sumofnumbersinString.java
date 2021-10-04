import java.util.Scanner;

public class sumofnumbersinString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        diamond(s);
    }

    public static void diamond(String s) {
        StringBuilder sb = new StringBuilder();
        int sum =0;
        String a ="0";
        for (int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){

                a = a+s.charAt(i);
            }else{
                if(a!=null) {
                    sum = sum + Integer.parseInt(a);
                    a ="0";
                }
            }
        }
        sum +=  Integer.parseInt(a);
        System.out.println(sum);
        }
    }
