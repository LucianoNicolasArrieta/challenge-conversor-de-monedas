package com.lna.exchange;

public record PairDto(String base_code, String target_code, double conversion_rate) {
}
