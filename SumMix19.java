// Day 19/366 Coding Challenge 2024
// https://www.codewars.com/kata/57eaeb9578748ff92a000009

import java.util.List;

public class SumMix19 {
    public int sum(List<?> mixed) {	
        int sum = 0;
        for(Object obj : mixed) {
            if (obj instanceof Integer) {
                sum += (Integer) obj;
            } else if (obj instanceof String) {
                sum += Integer.parseInt((String) obj);
            }
        }
	    return sum;
	}
}