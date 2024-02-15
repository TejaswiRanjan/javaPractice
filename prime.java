import java.util.Scanner;
public class prime {
    public static void main(String []args){

        int a,b,i,j,flag=0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Range : ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("Prime numbers between "+a+" to "+b+" are : ");

        for(i=a;i<=b;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}
