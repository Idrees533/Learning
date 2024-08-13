package com.code.interview.wipro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//extract the domain from the email address
public class DomainNameExtract {

	public static void main(String[] args) {
		
		String email="mdidris954@gmail.com";
		
		String withOutDomain=email.replaceAll("@(.+)", "");
		
		System.out.println("DomainName:"+withOutDomain);
		
		String domain=extractDomain(email);
		System.out.println("domain "+domain);
	}

	public static String extractDomain(String email) {
		// TODO Auto-generated method stub
		
		Pattern pattern=Pattern.compile("@(.+)");
		Matcher matcher=pattern.matcher(email);
		
		if(matcher.find()) {
			return matcher.group(1);
		} else {
			return null;
		}
		
	}
}
