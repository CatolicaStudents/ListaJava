package InicianteSeis;

public class Impares {
	int num1;
	int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int soma () {
		int result = 0;
		for (int i = num1; i < num2; i++) {
			if (i % 2 != 0) {
				result = result + i;
				
			}
		}
		return result;
	}

}
