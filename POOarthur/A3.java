package POOarthur;

public class A3 {
    class Aluno {

        String nome;
        double nota1;
        double nota2;
        double nota3;

        Aluno (String nome, double nota1, double nota2, double nota3) {
        
            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

        double calcularMedia() {
            return (nota1 + nota2 + nota3 / 3);
        }

        String verificarSituacao() {
            double media = calcularMedia();

            if (media >= 7) {
                return "Aprovado";
            } else if (media >= 4) {
                return "Recuperação";
            } else {
                return "Reprovado";
            }
        }

        void apresentar() {
            System.out.println("Nome:" + nome);
            System.out.println("Media: " + calcularMedia());
            System.out.println("Situação: " + verificarSituacao());
        }
    
    }
}
