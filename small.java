import java.util.*;
public class small{
    public static void main(String[] args){
        String a="manisha";
        int c[]=new int[26];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-97]++;
        }
        System.out.println(Arrays.toString(c));
    }
}