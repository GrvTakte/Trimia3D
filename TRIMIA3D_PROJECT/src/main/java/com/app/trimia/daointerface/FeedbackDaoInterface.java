package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.app.trimia.model.Feedback;

@EnableTransactionManagement
public interface FeedbackDaoInterface extends CrudRepository<Feedback, String >{

}
