package lib.measurable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToDoubleFunction;


public class DataAnalysis<E extends Measurable> {

	private List<E> objects;

	public DataAnalysis() {
		objects = new ArrayList<>();
	}

	public void addMeasurable(E m) {
		objects.add(m);
	}

	public int sum() {
		return objects.stream().mapToInt(m -> m.getMeasurable()).sum();
	}
	
	public double avg() {
		if (objects.isEmpty()) {
			return -1;
		}
		return new Double(sum())/objects.size();
	}
	
	public int min() {
		if (objects.isEmpty()) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		for (E object : objects) {
			if (object.getMeasurable() < min) {
				min = object.getMeasurable();
			}
		}
		return min;
		
	}
	
	public int max() {
		if (objects.isEmpty()) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		for (E object : objects) {
			if (object.getMeasurable() > max) {
				max = object.getMeasurable();
			}
		}
		return max;
	}
	
	public String toString() {
		return "DataAnalysis[objects= " + objects + "]";
	}
}
