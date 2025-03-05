public class tryctchblck {
    public static void main(String[]args){
        try{
            int d=90/0;
            
        }catch(ArithmeticException v)
        {
            System.out.println("bad Request");
        }
        try{
            int d=90/0;

        }catch(ArithmeticException v){
            System.out.println("catch block is running");

        }
        finally{
            System.out.println("finally is running");
        }
    }
    
}