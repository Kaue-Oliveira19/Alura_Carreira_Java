public class Exercicio3_Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(double porcentagemDesconto){
        double valorDesconto = (preco * (1 + (porcentagemDesconto / 100))) - preco;
        preco = preco - valorDesconto;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
}
