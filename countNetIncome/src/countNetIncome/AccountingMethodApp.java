package countNetIncome;

public class AccountingMethodApp {
	public static double valueOfSuppy;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		valueOfSuppy = 10000;
		vatRate = 0.1;
		expenseRate = 0.3;
		
//		double vat = getVat();
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double divided1 = getDividend1();
//		double divided2 = getDividend2();
//		double divided3 = getDividend3();
		
		print();
	}
	public static void print() {
		System.out.println("Value of supply : " + valueOfSuppy);
		System.out.println("VAT : " + getVat());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 1 : " + getDividend2());
		System.out.println("Dividend 1 : " + getDividend3());
	}
	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}
	public static double getIncome() {
		return valueOfSuppy - getExpense();
	}
	public static double getExpense() {
		return valueOfSuppy*expenseRate;
	}
	public static double getTotal() {
		return valueOfSuppy + getVat();
	}
	public static double getVat() {
		return valueOfSuppy*vatRate;
	}

}
