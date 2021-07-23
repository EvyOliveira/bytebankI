package bytebankBeta;

public class TestaSacaValoresNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		System.out.println(conta.pegaSaldo());
	}

}
