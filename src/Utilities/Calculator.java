package Utilities;

import List.DoublyLinkedList;

public class Calculator {
	
	public double average(DoublyLinkedList numbers) {
		double avg = 0, sum = 0;
		if (!numbers.isEmpty()) {
			for (int i = 0; i < numbers.size(); i++) {
				sum += Math.log(numbers.getDataInElement(i));
			}
			avg = sum / numbers.size();
		}
		return avg;
	}

	public double variance(DoublyLinkedList numbers) {
		double var = 0, avg = 0, sum = 0, sumElement = 0;
		if (numbers.size() > 1) {
			avg = this.average(numbers);
			for (int i = 0; i < numbers.size(); i++) {
				sumElement = Math.log(numbers.getDataInElement(i));
				sum += Math.pow(sumElement - avg, 2);
			}
			var = sum / (numbers.size() - 1);
		}
		return var;
	}

	public double standardDeviation(DoublyLinkedList numbers) {
		double deviation = 0;
		deviation = Math.sqrt(this.variance(numbers));
		return deviation;
	}

	/*
	 * Very Small
	 */
	public double VS(DoublyLinkedList numbers) {
		double VS = 0, lnVS = 0;
		lnVS = this.average(numbers) - 2 * (this.standardDeviation(numbers));
		VS = Math.exp(lnVS);
		return VS;
	}
	
	/*
	 * Small
	 */
	public double S(DoublyLinkedList numbers) {
		double S = 0, lnS = 0;
		lnS = this.average(numbers) - (this.standardDeviation(numbers));
		S = Math.exp(lnS);
		return S;
	}
	
	/*
	 * Medium
	 */
	public double M(DoublyLinkedList numbers) {
		double M = 0, lnM = 0;
		lnM = this.average(numbers);
		M = Math.exp(lnM);
		return M;
	}
	
	/*
	 * Large
	 */
	public double L(DoublyLinkedList numbers) {
		double L = 0, lnL = 0;
		lnL = this.average(numbers) + (this.standardDeviation(numbers));
		L = Math.exp(lnL);
		return L;
	}
	
	/*
	 * Very Large
	 */
	public double VL(DoublyLinkedList numbers) {
		double VL = 0, lnVL = 0;
		lnVL = this.average(numbers) + 2 * (this.standardDeviation(numbers));
		VL = Math.exp(lnVL);
		return VL;
	}
	
	
}
