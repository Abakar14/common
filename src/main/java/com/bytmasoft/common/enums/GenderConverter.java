package com.bytmasoft.common.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GenderConverter implements AttributeConverter<Gender, Integer> {

@Override
public Integer convertToDatabaseColumn(Gender gender) {
	if (gender == null) {
		return null;
	}
	return gender.getCode();
}

@Override
public Gender convertToEntityAttribute(Integer dbData) {
	if (dbData == null) {
		return null;
	}
	return Gender.getGender(dbData);
}


}
