package PraticaIntegradora01_Banco.Classes;

import PraticaIntegradora01_Banco.Implements.Deposito;
import PraticaIntegradora01_Banco.Implements.Trasferencia;

public class Executivos implements Deposito, Trasferencia {

    @Override
    public void deposito() {
        System.out.println(" - Deposito feito com sucesso!");
    }

    @Override
    public void trasferencia() {
        System.out.println(" - Trasnferencia realizada!");

    }

    @Override
    public void TransacaoOK() {
        System.out.println(" - Transação ok! ");
    }

    @Override
    public void TransacaoNaoOk() {
        System.out.println(" - Transação não ok! ");
    }

}
