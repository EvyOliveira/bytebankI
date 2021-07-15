package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda Conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda Conta após atribuição: "
				 + segundaConta.saldo);
		
		System.out.println("Saldo da segunda Conta após atribuição: "
				+ primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma Conta!");
		} 
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
