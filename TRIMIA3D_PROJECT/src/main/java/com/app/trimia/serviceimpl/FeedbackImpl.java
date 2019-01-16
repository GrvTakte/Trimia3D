package com.app.trimia.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.trimia.daointerface.FeedbackDaoInterface;
import com.app.trimia.model.Feedback;
import com.app.trimia.serviceinterface.FeedbackInterface;

@Service
public class FeedbackImpl implements FeedbackInterface{

	@Autowired 
	FeedbackDaoInterface feedbackdao;
	
	@Override
	public List<Feedback> getFeedback() {
		System.out.println("feedback impl");
		List<Feedback> flist=(List<Feedback>) feedbackdao.findAll();
		System.out.println(flist);
		return flist;
	}
	
	

}
