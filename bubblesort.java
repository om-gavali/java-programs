import java.util.*;
class bubblesort
{
    public static void main (String args[])
    {
        int i,a[]=new int [10];

        Scanner sc=new Scanner(System.in);

        System.out.println("enter your array=");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }

        for( i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]>a[j])
                {
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("sorted array");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }
}