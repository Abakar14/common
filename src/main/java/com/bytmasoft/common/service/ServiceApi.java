package com.bytmasoft.common.service;

import com.bytmasoft.common.exception.DSSEntityNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;

import java.util.List;


public interface ServiceApi <D, C, U>{

    D add(C c);

    PagedModel<EntityModel<D>>  findAll(Pageable pageable);

    Page<D> findAllByActiveStatus(boolean active, Pageable pageable);

    List<D> findAllAsList();

    D findById(Long id) throws DSSEntityNotFoundException;

    D update(Long id, U u);

    D delete(Long id);
}
