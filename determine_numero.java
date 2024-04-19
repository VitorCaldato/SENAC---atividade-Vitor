import java.util.Scanner;

public class determine_numero {

    public static void main(String[] args) {
      int num;                                                                  

    Scanner scan = new Scanner(System.in);  // declaração da biblioteca do scan

    System.out.println(" Digite um número: " );

    num = scan.nextInt();                              // ler entrada

if (num > 0  ){
    System.out.println(" o seu numero " + num + " é positivo:" );     }                  // saída

if (num < 0) {
System.out.println(num + " o seu numero é negativo:" ); }

if (num == 0) {
System.out.println(num + " o seu numero é zero:" ); }
} 

                                                                                    // saida tem de ser positivo negativo ou zero

    }
