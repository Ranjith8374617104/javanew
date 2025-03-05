import java.util.*;
class arrlis1{
    public static void main(String[] args){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(345);
        a.add(909);
        a.add(767);
        a.add(1,789);
        a.set(2,7898);
        System.out.println(a);
    }
}