package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserData {

	private String name;
    private int age;
    private List<String> phoneNumbers;
    private boolean active;
    private List<String> addresses;
	
    public UserData(String name, int age, boolean active, List<String> phoneNumbers, List<String> addresses) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumbers = phoneNumbers;
		this.active = active;
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "UserData [name=" + name + ", age=" + age + ", phoneNumbers=" + phoneNumbers + ", active=" + active
				+ ", addresses=" + addresses + "]";
	}
    
    
	public static void main(String[] args) {
		
	List<UserData>userData =Arrays.asList(new UserData("Alfa", 25, true, Arrays.asList("123", "456"), Arrays.asList("Address1", "Address2")),
	           new UserData("Beta", 33, false, Arrays.asList("789", "101"), Arrays.asList("Address3", "Address4")),
	           new UserData("Gama", 30, true, Arrays.asList("202", "303"), Arrays.asList("Address1", "Address5")),
	           new UserData("Delta", 38, true, Arrays.asList("208", "232"), Arrays.asList("Address3", "Address6"))
	                  );
	
	
	//we filter users who are both above 30 years old and active:
				
			List <UserData> filterData=userData.stream().filter(p->p.getAge() > 30)
				.filter(p->p.isActive()).collect(Collectors.toList());
			System.out.println("Filter the user base on age and activation  "+filterData);
			
			
	//map : transfering each element to new stream
	//used to convert each user's name to uppercase:
			
		List<String> upperCaseName=userData.stream()
			.map(p->p.getName().toUpperCase())
			.collect(Collectors.toList());
		
		System.out.println("Map Function "+upperCaseName);
			
	//FLat Map handle the nested collection
		
	//users have a list of addresses, and we want a flat list of unique addresses:
		
			List<String> addressList= userData.stream()
				.flatMap(f->f.getAddresses().stream())
				.distinct()
				.collect(Collectors.toList());
			System.out.println(addressList);
			
			
	//sorted
	//sort users based on their ages:
			
		List<UserData> sortedUser= userData.stream()
			 .sorted(Comparator.comparingInt(UserData::getAge))
			 .collect(Collectors.toList());
		
		System.out.println(sortedUser);
	
	//distinct
		//eliminate duplicate elements from the stream.
			
		List distinctList=userData.stream()
		.flatMap(f->f.getAddresses().stream())
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println("distinct List : "+distinctList);
		
		
		//, we filter active users above 30, extract their phone numbers, and sort them:
		
	List combineList	=userData.stream()
		.filter(f->f.getAge() > 30)
		.filter(UserData::isActive)
		.flatMap(p->p.getAddresses().stream())
		.sorted()
		.collect(Collectors.toList());
	
	System.out.println("Combine list"+combineList);
		
	
		
	
	
	
	
	
	}
    
    
}
