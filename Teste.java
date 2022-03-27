import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Teste {
    
    public static void main(String[] args) throws Exception {
        String filePath = "/home/lucas/Projects/so2/AlocacaoIndexada/teste.txt";
        String filePath2 = "/home/lucas/Projects/so2/AlocacaoIndexada/teste1.txt";
        AlocacaoIndexada ai = new AlocacaoIndexada();
        ai.adicionarNoBuffer(filePath);
        ai.adicionarNaParticao();        
        ai.listaBlocoDeIndices.get(0).print();
        System.out.println("---------------");
        ai.adicionarNoBuffer(filePath2);
        ai.adicionarNaParticao();
        ai.listaBlocoDeIndices.get(1).print();
          }
}
