package com.example.demo.execute;

import com.example.demo.model.Case;

import static com.example.demo.logic.Strategy.*;

public class CreateCase {

    public static void main(String[] args) {

        new CreateCase().test();

    }

    private void test() {
        Case myCase = new Case();

        myCase.thenApply(rejected()).thenApply(kycReview()).thenApply(priReview()).thenApply(verify(true));

        System.out.println(myCase);
    }
}
