
public class aviones {

	private String matricula;									// 1.
	
	private String marca;										  // 2.

	private String modelo;										// 3.
	
	private int pilotos;								  		// 4.
	
	private String origen;										// 5.
	
	private String destino;										// 6.
	
	private int coordenada_x;									// 7.
	
	private int coordenada_y;									// 8.
	
	private int autonomia;										// 9.
	
	private int rumbo;								  			// 10.
	
	private int combustible;						 			// 11.
	
	private int velocidad_maxima;							// 12.
	
		
	public aviones (String matricula, String marca, String modelo, int pilotos, String origen, String destino, int coordenada_x, int coordenada_y, int autonomia, int rumbo, int combustible, int velocidad_maxima) {
		
		this.matricula = matricula;								// 1.
		
		this.marca = marca;								  	  	// 2.
		
		this.modelo = modelo;							    		// 3.
				
		this.pilotos = pilotos;					  				// 4.
		
		this.origen = origen;						    			// 5.
		
		this.destino = destino;							  		// 6.
		
		this.coordenada_x = coordenada_x;					// 7.
		
		this.coordenada_y = coordenada_y;					// 8.
		
		this.autonomia = autonomia;						  	// 9.
		
		this.rumbo = rumbo;										    // 10.
		
		this.combustible = combustible;						// 11.
		
		this.velocidad_maxima = velocidad_maxima;	// 12.
		
	}
		
	
	public void setMatricula(String matricula) {
		
		this.matricula = matricula;		
	}
	
	public String getMatricula() {
		
		return this.matricula;
	}
	
	
	
	public void setMarca(String marca) {
		
		this.marca = marca;
	}
	
	public String getMarca() {
		
		return this.marca;
	}
	
	
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public String getModelo() {
		
		return this.modelo;
	}
	
	
	
	public void setPilotos(int pilotos) {
		
		this.pilotos = pilotos;
	}
	
	public int getPilotos() {
		
		return this.pilotos;
	}
	
	
	
	public void setOrigen(String origen) {
		
		this.origen = origen;
	}
	
	public String getOrigen() {
		
		return this.origen;
	}
	
	
	
	public void setDestino(String destino) {
		
		this.destino = destino;
	}
	
	public String getDestino() {
		
		return this.destino;
	}
	
	
	
	public void setCoordenada_x(int coordenada_x) {
		
		this.coordenada_x = coordenada_x;
	}
	
	public int getCoordenada_x() {
		
		return this.coordenada_x;
	}
	
	
	
	public void setCoordenada_y(int coordenada_y) {
		
		this.coordenada_y = coordenada_y;
	}
	
	public int getCoordenada_y() {
		
		return this.coordenada_y;
	}
		
	
	
	public void setAutonomia(int autonomia) {
		
		this.autonomia = autonomia;
	}
	
	public int getAutonomia() {
		
		return this.autonomia;
	}
	
	
	
	public void setRumbo(int rumbo) {
		
		this.rumbo = rumbo;
	}
	
	public int getRumbo() {
		
		return this.rumbo;
	}
	
	
	
	public void setCombustible(int combustible) {
		
		this.combustible = combustible;
		
	}
	
	public int getCombustible() {
		
		return this.combustible;
	}
	
	
	
	public void setVelocidad_maxima(int velocidad_maxima) {
		
		this.velocidad_maxima = velocidad_maxima;
		
	}
	
	public int getVelocidad_maxima() {
		
		return this.velocidad_maxima;
	}
	
	
	
	
	public String toString() {
		
		return 	"\n                                      Características\n" + 
				"\n Matrícula del avión ............... 	" + getMatricula() + "	" +
				"\n Marca del avión ................... 	" + getMarca() + "	" +
				"\n Modelo del avión .................. 	" + getModelo() + "	" + "\n" +
				
				"\n Origen del avión .................. 	" + getOrigen() + "	" +
				"\n Destino del avión ................. 	" + getDestino() + "	" + "\n" +
				
				"\n Pilotos del avión ................. 	" + getPilotos() + "	" +
				"\n Combustible del avión ............. 	" + getCombustible() + " L	" +
				"\n Autonomía del avión ............... 	" + getAutonomia() + " km	" +
				"\n Velocidad máxima del avión ........		" + getVelocidad_maxima() + " km/h	" +
				"\n Rumbo del avión ................... 	" + getRumbo() + " º	" + "\n" +
				
				"\n Recorrido del avión ............... 	" + getCoordenada_x() + " km	" +
				"\n Altura del avión .................. 	" + getCoordenada_y() + " ft	" +	"\n";
		
	}
	
	public class aviones_comerciales extends aviones {

		private int capacidad_pasajeros;
		
		private int capacidad_carga;
		
		
		public aviones_comerciales(String matricula, String marca, String modelo, int pilotos, String origen, String destino, int coordenada_x, int coordenada_y, int autonomia, int rumbo, int combustible, int capacidad_pasajeros, int capacidad_carga) {
			
			super(matricula, marca, modelo, pilotos, origen, destino, coordenada_x, coordenada_y, autonomia, rumbo, combustible, velocidad_maxima);
			
			this.capacidad_pasajeros = capacidad_pasajeros;
			
			this.capacidad_carga = capacidad_carga;
			
		}
		
		public void setCapacidad_pasajeros(int capacidad_pasajeros) {
			
			this.capacidad_pasajeros = capacidad_pasajeros;
			
		}
		
		public int getCapacidad_pasajeros() {
			
			return this.capacidad_pasajeros;
		}
		
		
		
		public void setCapacidad_carga(int capacidad_carga) {
			
			this.capacidad_carga = capacidad_carga;
		}
		
		public int getCapacidad_carga() {
			
			return this.capacidad_carga;
		}
		
	}
	
	public class aviones_militares extends aviones {

		private String armamento;
		
		private int capacidad_misiles;
		
		private int misiles_distancia;
		
		public aviones_militares(String matricula, String marca, String modelo, int pilotos, String origen, String destino, int coordenada_x, int coordenada_y, int autonomia, int rumbo, int combustible, String armamento, int capacidad_misiles, int misiles_distancia) {
			
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
			
}
