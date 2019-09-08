package perros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PerrosTest {
	private static Scanner sc;
	private static Perros perros;
	private static final String[] localidades = {"Teusaquillo", "Suba", "Usaquen", "Chapinero"};
	private static final String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		perros = new Perros();
		initBaseDatos();
		while (true) {
			imprimirOpciones();
			String opcion = sc.nextLine();
			ejecutarOpcion(opcion);
		}
	}

	private static void imprimirOpciones() {
		System.out.println("----Perros----");
		System.out.println("Ingrese una opcion:");
		System.out.println("1 Crear perro.");
		System.out.println("2 Agrupar por localidad.");
		System.out.println("3 Imprimir lista de perros.");
		System.out.println("x Salir.");
	}

	private static void ejecutarOpcion(String opcion) {
		switch (opcion.toLowerCase()) {
		case "1":
			opcionCrearPerro();
			break;
		case "2":
			opcionAgruparPorLocalidad();
			break;
		case "3":
			opcionImprimirListaPerros();
			break;
		case "x":
			System.exit(0);
		}
	}

	private static void opcionImprimirListaPerros() {
		perros.imprimirListaPerros();
	}

	private static void opcionAgruparPorLocalidad() {
		HashMap<String, ArrayList<Perro>> listaAgrupada = perros.agruparPorLocalidad();
		for(String localidad: listaAgrupada.keySet()) {
			System.out.println("---" + localidad + "---");
			for(Perro perro : listaAgrupada.get(localidad)) {
				System.out.println(perro);
			}
		}
	}

	private static void opcionCrearPerro() {
		System.out.println("Ingrese el nombre:");
		String nombre = sc.nextLine();
		System.out.println("Ingrese la raza:");
		String raza = sc.nextLine();
		System.out.println("Ingrese la localidad (Teusaquillo, Suba, Usaquen y Chapinero):");
		String localidad = sc.nextLine();
		System.out.println("Ingrese cedula del propietario:");
		String cedulaPropietario = sc.nextLine();
		System.out.println("Ingrese nombre del propietario:");
		String nombrePropietario = sc.nextLine();
		System.out.println("Ingrese telefono de contacto:");
		String telefonoContacto = sc.nextLine();
		System.out.println("Ingrese dia de asistencia:");
		String diaAsistencia = sc.nextLine();

		Perro perro = new Perro(nombre, raza, localidad, cedulaPropietario, nombrePropietario, telefonoContacto,
				diaAsistencia);
		perros.agregar(perro);
	}
	
	private static void initBaseDatos() {
		for(int i = 1; i <= 10; i++) {
			Perro perro = new Perro("Perro " + i,
					"Raza " + i,
					getValorAleatorio(localidades),
					"23555434" + i,
					"Propietario " + i,
					"3252352" + i,
					getValorAleatorio(dias));
			perros.agregar(perro);
		}
	}
	
	private static String getValorAleatorio(String[] values) {
		return values[new Random().nextInt(values.length)];
	}
}
