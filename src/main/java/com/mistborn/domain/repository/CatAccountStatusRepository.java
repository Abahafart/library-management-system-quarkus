package com.mistborn.domain.repository;

import java.util.List;
import java.util.Optional;

import com.mistborn.domain.model.CatAccountStatusDO;

public interface CatAccountStatusRepository {

  Optional<CatAccountStatusDO> getById(long id);
  Optional<CatAccountStatusDO> getByDescription(String description);
  List<CatAccountStatusDO> findAll();

}
