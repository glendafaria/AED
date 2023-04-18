package ListaLigada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.add("AC");
        lista.add("BA");
        System.out.println("Tamanho" + lista.getTamanho());

        System.out.println(lista.getPrimeiro().getValor());
        System.out.println(lista.getUltimo().getValor());
    }
}
