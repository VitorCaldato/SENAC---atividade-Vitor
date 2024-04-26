public class Classelivro {  //criar classe livro com atributos titulo, autor, numeros de paginas e ano de publicação. Adicione método para obter e definir esses atributos
    
    private String titulo, autor;
    private int numpagina, ano;

    public Classelivro (String titulo, String autor, int numpagina, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.numpagina = numpagina;
        this.ano = ano;
        }
        public String getTitulo (){
            return titulo;
        }
        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public String getAutor (){
            return autor;
        }
        public void setAutor (String autor){
            this.autor = autor;
        }

        public int getNumpagina (){
            return numpagina;
        }
        public void setNumpagina (int pagina){
            this.numpagina = numpagina;
        }

        public int getAno (){
            return ano;
        }
        public void setAno(int ano){
            this.ano = ano;
    }
}