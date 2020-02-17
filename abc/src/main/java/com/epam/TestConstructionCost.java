package com.epam;

public class TestConstructionCost {

	public void testCost() {
		CalculateCost cc = new CalculateCost();
		assertEquals(cc,cc.getCost("standard",6,false));
		assertEquals(cc,cc.getCost("highStandard",3,true));
		assertEquals(cc,cc.getCost("aboveStandard",2,true));
		assertEquals(cc,cc.getCost("highStandard",5,false));
		}
}
