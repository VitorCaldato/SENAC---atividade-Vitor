public class P_aeronave {
    private String nome;
    private int poltrona, fileira, num;
    private double preço;

public P_aeronave (String nome, int poltrona, int fileira, double preço, int num){
    this.nome = nome;
    this.poltrona = poltrona;
    this.fileira = fileira;
    this.preço = preço;
    this.num = num;
}
public String getNome (){
    return nome;
}
 public int getPoltrona (){
    return poltrona;
 }
public int getFileira (){
    return fileira;
}
 public double getPreço (){
    return preço;
 }

 public void depositar (int poltrona){
       
   if (poltrona > num){
    this.poltrona += poltrona;
}
  else {
    System.out.println( " poltrona reservada ");
   }

    }
 }
 