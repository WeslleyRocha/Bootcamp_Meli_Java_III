package PraticaIntegradora01_Banco.Classes;

import PraticaIntegradora01_Banco.Implements.ConsultaSaldo;
import PraticaIntegradora01_Banco.Implements.PagamentoServicos;
import PraticaIntegradora01_Banco.Implements.SaqueDinheiro;

public class Basico implements ConsultaSaldo, PagamentoServicos, SaqueDinheiro {


    @Override
    public void consultaSaldo() {
        System.out.println(" - Consultando Saldo");
    }

    @Override
    public void pagamentoServicos() {
        System.out.println(" - Pagamento de serviços feito com sucesso! ");
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
