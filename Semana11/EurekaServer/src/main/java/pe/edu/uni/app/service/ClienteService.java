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
	
	public List<Map<String,Object>> getAll(){
		String sql ="select chr_cliecodigo codigo,";
		sql = sql.concat("vch_cliepaterno paterno, vch_cliematerno materno,");
		sql = sql.concat("vch_clienombre nombre, chr_cliedni dni,");
		sql = sql.concat("vch_cliedireccion direccion, vch_clietelefono telegono ");
		sql = sql.concat("from cliente");
		return jdbcTemplate.queryForList(sql);
	}
	
}
