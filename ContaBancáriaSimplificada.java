public class ContaBancáriaSimplificada {
    String nome = "";
    int saldo = 0;
    boolean especial = false;

    public void abreContaSimples(String nomeInformado) {
        if (this.saldo >= 100) {
            this.nome = nomeInformado;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposita(int valor) {
        this.saldo += valor;
    }

    public boolean retira(int valor) {
        if (this.saldo - valor > 0 || especial) {
            this.saldo -= valor;
            return false;
        } else {
            return false;
        }
    }

    public void deixarEspecial() {
        this.especial = true;
    }

    public void mostraDados() {
        System.out.println("Conta: " + nome);
        System.out.println("Saldo: " + saldo + "R$");

        if (this.saldo < 0) {
            System.out.println("Alerta, saldo negativo!");
        }
    }
}
