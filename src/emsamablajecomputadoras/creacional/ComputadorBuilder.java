package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	public void createNewComputador() {
		computador = new Computador();
	}
	public abstract void definir();
	public abstract void buildMarca();
	public abstract void buildModelo();
	public abstract void buildRam();
	public abstract void buildAlmacenamiento();
	public abstract void buildSO();
	public abstract void buildMainboard();
}
