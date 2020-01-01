package com.study.model.response;

import java.util.List;

import com.study.api.response.APIResponse;
import com.study.model.db.TestModel;

import lombok.Builder;

public class TestResponse extends APIResponse<TestModel> {

    @Builder
    public TestResponse(final TestModel toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);
    }
}


