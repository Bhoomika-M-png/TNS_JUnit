package com.exampleTest;

import static org.junit.jupiter.api.Assertions.*;

import com.example.Calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator d1;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Execute before all");
    }

    @BeforeEach
    void beforeEach() {
        d1 = new Calculator();
    }
	@AfterEach
	void afterEach() {
		System.out.println("Execute after each");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("Execute After all");
	}
	@Test
	void testSub() {
		
		int actual=	d1.sub(5, 5);
		int expected =0;
		assertEquals(expected, actual,"Substraction of test cases");
	}

	@Test
	void testMul() {
		
		int actual=	d1.mul(5, 5);
		int expected =25;
		assertEquals(expected, actual,"Multiplication of test cases");
	}

	@Test
	void testDiv() {
		
		int actual=	d1.div(5, 5);
		int expected =1;
		assertEquals(expected, actual,"Division of test cases");
	}

}