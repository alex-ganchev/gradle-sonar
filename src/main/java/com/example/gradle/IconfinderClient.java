package com.example.gradle;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "iconfinder-api", url = "https://api.iconfinder.com", configuration = FeignConfig.class)
public interface IconfinderClient {
    @GetMapping("/v4/styles")
    StyleListResponseDto listAllStyles(@RequestParam int count);
}
