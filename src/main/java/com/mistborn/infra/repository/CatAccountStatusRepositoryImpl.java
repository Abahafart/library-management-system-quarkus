package com.mistborn.infra.repository;

import java.util.List;
import java.util.Optional;

import com.mistborn.domain.model.CatAccountStatusDO;
import com.mistborn.domain.repository.CatAccountStatusRepository;
import com.mistborn.infra.repository.entities.CatAccountStatusEntity;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CatAccountStatusRepositoryImpl implements CatAccountStatusRepository {

  @Override
  public Optional<CatAccountStatusDO> getById(long id) {
    CatAccountStatusEntity found = CatAccountStatusEntity.findById(id);
    return Optional.ofNullable(buildDO(found));
  }

  @Override
  public Optional<CatAccountStatusDO> getByDescription(String description) {
    CatAccountStatusEntity found = CatAccountStatusEntity.find("description", description).firstResult();
    return Optional.ofNullable(buildDO(found));
  }

  @Override
  public List<CatAccountStatusDO> findAll() {
    List<CatAccountStatusEntity> found = CatAccountStatusEntity.findAll().list();
    return found.stream().map(this::buildDO).toList();
  }

  private CatAccountStatusDO buildDO(CatAccountStatusEntity entity) {
    if (entity == null) {
      return null;
    }
    return new CatAccountStatusDO(entity.id, entity.getDescription(), entity.getCreatedAt());
  }
}
