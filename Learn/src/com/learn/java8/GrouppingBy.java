package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingBy {

	public static void main(String[] args) {
		
			List<Transaction> transList=	Arrays.asList(
									new Transaction("Grocery", 50.0),
									new Transaction("Grocery",30.0),
									new Transaction("product",30.0),
									new Transaction("Shopping",100.0));
			//Suppose you have a list of transactions, and you want to group 
			//them by the type of transaction and calculate the total amount for each type.
					Map<String, Double>	totalAmountType=transList.stream().collect(Collectors.groupingBy(Transaction::getType,
									Collectors.summingDouble(Transaction::getAmount)));
					System.out.println(totalAmountType);
	}
}
