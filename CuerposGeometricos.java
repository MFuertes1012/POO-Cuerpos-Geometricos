package FigurasGeometricas;
import java.util.Scanner;

public class CuerposGeometricos {
	static Scanner sc = new Scanner(System.in);
	static boolean Continuar;
	
 private double Volumen, Altura, Radio;
 private String NuevaF;
 
 public CuerposGeometricos(double Volumen, double Altura, double Radio, String NuevaF) {
			this.Volumen = Volumen;
			this.Altura = Altura;
			this.Radio = Radio;
			this.NuevaF = NuevaF;
		
 }
 public void NuevaFigura() {
		System.out.println("Se ha creado una nueva figura");
	}

public double getVolumen() {
	return Volumen;
}

public void setVolumen(double volumen) {
	Volumen = volumen;
}

public double getAltura() {
	return Altura;
}

public void setAltura(double altura) {
	Altura = altura;
}

public double getRadio() {
	return Radio;
}

public void setRadio(double radio) {
	Radio = radio;
}


}
 
 
	

