package PraticaIntegradora01_Banco;

import PraticaIntegradora01_Banco.Classes.Basico;
import PraticaIntegradora01_Banco.Classes.Cobradores;
import PraticaIntegradora01_Banco.Classes.Executivos;

public class TransacaoPrincipal {
    public static void main(String[] args) {

       Basico cBasica1 = new Basico();
       Cobradores cCobradores1 = new Cobradores();
       Executivos cExecutivos1 = new Executivos();

       System.out.println("\n  -- > Conta Basica");
       cBasica1.saqueDinheiro();
       cBasica1.pagamentoServicos();
       cBasica1.consultaSaldo();

        System.out.println("\n --> Conta Cobradores");
        cCobradores1.consultaSaldo();
        cCobradores1.saqueDinheiro();

        System.out.println("\n --> Conta Basica");
        cExecutivos1.deposito();
        cExecutivos1.trasferencia();


    }
}
