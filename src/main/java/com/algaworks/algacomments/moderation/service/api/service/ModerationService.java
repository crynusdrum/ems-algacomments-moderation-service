package com.algaworks.algacomments.moderation.service.api.service;

import com.algaworks.algacomments.moderation.service.api.model.ModerationInput;
import com.algaworks.algacomments.moderation.service.api.model.ModerationOutput;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class ModerationService {

    private static final List<String> PROHIBITED_WORDS = List.of("ódio", "xingamento");

    public ModerationOutput moderate(ModerationInput input) {
        String lowerText = input.getText().toLowerCase();

        for (String word : PROHIBITED_WORDS) {
            if (lowerText.contains(word.toLowerCase())) {
                return ModerationOutput.builder()
                        .approved(false)
                        .reason("Contém palavra proibida: " + word)
                        .build();
            }
        }

        return ModerationOutput.builder()
                .approved(true)
                .reason("Comentário aprovado")
                .build();
    }

}
