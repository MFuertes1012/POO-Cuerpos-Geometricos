package FigurasGeometricas;
import java.util.InputMismatchException;

public class Pir�mide extends CuerposGeometricos {
	private double AreaLateral, AreaTotal, Volumen, PerimetroBase, ApotemaPiramide, Apotema, Altura, LongitudBase, NumeroLados, AreaBase;
	
	public Pir�mide (double Volumen, double Altura, double Radio, String NuevaF, double AreaLateral, double AreaTotal, double PerimetroBase, double ApotemaPiramide, double Apotema, double LongitudBase, double NumeroLados, double AreaBase) {
		super(Volumen, Altura, Radio, NuevaF);
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
		this.PerimetroBase= PerimetroBase;
		this.ApotemaPiramide = ApotemaPiramide;
		this.Apotema = Apotema;
		this.Altura = Altura;
		this.LongitudBase = LongitudBase;
		this.NumeroLados = NumeroLados;
		this.AreaBase= AreaBase;
		this.Altura = Altura;
	}
	public void CalcularPiramide() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese la altura de la pir�mide: ");
		setAltura(sc.nextDouble());
		while(getAltura() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
				setAltura(sc.nextDouble());
		}
				
		System.out.print("Ingrese el n�mero de lados de la pir�mide: ");
		NumeroLados = sc.nextInt();
		while(NumeroLados <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			NumeroLados = sc.nextInt();
		}
		
		System.out.print("Ingrese la longitud de la base de la pir�mide ");
		LongitudBase = sc.nextDouble();
		while(LongitudBase <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LongitudBase = sc.nextDouble();
		}
		
		PerimetroBase = NumeroLados*LongitudBase;
		Apotema = NumeroLados/2;
		AreaBase = PerimetroBase*Apotema/2;
		ApotemaPiramide = Math.pow(getAltura(),2)+Math.pow(Apotema,2);
		AreaLateral = PerimetroBase*ApotemaPiramide/2;
		AreaTotal = AreaLateral+AreaBase;
		Volumen = Math.round(AreaBase *getAltura()/ 3);
		
		System.out.println("El �rea lateral de la pir�mide es: "+AreaLateral);
		System.out.println("El �rea total de la pir�mide es: "+AreaTotal);
		System.out.println("El volumen de la pir�mide es: "+Volumen);
		} catch (InputMismatchException ex) {
		    System.out.println("No puede ingresar signos, n�meros, letras o s�mbolos");
			  sc.next();
			  System.out.println();
			  Continuar = true;
				}
			} while (Continuar);
		}
@Override
	public void NuevaFigura() {
	System.out.println("Se ha creado una pir�mide");
	}
		
}
