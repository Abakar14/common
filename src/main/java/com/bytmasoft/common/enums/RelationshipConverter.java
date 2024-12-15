package com.bytmasoft.common.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RelationshipConverter implements AttributeConverter<Relationship, Integer> {

@Override
public Integer convertToDatabaseColumn(Relationship attribute) {
	if (attribute == null) {
		return null;
	}
	return attribute.getCode();


}

@Override
public Relationship convertToEntityAttribute(Integer dbData) {
	if (dbData == null) {
		return null;
	}
	return Relationship.getByCode(dbData);

}
}
