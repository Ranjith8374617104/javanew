public class cpat{
    public static void main(String[] args){
        int n=10;
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1)
                System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}