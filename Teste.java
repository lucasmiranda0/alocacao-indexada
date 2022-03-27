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
        /*
        
        AlocacaoIndexada ai = new AlocacaoIndexada();
        ai.adicionarNoBuffer(filePath);
        
        byte[] particao = new byte[1000];
        String filePath = "/home/lucas/Projects/so2/AlocacaoIndexada/teste.txt";
        File file = new File(filePath);
        byte[] bytes = Files.readAllBytes(file.toPath());
        System.out.println(bytes.length);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(particao[i]);
        }
        
        
        byte[] myvar = "Any String you want".getBytes();
        System.out.println(myvar.length);
        
        String s = new String(myvar);
        String s2 = "aloha";
        System.out.println(s);
        byte[] myvar2 = (s + s2).getBytes();
        System.out.println(myvar2.length);
        */
    }
}