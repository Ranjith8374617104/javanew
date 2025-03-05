class main1{
    public static void main(String[] args){
        String[] greeting={"good morning","good evening","good night"};
        while(true){
            System.out.println("good morning");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("good evening");
            try{
                Thread.sleep(7000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("good night");
            try{
                Thread.sleep(9000);
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}