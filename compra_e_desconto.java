import java.util.Scanner;

public class compra_e_desconto {
    
public static void main(String[] args) {

Scanner scan = new Scanner (System.in);

System.out.println(" Qual o valor da sua compra? " );

int valor = scan.nextInt();

System.out.println(" Seu valor é: " + valor );

if (valor <= 1000){ 
    System.out.println(" seu valor de " + valor + " não tem desconto" );
}
if (valor > 1000){ 
    System.out.println("Seu valor de " + valor * 0.9  + " com desconto de 10%");

}
scan.close ();
}

}
