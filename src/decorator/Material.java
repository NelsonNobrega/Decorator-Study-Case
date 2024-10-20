package decorator;

//Classe que passa os principais pontos dos livros, que ira passar por outras implementações em outras classes apartir do decorator.

public interface Material {
    String getTitulo();
    String getAutor();
    boolean isDisponivel();
}
