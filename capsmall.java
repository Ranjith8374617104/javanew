import java.util.*;
public class capsmall{
    public static void main(String[] args){
        String a="ManisHA";
        int c[]=new int[52];
        for(int i=0;i<a.length();i++)
        {
            c[((int)(a.charAt(i)))-65&97]++;
        }
        System.out.println(Arrays.toString(c));
    }
}