package FigurasGeometricas;
import java.util.InputMismatchException;

public class Ortoedro extends CuerposGeometricos{
	private double Area, Volumen, Diagonal, LadoA, LadoB, LadoC;
	
	public Ortoedro (double Volumen, double Altura, double Radio, String NuevaF, double Area, double Diagonal, double LadoA, double LadoB, double LadoC) {
		super(Volumen, Altura, Radio, NuevaF);
		this.Area = Area;
		this.Volumen = Volumen;
		this.Diagonal = Diagonal;
		this.LadoA = LadoA;
		this.LadoB = LadoB;
		this.LadoC = LadoC;
	}
	public void CalcularOrtoedro() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la longitud del ortoedro, Lado a: ");
		LadoA = sc.nextDouble();
		while(LadoA <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LadoA = sc.nextDouble();
		}
		
		System.out.print("Ingrese el ancho del ortoedro, Lado b: ");
		LadoB = sc.nextDouble();
		while(LadoB <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LadoB = sc.nextDouble();
		}
		
		System.out.print("Ingrese el alto del ortoedro, Lado c ");
		LadoC = sc.nextDouble();
		while(LadoC <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LadoC = sc.nextDouble();
		}
		Area = 2*(LadoA*LadoB + LadoA*LadoC + LadoB*LadoC);
		Volumen = LadoA*LadoB*LadoC;
		Diagonal = Math.sqrt(Math.pow(LadoA,2)+ Math.pow(LadoB,2)+ Math.pow(LadoC,2));
		
		System.out.println("El area del ortoedro es: "+Area);
		System.out.println("El volumen del ortoedro es: "+Volumen);
		System.out.println("El valor de la diagonal del ortoedro es: "+Diagonal);
			} catch (InputMismatchException ex) {
			    System.out.println("No puede ingresar signos, números, letras o símbolos");
				  sc.next();
				  System.out.println();
				  Continuar = true;
					}
				} while (Continuar);
			}
	@Override
		public void NuevaFigura() {
		System.out.println("Se ha creado un ortoedro");
	}

}
