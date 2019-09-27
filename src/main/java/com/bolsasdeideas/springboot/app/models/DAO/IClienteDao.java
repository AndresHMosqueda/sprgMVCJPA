package com.bolsasdeideas.springboot.app.models.DAO;

import java.util.List;

import com.bolsasdeideas.springboot.app.models.entity.Cliente;


public interface IClienteDao {

	//Cliente es la clase entity que esta mapeada a la tabla
	
		public List<Cliente> findAll();
		
		public void save(Cliente cliente);
		
		public Cliente findOne(Long id);
		
		public void delete(Long id);
	
	
}
