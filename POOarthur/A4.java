package POOarthur;

public class A4 {
    class ContaBancaria {
        public String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        public String depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                return "Deposito concluido.";
            } else {
                return "Valor invalido.";
            }
        }

        public String sacar(double valor) {
            if (valor > 0 && valor <= this.saldo) {
                saldo -= valor;
                return "Saque concluido.";
            } else {
                return "Valor invalido ou saldo insuficiente.";
            }
        }

        public double getSaldo() {
            return this.saldo;
        }
    }
}
