package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam1 {
	public static void main(String[] args) {
		List<String> orders = Arrays.asList(
			    "Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:TV", 
			    "David:Tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
			);
		
		Map<String, Integer> productCount = new HashMap<>();
		
		for(String value : orders) {
			String[] part = value.split(":");
			
			//상품이름이 들어갔음
			String product = part[1];
			
			productCount.put(product, productCount.getOrDefault(product, 0)+1);
		
		}
		
		//가장 많이 주문된 상품 찾기
		String maxProduct = null;
		int maxCount = 0;
		
		for(Map.Entry<String, Integer> entry : productCount.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxProduct = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		
		System.out.println(maxProduct + " => " + maxCount);
		
	}
}
