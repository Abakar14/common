package com.bytmasoft.common.enums;

public enum Gender {
        MALE(1),
        FEMALE(2),
        UNKNOWN(3);
private final int code;

Gender(int code) {
        this.code = code;
}

public int getCode() {
        return code;
}

public static Gender getGender(int code) {
        for (Gender gender : Gender.values()) {
                if (gender.getCode() == code) {
                        return gender;
                }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
}

}
