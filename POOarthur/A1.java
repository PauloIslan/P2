package POOarthur;

public class A1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Paulo", 22);
        pessoa1.apresentar();
    }
}
    class Pessoa{
        String nome;
        int idade;
    
    Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
