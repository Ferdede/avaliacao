import java.util.List;

public class Venda {
   private String datavenda;
   private String produtoVendido;
   private int quantidadeVendida;
    
   public Venda(){

   }
   public Venda(String datavenda, String produtoVendido, int quantidadeVendida){
       setData(datavenda);
       setVenda(produtoVendido);
       setQuantidade(quantidadeVendida);
   }
   public String getData(){
       return datavenda;
   }
   public void setData(String datavenda){
       this.datavenda = datavenda;
   }
   public String getVenda(){
       return produtoVendido;
   }
   public void setVenda(String produtoVendido){
       this.produtoVendido = produtoVendido;
   }
   public int getQuantidade(){
       return quantidadeVendida;
   }
   public void setQuantidade(int quantidadeVendida){
       this.quantidadeVendida = quantidadeVendida;
   }
   @Override
   public String toString(){
       return "Data da venda: "+datavenda+" Produto vendido: "+produtoVendido+" Quantidade: "+quantidadeVendida+"";
   }
public void add(List<Venda> vendas) {
}
}
