package org.example.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class TextContentDto {
    private String value;
    private List<Object> annotations;
}
