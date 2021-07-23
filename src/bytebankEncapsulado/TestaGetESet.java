package bytebankEncapsulado;

public class TestaGetESet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente evelyn = new Cliente();
		// conta.titular = evelyn;
		evelyn.setNome("evelyn oliveira");
		
		conta.setTitular(evelyn);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		System.out.println(titularDaConta);
		System.out.println(evelyn);
		System.out.println(conta.getTitular);
	
	}

}
