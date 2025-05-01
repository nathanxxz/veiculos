package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contrato.ITributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;

public class Carro extends Veiculo implements ITributavel {
    private int numeroDePortas;

    public Carro(String modelo, Motor motor, int anoFabricacao, TipoCombustivelEnum tipoCombustivelEnum, int numeroDePortas, String placa, Proprietario proprietario) {
        super(modelo, motor, anoFabricacao, tipoCombustivelEnum, placa, proprietario);
        this.numeroDePortas=numeroDePortas;
    }

    @Override
    public double calcularImposto() {
        return -500;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");

    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }
}
