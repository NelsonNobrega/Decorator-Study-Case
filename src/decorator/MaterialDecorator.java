package decorator;

//Classe definindo as principais caracteristicas que cada livro vai ter, usando o padrão decorator, para redifinir o metodo material

public abstract class MaterialDecorator implements Material {
    protected Material material;

    public MaterialDecorator(Material material) {
        this.material = material;
    }

    @Override
    public String getTitulo() {
        return material.getTitulo();
    }

    @Override
    public String getAutor() {
        return material.getAutor();
    }

    @Override
    public boolean isDisponivel() {
        return material.isDisponivel();
    }
}
