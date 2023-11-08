import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number : ");
        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (num%3==0){
            System.out.println("Buzz");
        } else if (num%5==0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num);
        }

    }
}