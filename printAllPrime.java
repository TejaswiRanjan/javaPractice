import java.util.Scanner;

public class printAllPrime {
    public static void main(String []args){
        
            Scanner scan = new Scanner(System.in);
            int a,b,i,j,flag;
            System.out.println("enter the range : ");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("Prime number bwtween "+a+" to "+b+" are : ");
            for(i=a;i<=b;i++){
                if(i==0||i==1)
                    continue;
                    flag = 1;
                for(j=2;j<=i/2;++j){
                    if(i%j==0){
                        flag = 0;
                        break;
                    }

                }
                if(flag == 1)
                    System.out.println(i);
                
            }
         
    }
    

}
