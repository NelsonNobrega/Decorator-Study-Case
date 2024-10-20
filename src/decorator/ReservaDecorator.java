package decorator;

// Classe apenas para realizar a reserva de um livro, sem definir um limite maximo pra devolução dele, ele tambem utiliza o decorator, ao
//adicionar novas funcionalidades relacionadas a reserva para a classe material.

public class ReservaDecorator extends MaterialDecorator {
    private String dataReserva;
    private Usuario usuario;

    public ReservaDecorator(Material material) {
        super(material);
    }

    public void reservar(Usuario usuario) {
        if (material.isDisponivel()) {
            this.usuario = usuario;
            this.dataReserva = new String();
            System.out.println(material.getTitulo() + " foi reservado por " + usuario.getNome() + ".");
        } else {
            System.out.println(material.getTitulo() + " já está indisponível para reserva.");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDataReserva() {
        return dataReserva;
    }
}