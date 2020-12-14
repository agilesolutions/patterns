package com.example.demo.model;

import com.example.demo.logic.Strategy;
import lombok.*;

import java.time.Instant;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Case implements Strategy {

    private String phase;
    private String status;
    private Instant dueDate = Instant.now();


}