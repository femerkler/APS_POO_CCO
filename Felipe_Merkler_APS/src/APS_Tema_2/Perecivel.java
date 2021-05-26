package APS_Tema_2;

import java.time.LocalDate;

public class Perecivel extends Produto {

    public int ano;
    public int mes;
    public int dia;
    public boolean refrigerado;

    LocalDate validade = LocalDate.of(ano, mes, dia);

    public Perecivel(int ano, int mes, int dia, boolean refrigerado, int codigo, String nome, String fabricante, int quantidade, int valorUni) {
        super(codigo, nome, fabricante, quantidade, valorUni);
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.refrigerado = refrigerado;
    }

    public String toString() {
        if (refrigerado == true) {
            return "Validade: " + validade + "Refrigerado: Sim";
        } else {
            return "Validade: " + validade + "Refrigerado: Nao";
        }
    }
}
