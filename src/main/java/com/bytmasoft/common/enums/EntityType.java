package com.bytmasoft.common.enums;

public enum EntityType {
	 STUDENT(1), TEACHER(2), EMPLOYEE(3);
	 private final int code;
	 private EntityType(int code) {
		 this.code = code;
	 }

	 public int getCode() {
		 return code;
	 }

	 public static EntityType getByCode(int code) {
		 for (EntityType entityType : EntityType.values()) {
			 if (entityType.getCode() == code) {
				 return entityType;
			 }
		 }
		 throw new IllegalArgumentException("No such entity type: " + code);

	 }
}
