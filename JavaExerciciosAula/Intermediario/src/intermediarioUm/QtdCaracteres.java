package intermediarioUm;

public class QtdCaracteres {
	public void qtdCaracteres(String string) {
		int i = 0;
		int tamanho = string.length();
		
		char letra = string.charAt(i);
		
		
		while(i < tamanho){	
			i++;
			int j = 1;
			if(letra == 32){
				System.out.println(j + "  ");
				j = 0;
			}
			letra = string.charAt(i);
			j++;
		}
		
		
		//while (letra != 32) {
		//	cont++;
		//	i++;
		//	letra = string.charAt(i);
		//}
		//System.out.println(cont);
	}
}
