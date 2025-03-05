import java.util.*;
class bill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();
        System.out.println("Enter Dress cost:");
        int cost =sc.nextInt();
        billslip t = new billslip(name,cost);
        t.menu();
    }
}
class billslip
{
    String cname=cname;
    int dresscost=0;
    int discountpercentage=0;
    int totalamountafterdiscount=0;
    billslip(String cname,int dresscost)
    {
        this.cname=cname;
        this.dresscost=dresscost;
    }
    public void discount(int amount)
    {
        if(amount>0)
        {
            discountpercentage+=amount;
           totalamountafterdiscount=amount;
        }
    }
    public void totalcost(int amount)
    {
        if(amount>0)
        {
            if(amount<=discountpercentage)
            {
                discountpercentage-=amount;
                totalamountafterdiscount=-amount;
            }
        }else{
            System.out.println("Your discountpercentage is insufficient");
        }
    }
    public void gettotalamountafterdiscount()
    {
        if(totalamountafterdiscount>0)
        {
            System.out.println("totalcost :"+totalamountafterdiscount);
        }else if(totalamountafterdiscount<0)
        {
            System.out.println("discount :"+totalamountafterdiscount);
        }else{
            System.out.println("NO discountpercentage Occured");
        }
    }
    void menu(){
        System.out.println("Enter Option :-");
        char option ='\0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Your name is : "+cname);
        System.out.println("Your dresscost is :"+dresscost);
        System.out.println(" B. discountpercentage");
        System.out.println(" C. totalamountafterdiscount");
        System.out.println(" E. Exit");
        do{
            option=Character.toUpperCase(sc.next().charAt(0));
            switch(option)

            {
                case 'B':
                    System.out.println("Enter amount");
                    int amount1 = sc.nextInt();
                    System.out.println("=======================");
                    discount(amount1);
                    System.out.println("Amount payed :"+totalamountafterdiscount);
                    System.out.println("=======================");
                    break;
                case 'C':
                    System.out.println("=======================");
                    System.out.println("Your totalamountafterdiscount");
                    gettotalamountafterdiscount();
                    System.out.println("=======================");
                    break;
                case 'E':
                    System.out.println("=======================");
                    System.out.println("Exiting your application");
                    System.out.println("=======================");
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }while(option!='E');
    }
} 