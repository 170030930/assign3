package org.klu.house;
public class Interestcalculation {
	public double Calculate_SimpleInterest(double p,int t,double r) {
		return p*t*r/100;
	}
	public double Calculate_CompoundInterest(double p,int t,double r) {
		return p*Math.pow(1+(r/100), t);
	}
}
