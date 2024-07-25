
import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int n=sc.nextInt();
       
        Triangle(n);
        Pyramid(n);
    
    }



    public static void Triangle(int n){
        System.out.println("jnjnjj");
    
        int row=1;
        int star= 1;
  
        while (row<=n) {
           
           int i=1;
           while (i<=star) {
              System.out.print("* ");
              i++;
           }
  
  
           row++;
           star+=2;
           System.out.println();
    }
    }



    public static void  Pyramid(int n){
       
        int row=1;
        int star=1;
        int space=n-1;

        while (row<=n) {
        
            //space
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;

            }
            


            //Star
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            star+=2;
            row++;
            space--;

        }
    }
}




