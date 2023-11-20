package pe.edu.uni.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String sql_base;
	
	static {
		sql_base= "select chr_cliecodigo codigo,";
		sql_base = sql_base.concat("vch_cliepaterno paterno, vch_cliematerno materno,");
		sql_base = sql_base.concat("vch_clienombre nombre, chr_cliedni dni,");
		sql_base = sql_base.concat("vch_cliedireccion direccion, vch_clietelefono telegono ");
		sql_base = sql_base.concat("from cliente ");
	}
	

	public List<Map<String, Object>> getAll() {
		return jdbcTemplate.queryForList(sql_base);
	}

	public List<Map<String, Object>> getAll(String dato) {
		String sql = sql_base.concat("where vch_cliepaterno like ? ");
		sql = sql.concat("or vch_cliematerno like ? ");
		sql = sql.concat("or vch_clienombre like ? ");
		dato = "%" + dato.toUpperCase() + "%";
		Object[] args = { dato, dato, dato };
		return jdbcTemplate.queryForList(sql, args);
	}

	public List<Map<String, Object>> getAll(String paterno, String materno, String nombre) {
		String sql = sql_base.concat("where vch_cliepaterno like ? ");
		sql = sql.concat("and vch_cliematerno like ? ");
		sql = sql.concat("and vch_clienombre like ? ");
		paterno = "%" + ((paterno==null)?"":paterno.toUpperCase()) + "%";
		materno = "%" + ((materno==null)?"":materno.toUpperCase()) + "%";
		nombre = "%" + ((nombre==null)?"":nombre.toUpperCase()) + "%";
		return jdbcTemplate.queryForList(sql, paterno, materno, nombre);
	}

}
