package com.pojoclass;

public class sdp {
	
	private static sdp aa;
	private sdp() {
		
		System.out.println("default");
		
	}
	
	public static sdp getinstance() {
		
		if (aa==null) {
			
			aa = new sdp();
			
			
		}
		
		
		return aa;
	}
	
	
	
	private void ab() {
		
		System.out.println("Java");

	}
	
	private void bc() {
		
		System.out.println("Selenium");
		
	}
	
	
	public static void main(String[] args) {
		sdp s = new sdp();
		
		s.ab();
		s.bc();
	}
	
	
}
