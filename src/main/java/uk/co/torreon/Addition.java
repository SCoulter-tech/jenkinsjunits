package uk.co.torreon;

public class Addition {
	
	
	public Integer add(Integer... numbers) {
		Integer total =0;
		for(Integer number: numbers) {
			total += number;
		}
		return total;
	}

}
