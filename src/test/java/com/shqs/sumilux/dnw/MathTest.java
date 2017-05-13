package com.shqs.sumilux.dnw;

import org.junit.Before;
import org.junit.Test;

import com.shqs.sumilux.dnw.Math;

import junit.framework.Assert;

public class MathTest {
	Math math;

	@Before
	public void setUp() throws Exception {
		math = new Math(10, 7);
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(17, math.add());
	}

	@Test
	public void testMinus() {
		Assert.assertEquals(3, math.minus());
	}

	@Test
	public void testMultiplied() {
		Assert.assertEquals(70, math.multiplied());
	}

//	@Test
//	public void testDivided() {
//		Assert.assertEquals(1, math.divided());
//	}
}
