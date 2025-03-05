import java.util.*;
public class swap2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a*b;
        b=a/b;
        a=a/b;
        String res=String.format("after swaping\nboy=%d\ngirl=%d",a,b);
        System.out.println(res);
    }
}