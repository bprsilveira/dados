package dado;

public enum DadoFace {
	
	UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6);
	
	private int dadoNumero;
	
	DadoFace(int dadoNumero){
		
		this.dadoNumero = dadoNumero;
	}
	
	public int getDado() {
		
		return dadoNumero;
		
	}

}
