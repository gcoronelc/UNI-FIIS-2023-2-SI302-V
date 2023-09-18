package pe.edu.uni.aprendiendojava.service.sistb;

import pe.edu.uni.aprendiendojava.service.PromedioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioServiceImpl extends PromedioServiceSpec{

	@Override
	public int promediar(int pp, int ep, int ef) {
		int pr = (pp * 2 + ep + ef)/4;
		return pr;
	}

}
