package pe.edu.uni.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import pe.edu.uni.app.dto.ComboDto;

@Service
public class ComboService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<ComboDto> getClientes(){
		String sql = "SELECT chr_cliecodigo code, ";
		sql += "concat(vch_cliepaterno,' ',vch_cliematerno, ";
		sql += "', ', vch_clienombre) value FROM CLIENTE";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(ComboDto.class)); 
	}

	
	
}
