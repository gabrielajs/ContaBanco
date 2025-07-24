
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(maria);
		Conta poupanca = new ContaPoupanca(maria);

		cc.depositar(600);
		cc.transferir(200, poupanca);
        cc.depositar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
