package br.com.cz.veiculos.model;

import br.com.cz.veiculos.contrato.IManutencao;
import br.com.cz.veiculos.contrato.ITributavel;
import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;

public class Carro extends Veiculo implements ITributavel, IManutencao {
    private int numeroDePortas;

    public Carro(String modelo, Motor motor, int anoFabricacao, TipoCombustivelEnum tipoCombustivelEnum, int numeroDePortas, String placa, Proprietario proprietario) {
        super(modelo, motor, anoFabricacao, tipoCombustivelEnum, placa, proprietario);
        this.numeroDePortas=numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public double calcularImposto() {
        return 500;
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado");

    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
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
    public String toString() {
        return "Carro{" + "Modelo=" + getModelo() +  "\n" + "Placa=" +
                getPlaca() +  "\n"  + "Motor=" + getMotor() +  "\n"
                + "Ano de fabricacao="  + getAnoFabricacao() +  "\n"
                + "Tipo de combustivel="  + getTipoCombustivelEnum()+  "\n"  +
                "Proprietario="  + getProprietario() +  "\n"  +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }
}
