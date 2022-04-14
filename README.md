# Alocação Indexada

**Requisitos**: 
1. A implementação deste mecanismo deve permitir a leitura (método 1) e escrita (método 2) de arquivos numa partição simulada de disco;
2. A partição simulada do disco pode ser um vetor de bytes (ou de registros), onde cada byte (ou registro) representa um bloco lógico de armazenamento;
3. As transferências dos dados do arquivo devem ocorrer entre um buffer e a partição simulada do disco (seja escrita ou leitura);
4. O buffer também pode ser definido como um vetor de bytes (ou de registros);
5. Prestar atenção à necessidade do uso de mapas de bits ou tabelas para a implementação dos mecanismos.



**Referências utilizadas para realização do projeto**:

MAZIERO, Carlos A. Sistemas operacionais: conceitos e mecanismos. Livro aberto, 2014.
SILBERSCHATZ, Abraham; GALVIN, Peter Baer; GAGNE, Greg. Fundamentos de Sistemas Operacionais . Grupo Gen-LTC, 2000.
