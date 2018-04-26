package com.studio.lab.avengers;

public class ReverseStringTransform implements Transform {

	public String forwardTransform(String str) {

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();
		
		
		return sb.toString();
	}

	public String reverseTransform(String str) {

		StringBuilder sbrev = new StringBuilder();
		sbrev.append(str);
		sbrev = sbrev.reverse();
		
		
		return sbrev.toString();
		
	}

}
