package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contrato.IManutencao;
import br.com.cz.veiculos.contrato.ITributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;

public class Caminhao extends Veiculo implements ITributavel, IManutencao {
    private double capacidadeCarga;
    public Caminhao(String modelo,double capacidadeCarga, Motor motor, int anoFabricacao, TipoCombustivelEnum tipoCombustivelEnum, String placa, Proprietario proprietario) {
        super(modelo, motor, anoFabricacao, tipoCombustivelEnum, placa, proprietario);
        this.capacidadeCarga=capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void ligar() {
        System.out.println("Caminhao ligado");

    }

    @Override
    public void desligar() {
        System.out.println("Caminhao desligado");
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
    public double calcularImposto() {
        return 350;
    }

    @Override
    public String toString() {
        return "Caminhao{" + "Modelo=" + getModelo() +  "\n" + "Placa=" +
                getPlaca() +  "\n"  + "Motor=" + getMotor() +  "\n"
                + "Ano de fabricacao="  + getAnoFabricacao() +  "\n"
                + "Tipo de combustivel="  + getTipoCombustivelEnum()+  "\n"  +
                 "Proprietario="  + getProprietario() +  "\n"  +
                "capacidadeCarga=" + capacidadeCarga +
                '}';
    }
}
