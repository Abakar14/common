package com.bytmasoft.common.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

public interface DSSMapper<E, D, C, U> {

    E dtoToEntity(D d);
    E dtoCreateToEntity(C c);
    D entityToDto(E e);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    E partialUpdate(U u, @MappingTarget E e);
}
