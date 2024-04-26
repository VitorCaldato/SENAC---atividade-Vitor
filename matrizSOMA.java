import java.util.Scanner;

public class matrizSOMA {      // calcula a soma dos elementos da matriz com 3 linha e 3 coluna informada pelo usuario
    public static void main(String[] args) {
     
int[][] mat = new int [3][3];
int num;
int total ;

 Scanner scan = new Scanner (System.in);

for (int i=0; i<3; i++){
    for (int j=0; j<3; j++){
       
       mat[i][j] = scan.nextInt();
}
}
for (int i=0; i<3; i++){
    for( int j=0; j<3; j++){

        System.out.print(mat[i][j]);
        total = i + j; 
    }
    

    System.out.println(" ");
}


    }
}


