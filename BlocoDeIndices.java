import java.util.LinkedList;

public class BlocoDeIndices {
    
    private LinkedList<Integer> lista;
    
    public BlocoDeIndices() {
        lista = new LinkedList<>();
    }

    public void add(int i) {
        lista.add(i);
    }

    public void print() {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
