import java.util.Iterator;

public class Iteracao_For {

	public static void main(String[] args) {
		
		// Códigos comentados para execução separados

//		for (int i = 0; i < 5; i++) {
//			System.out.println("Este é o número: " + i);
//		}

//-----------------------------------------------------

//		// Array
//		Double[] carinhoDeCompras = new Double[] { 50.0, 51.0, 52.0 };
//		Double total = 0.0;
//		// Lenght - propriedade que guarda o numero de ítens no array
//		for (int i = 0; i < carinhoDeCompras.length; i++) {
//			total = total + carinhoDeCompras[i]; // [i] índex da informação do array
//		}
//		System.out.println("O total é R$" + total);

//-----------------------------------------------------		

//		for (int i = 0; i < 10; i++) {
//			if(i == 5) {
//				break; //Escape do For
//			}
//			System.out.println("Iteração: " + i);
//
//		}

//-----------------------------------------------------

//		for (int i = 0; i < 10; i++) {
//			if(i == 5) {
//				System.out.println("Vai continuar.");
//				continue; //Um salto no laço de repetição
//			}
//			System.out.println("Iteração: " + i);
//		}

//-----------------------------------------------------

		Integer[] produtos = new Integer[] { 100, 225, 300 };

		for (int i = 0; i < produtos.length; i++) {
			Integer produtoCorrente = produtos[i];
			
			System.out.println("Produto de código: " + produtoCorrente);
			if (produtoCorrente.equals(225)) {
				System.out.println("Produto encontrado.");
				break; // Escape do For
			}

		}

	}

}
