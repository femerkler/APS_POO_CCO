package APS_Tema_2;

public class Movel extends Produto {

    public String material;

    public Movel(String material, int codigo, String nome, String fabricante, int quantidade, int valorUni) {
        super(codigo, nome, fabricante, quantidade, valorUni);
        this.material = material;
    }

    @Override
    public String toString() {
        return "\nMaterial: " + material;
    }
}
