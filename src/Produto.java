import java.util.List;

public class Produto {
    String _codigo;
    String _nome;
    double _valor;
    int _estoque;

    public Produto(){

}
    public Produto (String _codigo, String _nome, double _valor, int _estoque){
     setCodigo(_codigo);
     setNome(_nome);
     setValor(_valor);
     setEstoque(_estoque);
    }
    
    public String getCodigo(){
        return _codigo;
    }
    public void setCodigo(String _codigo){
        this._codigo = _codigo;
    }
    public String getNome(){
      return _nome;
    }
    public void setNome(String _nome){
        this._nome = _nome;
    }
    public double getValor(){
        return _valor;
    }
    public void setValor(Double _valor){
        this._valor = _valor;
    }
    public double getEstoque(){
        return _estoque;
    }
    public void setEstoque(int _estoque){
        this._estoque = _estoque;
    }    
    public String tostring(){
        return "Codigo: "+ _codigo + ", Nome: "+_nome+ ", Valor Unitário: "+_valor+ ", Quantidade em estoque: "+_estoque+"";
    }
    public static void add(List<Produto> produtos) {
    }    
    
}
