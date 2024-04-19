import java.util.Scanner;

class atividade1{
    public static void main(String[] args) {
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println(" escreva o primeiro número: " );
         num1 = scan.nextInt ();   
        
              System.out.println( " escreva o segundo número: " );
        num2 = scan.nextInt();
        System.out.print("A soma do primeiro e segundo numero é: " + (num1 + num2));
    }
}