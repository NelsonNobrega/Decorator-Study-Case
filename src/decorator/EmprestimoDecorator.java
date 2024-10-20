package decorator;


//Defino um metodo para fazer o emprestimo de um livro, definindo data de emprestimo e devolução, ele tambem utiliza o decorator, ao
//adicionar novas funcionalidades relacionadas a emprestimo para ele

public class EmprestimoDecorator extends MaterialDecorator {
    private String dataEmprestimo;
    private String dataDevolucao;
    private Usuario usuario;

    public EmprestimoDecorator(Material material) {
        super(material);
    }

    public void emprestar(Usuario usuario) {
        if (material.isDisponivel()) {
            this.usuario = usuario;
            this.dataEmprestimo = new String();
            ((Livro) material).setDisponivel(false);
            System.out.println(material.getTitulo() + " foi emprestado para " + usuario.getNome() + ".");
        } else {
            System.out.println(material.getTitulo() + " já está emprestado.");
        }
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
}
