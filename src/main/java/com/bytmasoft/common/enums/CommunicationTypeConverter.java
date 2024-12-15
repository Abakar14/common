package com.bytmasoft.common.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CommunicationTypeConverter implements AttributeConverter<CommunicationType, Integer> {

	@Override
	public Integer convertToDatabaseColumn(CommunicationType attribute) {
		if (attribute == null) {
			return null;
		}
		return attribute.getCode();

	}

	@Override
	public CommunicationType convertToEntityAttribute(Integer dbData) {
		if (dbData == null) {
			return null;
		}

		return CommunicationType.getByCode(dbData);
	}
}
