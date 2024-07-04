package com.ms.consumer.email.dtos;

import java.util.UUID;

public record EmailRecordDto(
        UUID userId,
        String emailTo,
        String text,
        String subject
) {
}
