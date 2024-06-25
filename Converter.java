import java.util.*;
public class Converter 
{
    long toBinary(int num) 
    {
        String binary = "";
        int temp = num;
        while (temp > 0) 
        {
            int remainder = temp % 2;
            binary = remainder + binary;
            temp=temp/2;
        }
        long bin=Long.parseLong(binary);
        return bin;
    }

    int toDecimal(long num) {
        int decimal = 0;
        int base = 1;
        long temp = num;
        while (temp > 0) {
            int digit = (int) (temp % 10);
            decimal += digit * base;
            base *= 2;
            temp /= 10;
        }
        return decimal;
    }

    public static void main(String args[])
    {
        Converter ob=new Converter();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to convert Decimal to Binary");
        System.out.println("Enter 2 to convert Binary to Decimal");
        System.out.print("Enter your choice: ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int Num = in.nextInt();
                long binary =ob.toBinary(Num);
                System.out.println("Binary Equivalent: " + binary);
                break;

            case 2:
                System.out.print("Enter a binary number: ");
                long binarynum = in.nextLong();
                long decimal=ob.toDecimal(binarynum);
                System.out.println("Decimal Equivalent: " + decimal);
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}