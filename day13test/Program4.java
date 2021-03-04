package day13test;

import java.util.HashMap;
import java.util.Map;

public class Program4 {


private Map<String,Integer> accountTotals = new HashMap(); 
private int retirementFund; 
public int getBalance(String accountName) {
	
Integer total = (Integer) accountTotals.get(accountName); 
if (total == null) 
{
	total = 0; 
}
return total.intValue(); 
} 

public void setBalance(String accountName, int amount) { 
accountTotals.put(accountName, amount); 
 }

public static void main(String[] args) {
	Program4 account=new Program4();
	account.setBalance("sanjana",50000);
	System.out.println(account.getBalance("sanjana"));
	
}
}

/*
---
1.convert Map to Map<String,Integer>
2.import necessary packages
3.convert integer to int types
*/