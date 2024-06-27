package com.example.gradle;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/iconfinder")
public class IconfinderController {
    private IconfinderClient iconfinderClient;

    public IconfinderController(IconfinderClient iconfinderClient) {
        this.iconfinderClient = iconfinderClient;
    }

    @GetMapping("/styles")
    public StyleListResponseDto listALlStyles(@RequestParam("count") int count){
        return iconfinderClient.listAllStyles(count);
    }
}
