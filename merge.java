import java.util.*;
public class merge{
    public static void main(String[] args){
        int arr1[]={3,4,5,6};
        int arr2[]={9,10,12};
        int k=0;
        int temp[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            temp[k]=arr1[i];
            k++;
        }
        System.out.println(Arrays.toString(temp));
    }
}