package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class demo {
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	@Test
	public void run() {
		/*assertEquals(2, 2);*/
		System.out.println("run");
	}
	
	@Test
	public void start() {
		System.out.println("start");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
}
/*
 *输出结果
 * BeforeClass
*before
*run
*after
*before
*start
*after
*AfterClass
注意这里before beforeClass After AfterClass的区别 beforeClass AfterClass注解的方法必须为静态方法,只执行一遍
但是before After是每@Test前后都会执行一遍   四个的输出顺序为BeforeClass before After AfterClass
 */
