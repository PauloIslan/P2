package POOarthur;

public class A2 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 1000, 10);
        produto1.apresentar();
    }
}
    class Produto {
        String nome;
        double preco;
        int quantidade;
    
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    double calcularTotal() {
        return preco * quantidade;
    }
    void apresentar() {
        System.out.print("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + calcularTotal());
    }
}
