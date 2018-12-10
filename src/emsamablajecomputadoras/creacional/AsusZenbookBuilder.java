package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ComputadorBuilder {
    
    public void definir(){
        
            computador=new Computador();
        }
	public void buildMarca() {
		computador.setMarca("Asus");
	}
	
	public void buildModelo() {
		computador.setModelo("Zenbook");
	}
	
	public void buildRam() {
		computador.setRam(16);
	}
	
	public void buildAlmacenamiento() {
		computador.setAlmacenamiento(500);
	}
	
	public void buildSO() {
		computador.setOs(new SistemaOperativo("Windows", 64, "10 HOME"));
	}
	
	public void buildMainboard() {
		computador.setPlaca(new Mainboard("Prime", "Z370"));
	}
}
