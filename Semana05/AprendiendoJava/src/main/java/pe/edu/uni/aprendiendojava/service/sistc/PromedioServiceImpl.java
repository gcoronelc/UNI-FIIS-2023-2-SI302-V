package pe.edu.uni.aprendiendojava.service.sistc;

import pe.edu.uni.aprendiendojava.service.PromedioServiceSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class PromedioServiceImpl implements PromedioServiceSpec{

	@Override
	public int promediar(int pp, int ep, int ef) {
		int pr = (pp + ep + ef * 2)/4;
		return pr;
	}

}
