package com.algaworks.algacomments.moderation.service.api.controller;

import com.algaworks.algacomments.moderation.service.api.model.ModerationInput;
import com.algaworks.algacomments.moderation.service.api.model.ModerationOutput;
import com.algaworks.algacomments.moderation.service.api.service.ModerationService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/moderate")
@RequiredArgsConstructor
@RestController
public class ModerationController {

    private final ModerationService moderationService;

    @SneakyThrows
    @PostMapping
    public ModerationOutput moderate(@RequestBody ModerationInput input) {
        //Thread.sleep(Duration.ofSeconds(10));
        return moderationService.moderate(input);

    }
}
