package com.example.gradle;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FeignConfigTest {
    @Autowired
    private RequestInterceptor requestInterceptor;
    @Test
    void testRequestInterceptor() {
        RequestTemplate requestTemplate = new RequestTemplate();
        requestInterceptor.apply(requestTemplate);

        assertEquals("Bearer X0vjEUN6KRlxbp2DoUkyHeM0VOmxY91rA6BbU5j3Xu6wDodwS0McmilLPBWDUcJ1",
                requestTemplate.headers().get("Authorization").iterator().next());
    }

}
