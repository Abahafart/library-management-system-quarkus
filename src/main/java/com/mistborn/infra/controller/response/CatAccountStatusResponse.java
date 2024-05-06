package com.mistborn.infra.controller.response;

import java.time.Instant;

public record CatAccountStatusResponse(Long id, String description, Instant createdAt) {

}
