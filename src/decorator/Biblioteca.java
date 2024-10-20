package decorator;

//Essa classe gerencia o uso dos materiaisdecorator, para verificar se os livros estarão disponiveis ou não.


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiais = new ArrayList<>();

    public void adicionarMaterial(Material material) {
        materiais.add(material);
    }

    public void emprestar(Material material, Usuario usuario) {
        if (material instanceof EmprestimoDecorator) {
            ((EmprestimoDecorator) material).emprestar(usuario);
        } else {
            System.out.println("Emprestimo não disponível para este material.");
        }
    }

    public void reservar(Material material, Usuario usuario) {
        if (material instanceof ReservaDecorator) {
            ((ReservaDecorator) material).reservar(usuario);
        } else {
            System.out.println("Reserva não disponível para este material.");
        }
    }

    public List<Material> getMateriais() {
        return materiais;
    }
}

