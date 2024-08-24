import Exceptions.ExceptionOne;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type some integer value: ");
        Scanner scanner = new Scanner(System.in);
        int userOutput = scanner.nextInt();

        try {
            valueCantBeNegative(userOutput);
        }
        catch (Exception e)
        {
            System.out.println("ArithmeticException => " + e.getMessage());
            System.out.println("Value should not be negative");
        }

        System.out.println("Type some integer value: ");
        int userOutput3 = scanner.nextInt();

        dontDivideBy0(userOutput,userOutput3);

        System.out.println("Type some integer value: ");
        int userOutput2 = scanner.nextInt();
        checkAge(userOutput2);

        outOfBoundary();


        noFileExp("text.txt");
        noFileExp("text2.txt");

    }

    public static void valueCantBeNegative(int a) throws ArithmeticException
    {
        if(a < 0)
        {
            throw new ExceptionOne("Exception");
        }
        System.out.println("Continue with value of a: a= " + a);

    }

    public static void noFileExp(String txtpath)
    {
        int userOutput = 0;
        try (Scanner scanner = new Scanner(System.in)){

            //userOutput = Integer.parseInt(scanner.next());
            System.out.println("Before error");
            FileReader fileReader = new FileReader(txtpath);
            System.out.println("After error");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File was not found. Skip this");
        }
        finally {
         //   scanner.close();
        }
    }

    public static void checkAge(int age) {
        if (age < 18 && age > 0) {
            throw new ArithmeticException("Access denied. You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted. You are old enough!");
        }
    }

    public static void outOfBoundary()
    {
        try {
            int tab[] = {2,4,1,5,3};

            System.out.println(tab[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        System.out.println("After exception outOfBoundary");

    }

    public static void dontDivideBy0(int a,int b)
    {
        try {
            a = a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
        System.out.println("After exception dont divide by zero exception");
    }

}