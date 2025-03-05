import java.util.*;
class arrlis3{
    public static void main(String[] args){
        ArrayList<Integer>a=new ArrayList<>();
        a.add(45);
        a.add(1);
        a.add(19);
        a.add(39);
        Collections.sort(a);
        System.out.println(a);
    }
}