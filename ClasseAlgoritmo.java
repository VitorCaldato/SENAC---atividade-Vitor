public class ClasseAlgoritmo { // algoritmo que permite criar pessoa, retangulo, livro e carro. 
                               //Ao terminar o programa mostra os atributos de todos os objetos(exceto retangulo que tem seu perimetro e area exibido)
public static void main(String[] args) {

    ClassePessoa pessoa1 = new ClassePessoa("Vitor", 18, " estudante");
    ClassePessoa pessoa2 = new ClassePessoa("Fulano", 19, "árbitro");
    ClasseRetangulo retangulo = new ClasseRetangulo(22, 12);
    Classelivro livro = new Classelivro("navegando na programação", "Desconhecido", 111, 2024);
    ClasseCarro carro = new ClasseCarro("toyota", "chacoalhota", "vermelha", 1977);

    System.out.println ("a pessoa1 é: " + pessoa1.getNome() + " com " + pessoa1.getIdade() + " anos " + "de profissão" + pessoa1.getProfissao());
    System.out.println ("A outra pessoa é: " + pessoa2.getNome() + " com " + pessoa2.getIdade() + " anos " + "e sua profissão é " + pessoa2.getProfissao());
    System.out.println ("o retangulo tem: " + retangulo.getComprimento() + " cm de comprimento, " + retangulo.getLargura() + " cm de largura, " + "sua área é "+ retangulo.getArea()+ " cm, e seu perímetro é " + retangulo.getperimetro() + "cm");
    System.out.println ("Seu livro é: " + livro.getTitulo() + " o autor é " + livro.getAutor() + " com quantidade de páginas " + livro.getNumpagina() + " publicado no ano " + livro.getAno());
    System.out.println("O carro é: " + carro.getMarca() + " modelo " + carro.getModelo() + " na cor " + carro.getCor()+ " ano de fabricação é: " + carro.getAno());

}

}