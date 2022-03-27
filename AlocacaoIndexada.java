import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.Random;

public class AlocacaoIndexada {
    
    private final int TAMANHO = 20;
    private byte[] buffer;
    private byte[] particao;
    private boolean[] mapaDeBits;
    public LinkedList<BlocoDeIndices> listaBlocoDeIndices;

    public AlocacaoIndexada() {        
        particao = new byte[TAMANHO];
        mapaDeBits = new boolean[TAMANHO];
        listaBlocoDeIndices = new LinkedList<>();
    }

    public void adicionarNoBuffer(String filePath) throws IOException {        
        File file = new File(filePath);
        buffer = Files.readAllBytes(file.toPath());        
    }

    public void adicionarNaParticao() {
        BlocoDeIndices blocoDeIndices = new BlocoDeIndices();
        for (int i = 0; i < buffer.length; i++) {
            boolean ocupado = true;
            int randomNumber = 0;
            while (ocupado) {
                Random random = new Random();
                randomNumber = random.nextInt(TAMANHO);
                ocupado = estaOcupado(randomNumber);
            }
            blocoDeIndices.add(randomNumber);            
            mapaDeBits[randomNumber] = true;
        }
        listaBlocoDeIndices.add(blocoDeIndices);        
    }

    public boolean estaOcupado(int i) {
        if(mapaDeBits[i]) {
            return true;
        }
        return false;
    }
}
