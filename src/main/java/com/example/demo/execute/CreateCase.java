package com.example.demo.execute;

import com.example.demo.model.Case;

import static com.example.demo.logic.CaseStrategy.*;

public class CreateCase {

    public static void main(String[] args) {

        new CreateCase().test();

    }

    private void test() {
        Case myCase = new Case();

        myCase.append(rejected()).append(kycReview()).append(priReview()).append(verify(true)).compute();

        System.out.println(myCase);
    }
}
