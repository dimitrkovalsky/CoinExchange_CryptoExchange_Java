package com.bizzan.bitrade.constant;

import com.bizzan.bitrade.core.BaseEnum;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author GS
 * @date 2018年01月10日BaseEnum
 */
@AllArgsConstructor
@Getter
public enum BooleanEnum implements BaseEnum {
    IS_FALSE(false, "N"),
    IS_TRUE(true, "Y");

    @Setter
    private boolean is;

    @Setter
    private String nameCn;

    @Override
    @JsonValue
    public int getOrdinal() {
        return this.ordinal();
    }
}
