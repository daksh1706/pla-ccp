import java.util.Scanner;
public class Horseshoe
{
    public static void main(String args[])
    {
        Scanner z=new Scanner(System.in);
        int a=z.nextInt();
        int b=z.nextInt();
        int c=z.nextInt();
        int d=z.nextInt();
        int k1=0;
        int[] x={a,b,c,d};
        for(int i=0;i<4;i++)
        {
            int k=0;
            for(int j=i;j<4;j++)
            {
                if(x[i]==x[j])
                    k++;
            }
            if(k>1)
                k1++;
        }
        System.out.println(k1);
    }
}
