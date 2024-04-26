public class ClasseProduto {       //criar classe produto com atributo nome(String) preco(double) e quantidade(int)
                                    // metodo: adicionarEstoque(int quantidade): adicione uma quantidade ao estoque do produto
private String nome;                         // removerEstoque (int quantidade) remove uma quantidade e verifica se há suficiente
private double preço;                          // verificarDisponibilidade() verifica se há estoque disponivel
private int quantidade;                         // calcularValorTotal(int quantidade)?: calcula o valor total de uma quantidade específica
                                                //imprimirInformações(): imprime todas informações - nome, preço, quantidade em estoque
public ClasseProduto (String nome, double preço, int quantidade){
    this.nome = nome;
    this.preço = preço;
    this.quantidade = quantidade;
    }

    public void depositar (int Prod_recebido){                               // adiciona estoque
        this.quantidade += Prod_recebido;
    }

        public void sacar (int Prod_recebido){                              // remove estoque
            if (quantidade > Prod_recebido) {
            this.quantidade -= Prod_recebido;
        }
        else
        {
        System.out.println(" falta produto no estoque");
        }
        if (quantidade < 1) {
            System.out.println("estoque insuficiente");
        }
        else 
        {
            System.out.println ("há estoque disponível");
        }





        }

        }


