import java.util.Scanner;

public class checkPrime{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number  : ");
        int a = scan.nextInt();
        boolean result = false;

        for(int i = 2;i<a;i++){
            if(a%i==0){
                result = true;
            }
        }

        if(result == true){
            System.out.println("The number is not a prime number");
        }else{
            System.out.println("The number is a prime number : "+a);
        }
    }
}