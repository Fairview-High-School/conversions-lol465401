import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Salah Oulad-Daoud
 * @version 8/26/2024
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Teaspoon to Tablespoon");
        System.out.println("8. Tablespoon to Teaspoon");
        System.out.println("9. Gallons to Cups");
        System.out.println("10. Cups to Gallons");

        
        
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
           System.out.println("Enter Fahrenheit: ");
           double fahrenheit = keyboard.nextDouble();
           keyboard.nextLine();
           double celsius = (fahrenheit - 32) * 5/9;
           System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius"); //add the code to ask the user to enter Fahrenheit and then convert to Celsius
        }
        if (selection == 3)
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = (feet/3.281);
            System.out.println(feet + " feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter Meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = (meters * 3.281);
            System.out.println(meters + " meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter Ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double millimeters = (ounces * 29.574);
            System.out.println(ounces + " ounces is " + millimeters + " millimeters");
        }
        if (selection == 6)
        {
            System.out.println("Enter Millimeters ");
            double millimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = (millimeters/29.574);
            System.out.println(millimeters + " millimeters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter Teaspoon ");
            double teaspoon = keyboard.nextDouble();
            keyboard.nextLine();
            double tablespoon = (teaspoon/3);
            System.out.println(teaspoon + " teaspoon is " + tablespoon + " tablespoon");
        }
        if (selection == 8)
        {
            System.out.println("Enter Tablespoon ");
            double tablespoon = keyboard.nextDouble();
            keyboard.nextLine();
            double teaspoon = (tablespoon * 3);
            System.out.println(tablespoon + " tablespoon is " + teaspoon + " teaspoon");
        }
        if (selection == 9)
        {
            System.out.println("Enter Gallon ");
            double gallon = keyboard.nextDouble();
            keyboard.nextLine();
            double cups = (gallon * 16);
            System.out.println(gallon + " gallon is " + cups + " cups");
        }
        if (selection == 10)
        {
            System.out.println("Enter Cups ");
            double cups = keyboard.nextDouble();
            keyboard.nextLine();
            double gallon = (cups/16);
            System.out.println(cups + " cups is " + gallon + " gallon");
        }

        //add more if statements here.
    }
}