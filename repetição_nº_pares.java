import java.util.Scanner;

public class repetição_nº_pares {
   
    public static void main(String[] args) {
        int num;

Scanner scan = new Scanner(System.in);

System.out.println("digite um numero ");

 num = scan.nextInt();  
       for (int i=1; i<=num; i++){

if (i % 2 == 0 )

System.out.println(i);;
       }

    }
}
