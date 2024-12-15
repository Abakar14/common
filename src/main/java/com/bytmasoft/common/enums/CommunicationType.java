package com.bytmasoft.common.enums;

public enum CommunicationType {
    MAIL(1),
    TELEFON(2),
    FAX(3),
    WEB(4),
    MOBILE(5),
    UNKNOWN(6);

    private final int code;
    private CommunicationType(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public static CommunicationType getByCode(int code) {
        for (CommunicationType communicationType : CommunicationType.values()) {
            if (communicationType.getCode() == code) {
                return communicationType;
            }
        }
        throw new IllegalArgumentException("Unknown CommunicationType code: " + code);
    }
}
