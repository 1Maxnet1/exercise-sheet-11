package de.unistuttgart.iste.sqa.pse.exercisesheet11.calculator;

/**
 * 
 * A Calculator. It has Bugs.
 *
 */
final class BuggyCalculator implements Calculator {

	@Override
	public int add(final int summand1, final int summand2) {
		return summand1 + summand2;
	}

	@Override
	public int divide(final int dividend, final int divisor) {
		if (divisor == 0) {
			return 0;
		}
		int posDividend = Math.abs(dividend);
		int posDivisor = Math.abs(divisor);
		int posQuotient = posDividend / posDivisor;
		int posResidual = posDividend % posDivisor;

		if (2 * posResidual > posDivisor) {
			posQuotient++;
		}

		return posQuotient * getResultSign(dividend, divisor);
	}

	/*
	 * @ensures dividend < 0 & divisor < 0 ==> \result = 1
	 * 
	 * @ensures dividend > 0 & divisor > 0 ==> \result = 1
	 * 
	 * @ensures dividend < 0 & divisor > 0 ==> \result = -1
	 * 
	 * @ensures dividend > 0 & divisor < 0 ==> \result = -1
	 */
	/**
	 * calculates the sign of the result when dividing or multiplying to integer
	 * numbers
	 * 
	 * @param n the first number
	 * @param m the second number
	 * @return -1 if the result is smaller than 0, 1 otherwise
	 */
	private int getResultSign(int dividend, int divisor) {
		int sign = (dividend / Math.abs(dividend)) * (divisor / Math.abs(divisor));
		return sign;
	}

	@Override
	public int addExact(int summand1, int summand2) {
		return 0;
	}

	@Override
	public int abs(int value) {
		return 0;
	}

}
