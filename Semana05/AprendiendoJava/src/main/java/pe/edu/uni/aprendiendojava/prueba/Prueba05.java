package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.DaoServiceEspc;
import pe.edu.uni.aprendiendojava.service.sqlserver.DaoClienteServiceImpl;

/**
 *
 * @author Gustavo Coronel
 * @blog http://desarrollasoftware.com/
 * @cursos https://gcoronelc.github.io/
 */
public class Prueba05 {


    public static void main(String[] args) {
        
		 DaoServiceEspc service = new DaoClienteServiceImpl();
		 
		 
		 service.insertar();
		 service.actualizar();
		 service.consultar();
		 
		 
		 
    }

}
