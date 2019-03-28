package com.javachen.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javachen.service.DAOService;

@Component
public class LuceneIndexingTask {

	@Autowired
	private DAOService service;
	
	public void updateIndexes() {
		service.updateIndexes();
	}
}
