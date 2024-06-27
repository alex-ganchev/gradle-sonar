package com.example.gradle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.*;

@WebMvcTest(IconfinderController.class)
public class IconfinderControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IconfinderClient iconfinderClient;

    private StyleListResponseDto mockResponse;

    @BeforeEach
    public void setUp() {
        mockResponse = new StyleListResponseDto();

        when(iconfinderClient.listAllStyles(anyInt())).thenReturn(mockResponse);
    }

    @Test
    public void testListAllStyles() throws Exception {
        int count = 5;

        mockMvc.perform(get("/iconfinder/styles")
                        .param("count", String.valueOf(count)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.styles", is(not(empty()))));
    }
}
