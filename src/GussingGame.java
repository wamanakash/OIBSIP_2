import java.util.Scanner;
public class GussingGame {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int R=(int)(Math.random()*100+1);
        System.out.println("Guess The Number .");
        System.out.println("Enter a positive number below 100:");
        int n=ob.nextInt();
        int b=1;
        while(n!=R)
        {
            b++;
            if(n<R)
                System.out.println(n + "Is Smaller.");
            else if(n>R)
                System.out.println(n + "Is Larger.");
            System.out.println("Enter Another Number:");
            n=ob.nextInt();

        }
        if(b==1)
            System.out.println("*****\nCongratulations!!!");
        else if(b==2)
            System.out.println("***\nCongratulations!!!");
        else if(b==3)
            System.out.println("*\nCongratulations!!!");
        else
            System.out.println("You Win!");
    }

}
