import java.util.*;
public class midd1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ns[]=new int[n];
        int k=0,s=0;
        for(int i=1;i<=n;i++)
        {
            s+=i;
            ns[k]=s;
            k++;
        }
       for(int i=0;i<n;i+=3)
       {
        System.out.println(ns[i]+" ");
       }
    }
}