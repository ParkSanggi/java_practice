package countNetIncome;

public class AccountingArrayApp {

	public static void main(String[] args) {
		double valueOfSuppy = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSuppy*vatRate;
		double total = valueOfSuppy + vat;
		double expenseRate = 0.3;
		double expense = valueOfSuppy*expenseRate;
		double income = valueOfSuppy - expense;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.1;
		
		double devided1 = dividendRates[0];
		double devided2 = dividendRates[1];
		double devided3 = dividendRates[2];
		
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
