package dio.facade;

import dio.Subsistema1.CrmService;
import dio.subsistema2.CepAp1;

public class Facade {
    public void migrarCliente(String nome, String cep) {
       String cidade = CepAp1.getInstancia().recuperarCidade(cep);
       String estado = CepAp1.getInstancia().recuperarCidade(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado );


    }
}
