package OPP.inheritance;

public class AlunoPosGrad extends Aluno{

	private String orientador;
	private String tese;
	
	public AlunoPosGrad(int ra, String nome, boolean matriculado, String orientador, String tese) {
		super(ra, nome, matriculado);	
		this.orientador = orientador;
		this.tese = tese;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Orientador = " + this.orientador);
		System.out.println("Tese = " + this.tese);
	}
}
