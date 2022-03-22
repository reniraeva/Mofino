package com.mofino.springboot.mofino;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void loginPageTest() throws Exception {
        this.mvc.perform(get("/login")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void indexPageTest() throws Exception {
        this.mvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void registerPageTest() throws Exception {
        this.mvc.perform(get("/register")).andDo(print()).andExpect(status().isOk());
    }
}