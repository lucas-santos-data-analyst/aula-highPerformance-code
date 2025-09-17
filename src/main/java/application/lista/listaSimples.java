package application.lista;

public class listaSimples {
    private Node head;
    private int tamanho;

    public listaSimples(){
        this.head = null;
        this.tamanho = 0;
    }

    public void adicionar(String valor){
        Node node = new Node(valor);

        if(head == null){
            head = node;
        } else {
            Node atual = this.head;

            while (atual.getProximo()!=null) {

                atual = atual.getProximo();

            }

            atual.setProximo(node);
        }
        this.tamanho++;
    }

    public void remover(int indice){
        if(this.head == null || indice < 0 || indice >= this.tamanho){
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if(indice == 0){
            this.head = head.getProximo();
        } else {
            Node atual = this.head;
            Node anterior = null;

            for( int cont = 0; cont < indice; cont ++){
                anterior = atual;
                atual = atual.getProximo();
            }
            
            anterior.setProximo(atual.getProximo());


        }
        this.tamanho--;
    }

    @Override
    public String toString(){

        String resultado = "";
    
        if(this.head != null){

            Node atual = this.head; 

            do{

                resultado += atual.getValor() + " ";

                atual = atual.getProximo();

            } while (atual !=null);

        }

    return resultado;
    }
}
