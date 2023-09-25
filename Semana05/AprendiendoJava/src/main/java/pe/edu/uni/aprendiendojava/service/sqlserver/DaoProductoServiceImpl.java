package pe.edu.uni.aprendiendojava.service.sqlserver;

import pe.edu.uni.aprendiendojava.service.DaoServiceEspc;

/**
 *
 * @author Gustavo Coronel
 */
public class DaoProductoServiceImpl implements DaoServiceEspc{

	@Override
	public void consultar() {
		System.out.println("SQL SERVER: Productos consultados");
	}

	@Override
	public void insertar() {
		System.out.println("SQL SERVER: Producto registrado");
	}

	@Override
	public void actualizar() {
		System.out.println("SQL SERVER: Producto actualizado");
	}

	@Override
	public void eliminar() {
		System.out.println("SQL SERVER: Producto eliminado");
	}
}
