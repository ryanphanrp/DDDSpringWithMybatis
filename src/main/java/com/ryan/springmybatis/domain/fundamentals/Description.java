package com.ryan.springmybatis.domain.fundamentals;

import com.ryan.springmybatis.domain.common.BaseDomain;
import lombok.Data;

import java.util.Objects;

@Data
public class Description implements BaseDomain<String> {
    private static final String DEFAULT_DESCRIPTION = "";
    private String value;

    public static String ofEmpty() {
        return DEFAULT_DESCRIPTION;
    }

    @Override
    public String values() {
        return isEmpty() ? DEFAULT_DESCRIPTION : value;
    }

    @Override
    public String asText() {
        return values();
    }

    public boolean isEmpty() {
        return Objects.isNull(value) || value.isEmpty();
    }

    @Override
    public boolean hasValue() {
        return !isEmpty();
    }
}
