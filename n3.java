import java.util.*;
public class n3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
        for(int j=i;j>=1;j--)
        {   
            System.out.print((char)(64+j)+" ");
        }
        System.out.println();
        }
    }
}