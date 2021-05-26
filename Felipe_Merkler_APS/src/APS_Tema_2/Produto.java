package APS_Tema_2;

public abstract class Produto {

    private int codigo;
    private String nome;
    private String fabricante;
    private int quantidade;
    private int valorUni;

    // remove a quantidade pedida do estoque, e retorna o valor de venda equivalente
    // caso não haja quantidade suficiente, retorne -1;
    public double vender(int quantidade) {
        if (this.quantidade >= quantidade) {
            System.out.println("Vendido " + quantidade + " " + nome);
            return this.quantidade - quantidade;
        } else {
            System.out.println("Estoque insuficiente.");
            return -1;
        }
    }

    // adiciona a quantidade pedida ao estoque;
    public void comprar(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    // retorna todos os dados do produto;
    @Override
    public String toString() {
        return "Codigo : " + codigo + "\nNome: " + nome + "\nFrabricante: " + fabricante + "\nQuantidade: " + quantidade + "\nValor Unitario: " + valorUni;
    }

    //– Construtor: apenas um, com todos os dados;
    public Produto(int codigo, String nome, String fabricante, int quantidade, int valorUni) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
        this.valorUni = valorUni;
    }

    //· Gets e sets: gets para todos os atributos, quantidade sem set
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getValorUni() {
        return valorUni;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValorUni(int valorUni) {
        this.valorUni = valorUni;
    }

}
