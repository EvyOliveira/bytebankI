package bytebankBeta;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente evelyn = new Cliente();
		evelyn.nome = "Evelyn Oliveira";
		evelyn.cpf = "234.567.345-67";
		evelyn.profissao = "Programadora Júnior";
		
		Conta contaDaEvy = new Conta();
		contaDaEvy.deposita(100);
		
		contaDaEvy.titular = evelyn;
		System.out.println(contaDaEvy.titular.nome);
		System.out.println(contaDaEvy.titular);
	}
}
