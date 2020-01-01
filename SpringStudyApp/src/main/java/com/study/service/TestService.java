package com.study.service;

import org.springframework.stereotype.Service;

import com.study.model.db.TestModel;

@Service
public class TestService {

	public TestModel get(final String id) {
		// do id validation
		return TestModel.builder()
				.id(id)
				.description("First step of journey.")
				.name("test")
				.build();
	}

}
