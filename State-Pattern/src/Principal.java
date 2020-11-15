public class Principal {

	public static void main(String[] args) {
		Alerta alerta = new Alerta();
		alerta.alertar();
		alerta.alertar();
		alerta.setAlerta(new ModoSonoro());
		alerta.alertar();
		alerta.alertar();
		alerta.alertar();		
	}

}