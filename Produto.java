public class Produto {

public String nome;
public double preco;

public Produto (String nome, double preco){

    this.nome = nome;
    this.preco = preco;
}
    public void exibirInfo() {
        System.out.println("Nome " + nome);
        System.out.println("Preço R$" + preco);
    }





}


