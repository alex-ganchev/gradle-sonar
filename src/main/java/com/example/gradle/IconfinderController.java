package com.example.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/iconfinder")
public class IconfinderController {
    @Autowired
    private IconfinderClient iconfinderClient;

    @GetMapping("/styles")
    public StyleListResponseDto listALlStyles(@RequestParam("count") int count){
        return iconfinderClient.listAllStyles(count);
    }
}
