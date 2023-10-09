package pe.edu.uni.proyectosemana07.controller;

import pe.edu.uni.proyectosemana07.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class MateController {

	public int dividir(int n1, int n2) {
		MateService service = new MateService();
		return service.dividir3(n1, n2);
	}

}
