import java.util.Scanner;

 public class matriz3 {       // imprimir matriz com 3 linha e 3 coluna
    public static void main(String[] args) {

       int[][] mat = new int [3] [3];
Scanner scan = new Scanner (System.in);

    for (int i = 0; i < 3; i++){
        for (int j = 0; j<3; j++){
         
            mat[i][j] = scan.nextInt();   // faz com que o usuário digite os numeros que deseja.
                             
                }
        }       
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
    System.out.print(mat[i][j]);
            }
            System.out.println(" ");
}

        }  
      
    }
   