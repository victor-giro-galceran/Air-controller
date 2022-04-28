
public class motores extends avion {

	
	private boolean motor = false;
	
	
	public motores(String matricula, String marca, String modelo, int pilotos, String origen, String destino, int coordenada_x, int coordenada_y, int autonomia, int rumbo, int combustible, int velocidad_maxima, boolean motor) {
		
		super(matricula, marca, modelo, pilotos, origen, destino, coordenada_x, coordenada_y, autonomia, rumbo, combustible, velocidad_maxima);
		
		this.motor = motor;
		
	}
	
	public void setMotor(boolean motor) {
		
		this.motor = motor;
	}
	
	public boolean getMotor() {
		
		return this.motor;
	}
	
}
