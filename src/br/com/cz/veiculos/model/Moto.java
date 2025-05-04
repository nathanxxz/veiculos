package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contrato.IManutencao;
import br.com.cz.veiculos.contrato.ITributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;

public class Moto extends Veiculo implements ITributavel, IManutencao {
    public Moto(String modelo, Motor motor, int anoFabricacao, TipoCombustivelEnum tipoCombustivelEnum, String placa, Proprietario proprietario) {
        super(modelo, motor, anoFabricacao, tipoCombustivelEnum, placa, proprietario);
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }

    @Override
    public boolean verificarManuntecao(boolean verificador) {
        if (verificador){
            System.out.println("Verificando manutencao");
            return true;
        }
        else {
            System.out.println("Verificacao negada");
            return false;
        }

    }


    @Override
    public double calcularImposto(double valorVeiculo, double valorAliquota) {
        if (valorVeiculo>0){
            double ipva=valorVeiculo*(valorAliquota/100);
            System.out.printf("Valor de imposto é %.2f:\n", ipva );

        }
        else{
            System.out.println("Valores invalidos\n");
        }
        return 0;
    }

    @Override
    public String toString() {
       return "Moto{" + "Modelo=" + getModelo() +  "\n" + "Placa=" +
                getPlaca() +  "\n"  + "Motor=" + getMotor() +  "\n"
                + "Ano de fabricacao="  + getAnoFabricacao() +  "\n"
                + "Tipo de combustivel="  + getTipoCombustivelEnum()+  "\n"  +
                "Proprietario="  + getProprietario() +  "\n" +
                '}';
    }
}
