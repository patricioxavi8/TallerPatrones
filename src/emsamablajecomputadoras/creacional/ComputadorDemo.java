package emsamablajecomputadoras.creacional;

import com.sun.prism.image.CompoundTexture;

public class ComputadorDemo {
	public static void main(String[] argc) {
		ComputadorDirector computadorDirector = new ComputadorDirector();
		
		computadorDirector.setCOmputadorBuilder(new AsusRogeBuilder());
		
		computadorDirector.setCOmputadorBuilder(new AsusZenbookBuilder());
		
		//computadorDirector.ConstruirComputador();
		
		Computador computador = computadorDirector.getComputadorBuilder();
	
		System.out.println(computador.getModelo());
	}
}
