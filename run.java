class This{
    int a;
    int b=20;
    void This1(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+"rt"+b);
    }
    void dis(){
        System.out.println(a+"rt"+b);
    }
    public static void main(String ar[]){
        This t=new This();
        t.This1(2,3);
        t.dis();
        System.out.println(t.a+""+t.b);

    }
}