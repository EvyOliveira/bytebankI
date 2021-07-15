package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDaEvy = new Conta();
		contaDaEvy.saldo = 100;
		contaDaEvy.deposita(50);
		System.out.println(contaDaEvy.saldo);
		
		boolean conseguiuRetirar = contaDaEvy.saca(20);
		System.out.println(contaDaEvy.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoAlex = new Conta();
		contaDoAlex.deposita(1000);
		
		boolean sucessoTransferencia = contaDoAlex.transfere(3000, contaDaEvy);
		
		if(sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso.");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println(contaDoAlex.saldo);
		System.out.println(contaDaEvy.saldo);
	}
}
