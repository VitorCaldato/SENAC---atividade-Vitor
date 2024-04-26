public class ClassePessoa {    // criar classe Pessoa com atributo nome, idade, profissão. Adicione métodos para obter e definir esses atributos
        private String nome;
        private int idade;
        private String profissao;

        // construtor 
    public ClassePessoa (String nome, int idade, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
// metodo de acesso

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public int getIdade (){  
        return idade;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }
    
    public String getProfissao(){   
        return profissao;
    }  
    public void setProfissao(String profissao){
        this.profissao = profissao;
    }           
    
}

 
    
        
    

