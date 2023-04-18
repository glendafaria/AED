package ListaLigada;

public class ListaLigada {

    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;

    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void add(String valor) {
        Elemento novo = new Elemento(valor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.tamanho++;
        }else {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
    }

    public void del(String valor) {

    }

    public Elemento get(int posicao) {
        Elemento atual = this.primeiro;
        for(int i = 0 ; i <= posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
    }
}
