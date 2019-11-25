package countNetIncome;

public class AccountingIfApp {

	public static void main(String[] args) {
		double valueOfSuppy = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSuppy*vatRate;
		double total = valueOfSuppy + vat;
		double expenseRate = 0.3;
		double expense = valueOfSuppy*expenseRate;
		double income = valueOfSuppy - expense;		
		double devided1;
		double devided2;
		double devided3;
		
		if (valueOfSuppy > 10000) {
			devided1 = income * 0.5;
			devided2 = income * 0.3;
			devided3 = income * 0.2;
		} else {
			devided1 = income;
			devided2 = 0;
			devided3 = 0; 
		}
		
		System.out.println("Value of supply : " + valueOfSuppy);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + devided1);
		System.out.println("Dividend 1 : " + devided2);
		System.out.println("Dividend 1 : " + devided3);
	}

}
