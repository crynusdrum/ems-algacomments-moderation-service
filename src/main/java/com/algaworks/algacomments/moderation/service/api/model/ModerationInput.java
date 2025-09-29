package com.algaworks.algacomments.moderation.service.api.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Builder
@Data
public class ModerationInput {


    @NotNull
    private UUID commentId;

    @NotBlank
    private String text;
}
