public class Teste {
    
    public static void main(String[] args) throws Exception {
        AlocacaoIndexada ai = new AlocacaoIndexada();  
        
        String filePath = "";                
        ai.adicionarNoBuffer(filePath);
        ai.adicionarNaParticao();                
        
        System.out.println("---------------");
    
        String filePath2 = "";
        ai.adicionarNoBuffer(filePath2);
        ai.adicionarNaParticao();        
        
        ai.recuperarDados();

        System.out.println("PARTIÇÂO");
        
        for(int i = 0; i < ai.particao.length; i++) {
            System.out.println(ai.particao[i]);
        }
    }
}
