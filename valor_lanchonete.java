import java.util.Scanner;

class valor_lanchonete {
    
public static void main(String[] args) {

   Scanner scan = new Scanner (System.in);

   int código = scan.nextInt();     
   float quantidade = scan.nextInt();
   scan.close ();

    switch (código) {
        case 100:
         
        System.out.println("cachorro quente");   
        System.out.println(quantidade * 1.10f);
            break;

            case 101: System.out.println("bauru simples");   
            System.out.println(quantidade * 1.30);
            break;

            case 102: System.out.println("Bauru com ovo");   
            System.out.println(quantidade * 1.50);
            break;

            case 103: System.out.println("Hamburguer");   
            System.out.println(quantidade * 1.10);

            break;

            case 104: System.out.println("cheeseburger");   
            System.out.println(quantidade * 1.30);
            break;

            case 105: System.out.println("refrigerante");   
            System.out.println(quantidade * 1.30);
            break;

            case 106: System.out.println("suco");  
            System.out.println(quantidade * 2); 
            break;
           
        default:
            break;
    }
}

}
