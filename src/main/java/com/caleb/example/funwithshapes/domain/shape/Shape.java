package com.caleb.example.funwithshapes.domain.shape;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface Shape {
    String getDescription();
    String getLoad();
    void setLoad(Integer[] positions);

    default String prepareLoad(final Integer[] positions, final String chars) {
        List<Integer> indexes = Arrays.asList(positions);
        String spaces = chars.replaceAll(chars.substring(0,1), " ");
        return IntStream.range(0, Collections.max(Arrays.asList(positions)))
                .mapToObj(n -> indexes.contains(n) ? chars : spaces)
                .collect(Collectors.joining());
    }
}
