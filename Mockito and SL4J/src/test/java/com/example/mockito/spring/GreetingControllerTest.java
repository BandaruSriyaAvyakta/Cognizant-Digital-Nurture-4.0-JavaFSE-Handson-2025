
package com.example.mockito.spring;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest {
    @Autowired
    MockMvc mvc;

    @MockBean
    GreetingService service;

    @Test
    void testGreet() throws Exception {
        when(service.greet("Alice")).thenReturn("Hello, Alice (mocked)");
        mvc.perform(get("/greet/Alice")).andExpect(status().isOk()).andExpect(content().string("Hello, Alice (mocked)"));
    }
}
