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
            System.out.println("    CONCESSIONARIA  ");
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
                    caminhao1.verificarManuntecao();
                    caminhao1.calcularImposto();
                    System.out.println(caminhao1);
                    break;
                case 2:
                    System.out.println("EXIBINDO CARRO\n");
                    Motor carro=new Motor(110);
                    Proprietario Erlon=new Proprietario("Erlon","10101010101");
                    Carro carro1=new Carro("honda Civic",carro,2024,TipoCombustivelEnum.GASOLINA,4,"iwjwjwj",Erlon);
                    carro1.calcularImposto();
                    System.out.println(carro1);
                    break;
                case 3:
                    System.out.println("EXIBINDO MOTO\n");
                    Motor moto=new Motor(80);
                    Proprietario Ludgero=new Proprietario("Ludgero","11111111111");
                    Moto moto1=new Moto("XJ6",moto,2025,TipoCombustivelEnum.HIBRIDO,"BLAC1K",Ludgero);
                    moto1.calcularImposto();
                    System.out.println(moto1);
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
