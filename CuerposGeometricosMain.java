package FigurasGeometricas;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CuerposGeometricosMain {
	static boolean Continuar;
	static int Opcion, Opcion1;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			do {
			try {
				Continuar = false;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~Bienvenido a nuestro programa~~~~~~~");
		System.out.println("");
		System.out.println("Elija la figura geométrica que desee");
		System.out.println("Opcion 1: Cilindro");
		System.out.println("Opción 2: Cono");
		System.out.println("Opción 3: Dodecaedro");
		System.out.println("Opción 4: Esfera");
		System.out.println("opción 5: Hexaedro");
		System.out.println("Opción 6: Icosaedro");
		System.out.println("Opción 7: Octaedro");
		System.out.println("Opción 8: Ortoedro");
		System.out.println("Opción 9: Pirámide");
		System.out.println("Opción 10: Prisma");
		System.out.println("Opción 11: Tetraedro");
		System.out.println("Opición 12: Tronco de Cono");
		System.out.println("Opción 13: Tronco de Pirámide");
		System.out.println("Opción 14: Salir");
		System.out.println("Opción: ");
		Opcion = sc.nextInt();
		while(Opcion <= 0 || Opcion >= 15) {
			System.out.println("Usted ha ingresado una respuesta erronea, por favor ingrese una respuesta válida");
			System.out.print("Opcion: ");
			Opcion = sc.nextInt();
		}
		} catch (InputMismatchException ex) {
            System.out.println("No puede ingresar signos, números, letras o símbolos");
            	  sc.next();
            	  System.out.println();
            	  Continuar = true;
		}
		} while (Continuar);

			
			switch(Opcion) {
			case 1:
				Cilindro cilindro =  new Cilindro(0.0, 0.0,0.0, "Se ha creado un cilindro", 0.0, 0.0);
				cilindro.CalcularCilindro();
				cilindro.NuevaFigura();
				break;
				
			case 2:
				Cono cono = new Cono(0.0, 0.0,0.0, "Se ha creado un cono", 0.0, 0.0, 0.0);
				cono.CalcularCono();
				cono.NuevaFigura();
				break;
				
			case 3:
				Dodecaedro dodecaedro = new Dodecaedro(0.0, 0.0,0.0, "Se ha creado un dodecaedro", 0.0, 0.0, 0.0, 0.0, 0.0);
				dodecaedro.CalcularDodecaedro();
				dodecaedro.NuevaFigura();
				break;
			
			case 4:
				Esfera esfera = new Esfera( 0.0, 0.0,0.0, "Se ha creado una esfera", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				esfera.CalcularEsfera();
				esfera.NuevaFigura();
				break;
				
			case 5:
				Hexaedro hexaedro = new Hexaedro(0.0, 0.0,0.0, "Se ha creado un hexaedro", 0.0, 0.0, 0.0);				
				hexaedro.CalcularHexaedro();
				hexaedro.NuevaFigura();
				break;
				
			case 6:
				Icosaedro icosaedro = new Icosaedro(0.0, 0.0,0.0, "Se ha creado un icoasedro", 0.0, 0.0);
				icosaedro.CalcularIcosaedro();
				icosaedro.NuevaFigura();
				break;
				
			case 7:
				Octoedro octaedro = new Octoedro(0.0, 0.0,0.0,"Se ha creado un octaedro", 0.0, 0.0);
				octaedro.CalcularOctoadro();
				octaedro.NuevaFigura();
				break;
				
			case 8:
				Ortoedro ortoedro = new Ortoedro(0.0, 0.0,0.0, "Se ha creado un ortoedro", 0.0, 0.0, 0.0, 0.0, 0.0);
				ortoedro.CalcularOrtoedro();
				ortoedro.NuevaFigura();
				break;
				
			case 9:
				Pirámide piramide = new Pirámide(0.0, 0.0,0.0,"Se ha creado una pirámide", 0.0, 0.0, 0.0, 0.0,0.0,0.0,0.0,0.0);
				piramide.CalcularPiramide();
				piramide.NuevaFigura();
				break;
				
			case 10:
				Prisma prisma = new Prisma(0.0, 0.0,0.0,"Se ha creado un prisma", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				prisma.CalcularPrisma();
				prisma.NuevaFigura();
				break;
				
			case 11:
				Tetraedro tetraedro = new Tetraedro(0.0, 0.0,0.0,"Se ha creado un tetraedro", 0.0, 0.0);
				tetraedro.CalcularTetraedro();
				tetraedro.NuevaFigura();
				break;
				
			case 12:
				TroncodeCono trondecono = new TroncodeCono(0.0, 0.0,0.0, "Se ha creado el tronco del cono", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
				trondecono.CalcularTroncodeCono();
				trondecono.NuevaFigura();
				break;
				
			case 13:
				TroncodePiramide troncodepiramide = new TroncodePiramide(0.0, 0.0,0.0, "Se ha creado el tronco de la pirámide", 0.0, 0.0, 0.0, 0.0 ,0.0 ,0.0 ,0.0, 0.0, 0.0, 0.0, 0.0);
				troncodepiramide.CalcularTroncoPiramide();
				troncodepiramide.NuevaFigura();
				break;
			}
			
	
	}while(Opcion!= 14);
		System.out.println("~~~~~Gracias por utilizar nuestro programa~~~~~~");
}
	}
