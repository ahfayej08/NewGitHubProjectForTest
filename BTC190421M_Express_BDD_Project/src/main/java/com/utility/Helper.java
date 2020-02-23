package com.utility;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Helper {
	
	
	public static String[] getAnyWebelements(List<WebElement> eles, String[] expectedTxt) {
		String[] actualTXT = new String[eles.size()];
		System.out.println("actual text size : "+actualTXT);
		int i = 0;
		for(WebElement temp_ele : eles) {
			actualTXT[i] = temp_ele.getText();
			System.out.println("Actual text : "+actualTXT[i]);
			i++;
		}for(int x = 0; x < actualTXT.length; x++) {
			if(actualTXT[x].equals(expectedTxt[x])) {
				System.out.println("Index Number of " + x + "matches.");
			}else {
				System.out.println("Index Number of " + x + "doesn't matches.");
			}
		}		   
		return actualTXT;		
	}

}
