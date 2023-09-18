package pe.edu.uni.aprendiendojava.service.sista;

import pe.edu.uni.aprendiendojava.service.PromedioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioServiceImpl extends PromedioServiceSpec{

	@Override
	public int promediar(int pp, int ep, int ef) {
		int pr = (pp + ep + ef)/3;
		return pr;
	}

}
