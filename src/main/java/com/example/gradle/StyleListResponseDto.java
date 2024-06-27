package com.example.gradle;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class StyleListResponseDto {
    private int total_count;
    private List<StyleResponseDto> styles;
}
