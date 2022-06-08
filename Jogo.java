package dado;

import java.util.ArrayList;

public class Jogo {

	private String nomeJogo;
	private int par;
	private ArrayList<Dado> dado;
	
	public Jogo(String nomeJogo) {
		
		this.nomeJogo = nomeJogo;
		this.dado = new ArrayList<Dado>();
	}
	
	public String GetNomeJogo() {
		
		return this.nomeJogo;
	}
	
	public void AdicionaDado(Dado d) {
		
	  if(d!=null)
		
		dado.add(d);
	  
	  if(d.getFace().equals(DadoFace.DOIS)||d.getFace().equals(DadoFace.QUATRO)||d.getFace().equals(DadoFace.SEIS)) {
		  
		  this.par++;
	  }
	  
	}
	
	public void FacePar() {
		
				
			System.out.println ("Número de valors pares = " + this.par);
		}
	
	public void ListaDados() {
		
		System.out.println("Dados: ");
		
		for(Dado dd: dado){
				  
		  dd.mostraDado();
		
		}   
	}
}
