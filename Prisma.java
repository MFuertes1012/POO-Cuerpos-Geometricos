package FigurasGeometricas;
import java.util.InputMismatchException;

public class Prisma extends CuerposGeometricos {
	private double AreaLateral, AreaTotal, Volumen,PerimetroBase, LongitudLados, NumeroLados, AreaBase, Apotema, Altura;
	
	public Prisma (double Volumen, double Altura, double Radio, String NuevaF, double AreaLateral, double AreaTotal, double PerimetroBase, double LongitudLados, double NumeroLados, double AreaBase, double Apotema) {
		super(Volumen, Altura, Radio, NuevaF);
		this.AreaLateral = AreaLateral;
		this.AreaTotal = AreaTotal;
		this.Volumen = Volumen;
		this.PerimetroBase= PerimetroBase;
		this.LongitudLados = LongitudLados;
		this.NumeroLados = NumeroLados;
		this.AreaBase= AreaBase;
		this.Apotema = Apotema;
		this.Altura = Altura;
	}
	public void CalcularPrisma() {
		do {
			try {
				Continuar = false;
				
		System.out.print("Ingrese el número de lados del prisma: ");
		NumeroLados = sc.nextInt();
		while(NumeroLados <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			NumeroLados = sc.nextInt();
		}
		
		System.out.print("Ingrese la Longitud de los lados del Prisma: ");
		LongitudLados = sc.nextDouble();
		while(LongitudLados <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			LongitudLados = sc.nextDouble();
		}
		
		System.out.print("Ingrese la Altura del Prisma: ");
		setAltura(sc.nextDouble());
		while(getAltura() <= 0) {
			System.out.println("No puede ingresar valores negativos");
			System.out.print("Valor: ");
			setAltura(sc.nextDouble());
		}
		PerimetroBase = NumeroLados*LongitudLados;
		AreaLateral = PerimetroBase*getAltura();
		Apotema = Math.sqrt(3*Math.pow(LongitudLados,2)/4);
		AreaBase = PerimetroBase*Apotema/2;
		AreaTotal = AreaLateral+2*AreaBase;
		Volumen = AreaBase*getAltura();
		
		System.out.println("El área lateral del prisma es: "+AreaLateral);
		System.out.println("El área total del prisma es: "+AreaTotal);
		System.out.println("El volumen del prisma es: "+Volumen);
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
		System.out.println("Se ha creado un prisma");
	}
		
}
