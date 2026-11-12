package POOarthur;

public class A5 {
    class Livro {

        String titulo;
        String autor;
        int ano;
        
        Livro(String titulo, String autor, int ano) {
            this.titulo = titulo;
            this.autor = autor;
            this.ano = ano;
        }

        void apresentar() {
            System.out.println("\n Titulo: " + titulo);
            System.out.println("\n Autor: " + autor );
            System.out.println("\n Ano: " + ano);
        }

            
        }

        public static void main(String[] args) {

            A5 programa = new A5();

             Livro livro1 = programa.new Livro ("A volta de quem nao foi", "Leno Brega", 2010);
            Livro livro2 = programa.new Livro ("Homem Aranha: Quero minha casa", "Roberto Carlos", 1999);

            livro1.apresentar();
            System.out.println();
            livro2.apresentar();
            
        }
    }