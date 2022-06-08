package dado;

public class MainDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dado d = new Dado(1, DadoFace.CINCO);
		Dado d2 = new Dado(2, DadoFace.QUATRO);
		Dado d3 = new Dado(3, DadoFace.SEIS);
		Dado d4 = new Dado(4, DadoFace.TRES);
		Dado d5 = new Dado(5, DadoFace.DOIS);
		Dado d6 = new Dado(6, DadoFace.UM);
		Jogo j = new Jogo("Jogo1");
		
	    j.AdicionaDado(d6);
	    j.AdicionaDado(d5);
	    j.AdicionaDado(d4);
	    j.AdicionaDado(d3);
	    j.AdicionaDado(d2);
	    j.AdicionaDado(d);
	    
	    j.ListaDados();
	    j.FacePar();

	}

}
