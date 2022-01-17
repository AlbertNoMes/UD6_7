import javax.swing.JOptionPane;
public class conversionEurosAPP {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Escribe una cantidad de euros");
		double cantidad=Double.parseDouble(texto);
		String moneda=JOptionPane.showInputDialog("Escribe libras, dolares o yenes para la conversion");
		conversor(cantidad, moneda);
	}
	public static void conversor (double cantidad, String moneda) {
		double res=0;
		//En caso de que no se introduzca la moneda correcta
		boolean correcto=true;
		//Calculamos la cantidad segun la moneda
		switch (moneda) {
		case "libras":
			res=cantidad*0.86;
			break;
		case "dolares":
			res=cantidad*1.29;
			break;
		case "yenes":
			res=cantidad*129.852;
			break;
		default:
			System.out.println("No has introducido correctamente la moneda");
			correcto=false;
		}
		if (correcto) {
			System.out.println(cantidad+" euros en "+moneda+" son "+res);
		}
	}
}
