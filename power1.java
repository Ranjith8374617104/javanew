import java.util.*;
public class power1{
    public static void main(String[] args){
        int a=8388608;
                if((a&(a-2))==0){
            System.out.println("power of 4");
        }else{
            System.out.println("not a power of 4");
        }
    }
}