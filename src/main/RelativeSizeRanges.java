package main;

import java.text.DecimalFormat;
import java.util.Locale;

import List.DoublyLinkedList;
import Utilities.Calculator;

public class RelativeSizeRanges {

	private Calculator calculator = new Calculator();
	private String message = "La lista debe tener al menos dos elementos";

	public String Ranges(DoublyLinkedList numbers) {
		if (numbers.size() > 1 && !containZero(numbers) && !containNegatives(numbers)) {
				message = "VS: " + this.Format(calculator.VS(numbers));
				message += " S: " + this.Format(calculator.S(numbers));
				message += " M: " + this.Format(calculator.M(numbers));
				message += " L: " + this.Format(calculator.L(numbers));
				message += " VL: " + this.Format(calculator.VL(numbers));
		}
		return message;
	}

	public boolean containZero(DoublyLinkedList numbers) {
		boolean contain = false;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.getDataInElement(i) == 0) {
				message = "La lista no puede tener el numero 0";
				contain = true;
				break;
			}
		}
		return contain;
	}
	
	public boolean containNegatives(DoublyLinkedList numbers) {
		boolean contain = false;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.getDataInElement(i) < 0) {
				message = "La lista no puede tener numeros negativos";
				contain = true;
				break;
			}
		}
		return contain;
	}
	
	public String Format(double number) { 
	      Locale.setDefault(Locale.US); 
	      DecimalFormat num = new DecimalFormat("####.0000"); 
	      return num.format(number); 
	  } 
}
