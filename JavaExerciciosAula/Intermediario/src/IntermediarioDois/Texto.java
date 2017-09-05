package IntermediarioDois;


public class Texto {
	private String frase;
	private String inverso;
	public String getFrase() {
		return frase;
	}
	private void inverter () {
		StringBuilder original = new StringBuilder(frase);
		StringBuilder reverso = original.reverse();
		inverso = reverso.toString();
	}

	public void setFrase(String frase) {
		this.frase = frase;
		inverter ();
	}
	public String getInverso() {
		return inverso;
	}
	
	public boolean palindromo(){
		String retirar[] = {" ",",","-",".", "ô", "á", "ó"};
		String fraseSemEspecial = frase;
		String inversoSemEspecial = inverso;
		for (int i = 0; i < retirar.length; i++) {
			inversoSemEspecial = inversoSemEspecial.replace(retirar[i], "");
			fraseSemEspecial  =  fraseSemEspecial.replace(retirar[i], "");
		}
		

		if (fraseSemEspecial.equalsIgnoreCase(inversoSemEspecial)){
			return true;
		}
		return false;
		
	}
	
}
