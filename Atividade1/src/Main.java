public class Main {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("2233");
		ContaCorrente c1 = new ContaCorrente("9821");
		ContaPoupanca c2 = new ContaPoupanca("1212");
		
		c1.depositar(1900);
		System.out.println(c1.getSaldo());
		
		c2.depositar(293847);
		System.out.println(c2.getSaldo());
		
		conta.depositar(12000);
		System.out.println(conta.getSaldo());
	}

}