
import java.util.*;


class HelloWorld {
    public static String reverse(String s,int start,int end){
        StringBuilder sb=new StringBuilder(s);
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=scan.nextLine();
        String pt=reverse(str,0,str.length()-1);
        System.out.println("The reverse string is: "+pt);
    }
}