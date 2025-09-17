package application.lista;

public class Node {
    private String valor;
    private Node proximo;

    public String getValor(){
        return this.valor;
    }

    public void setProximo(Node proximo){
        this.proximo = proximo;
    }

    public Node getProximo(){
        return this.proximo;
    }

    public Node(String valor){
        this.valor = valor;
        this.proximo = null;


    }

}
