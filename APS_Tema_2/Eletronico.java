package APS_Tema_2;

public class Eletronico extends Produto {

    public int voltagem;
    public int potencia;
    public String classificEfi;

    public Eletronico(int voltagem, int potencia, String classificEfi, int codigo, String nome, String fabricante, int quantidade, int valorUni) {
        super(codigo, nome, fabricante, quantidade, valorUni);
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.classificEfi = classificEfi;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nVoltagem: " + voltagem + "\nPotencia: " + potencia + "\nClassificacao de Eficiencia: " + classificEfi;
    }

}
