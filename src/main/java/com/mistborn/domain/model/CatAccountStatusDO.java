package com.mistborn.domain.model;

import java.time.Instant;

public class CatAccountStatusDO {

  private Long id;
  private String description;
  private Instant createdAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public CatAccountStatusDO(Long id, String description, Instant createdAt) {
    this.id = id;
    this.description = description;
    this.createdAt = createdAt;
  }

  public CatAccountStatusDO() {
  }
}
