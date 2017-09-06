package uriInicianteGasosa;


public class Gasosa {
	private double Tmpgst;
	private double Velmed;
	private double Gasosa;
	
	public double getTmpgst() {
		return Tmpgst;
	}
	public void setTmpgst(double tmpgst) {
		this.Tmpgst = tmpgst;
	}
	public double getVelmed() {
		return Velmed;
	}
	public void setVelmed(double velmed) {
		this.Velmed = velmed;
	}
	public double getGasosa(double gasosa) {
		gasosa = (Tmpgst * Velmed) / 12;
		Gasosa = gasosa;
		return Gasosa;
	}
	public void setGasosa(double gasosa) {

	}
}
