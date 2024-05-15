class P_assento_economico implements P_assento{

private String livre;
private double preço;

public P_assento_economico ( String livre, double preço){
    
this.livre = livre;
this.preço = preço;
}

    public void reservar (){
        System.out.println( " assento econômico reservado ");
    }

    public String getLivre(){
        return livre;
    }

    public double getPreço (){
        return preço;
    }
}
