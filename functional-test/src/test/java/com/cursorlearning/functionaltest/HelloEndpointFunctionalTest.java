package com.cursorlearning.functionaltest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.cursorlearning.app.CursorLearningApplication;

@SpringBootTest(classes = CursorLearningApplication.class)
@AutoConfigureMockMvc
class HelloEndpointFunctionalTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloEndpointReturnsExpectedPayload() throws Exception {
        mockMvc.perform(get("/api/v1/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello from CursorLearning"));
    }
}
