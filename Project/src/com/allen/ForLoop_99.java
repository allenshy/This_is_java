package com.allen;

public class ForLoop_99 {

	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			
			
			for(int j=1; j<=20; j++) {
				if(i*j>=10) {
					System.out.print(i+"*"+j+"="+(i*j)+"\s");
				}else {
					System.out.print(i+"*"+j+"="+"\s"+(i*j)+"\s");
				}					
			}
			System.out.print("\r");
		}
		
	
	}

}
