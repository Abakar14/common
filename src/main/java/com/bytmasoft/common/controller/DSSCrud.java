package com.bytmasoft.common.controller;

import com.bytmasoft.common.exception.DSSEntityNotFoundException;
import jakarta.validation.Valid;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface DSSCrud <D, C, U>{

    @PostMapping
    ResponseEntity<D> save(@RequestBody @Valid C c);

    @GetMapping
    Page<D> findAll(@PageableDefault(size = 10) @ParameterObject Pageable pageable);

    @GetMapping("list")
    List<D> findList();


    @GetMapping("/{id}")
    ResponseEntity<D> findById(@PathVariable Long id) throws DSSEntityNotFoundException;

    @PutMapping("/{id}")
    ResponseEntity<D> update(@PathVariable Long id, @RequestBody @Valid U u) throws DSSEntityNotFoundException;

    @DeleteMapping("/{id}")
    ResponseEntity<D> delete(@PathVariable Long id) throws DSSEntityNotFoundException;
}
