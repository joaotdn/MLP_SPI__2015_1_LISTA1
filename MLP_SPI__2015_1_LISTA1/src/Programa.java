
public class Programa {
	public static void main(String[] args) {
		Fatura fatura = new Fatura();
		
		fatura.setPreco(10);
		fatura.setQuantidade(9);
		
		System.out.println(fatura.getValorFatura());
	}
}
