import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Random;

public class AlocacaoIndexada {
    
    private final int TAMANHO = 20;
    private byte[] buffer;
    public byte[] particao;
    private boolean[] mapaDeBits;
    public LinkedList<BlocoDeIndices> listaBlocoDeIndices;

    public AlocacaoIndexada() {        
        particao = new byte[TAMANHO];
        mapaDeBits = new boolean[TAMANHO];
        listaBlocoDeIndices = new LinkedList<>();
    }

    public void recuperarDados() throws IOException {
        for(int i = 0; i < listaBlocoDeIndices.size(); i++) {            
            byte[] recuperacao = new byte[listaBlocoDeIndices.get(i).getSize()];                                    
            for(int j = 0; j < recuperacao.length; j++) {
                
                recuperacao[j] = particao[listaBlocoDeIndices.get(i).lista.get(j)];
                System.out.println(recuperacao.length);
            }
            String fileOutput = "/home/lucas/Projects/so2/alocacao-indexada/";
            fileOutput = fileOutput + "recuperacao" + i + ".txt";            
            Path path = Paths.get(fileOutput);
            Files.write(path, recuperacao);
        }
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
            particao[randomNumber] = buffer[i];
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
