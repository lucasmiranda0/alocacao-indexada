# Alocação Indexada

**O que é Alocação de arquivos?**

A alocação de arquivos consiste em dispor (alocar) o conteúdo e os metadados dos arquivos dentro de blocos. Como os blocos são pequenos, um arquivo pode precisar de muitos blocos para ser armazenado no disco: por exemplo, um arquivo de filme em formato MP4 com 1 GB de tamanho ocuparia 262.144 blocos de 4 KBytes. O conteúdo do arquivo deve estar disposto nesses blocos de forma a permitir um acesso rápido, flexível e confiável. Por isso, a forma de alocação dos arquivos nos blocos do disco tem um impacto importante sobre o desempenho e a robustez do sistema de arquivos.

**Por que utilizar a Alocação Indexada?**:

A alocação encadeada resolve os problemas de fragmentação externa e declaração de tamanho da alocação contígua. No entanto, na ausência de uma FAT, a alocação encadeada não pode suportar um acesso direto eficiente, já que os ponteiros para os blocos são espalhados com os próprios blocos por todo o disco e devem ser recuperados em ordem. A alocação indexada resolve esse problema colocando todos os ponteiros juntos em uma locação: o bloco de índices.

**Requisitos**: 
1. A implementação deste mecanismo deve permitir a leitura (método 1) e escrita (método 2) de arquivos numa partição simulada de disco;
2. A partição simulada do disco pode ser um vetor de bytes (ou de registros), onde cada byte (ou registro) representa um bloco lógico de armazenamento;
3. As transferências dos dados do arquivo devem ocorrer entre um buffer e a partição simulada do disco (seja escrita ou leitura);
4. O buffer também pode ser definido como um vetor de bytes (ou de registros);
5. Prestar atenção à necessidade do uso de mapas de bits ou tabelas para a implementação dos mecanismos.



**Referências utilizadas para realização do projeto**:

MAZIERO, Carlos A. Sistemas operacionais: conceitos e mecanismos. Livro aberto, 2014.
SILBERSCHATZ, Abraham; GALVIN, Peter Baer; GAGNE, Greg. Fundamentos de Sistemas Operacionais . Grupo Gen-LTC, 2000.
