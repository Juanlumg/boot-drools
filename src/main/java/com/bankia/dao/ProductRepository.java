package com.bankia.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bankia.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

	@Query(value="select c from Product c where c.tipo = :tipo")
	List<Product> findByCustomerId(@Param("tipo")String tipo);
}
