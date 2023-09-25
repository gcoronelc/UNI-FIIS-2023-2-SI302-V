package pe.edu.uni.aprendiendojava.service.oracle;

import pe.edu.uni.aprendiendojava.service.DaoServiceEspc;

/**
 *
 * @author Gustavo Coronel
 */
public class DaoProductoServiceImpl implements DaoServiceEspc{

	@Override
	public void consultar() {
		System.out.println("ORACLE: Productos consultados");
	}

	@Override
	public void insertar() {
		System.out.println("ORACLE: Producto registrado");
	}

	@Override
	public void actualizar() {
		System.out.println("ORACLE: Producto actualizado");
	}

	@Override
	public void eliminar() {
		System.out.println("ORACLE: Producto eliminado");
	}
}
