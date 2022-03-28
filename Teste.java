public class Teste {
    
    public static void main(String[] args) throws Exception {
        AlocacaoIndexada ai = new AlocacaoIndexada();  
        
        String filePath = "/home/lucas/Projects/so2/alocacao-indexada/teste.txt";                
        ai.adicionarNoBuffer(filePath);
        ai.adicionarNaParticao();        
        ai.listaBlocoDeIndices.get(0).print();

        System.out.println("---------------");

        /*
        String filePath2 = "/home/lucas/Projects/so2/alocacao-indexada/teste1.txt";
        ai.adicionarNoBuffer(filePath2);
        ai.adicionarNaParticao();
        ai.listaBlocoDeIndices.get(1).print();      
        */

        System.out.println("PARTIÇÂO");
        
        for(int i = 0; i < ai.particao.length; i++) {
            System.out.println(ai.particao[i]);
        }
    }
}
