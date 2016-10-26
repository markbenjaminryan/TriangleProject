package com.triangle.demo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.triangle.demo.main.TriangleType;
import com.triangle.demo.main.TriangleUtil;

public class TriangleUtilTest {
	
	private TriangleUtil triangleUtil;

	@Before
	public void setUp() throws Exception {
		this.triangleUtil = new TriangleUtil();
	}

	@After
	public void tearDown() throws Exception {
		this.triangleUtil = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDetermineTriangleTypeForIllegalArguments() {
		this.triangleUtil.determineTriangleType(5.0, 5.0, -2.0);
	}
	
	@Test
	public void testDetermineTriangleTypeForEquilateral() {
		TriangleType type = this.triangleUtil.determineTriangleType(5.0, 5.0, 5.0);
		assertEquals(TriangleType.EQUILATERAL,type);
	}
	
	@Test
	public void testDetermineTriangleTypeForIsosceles() {
		TriangleType type = this.triangleUtil.determineTriangleType(5.0, 2.0, 5.0);
		assertEquals(TriangleType.ISOSCELES,type);
	}
	
	@Test
	public void testDetermineTriangleTypeForScalene() {
		TriangleType type = this.triangleUtil.determineTriangleType(3.0, 2.0, 5.0);
		assertEquals(TriangleType.SCALENE, type);
	}

}
