import java.util.Scanner;

public class UserInput
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print(" Your fav number: ");

        if (userInput.hasNextInt())
        {
            int numberEntered = userInput.nextInt();

            System.out.println(" Entered: " + numberEntered);

            int numberEnteredCalulated = numberEntered + numberEntered ^ numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " ^ " + numberEntered + " = " + numberEnteredCalulated);

        }

        else
        {
            System.out.println(" Ingeter only input");
        }

        System.out.println(" ");
        System.out.println(" Enter The first Number: ");

        if (userInput.hasNextInt())
        {


            int numberSize1 = userInput.nextInt();

            System.out.println(" Enter The second Number: ");

            int numberSize2 = userInput.nextInt();

            int numberSizeTotal1 = Math.max(numberSize1, numberSize2);
            int numberSizeTotal2 = Math.min(numberSize1, numberSize2);

            System.out.println(" Biggest number: " + numberSizeTotal1);
            System.out.println(" Lowest Number: " + numberSizeTotal2);

        }


    }
}