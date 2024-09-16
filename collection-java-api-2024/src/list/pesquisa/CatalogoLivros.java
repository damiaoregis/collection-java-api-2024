package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        this.livros.add(new Livro(titulo, autor, ano));
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        Livro resultado = null;
        if (livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    resultado = livro;
                    break;
                }
            }
        }
        return resultado;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> resultado = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    resultado.add(livro);
                }
            }
        }
        return resultado;
    }


   public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> resultado = new ArrayList<>();
        if(!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                    resultado.add(livro);
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        Livro l1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1937);
        Livro l2 = new Livro("1984", "George Orwell", 1949);
        Livro l3 = new Livro("A Game of Thrones", "George R. R. Martin", 1996);
        Livro l4 = new Livro("Pride and Prejudice", "Jane Austen", 1813);


        Livro resultado1 = catalogo.pesquisarLivroPorTitulo("1984");
        List<Livro> resultado2 = catalogo.pesquisarLivrosPorAutor("George Orwell");
        List<Livro> resultado3 = catalogo.pesquisarPorIntervaloAnos(1940, 1950);
    }
}
