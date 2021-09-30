package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ClassJunit {
	@Test
	public void test() {
		System.out.println("Test1 - Test");		
	}
	@Before
	public void test1() {
		System.out.println("Test2 - Before");		
	}
	@After
	public void test2() {
		System.out.println("Test3 - After");		
	}
	@BeforeClass
	public static void test3() {
		System.out.println("Test4 - BeforeClass");		
	}
	@AfterClass
	public static void test4() {
		System.out.println("Test5 - AfterClass");		
	}
	@Test
	public void test5() {
		System.out.println("Test6 - Test");		
	}
}
