import java.util.Scanner;
public class Practice{
    public boolean check(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = scan.nextInt();


        Practice pr = new Practice();

        if(pr.check(a)==true){
            System.out.println("The input number is Even");
        }else{
            System.out.println("The input number is Odd");
        }
        

    }
}