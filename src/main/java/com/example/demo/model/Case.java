package com.example.demo.model;

import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Case {

    private String phase;
    private String status;
    private Instant dueDate;

    @ToString.Exclude
    private List<Consumer<Case>> strategies = new ArrayList<>();

    public Case append(Consumer<Case> logic) {
        this.strategies.add(logic);
        return this;
    }

    public void compute() {
        strategies.stream().forEach(s -> s.accept(this));
    }
}