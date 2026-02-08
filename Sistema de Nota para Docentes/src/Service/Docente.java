package Service;

public class Docente {

	public static String usuario;
	private double nota;
	private int bimestre;

	public Docente(double nota, int bimestre) {
		this.nota = nota;
		this.bimestre = bimestre;
	}

	public static String getUsuario() {
		return usuario;
	}

	public static void setUsuario(String usuario) {
		Docente.usuario = usuario;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getBimestre() {
		return bimestre;
	}

	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}
		
	

}