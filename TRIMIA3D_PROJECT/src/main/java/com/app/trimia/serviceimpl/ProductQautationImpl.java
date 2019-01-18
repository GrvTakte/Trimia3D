package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.ProductQuatationDaoInterface;
import com.app.trimia.model.ProductQuotation;
import com.app.trimia.serviceinterface.ProductQautationSeviceInterface;
import com.app.trimia.util.IdAutoGenerate;



@Service
public class ProductQautationImpl implements ProductQautationSeviceInterface
{
	IdAutoGenerate idgenerate=new IdAutoGenerate();
	@Autowired
	ProductQuatationDaoInterface quatationDaoInterface;

	@Override
	public List<ProductQuotation> productQA() 
	{
		List<ProductQuotation> qlist=(List<ProductQuotation>) quatationDaoInterface.findAll();
		return  qlist;
	}

	@Override
	public void addQuatation(ProductQuotation pQuatation)
	{
		ProductQuotation quatation=quatationDaoInterface.findTopByOrderByIdDesc();
		String id=idgenerate.generateId(quatation.getId());
		pQuatation.setId(id);
		quatationDaoInterface.save(pQuatation);
	}

}
