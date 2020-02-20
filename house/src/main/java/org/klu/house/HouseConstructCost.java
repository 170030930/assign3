package org.klu.house;
import org.junit.Test;
import static org.junit.Assert.*;
public class HouseConstructCost {
	@Test
	public void test() {
		HouseConstruct hc=new HouseConstruct();
		assertEquals(9500.00 ,hc.cost("HIGH", "NO", 5.5),0);
	}
}
