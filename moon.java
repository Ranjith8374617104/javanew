class Main{
    void run(){
        System.out.println("run()");

    }
    int run(int a,int b){
        return a+b;

    }
    void run(double a,double b){
        System.out.println(a+b);

    }
    String run1(){
        return "hi how are you";
    }
public static void main(String sr[]){
    Main n=new Main();
    n.run();
    System.out.println(n.run(3,78));
    n.run(45.45,76.540);
    System.out.println(n.run1());
}
}
