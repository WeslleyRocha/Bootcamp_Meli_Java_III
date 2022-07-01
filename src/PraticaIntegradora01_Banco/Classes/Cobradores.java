package PraticaIntegradora01_Banco.Classes;

import PraticaIntegradora01_Banco.Implements.ConsultaSaldo;
import PraticaIntegradora01_Banco.Implements.SaqueDinheiro;

public class Cobradores implements SaqueDinheiro, ConsultaSaldo {

    @Override
    public void consultaSaldo() {
        System.out.println(" - Consultando Saldo");
    }

    @Override
    public void saqueDinheiro() {
        System.out.println(" - Saque de dinheiro ok!");
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
