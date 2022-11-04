class TestaContaBancáriaSimplificada {
    public static void main(String[] args) {

        ContaBancáriaSimplificada c1;
        c1 = new ContaBancáriaSimplificada();

        c1.deposita(100);
        c1.abreContaSimples("Maria");
        c1.deixarEspecial();

        ContaBancáriaSimplificada c2 = new ContaBancáriaSimplificada();

        c2.deposita(100);
        c2.abreContaSimples("João");

        c1.deposita(200);
        c2.saldo = 1000;

        if (c1.retira(400)) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        c1.mostraDados();
        c2.mostraDados();
    }
}