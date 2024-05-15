public class P_assento1ªclasse implements P_assento{

    private String livre;
    private double preço;

    public P_assento1ªclasse (String livre, double preço){
        this.livre = livre;
         this.preço = preço;
        }

    public String getLivre (){
        return livre;
        }

    public double getPreço() {
        return preço;
        }

    public void reservar (){
        System.out.println( " Assento de primeira classe reservado " );
    }
}
