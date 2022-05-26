import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.DoubleSummaryStatistics;

public class App {
  public static void main(String[] args) throws Exception{
           List <Produto> lista_produtos = new ArrayList <> ();
           List <Venda> vendas = new ArrayList<>();

              String codProduto;
              boolean encontrado = false;
              Object buscarproduto = null;
              String dataInicio;
              String dataFim;
    try (Scanner scanner = new Scanner(System.in)) {
    int opcao; {
      
      do {
      System.out.println("\n****\nMENU\n****\n");
      System.out.println("1 - Incluir Produto");
      System.out.println("2 - Consultar Produto");
      System.out.println("3 - Listagem de produto");
      System.out.println("4 - Venda Por periodo - detalhado");
      System.out.println("5 - Realizar Venda");
      System.out.println("0 - Sair");
    opcao = scanner.nextInt();
          switch (opcao){
          case 1: {
            Produto produto = new Produto();
            System.out.println("Informe o codigo do produto.");
            produto.setCodigo(scanner.next());
            System.out.println("Informe o nome do produto.");
            produto.setNome(scanner.next()); 
            System.out.println("Informe o valor do produto.");
            produto.setValor(scanner.nextDouble());
            System.out.println("Informe a quantidade.");
            produto.setEstoque(scanner.nextInt());
            lista_produtos.add(produto);
                    System.out.println("Produto Cadastrado com sucesso.");
                                             
          break;
         }      
              case 2: {System.out.println("Informe o codigo do produto");
               scanner.nextLine(); 
               codProduto = scanner.nextLine();
              for(Produto produtos: lista_produtos){
                if(produtos.getCodigo().equals(codProduto)){
                  System.out.println(produtos);
                }
              else{
                System.out.println("Codigo invalido ou produto não cadastrado");
              }}
          break;}

          case 3:
         {DoubleSummaryStatistics resumo = lista_produtos.stream()
          .collect(Collectors.summarizingDouble(Produto::getValor));
           System.out.println("Listagem Estoque.");
         if(lista_produtos.isEmpty()){
           System.out.println("Sem produtos em estoque");
         }else{
         System.out.println("-------------------------Listagem de Produtos----------------------------");
         System.out.printf("%7s %20s %20s %20s\n", "Nome", "Código", "Valor","Quantidade");
         System.out.println("-------------------------------------------------------------------------");
           for (Produto produtos: lista_produtos) {
         System.out.printf( "%7s %20s %20s %20s\n", produtos.getNome(),produtos.getCodigo(),produtos.getValor(),produtos.getEstoque());
           }
           System.out.println("\n");
           System.out.println("-----------------------------Resumo Médio--------------------------------");
           System.out.printf( "Menor valor %s - Média de valor %s - Maior valor %s\n",resumo.getMin(), resumo.getAverage(),resumo.getMax());
         }
         break; } 

         case 4: {System.out.println("Informe a data inicial");

                   break;}
                   case 5: { double valorVenda;
                     Venda Venda = new Venda();
                            System.out.println("Informe o codigo do produto");
                            Venda.setVenda(scanner.next());
                            codProduto = Venda.getVenda();
                            encontrado = false;
                            buscarproduto = null;
                            for(Produto Item: lista_produtos){
                              if(Item.getCodigo().equalsIgnoreCase(codProduto)){
                                encontrado = true;
                                buscarproduto = lista_produtos;
                              }
                            }
                            if(encontrado){
                              System.out.println("Produto Encontrado: "+buscarproduto);
                            }else{
                              System.out.println("Codigo invalido ou produto não cadastrado"); break;
                            }
                            System.out.println("Informe a Data da venda");
                            Venda.setData(scanner.next());
                            System.out.println("Informe Quantidade Vendida");
                            int vendidos = scanner.nextInt();
                            Venda.setQuantidade(scanner.nextInt());
                            for (Produto produtos: lista_produtos){
                              if(produtos.getCodigo().equals(codProduto)){
                                valorVenda = produtos.getValor()*vendidos;
                              }
                            }
                          
                            vendas.add(Venda);
                            System.out.println("Venda Lançada");
                           

                            break;}
                           case 6: {System.out.println("Você saiu do sistema");}
        
         }} while (opcao!= 0);
         scanner.close();
         }
         } 
        }
      }
     
         