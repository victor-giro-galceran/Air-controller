

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Scanner;

/* 
	Author:		green-vibes-coding ₪
	URL:		-
	Version:	1.0
*/

public class principal {

	static Scanner scan = new Scanner(System.in);
	
	// ----------------------------------  M E N U  ---------------------------------- \\
	/////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static void main(String[] args) {

		
		menu();
		
		
	}
	
		
	//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	// -------------------------------- / M E N U  ---------------------------------- //

	public static void menu() {
		
		int escoger = 0;
		
		System.out.print("\n\n");
		System.out.println("1. Realizar simulación con los aviones predeterminados");
		System.out.println("2. Introducir todo manualmente");
		
		System.out.println("\n¿Qué quieres hacer?");
		System.out.print(">> ");
		escoger = scan.next().charAt(0);
		
		switch (escoger) {
			
			case '1':
						
				new principal().menu_predeterminado_control();
				break;
						
			case '2':
				
				int escoger_manual = 0;
				
				System.out.print("\n");
				System.out.println("1. Controlador aéreo");
				System.out.println("2. Gestión de aviones");
				
				System.out.println("\n¿Qué quieres hacer?");
				System.out.print(">> ");
				escoger_manual = scan.next().charAt(0);
				
				switch (escoger_manual) {
					
					case '1':
							
						new principal().menu_manual_control();
						break;						
							
					case '2':
							
						new principal().menu_manual_gestion();
						break;
													
					default:
						System.out.println("Introduce 1 o 2");
				}

		}
		
		scan.close();

	}
	
	

	// -------------------  P O S I C I Ó N   Y   A L T I T U D  -------------------- //
	
	public int modificar_posicion() {
		
		int posicion = 0;
		
		return posicion;
	}
	
	public int modificar_altura() {
		
		int altura = 0;
		
		return altura;
	}
	
	/*public String mobilizar_avion(int contador) {
		
		contador = .posicion..
		
		int posicion_actual = posicion;
		int altura_actual = altura;
		
		int nueva_posicion = 0;
		int nueva_altura = 0;
		
		String mensaje = "nueva posición [" + nueva_posicion + "] [" + nueva_altura + "] ";
		
		return mensaje;
	}*/
	
	
	// --------------------------  M A N U A L M E N T E  --------------------------- //
	
	
	public aviones[] crear_avion_comercial(aviones[] avion, int posicion) {
		
		System.out.println("\n[Matrícula] ¿Cuál es la matrícula del avión que quieres crear?");
		System.out.print(">> ");
		String nuevo_matricula = scan.next();
		
		System.out.println("\n[Marca] ¿Cuál es la marca del avión que quieres crear?");
		System.out.print(">> ");
		String nuevo_marca = scan.next();
		
		System.out.println("\n[Modelo] ¿Cuál es el modelo del avión que quieres crear?");
		System.out.print(">> ");
		String nuevo_modelo = scan.next();
				
		System.out.println("\n[Pilotos] ¿De cuántos pilotos dispone el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_pilotos = scan.nextInt();
		
		System.out.println("\n[Origen] ¿De dónde procede el avión que quieres crear?");
		System.out.print(">> ");
		String nuevo_origen = scan.next();
		
		System.out.println("\n[Destino] ¿Dónde se dirige el avión que quieres crear?");
		System.out.print(">> ");
		String nuevo_destino = scan.next();
		
		System.out.println("\n[Distancia] ¿Cuánta distancia a recorrido el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_coordenada_x = scan.nextInt();
		
		System.out.println("\n[Altura] ¿A qué altura se encuentra el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_coordenada_y = scan.nextInt();
			
		System.out.println("\n[Autonomía] ¿Cuál es la autonomía del avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_autonomia = scan.nextInt();
		
		System.out.println("\n[Rumbo] ¿Qué rumbo tiene el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_rumbo = scan.nextInt();
		
		System.out.println("\n[Combustible] ¿Qué capacidad de combustible tiene el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_combustible = scan.nextInt();
		
		System.out.println("\n[Combustible] ¿Qué capacidad de combustible tiene el avión que quieres crear?");
		System.out.print(">> ");
		int nuevo_velocidad_maxima = scan.nextInt();		
		
		System.out.println(	"\n                                      Características\n" + 
				"\n Matrícula del avión ............... 	" + nuevo_matricula + "	" +
				"\n Marca del avión ................... 	" + nuevo_marca + "	" +
				"\n Modelo del avión .................. 	" + nuevo_modelo + "	" + "\n" +
				
				"\n Origen del avión .................. 	" + nuevo_origen + "	" +
				"\n Destino del avión ................. 	" + nuevo_destino + "	" + "\n" +
				
				"\n Pilotos del avión ................. 	" + nuevo_pilotos + "	" +
				"\n Combustible del avión ............. 	" + nuevo_combustible + " L	" +
				"\n Autonomía del avión ............... 	" + nuevo_autonomia + " km	" +
				"\n Velocidad máxima del avión ........		" + nuevo_velocidad_maxima + " km/h	" +
				"\n Rumbo del avión ................... 	" + nuevo_rumbo + " º	" + "\n" +
				
				"\n Recorrido del avión ............... 	" + nuevo_coordenada_x + " km	" +
				"\n Altura del avión .................. 	" + nuevo_coordenada_y + " ft	" +	"\n");
		
		aviones unAvion = new aviones(nuevo_matricula, nuevo_marca, nuevo_modelo, nuevo_pilotos, nuevo_origen, nuevo_destino, nuevo_coordenada_x, nuevo_coordenada_y, nuevo_autonomia, nuevo_rumbo, nuevo_combustible, nuevo_velocidad_maxima);
		
		avion[posicion] = unAvion;
					
		return avion;
	} 
	
	public aviones[] crear_avion_militar(aviones[] avion, int posicion) {
		
		
		return avion;
	}
	
	public aviones[] modificar_avion_comercial(aviones[] aviones, int posicion) {
		
		System.out.println("\n[Matrícula] ¿Nueva matrícula?");
		System.out.print(">> ");
		String nuevo_matricula = scan.next();
		
		System.out.println("\n[Marca] ¿Nueva marca?");
		System.out.print(">> ");
		String nuevo_marca = scan.next();
		
		System.out.println("\n[Modelo] ¿Nuevo modelo?");
		System.out.print(">> ");
		String nuevo_modelo = scan.next();
				
		System.out.println("\n[Pilotos] ¿Nuevo número de pilotos?");
		System.out.print(">> ");
		int nuevo_pilotos = scan.nextInt();
		
		System.out.println("\n[Origen] ¿Nuevo origen de procedencia?");
		System.out.print(">> ");
		String nuevo_origen = scan.next();
		
		System.out.println("\n[Destino] ¿Nuevo destino?");
		System.out.print(">> ");
		String nuevo_destino = scan.next();
		
		System.out.println("\n[Distancia] ¿Nueva distancia?");
		System.out.print(">> ");
		int nuevo_coordenada_x = scan.nextInt();
		
		System.out.println("\n[Altura] ¿Nueva altura?");
		System.out.print(">> ");
		int nuevo_coordenada_y = scan.nextInt();
			
		System.out.println("\n[Autonomía] ¿Nueva autonomía?");
		System.out.print(">> ");
		int nuevo_autonomia = scan.nextInt();
		
		System.out.println("\n[Rumbo] ¿Nuevo rumbo?");
		System.out.print(">> ");
		int nuevo_rumbo = scan.nextInt();
		
		System.out.println("\n[Combustible] ¿Nueva capacidad de combustible?");
		System.out.print(">> ");
		int nuevo_combustible = scan.nextInt();
		
		aviones unAvion = aviones[posicion];
		
		unAvion.setMatricula(nuevo_matricula);
		unAvion.setMarca(nuevo_marca);
		unAvion.setModelo(nuevo_modelo);
		unAvion.setPilotos(nuevo_pilotos);
		unAvion.setOrigen(nuevo_origen);
		unAvion.setDestino(nuevo_destino);
		unAvion.setCoordenada_x(nuevo_coordenada_x);
		unAvion.setCoordenada_y(nuevo_coordenada_y);		
		unAvion.setAutonomia(nuevo_autonomia);
		unAvion.setRumbo(nuevo_rumbo);
		unAvion.setCombustible(nuevo_combustible);
		
		aviones[posicion] = unAvion;
		
		return aviones;
	}
	
	public void menu_manual_control() {
				
		int opcion = 0;
		
		aviones[] espacio_aereo = new aviones[10];
		
		int contador = 0;
		int posicion = 0;
		boolean definido = false;
				
		do {
				System.out.println("\n==================================\n");
				System.out.println("CONTROL AEREO" + "\n");
				System.out.println("¿Qué quieres hacer?" + "\n");
				System.out.println("| 1. Definir un nuevo avión");
				
				if (definido == true) {
					
					System.out.println("| 2. Modificar los atributos del avión");
					System.out.println("| 3. Mostrar información del avión" + "\n");
					
					System.out.println("| 4. Añadir un avión al espacio aéreo");
					System.out.println("| 5. Gestionar un avión del espacio aéreo");
					System.out.println("| 6. Mostrar el espacio aéreo actual" + "\n");
					
					System.out.println("| 0. Salir");
					
				}	
				
				System.out.print("\n" + ">> ");
				opcion = scan.next().charAt(0);
				
				System.out.println("\n==================================\n");
				
				switch (opcion) {
			
					case '1': // ===============================  O P C I Ó N  1  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 1: \"Definir un nuevo avión\"\n");
			    		
			    		espacio_aereo = crear_avion_comercial(espacio_aereo, contador);
			    		
			    		if (contador < espacio_aereo.length) {
			    			
			    			System.out.print("\nAvión en la posicion [");
			    			
			    			sleep(40);
			    			System.err.print(contador);
			    			sleep(40);
			    			
			    			System.out.print("] ");
			    			System.out.print("\n");
			    			
			    			contador++;
			    			
			    		} else {
			    			
			    			System.out.println("Ya hay un avión en esta posición");
			    			
			    		}
			    		
			    		definido = true;
			    		
						System.out.println("_____________________________________________________________\n");					
						
						break;
						
						
					case '2': // ===============================  O P C I Ó N  2  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 2: \"Modificar los atributos del avión\"\n");
			    		
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print("");
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres modificar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
			    		espacio_aereo = modificar_avion_comercial(espacio_aereo, posicion);
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    				    		
						System.out.println("_____________________________________________________________\n");
						break;
						
					
					case '3': // ===============================  O P C I Ó N  3  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 3: \"Mostrar información del avión\"\n");
			    				
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres visualizar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
						System.out.println("_____________________________________________________________\n");
						break;
						
						
					case '4': // ===============================  O P C I Ó N  4  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 4: \"Añadir un avión al espacio aéreo\"\n");
			    					    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres despegar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		// System.out.println(espacio_aereo[posicion]);
			    					    		
						System.out.println("_____________________________________________________________\n");
						break;
				
					
					case '5': // ===============================  O P C I Ó N  5  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 5: \"Gestionar un avión del espacio aéreo\"\n");
						
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres despegar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		// System.out.println(espacio_aereo[posicion]);	
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '6': // ===============================  O P C I Ó N  6  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 6: \"Mostrar el espacio aéreo actual\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
					
					
					case '0': // ===============================  O P C I Ó N  0  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 0: \"Salir\"\n");
			    					    		
			    		System.out.print(" Saliendo de la simulación");
						
			    		for (int i = 0; i < 3; i++) {
							
			    			sleep(1000);
							System.out.print(".");
						
			    		}
			    		
						System.out.println("");
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					default:
						System.out.println("Introduce números entre el 0 y el 6");
					}
			
			
		} while (opcion != '0');
		
				
	}
	
	public void menu_manual_gestion() {
		
		int opcion = 0;
		
		aviones[] espacio_aereo = new aviones[10];
		
		int posicion = 0;
				
		do {
				System.out.println("\n==================================\n");
				System.out.println("GESTION DE AVIONES" + "\n");
				
				System.out.println("¿Qué quieres hacer?" + "\n");
				
				System.out.println("| 1. Encender motor del avion");
				System.out.println("| 2. Apagar motor del avión" + "\n");
				
				System.out.println("| 3. Acelerar");
				System.out.println("| 4. Frenar" + "\n");
				
				System.out.println("| 5. Incrementar altura");
				System.out.println("| 6. Reducir altura" + "\n");
				
				System.out.println("| 7. Subir tren de aterraje");
				System.out.println("| 8. Bajar tren de aterraje" + "\n");
				
				System.out.println("| 9. Establecer rumbo");
				System.out.println("| S. Mostrar el estado actual del avión" + "\n");
				
				
				
				System.out.println("| E. Salir" + "\n");
					
				
				
				System.out.print(">> ");
				opcion = scan.next().charAt(0);
				
				System.out.println("\n==================================\n");
				
				switch (opcion) {
			
					case '1': // ===============================  O P C I Ó N  1  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 1: \"Encender motor del avion\"\n");
			    		
			    		//
			    		
						System.out.println("_____________________________________________________________\n");					
						
						break;
						
						
					case '2': // ===============================  O P C I Ó N  2  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 2: \"Apagar motor del avión\"\n");
			    		
			    		//
			    				    		
						System.out.println("_____________________________________________________________\n");
						break;
						
					
					case '3': // ===============================  O P C I Ó N  3  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 3: \"Acelerar\"\n");
			    				
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres visualizar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
						System.out.println("_____________________________________________________________\n");
						break;
						
						
					case '4': // ===============================  O P C I Ó N  4  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 4: \"Frenar\"\n");
			    					    		
			    		//
			    					    		
						System.out.println("_____________________________________________________________\n");
						break;
				
					
					case '5': // ===============================  O P C I Ó N  5  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 5: \"Incrementar altura\"\n");
						
			    		//
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '6': // ===============================  O P C I Ó N  6  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 6: \"Reducir altura\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '7': // ===============================  O P C I Ó N  7  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 7: \"Subir tren de aterrizaje\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '8': // ===============================  O P C I Ó N  8  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 8: \"Bajar tren de aterrizaje\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '9': // ===============================  O P C I Ó N  9  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 9: \"Establecer rumbo\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case 'S': // ===============================  O P C I Ó N  S  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción S: \"Mostrar el estado actual del avión\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
					
					
					case 'E': // ===============================  O P C I Ó N  E  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción E: \"Exit\"\n");
			    					    		
			    		System.out.print("Volviendo al menú principal");
						
			    		for (int i = 0; i < 3; i++) {
							
			    			sleep(1000);
							System.out.print(".");
						
			    		}
			    		
						System.out.println("");
			    		
			    		System.out.println("\n_____________________________________________________________\n");
			    		System.exit(0);
			    		break;
						
						
					default:
						System.out.println("Introduce números entre el 0 y el 10");
					}
			
			
		} while (opcion != 'E');
					
	}
	
	// -----------------------  P R E D E T E R M I N A D O  ------------------------- //
	
	public aviones[] aviones_predeterminados(aviones[] avion_predeterminados) { 
		
		// Matrícula / Marca / Modelo / Pasajeros / Pilotos / Origen / Destino / Coordenadas / Autonomia / Rumbo / Combustible
		avion_predeterminados[0] = new aviones("N2251U", "Boeing", "777-300 (ER)", 2, "Los Angeles  (LAX)", "Honolulu  (HNL)", 80, 16750, 17370, 267, 171170, 912); 
		avion_predeterminados[1] = new aviones("F-HKYS", "Airbus", "A330-941", 2, "Marselle  (MRS)", "Saint-Denis  (RUN)", 597, 35000, 12500, 113, 181280, 912); 
		avion_predeterminados[2] = new aviones("N8809L", "Boeing", "737 MAX 8", 2, "Baltimore  (BWI)", "Charlotte  (CLT)", 83, 23000, 15600, 209, 172350, 912); 
		avion_predeterminados[3] = new aviones("JA604F", "Boeing", "767-381F(ER)", 2, "Singapore  (SIN)", "Tokyo  (NRT)", 390, 35000, 16300, 46, 180560, 912);
		avion_predeterminados[4] = new aviones("A6-EPO", "Boeing", "777-31H(ER)", 2, "Nairobi  (NBO)", "Dubai  (DXB)", 443, 35000, 30000, 43, 299370, 912);
		avion_predeterminados[5] = new aviones("", "", "", 0, "", "", 0, 0, 0, 0, 0, 0); 
		avion_predeterminados[6] = new aviones("", "", "", 0, "", "", 0, 0, 0, 0, 0, 0); 
		avion_predeterminados[7] = new aviones("", "", "", 0, "", "", 0, 0, 0, 0, 0, 0);
		avion_predeterminados[8] = new aviones("", "", "", 0, "", "", 0, 0, 0, 0, 0, 0); 
		avion_predeterminados[9] = new aviones("", "", "", 0, "", "", 0, 0, 0, 0, 0, 0);
		
		return avion_predeterminados;
	}
	
	public aviones[] modificar_avion_predeterminado(aviones[] aviones_predeterminados, int posicion) {
		
		System.out.println("\n[Matrícula] 	¿Nueva matrícula?");
		System.out.print(">> ");
		String nuevo_matricula = scan.next();
		
		System.out.println("\n[Marca] 	¿Nueva marca?");
		System.out.print(">> ");
		String nuevo_marca = scan.next();
		
		System.out.println("\n[Modelo] 	¿Nuevo modelo?");
		System.out.print(">> ");
		String nuevo_modelo = scan.next();
						
		System.out.println("\n[Pilotos] 	¿Nuevo número de pilotos?");
		System.out.print(">> ");
		int nuevo_pilotos = scan.nextInt();
		
		System.out.println("\n[Origen] 	¿Nuevo origen de procedencia?");
		System.out.print(">> ");
		String nuevo_origen = scan.next();
		
		System.out.println("\n[Destino] 	¿Nuevo destino?");
		System.out.print(">> ");
		String nuevo_destino = scan.next();
		
		System.out.println("\n[Distancia] 	¿Nueva distancia?");
		System.out.print(">> ");
		int nuevo_coordenada_x = scan.nextInt();
		
		System.out.println("\n[Altura] 	¿Nueva altura?");
		System.out.print(">> ");
		int nuevo_coordenada_y = scan.nextInt();
			
		System.out.println("\n[Autonomía] 	¿Nueva autonomía?");
		System.out.print(">> ");
		int nuevo_autonomia = scan.nextInt();
		
		System.out.println("\n[Rumbo] 	¿Nuevo rumbo?");
		System.out.print(">> ");
		int nuevo_rumbo = scan.nextInt();
		
		System.out.println("\n[Combustible] 	¿Nueva capacidad de combustible?");
		System.out.print(">> ");
		int nuevo_combustible = scan.nextInt();
				
		aviones unAvion = aviones_predeterminados[posicion];
				
		unAvion.setMatricula(nuevo_matricula);
		unAvion.setMarca(nuevo_marca);
		unAvion.setModelo(nuevo_modelo);
		unAvion.setPilotos(nuevo_pilotos);
		unAvion.setOrigen(nuevo_origen);
		unAvion.setDestino(nuevo_destino);
		unAvion.setCoordenada_x(nuevo_coordenada_x);
		unAvion.setCoordenada_y(nuevo_coordenada_y);		
		unAvion.setAutonomia(nuevo_autonomia);
		unAvion.setRumbo(nuevo_rumbo);
		unAvion.setCombustible(nuevo_combustible);
		
		aviones_predeterminados[posicion] = unAvion;
		
		return aviones_predeterminados;
	}
		
	public void menu_predeterminado_control() {
		
		int opcion = 0;
		
		aviones[] espacio_aereo = new aviones[10];
		
		int posicion = 0;
		
		espacio_aereo = aviones_predeterminados(espacio_aereo);
				
		do {
				System.out.println("\n==================================\n");
				System.out.println("CONTROL AEREO PREDETERMINADO" + "\n");
				System.out.println("¿Qué quieres hacer?" + "\n");
				System.out.println("| 1. Modificar los atributos del avión");
				System.out.println("| 2. Mostrar información del avión" + "\n");
				
				System.out.println("| 3. Añadir un avión al espacio aéreo");					
				System.out.println("| 4. Gestionar un avión del espacio aéreo");
				System.out.println("| 5. Mostrar el espacio aéreo actual" + "\n");
				
				System.out.println("| 0. Salir");
				
				System.out.print("\n" + ">> ");
				opcion = scan.next().charAt(0);
				
				System.out.println("\n==================================\n");
				
				switch (opcion) {
			
					case '1': // ================================  O P C I Ó N  1  ================================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 1: \"Modificar los atributos del avión\"\n");
			    		
			    		
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    					    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres modificar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
			    		espacio_aereo = modificar_avion_predeterminado(espacio_aereo, posicion);
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    				    		
						System.out.println("_____________________________________________________________\n");
					
						
						break;
						
					
					case '2': // ================================  O P C I Ó N  2  ================================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 2: \"Mostrar información del avión\"\n");
			    		
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}	
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres visualizar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();	
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
						System.out.println("_____________________________________________________________\n");
						break;
						
						
					case '3': // ================================  O P C I Ó N  3  ================================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 3: \"Añadir un avión al espacio aéreo\"\n");
			    					    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres mobilizar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		// mobilizar_avion();
			    		
			    		// System.out.println(parking[posicion]);
			    					    		
						System.out.println("_____________________________________________________________\n");
						break;
				
					
					case '4': // ================================  O P C I Ó N  4  ================================
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 4: \"Gestionar un avión del espacio aéreo\"\n");
			    					    		
			    		//
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '5': //================================  O P C I Ó N  5  ================================
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 5: \"Mostrar el espacio aéreo actual\"\n");
			    		
			    		//
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '0':
						System.out.print(" Saliendo de la simulación");
						
			    		for (int i = 0; i < 3; i++) {
							
			    			sleep(1000);
							System.out.print(".");
						
			    		}
			    		
						System.out.println("");
						break;
						
						
					default:
						System.out.println("Introduce números entre el 0 y el 5");
					}
			
			
		} while (opcion != '0');
			
		
		System.out.println("=================== Simulacion finalizada ===================");
			
		scan.close();	
				
	}
	
	public void menu_predeterminado_gestion() {
		
		int opcion = 0;
		
		aviones[] espacio_aereo = new aviones[10];
		
		int posicion = 0;
				
		do {
				System.out.println("\n==================================\n");
				System.out.println("GESTION DE AVIONES PREDETERMINADO" + "\n");
				
				System.out.println("¿Qué quieres hacer?" + "\n");
				
				System.out.println("| 1. Encender motor del avion");
				System.out.println("| 2. Apagar motor del avión" + "\n");
				
				System.out.println("| 3. Acelerar");
				System.out.println("| 4. Frenar" + "\n");
				
				System.out.println("| 5. Incrementar altura");
				System.out.println("| 6. Reducir altura" + "\n");
				
				System.out.println("| 7. Subir tren de aterraje");
				System.out.println("| 8. Bajar tren de aterraje" + "\n");
				
				System.out.println("| 9. Establecer rumbo");
				System.out.println("| S. Mostrar el estado actual del avión" + "\n");
				
				
				
				System.out.println("| E. Salir" + "\n");
					
				
				
				System.out.print(">> ");
				opcion = scan.next().charAt(0);
				
				System.out.println("\n==================================\n");
				
				switch (opcion) {
			
					case '1': // ===============================  O P C I Ó N  1  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 1: \"Encender motor del avion\"\n");
			    		
			    		//
			    		
						System.out.println("_____________________________________________________________\n");					
						
						break;
						
						
					case '2': // ===============================  O P C I Ó N  2  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 2: \"Apagar motor del avión\"\n");
			    		
			    		//
			    				    		
						System.out.println("_____________________________________________________________\n");
						break;
						
					
					case '3': // ===============================  O P C I Ó N  3  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 3: \"Acelerar\"\n");
			    				
			    		System.out.println("\nCatálogo de aviones\n");
			    		
			    		for (int n = 0; n < espacio_aereo.length; n++) {
			    			
			    			if (espacio_aereo[n] != null) {
			    			
				    			if (espacio_aereo.length == 0) {
				    				
				    				System.out.print(""); 
				    				
				    			} else {
				    				
				    				if (espacio_aereo != null) {
				    					
				    					System.out.print(" [" + n + "] " + espacio_aereo[n].getMatricula() + " - ");
				    					sleep(40);
				    					System.err.print(espacio_aereo[n].getMarca());
				    					sleep(40);
				    					System.out.println("");
				    					
				    				}
				    				
				    			}
				    			
			    			}
			    			
			    		}
			    		
			    		System.out.println("\n[Posicion] ¿Que avión quieres visualizar?");
			    		System.out.print(">> ");
			    		posicion = scan.nextInt();
			    		
			    		System.out.println(espacio_aereo[posicion]);
			    		
						System.out.println("_____________________________________________________________\n");
						break;
						
						
					case '4': // ===============================  O P C I Ó N  4  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 4: \"Frenar\"\n");
			    					    		
			    		//
			    					    		
						System.out.println("_____________________________________________________________\n");
						break;
				
					
					case '5': // ===============================  O P C I Ó N  5  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 5: \"Incrementar altura\"\n");
						
			    		//
			    		
			    		System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '6': // ===============================  O P C I Ó N  6  ===============================
					
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 6: \"Reducir altura\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '7': // ===============================  O P C I Ó N  7  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 7: \"Subir tren de aterrizaje\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '8': // ===============================  O P C I Ó N  8  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 8: \"Bajar tren de aterrizaje\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case '9': // ===============================  O P C I Ó N  9  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción 9: \"Establecer rumbo\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
						
						
					case 'S': // ===============================  O P C I Ó N  S  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción S: \"Mostrar el estado actual del avión\"\n");
						
			    		//
			    		
						System.out.println("\n_____________________________________________________________\n");
						break;
					
					
					case 'E': // ===============================  O P C I Ó N  E  ===============================
						
						System.out.println("_____________________________________________________________\n");
			    		System.out.println("Has seleccionado la opción E: \"Exit\"\n");
			    					    		
			    		System.out.print("Volviendo al menú principal");
						
			    		for (int i = 0; i < 3; i++) {
							
			    			sleep(1000);
							System.out.print(".");
						
			    		}
			    		
						System.out.println("");
			    		
			    		System.out.println("\n_____________________________________________________________\n");
			    		System.exit(0);
			    		break;
						
						
					default:
						System.out.println("Introduce números entre el 0 y el 10");
					}
			
			
		} while (opcion != 'E');
		
	}
	
	// ------------------------------ A E S T H E T I C ------------------------------ //
	
	public void sleep(int time) {
		
		try {
			
			Thread.sleep(time);
			
		} catch (InterruptedException e) {
				
		}
		
	}		

	public String armamento() {
		
		String nombre_armamento = "Misiles";
		int selecionar;
		
		System.out.println("1. Municiones de calibre pequeño");
		System.out.println("2. Municiones de calibre mediano");
		System.out.println("3. Bombas");
		System.out.println("4. GPS Guided Bombs");
		System.out.println("5. Proyectiles de calibre grueso");
		System.out.println("6. Cañones");
		System.out.println("7. Misiles");
		System.out.println("8. Artillería");
		System.out.println("9. Espoletas");	
		
		System.out.print(">> ");
		selecionar = scan.nextInt();
		
		switch (selecionar) {
		
			case 1:
				nombre_armamento = "Municiones de calibre pequeño";
				break;
			case 2: 
				nombre_armamento = "Municiones de calibre mediano";
				break;
			case 3:
				nombre_armamento = "Bombas";
				break;
			case 4:
				nombre_armamento = "GPS Guided Bombs";
				break;
			case 5:
				nombre_armamento = "Proyectiles de calibre grueso";
				break;
			case 6:
				nombre_armamento = "Cañones";
				break;
			case 7:
				nombre_armamento = "Misiles";
				break;
			case 8:
				nombre_armamento = "Artillería";
				break;
			case 9:
				nombre_armamento = "Espoletas";
				break;
			
		}
		
		return nombre_armamento;
		
	}
	
	
	public void something() {
		
		String cadenaDeTexto = "http://javaconfigmx.blogspot.mx";
	    String cadenaEncriptada = "";
	   
	    try {
	    	
	        System.out.println("Cadena original > " + cadenaDeTexto);
	        cadenaEncriptada = encriptar(cadenaDeTexto);
	        
	        System.out.println("Cadena encriptada > " + cadenaEncriptada);
	        String cadenaDesencriptada = desencriptar(cadenaEncriptada);
	        System.out.println("Cadena desencriptada > " + cadenaDesencriptada);
	        
	    } catch (UnsupportedEncodingException uee) {
	        
	    	System.out.println("Ups!! > " + uee);
	    
	    }
	    
	}

	private String encriptar(String s) throws UnsupportedEncodingException{
   
		return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));

	}

	private String desencriptar(String s) throws UnsupportedEncodingException{
    
		byte[] decode = Base64.getDecoder().decode(s.getBytes());    
		return new String(decode, "utf-8");

	}
	
	
}
