package br.com.cz.veiculos.main;

import br.com.cz.veiculos.enumerador.TipoCombustivelEnum;
import br.com.cz.veiculos.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num=-1;
        while (num!=0){
            Scanner sc=new Scanner(System.in);
            System.out.println("=======================  ");
            System.out.println("        VEICULOS         ");
            System.out.println("=======================  ");
            System.out.println();
            System.out.println(" MOSTRAR CAMINHAO [1]\n" +
                    " MOSTRAR CARRO    [2]\n" +
                    " MOSTRAR MOTO     [3]\n" +
                    " SAIR DO SISTEMA  [0]\n");

            System.out.println("=======================");
            System.out.println("INFORME UM NUMERO ");
            System.out.println("=======================");
            num= sc.nextInt();

            switch (num){
                case 1:
                    System.out.println("EXIBINDO CAMINHAO\n");
                    Motor caminhao=new Motor(250);
                    Proprietario beru= new Proprietario("Beru","18181818181");
                    Caminhao caminhao1=new Caminhao("Scana",4500,caminhao,2005, TipoCombustivelEnum.DIESEL,"2uauau2",beru);
                    caminhao1.ligar();
                    System.out.println(caminhao1.verificarManuntecao(false));
                    System.out.println(caminhao1);
                    caminhao1.desligar();
                    caminhao1.calcularImposto(10.00000,1000);
                    break;
                case 2:
                    System.out.println("EXIBINDO CARRO\n");
                    Motor carro=new Motor(110);
                    Proprietario Erlon=new Proprietario("Erlon","10101010101");
                    Carro carro1=new Carro("honda Civic",carro,2024,TipoCombustivelEnum.GASOLINA,4,"iwjwjwj",Erlon);
                    carro1.ligar();
                    System.out.println(carro1);
                    carro1.desligar();
                    carro1.calcularImposto(5000.000,700);
                    break;
                case 3:
                    System.out.println("EXIBINDO MOTO\n");
                    Motor moto=new Motor(80);
                    Proprietario Ludgero=new Proprietario("Ludgero","11111111111");
                    Moto moto1=new Moto("XJ6",moto,2025,TipoCombustivelEnum.HIBRIDO,"BLAC1K",Ludgero);
                    moto1.ligar();
                    System.out.println(moto1);
                    moto1.desligar();
                    moto1.calcularImposto(15.000,250);
                    break;
                case 0:
                    System.out.println("SAINDO DO SISTEMA.....");
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");

            }
        }


    }
}
