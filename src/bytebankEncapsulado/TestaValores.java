package bytebankEncapsulado;

public class TestaValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 24225);
		
		// System.out.println(Conta.getTotal());
	}

}
