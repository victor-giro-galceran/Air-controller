
public class avion_militar extends avion {

	
	private String armamento;
	
	private int capacidad_misiles;
	
	private int misiles_distancia;
	
	
	public avion_militar(String matricula, String marca, String modelo, int pilotos, String origen, String destino, int coordenada_x, int coordenada_y, int autonomia, int rumbo, int combustible, int velocidad_maxima, String armamento, int capacidad_misiles, int misiles_distancia) {
		
		super(matricula, marca, modelo, pilotos, origen, destino, coordenada_x, coordenada_y, autonomia, rumbo, combustible, velocidad_maxima);
		
		this.armamento = armamento;
		
		this.capacidad_misiles = capacidad_misiles;
		
		this.misiles_distancia = misiles_distancia;
		
	}
	
	
	public void setArmamento(String armamento) {
		
		this.armamento = armamento;
	}
	
	public String getArmamento () {
		
		return this.armamento;
	}
	
	
	
	public void setCapacidad_misiles(int capacidad_misiles) {
		
		this.capacidad_misiles = capacidad_misiles;
	}
	
	public int getCapacidad_misiles() {
		
		return this.capacidad_misiles;
	}
	
	
	
	public void setMisiles_distancia(int misiles_distancia) {
		
		this.misiles_distancia = misiles_distancia;
	}
	
	public int getMisiles_distancia() {
		
		return this.misiles_distancia;
	}

}
