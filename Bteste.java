import java.util.Scanner;

public class Bteste{  // criar uma variável de cada tipo de dado, depois criar comando de entrada (input.nextint) para atribuir valores e depois comando de saída (system.out.println)
    
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int num1;
        float real;                                         // precisa ser nome
        char c = 'd';                                      // variavel que define uma letra
        double realdouble = 10;                           // numero real de precisão dupla
        String string = new String("vitor");    // declara cadeias de caracter
        
        System.out.println(" digite um numero");
num1 = scan.nextInt();          // comandos de entrada para int
System.out.println(" o inteiro é " + num1);

System.out.println(" digite outro numero");

real = scan.nextFloat();
System.out.println( "o float é" + real);

System.out.println(" digite uma letra");

System.out.println(" o char é " + c);

System.out.println(" digite um numero");
realdouble = scan.nextDouble();
System.out.println("o double é " + realdouble);

System.out.println(" digite uma palavra");
string = scan.next();
System.out.println(" o string é: " + string);



}
}
