public class ClasseRetangulo {            // criar classe retangulo com atributo comprimento, largura. Adicione métodos para Calcular a area e perimetro do retangulo

    private float comprimento;
    private float largura;
    
    public ClasseRetangulo (float comprimento, float largura){
    this.comprimento = comprimento;
    this.largura = largura;
    }

    public float getComprimento(){
        return comprimento;
    }
    public void setComprimento(Float comprimento){
        this.comprimento = comprimento;
    }

    public float getLargura () {
        return largura;        }
    public void setLargura (float largura){
        this.largura = largura;
    }

    public float getArea (){
        return comprimento*largura;     
    }
        public float getperimetro (){
        return (comprimento + largura) * 2;
    }

}
