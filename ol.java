class M1{
    M1(int a){
        System.out.println(a);

    }
    M1(){
        System.out.println("rt"+10);
    }
    M1(String []a){
        for(String i:a){
        System.out.print(i+"  ");
        }
    }
public static void main(String ar[]){
    M1 m=new M1(2);
    
    M1 m1=new M1();
    String[] a={"hi","good","morning"};
    M1 m2=new M1(a);
}
}