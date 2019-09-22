
import java.util.*;
import java.lang.*;
import java.io.*;


class RestaurantCalculator
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner stdin = new Scanner(System.in);
        int opt = 1;
        double totalprice = 0;
        double tip;

        while(opt == 1)
        {
            System.out.println("Enter the prices of all the items ordered.");
            double price = stdin.nextDouble();

            System.out.println("Do you want to add more items (1 for Yes, 0 for No)");
            opt = stdin.nextInt();
            totalprice = totalprice + price;
        }

        System.out.println("The total price of the items = " + totalprice);

        if(totalprice > 100)
            tip = 0.2 * totalprice;
        else if(totalprice > 0 && totalprice < 100)
            tip = 0.15 * totalprice;
        else if(totalprice > 2 && totalprice < 50)
            tip = 0.05 * totalprice;
        else
            tip = 0;

        double tax = 0.1 * totalprice;

        double finaltotal = totalprice + tip - tax;

        System.out.println("The total price of items ordered = " + totalprice);
        System.out.println("Tax = " + tax);
        System.out.println("Tip = " + tip);
        System.out.println("Final total = " + finaltotal);


    }
}