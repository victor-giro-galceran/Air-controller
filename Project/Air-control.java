
public class avion {
	
	
	private String matricula;
	
	private int autonomia;
	
	private int altura;
	
	private int capacidad_carga;
	
	private int posicion;
	
	
	public avion (String matricula, int autonomia, int altura, int capacidad_carga, int posicion) {
		
		this.matricula = matricula;
		
		this.autonomia = autonomia;
		
		this.altura = altura;
		
		this.capacidad_carga = capacidad_carga;
		
		this.posicion = posicion;
    
	}
		
	
	public void setMatricula(String matricula) {
		
		this.matricula = matricula;		
	}
	
	public String getMatricula() {
		
		return this.matricula;
	}
	
	
	
	public void setAutonomia(int autonomia) {
		
		this.autonomia = autonomia;
	}
	
	public int getAutonomia() {
		
		return this.autonomia;
	}
	
	
	
	public void setAltura(int altura) {
		
		this.altura = altura;
		
	}
	
	public int getAltura() {
		
		return this.altura;
	}
	
	
	
	public void setCapacidad_carga(int capacidad_carga) {
		
		this.capacidad_carga = capacidad_carga;
	}
	
	public int getCapacidad_carga() {
		
		return this.capacidad_carga;
	}
	
	
	
	public void setPosicion(int posicion) {
		
		this.posicion = posicion;
	}
	
	public int getPosicion() {
		
		return this.posicion;
	}
	
	
	public String toString() {
		
		return 	"\n                                      Características\n" + 
				"\n Matrícula del avión ............... 	" + getMatricula() +
				"\n Autonomía del avión ............... 	" + getAutonomia() +
				"\n Altura del avión .................. 	" + getAltura() +
				"\n Capacidad de carga del avión ...... 	" + getCapacidad_carga() +
				"\n Posición del avión ................ 	" + getPosicion() + "\n";
		
	}


}

