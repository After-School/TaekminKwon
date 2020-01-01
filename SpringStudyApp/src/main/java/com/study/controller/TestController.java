package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.adapter.Adapter;
import com.study.model.db.TestModel;
import com.study.model.response.TestResponse;
import com.study.service.TestService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public @ResponseBody TestResponse get(@PathVariable(value = "id") String id) {
		List<String> errors = new ArrayList<>();
		TestModel toDoItem = null;
		try {
			toDoItem = testService.get(id);
		} catch (final Exception e) {
			errors.add(e.getMessage());
		}
		return Adapter.toToDoItemResponse(toDoItem, errors);
	}

}
