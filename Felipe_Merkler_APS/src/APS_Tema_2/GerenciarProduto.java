package APS_Tema_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciarProduto {

    ArrayList<Produto> produtos = new ArrayList();

    //adiciona um produto ao ArrayList;
    public void adicionar(Produto p) {
        produtos.add(p);
    }

    //busca o produto com o código correspondente e o remove do ArrayList, retornando true – se não encontrar o produto, retorna false;
    public boolean remover(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                produtos.remove(p);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //busca o produto dado pelo código, retornando-o se encontrado. Caso não encontre, retorne null;
    public Produto buscarPorCodigo(int codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                System.out.println(p.toString());
                return p;
            } else {
                return null;
            }
        }
        return null;
    }

    //lista todos os produtos eletrônicos, guardando seus dados em uma String e depois retornando essa String;
    public String listarEletronicos() {
        return null;
    }

    //lista todos os produtos perecíveis, guardando seus dados em uma String e depois retornando essa String;
    public String listarPereciveis() {
        return null;
    }

    //lista todos os produtos que sejam móveis, guardando seus dados em uma String e depois retornando essa String;
    public String listarMoveis() {
        return null;
    }

    //lista todos os produtos que estejam com estoque menor que o indicado pelo valor quantidadeMinima, guardando os dados em uma String e depois retornando essa String;
    public String listarEstoqueMenorQue(int quantidadeMinima) {
        return null;
    }

    //lista todos os produtos que estejam com quantidade igual a zero, guardando os dados em uma String e depois retornando essa String;
    public String listarEstoqueVazio() {
        return null;
    }

    //lista todos os produtos feitos por um certo fabricante, guardando os dados em uma String e depois retornando essa String;
    public String listarPorFabricante(String fabricante) {
        return null;
    }

    //lista todos os produtos que vencerão na data especificada por parâmetro, guardando os dados em uma String e depois retornando essa String;
    public String listarPorValidade(LocalDate validade) {
        return null;
    }

    //lista todos os produtos que vencerão dentro do intervalo especificado por parâmetro, guardando os dados em uma String e depois retornando essa String;
    public String listarPorValidade(LocalDate minima, LocalDate maxima) {
        return null;
    }

    //procura o produto indicado pelo código e vende a quantidade pedida, retornando o valor da venda. Caso o produto não exista, retorne -1;
    public double venderProduto(int codigoProduto, int quantidade) {
        return -1;
    }

    //procura o produto indicado pelo código e adiciona a quantidade passada ao estoque daquele produto, retornando true. Caso não encontre o produto, retorne false;
    public boolean comprarProduto(int codigoProduto, int quantidade) {
        return true;
    }

    //lista todos os produtos, guardando os dados em uma String e depois retornando essa String;
    public String listarTudo() {
        return null;
    }

}
