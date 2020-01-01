package com.study.adapter;

import java.util.List;

import com.study.model.db.TestModel;
import com.study.model.response.TestResponse;

public class Adapter {
    public static TestResponse toToDoItemResponse(final TestModel toDoItem, final List<String> errors) {
        return TestResponse.builder().toDoItem(toDoItem).errors(errors).build();
    }
}
