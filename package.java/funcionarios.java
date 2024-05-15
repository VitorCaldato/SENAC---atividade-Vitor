package package.java; //Crie uma hierarquia de classes para representar diferentes tipos de funcionários. 
                    // A classe base deve ser Funcionario, com subclasses Gerente e Atendente. 
                    //Cada funcionário deve ter um método diferente para calcular o salário (mas com o mesmo nome).

public class funcionarios {
   private String gerente, atendente;
   private float salario;

   public funcionarios (String gerente, String atendente, float salario){
    this.gerente=gerente;
    this.atendente=atendente;
    this.salario = salario;
}
public String getGerente (){
    return gerente;
}

public String getAtendente(){
    return atendente;
}

public float getSalario(){
    return salario;
}
public void getInformacao (String gerente, String atendente, float salario){
    System.out.println(gerente + salario) ;
    System.out.println (atendente + salario);
}

}

