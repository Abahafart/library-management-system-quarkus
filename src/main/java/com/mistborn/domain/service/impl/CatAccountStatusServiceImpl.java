package com.mistborn.domain.service.impl;

import java.util.List;

import com.mistborn.domain.constants.Messages;
import com.mistborn.domain.exceptions.RecordNotFoundException;
import com.mistborn.domain.model.CatAccountStatusDO;
import com.mistborn.domain.repository.CatAccountStatusRepository;
import com.mistborn.domain.service.CatAccountStatusService;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CatAccountStatusServiceImpl implements CatAccountStatusService {

  private final CatAccountStatusRepository repository;

  public CatAccountStatusServiceImpl(CatAccountStatusRepository repository) {
    this.repository = repository;
  }

  @Override
  public CatAccountStatusDO create(CatAccountStatusDO statusDO) {
    return repository.create(statusDO);
  }

  @Override
  public CatAccountStatusDO getById(long id) {
    return repository.getById(id).orElseThrow(() -> new RecordNotFoundException(
        String.format(Messages.ID_RECORD_NOT_FOUND, id)));
  }

  @Override
  public CatAccountStatusDO getByName(String description) {
    return repository.getByDescription(description).orElseThrow(() -> new RecordNotFoundException(
        String.format(Messages.FIELD_RECORD_NOT_FOUND, description)));
  }

  @Override
  public List<CatAccountStatusDO> findAll() {
    return repository.findAll();
  }
}
