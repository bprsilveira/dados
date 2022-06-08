package dado;

public class Dado {
	
    private int nome;
	private DadoFace face;
		
	public Dado(int nome, DadoFace face) {
		
		this.nome = nome;
		this.face = face;
	}
	
	public DadoFace getFace() {
		
		return this.face;
	}
	
	public int mostraNome() {
		
		return this.nome;
	}
	
	public void mostraDado() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Face: " + this.face);
	}
	
	
}
