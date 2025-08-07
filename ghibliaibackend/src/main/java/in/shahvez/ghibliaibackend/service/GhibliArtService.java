package in.shahvez.ghibliaibackend.service;

import in.shahvez.ghibliaibackend.client.StabilityAiClient;
import in.shahvez.ghibliaibackend.dto.TextToImageRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.lang.String;

@Service
public class GhibliArtService {

    private final StabilityAiClient stabilityAiClient;
    private  final String apiKey;


    GhibliArtService(StabilityAiClient stabilityAiClient, @Value("${stability.api.key}") String apiKey){

        this.stabilityAiClient = stabilityAiClient;
        this.apiKey = apiKey;


    }

    public byte[] createGhibliArt(MultipartFile image, String prompt){

        String finalPrompt = prompt + ", in the beautiful, detailed anime style of studio ghibli.";
        String engineId  = "stable-diffusion-v1-6";
        String stylePreset ="anime";



        return stabilityAiClient.generateImageFromImage(
                "Bearer " +apiKey,
                 engineId,
                 image,
                 finalPrompt,
                 stylePreset
        );
    }
    public byte[] createGhibliArtFromText( String prompt, String style){

        String finalPrompt = prompt+", in the beautiful, detailed anime style of studio ghibli.";
        String engineId  = "stable-diffusion-xl-1024-v1-0";
        String stylePreset =style.equals("general") ? "anime": style.replace("_", "-");

        TextToImageRequest requestPayload = new TextToImageRequest(finalPrompt, stylePreset);

        return  stabilityAiClient.generateImageFromText(
                "Bearer " +apiKey,
                engineId,
                requestPayload

        );

    }


}
