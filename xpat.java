import java.util.*;
public class xpat{
    public static void main(String[] args){
        int n=8;
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i+j==n-1 || i==j)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}