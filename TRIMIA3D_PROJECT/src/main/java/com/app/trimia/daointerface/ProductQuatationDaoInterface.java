package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.ProductQuotation;

public interface ProductQuatationDaoInterface extends CrudRepository<ProductQuotation,String> 
{
	public ProductQuotation findTopByOrderByIdDesc();
}
