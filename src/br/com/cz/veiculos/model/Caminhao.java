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

    @Override
    public void ligar() {

    }

    @Override
    public boolean verificarManuntecao() {
        return false;
    }

    @Override
    public double calcularImposto() {
        return -350;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
