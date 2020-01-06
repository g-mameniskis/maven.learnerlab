package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    // given
    private void test(String expectedName) {
        Person person = new Person(expectedName);
        String expected = "Grayson";


        // when
        String actualName = person.getName();

        // then
        Assert.assertEquals(expected, actualName);
    }


    @Test
    public void test0() {
        test("Grayson");
    }

    @Test
    public void test1() {
        test("Montaniz");
    }

    @Test
    public void test2() {
        test("Jeffy-Jeff");
    }


}
