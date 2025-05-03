package br.com.cz.veiculos.model;

import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;

public abstract class  Veiculo {
    private String modelo;
    private int anoFabricacao;
    private String placa;
    private TipoCombustivelEnum tipoCombustivelEnum;
    private Motor motor;
    private Proprietario proprietario;

    public Veiculo(String modelo,Motor motor, int anoFabricacao,TipoCombustivelEnum tipoCombustivelEnum, String placa,Proprietario proprietario) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.tipoCombustivelEnum=tipoCombustivelEnum;
        this.motor=motor;
        this.proprietario=proprietario;
    }
    public abstract void ligar();

    public  abstract void desligar();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
         return this.placa;
    }

    public void setPlaca(String placa) {
        if (this.placa.length()==7){
            System.out.println("Placa valida");
            this.placa=placa;
        }
        else {
            System.out.println("Placa nao possui 7 caracteres");
        }
    }


    public TipoCombustivelEnum getTipoCombustivelEnum() {
        return tipoCombustivelEnum;
    }

    public void setTipoCombustivelEnum(TipoCombustivelEnum tipoCombustivelEnum) {
        this.tipoCombustivelEnum = tipoCombustivelEnum;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                ", placa='" + placa + '\'' +
                ", tipoCombustivelEnum=" + tipoCombustivelEnum +
                ", motor=" + motor +
                ", proprietario=" + proprietario +
                '}';
    }
}
