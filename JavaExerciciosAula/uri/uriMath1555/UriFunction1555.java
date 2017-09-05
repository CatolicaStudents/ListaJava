package uriMath1555;

public class UriFunction1555 {
	public void showMeTheWinner(double x, double y) {

		double rafaelResult = Math.pow((3 * x), 2);
		double betoResult = 2 * Math.pow(x, 2) + Math.pow((5 * y), 2);
		double carlosResult = (-100 * x) + Math.pow(y, 3);

		if (rafaelResult > betoResult && rafaelResult > carlosResult) {
			System.out.println("Rafael ganhou");
		} else if (betoResult > carlosResult) {
			System.out.println("Beto ganhou");
		} else {
			System.out.println("Carlos ganhou");
		}
	}
}
