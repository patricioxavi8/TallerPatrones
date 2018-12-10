package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	private ComputadorBuilder computadorBuilder;

    public ComputadorDirector(ComputadorBuilder computadorBuilder){
            this.computadorBuilder=computadorBuilder;
        
        }
	
	
	public Computador getComputadorBuilder() {
		return computadorBuilder.getComputador();
	}


	public void setCOmputadorBuilder(ComputadorBuilder omputadorBuilder) {
		this.computadorBuilder = computadorBuilder;
	}

	public void ConstruirComputador() {
        computadorBuilder.definir();
		computadorBuilder.buildMainboard();
		computadorBuilder.buildAlmacenamiento();
		computadorBuilder.buildMarca();
		computadorBuilder.buildModelo();
		computadorBuilder.buildRam();
		computadorBuilder.buildSO();
	}
}