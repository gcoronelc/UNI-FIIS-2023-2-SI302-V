package pe.edu.uni.aprendiendojava.service.sqlserver;

import pe.edu.uni.aprendiendojava.service.DaoServiceEspc;

/**
 *
 * @author Gustavo Coronel
 */
public class DaoClienteServiceImpl implements DaoServiceEspc{

	@Override
	public void consultar() {
		System.out.println("SQL SERVER: Clientes consultados");
	}

	@Override
	public void insertar() {
		System.out.println("SQL SERVER: Cliente registrado");
	}

	@Override
	public void actualizar() {
		System.out.println("SQL SERVER: Cliente actualizado");
	}

	@Override
	public void eliminar() {
		System.out.println("SQL SERVER: Cliente eliminado");
	}

}
