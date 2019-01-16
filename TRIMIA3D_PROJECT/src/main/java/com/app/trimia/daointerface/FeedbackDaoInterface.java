package com.app.trimia.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.app.trimia.model.Feedback;

public interface FeedbackDaoInterface extends CrudRepository<Feedback, String >{

}
