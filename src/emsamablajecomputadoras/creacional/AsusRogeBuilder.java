package emsamablajecomputadoras.creacional;

public abstract class AsusRogeBuilder extends ComputadorBuilder{
	public void buildMarca() {
		computador.setMarca("Asus");
	}
	
	public void buildModelo() {
		computador.setModelo("ROG");
	}
	
	public void buildRam() {
		computador.setRam(32);
	}
	
	public void buildAlmacenamiento() {
		computador.setAlmacenamiento(1000);
	}
	
	public void buildSO() {
		computador.setOs(new SistemaOperativo("Windows", 64, "10 PRO"));
	}
	
	public void buildMainboard() {
		computador.setPlaca(new Mainboard("Strix", "x99"));
	}
}
