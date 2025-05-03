package br.com.cz.veiculos.model;

public class Proprietario {
    private String nome;
    private String cpf;

    public Proprietario(String nome, String cpf) {
        this.nome = nome;
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String ptCfp1=cpf.substring(0,3);
        String ptCpf2=cpf.substring(8,11);
        String novoCpf=String.format("%s*****%s",ptCfp1,ptCpf2);
        this.cpf = novoCpf;
    }

    @Override
    public String toString() {
        return "Proprietario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
