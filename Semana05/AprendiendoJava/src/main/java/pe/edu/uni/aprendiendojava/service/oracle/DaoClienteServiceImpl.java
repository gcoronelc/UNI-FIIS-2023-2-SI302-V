package pe.edu.uni.aprendiendojava.service.oracle;

import pe.edu.uni.aprendiendojava.service.DaoServiceEspc;

/**
 *
 * @author Gustavo Coronel
 */
public class DaoClienteServiceImpl implements DaoServiceEspc{

	@Override
	public void consultar() {
		System.out.println("ORACLE: Clientes consultados");
	}

	@Override
	public void insertar() {
		System.out.println("ORACLE: Cliente registrado");
	}

	@Override
	public void actualizar() {
		System.out.println("ORACLE: Cliente actualizado");
	}

	@Override
	public void eliminar() {
		System.out.println("ORACLE: Cliente eliminado");
	}

}
