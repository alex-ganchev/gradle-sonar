package com.example.gradle;

import java.util.List;

public class StyleListResponseDto {
    private int total_count;
    private List<StyleResponseDto> styles;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<StyleResponseDto> getStyles() {
        return styles;
    }

    public void setStyles(List<StyleResponseDto> styles) {
        this.styles = styles;
    }
}
