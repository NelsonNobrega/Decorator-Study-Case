package decorator;

//Classe para criar os livros, usuarios, e gerenciar eles.

public class Executar {

	    public static void main(String[] args) {
	        Material romance = new Romance("O Morro dos Ventos Uivantes", "Emily Brontë");
	        Material dicionario = new Dicionario("Dicionário de Inglês", "Oxford");

	        Usuario usuario1 = new Usuario("João", "12345");
	        Usuario usuario2 = new Usuario("Maria", "54321");

	        Material romanceComEmprestimo = new EmprestimoDecorator(romance);
	        Material romanceComReserva = new ReservaDecorator(romanceComEmprestimo);

	        Material dicionarioComReserva = new ReservaDecorator(dicionario);

	        Biblioteca biblioteca = new Biblioteca();
	        biblioteca.adicionarMaterial(romanceComReserva);
	        biblioteca.adicionarMaterial(dicionarioComReserva);

	        biblioteca.emprestar(romanceComEmprestimo, usuario1);
	        biblioteca.reservar(romanceComReserva, usuario2);

	        biblioteca.reservar(dicionarioComReserva, usuario2);
	    }
	}