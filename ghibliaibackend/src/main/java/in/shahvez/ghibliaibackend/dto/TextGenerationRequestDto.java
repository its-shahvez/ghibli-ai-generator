package in.shahvez.ghibliaibackend.dto;


import lombok.Data;

@Data
public class TextGenerationRequestDto {

    private String prompt;
    private String style;
}
