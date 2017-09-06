package InicianteNove;

public class Nota {
	int nota100 = 0;
	int nota50 = 0;
	int nota20 = 0;
	int nota10 = 0;
	int nota5 = 0;
	int nota2 = 0;
	int nota1 = 0;
	
	
	public int getNota100() {
		return nota100;
	}


	public int getNota50() {
		return nota50;
	}


	public int getNota20() {
		return nota20;
	}


	public int getNota10() {
		return nota10;
	}


	public int getNota5() {
		return nota5;
	}


	public int getNota2() {
		return nota2;
	}


	public int getNota1() {
		return nota1;
	}


	public void exibeQtdNotas(int valorSaque) {

		while (valorSaque >= 100) {
			valorSaque = valorSaque - 100;
			nota100++;
		}
		while (valorSaque >= 50) {
			valorSaque = valorSaque - 50;
			nota50++;
		}
		while (valorSaque >= 20) {
			valorSaque = valorSaque - 20;
			nota20++;
		}
		while (valorSaque >= 10) {
			valorSaque = valorSaque - 10;
			nota10++;
		}
		while (valorSaque >= 5) {
			valorSaque = valorSaque - 5;
			nota5++;
		}
		while (valorSaque >= 2) {
			valorSaque = valorSaque - 2;
			nota2++;
		}
		while (valorSaque >= 1) {
			valorSaque = valorSaque - 1;
			nota1++;
		}


	}

}
