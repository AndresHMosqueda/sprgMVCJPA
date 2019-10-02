package com.bolsasdeideas.springboot.app.models.DAO;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsasdeideas.springboot.app.models.entity.Cliente;


public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long> {

	//Cliente es la clase entity que esta mapeada a la tabla
	
	
	
	
	
	
}
