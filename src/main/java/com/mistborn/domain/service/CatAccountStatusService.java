package com.mistborn.domain.service;

import java.util.List;

import com.mistborn.domain.model.CatAccountStatusDO;

public interface CatAccountStatusService {

  CatAccountStatusDO create(CatAccountStatusDO statusDO);
  CatAccountStatusDO getById(long id);
  CatAccountStatusDO getByName(String name);
  List<CatAccountStatusDO> findAll();

}
