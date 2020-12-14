package com.example.demo.logic;

import com.example.demo.model.Case;
import com.example.demo.model.CasePhase;
import com.example.demo.model.CaseStatus;

import java.time.Instant;
import java.util.function.Consumer;

public class CaseStrategy {

    public static Consumer<Case> kycReview() {
        return c -> c.setPhase(CasePhase.KYC_REVIEW.name());
    }

    public static Consumer<Case> priReview() {
        return c -> c.setPhase(CasePhase.PRI_REVIEW.name());
    }

    public static Consumer<Case> rejected() {
        return c -> c.setStatus(CaseStatus.REJECTED.name());
    }

    public static Consumer<Case> verify(Boolean check) {
        return c -> {
            if (check && c.getDueDate().isBefore(Instant.now())) {
                c.setStatus(CaseStatus.DECLINED.name());
            }
        };
    }

}