import java.util.Scanner;

public class do_while_média_de_nota {  // utilize laço de repetição do while para calcular a média de notas digitadas até que encerre digitando nota negativa
   
    public static void main(String[] args) {
     int nota = 0, contador = 0;
     float media = 0.0f;
 
Scanner scan = new Scanner(System.in);

do{
    nota = scan.nextInt();
    if(nota >= 0){
    media = media + nota;
    contador++;
    }
}while(nota >= 0);

scan.close();

System.err.println("A média é:" + media/(float)contador);

    }
}

