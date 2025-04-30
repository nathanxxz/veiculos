package br.com.cz.veiculos.main;

import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;
import br.com.cz.veiculos.model.Caminhao;
import br.com.cz.veiculos.model.Motor;
import br.com.cz.veiculos.model.Proprietario;

public class Main {
    public static void main(String[] args) {
        Motor caminhao=new Motor(250);
        Proprietario beru= new Proprietario("Beru","18181818181");
        Caminhao caminhao1=new Caminhao("Scana",4500,caminhao,2005, TipoCombustivelEnum.DIESEL,"2uauau2",beru);
        caminhao1.verificarManuntecao();
        caminhao1.calcularImposto();
        System.out.println(caminhao1);


    }
}
