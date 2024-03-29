package com.ryan.springmybatis.domain.fundamentals;

import com.ryan.springmybatis.domain.common.BaseDomain;
import lombok.Data;

import java.util.Objects;

@Data
public class Title implements BaseDomain<String> {
    private String value;

    @Override
    public String values() {
        return isEmpty() ? "" : value;
    }

    @Override
    public String asText() {
        return values();
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(value) || value.isEmpty();
    }

    @Override
    public boolean hasValue() {
        return !isEmpty();
    }
}
