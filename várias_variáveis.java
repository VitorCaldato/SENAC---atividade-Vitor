import java.util.Scanner;

class várias_variáveis {
    public static void main(String[] args) {
        int num1;
        float real;                                       // precisa ser nome
        char c = 'S';                                     // variavel que define uma letra
        double realDouble = 10;                           // numero real de precisão dupla
        String string = new String (" vitor " ); // declara cadeias de caracter

        Scanner scan = new Scanner (System.in);
        
num1 = scan.nextInt ();              // comandos de entrada para int
System.out.println("inteiro é:" + num1);
real = scan.nextFloat();             // comandos de entrada para float
System.out.println("real" + real);
c = scan.next().charAt(0);     // comandos de entrada para char
System.out.println("Caractere: " + c);
realDouble = scan.nextDouble();      // comandos de entrada para double
System.out.println("Real Double: " + realDouble);
string = scan.next();                // comandos de entrada para string
System.out.println("String: " + string);


    }
}
