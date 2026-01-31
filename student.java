import java.util.Scanner;
public class student
{
    Scanner sc=new Scanner(System.in);
        int roll;

        String name;        

        void get ()
        {
            System.out.println("enter your roll_no");
            roll=sc.nextInt();
            

            System.out.println("enter your name=");
            name=sc.next();
        }
        void display ()
        {
            System.out.println("your roll no"+roll);
            System.out.println("your name id="+name);
        }
    public static void main(String args[])
    {
		 int i;
        student s[]=new student [5];

        for( i=0;i<5;i++)
        {
            s[i]=new student();
            s[i].get ();
        }
		for( i=0;i<5;i++)
		{
        s[i].display ();
		}
    }    
}
