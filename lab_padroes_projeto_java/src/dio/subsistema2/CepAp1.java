package dio.subsistema2;

public class CepAp1 {
        private static CepAp1 instancia = new CepAp1();

        private CepAp1() {
            super();
        }

        public static CepAp1 getInstancia() {
            return instancia;
        }
        public String recuperarCidade(String cep) {
            return "Creoli";
        }
        public String recuperarEstado(String cep) {
            return "MA";
        }

}
