package com.bytmasoft.common.enums;

public enum Relationship {
     Mother(1) , Father(2), Uncle(3), Aunt(4), Other(5);

     private final int code;
     private Relationship(int code) {
         this.code = code;
     }

public int getCode() {
    return code;
}

public static Relationship getByCode(int code) {
         for (Relationship relationship : Relationship.values()) {
             if (relationship.getCode() == code) {
                 return relationship;
             }
         }
         throw new IllegalArgumentException("Invalid relationship code: " + code);
}


}
