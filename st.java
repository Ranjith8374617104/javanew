class Nm{
    static{
        System.out.println("rt");
    }
    void ok(){
        System.out.println("rto0");
    }
    static void ok1(){
        System.out.println("rto1");
    }
}
class Main{
    public static void main(String sr[]){
        Nm n=new Nm();
        n.ok();
        n.ok1();
    }
}