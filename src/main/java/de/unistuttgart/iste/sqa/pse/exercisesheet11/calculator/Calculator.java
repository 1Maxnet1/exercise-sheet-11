package de.unistuttgart.iste.sqa.pse.exercisesheet11.calculator;

/**
 * A Calculator that provides some a variety of mathematical operations.
 */
public interface Calculator {

	/*
	 * @ensures summand1 + summand2 <= Integer.MAX_VALUE & summand1 + summand2 >=
	 * Integer.MIN_VALUE ==> \result summand1 + summand2
	 * 
	 * @ensures summand1 + summand2 > Integer.MAX_VALUE ==> \result =
	 * Integer.MIN_VALUE + (summand1 + summand2 - Integer.MAX_VALUE) - 1
	 * 
	 * @ensures summand1 + summand2 < Integer.MIN_VALUE ==> \result =
	 * Integer.MAX_VALUE - (summand1 + summand2 + Integer.MAX_VALUE) + 1
	 */
	/**
	 * calculate the sum of two integer values.
	 * 
	 * if the sum is greater than {@linkplain Integer#MAX_VALUE Integer.MAX_VALUE}
	 * an overflow happens and if the sum is smaller than
	 * {@linkplain Integer#MIN_VALUE Integer.MIN_VALUE} an underflow happens
	 * 
	 * @param summand1 first summand
	 * @param summand2 second summand
	 * @return the sum
	 */
	public int add(final int summand1, final int summand2);

	/*
	 * @ensures divisor != 0 ==> \result = correctly rounded quotient
	 * 
	 * @ensures divisor = 0 ==> exception
	 * 
	 * @ensures dividend = Integer.MIN_VALUE & divisor = -1 ==> \result =
	 * Integer.MIN_VALUE
	 */
	/**
	 * Calculates the quotient of two integer values.
	 * 
	 * The result is correctly rounded. That is, the result is rounded up for
	 * decimals greater than or equal to 0.5 and rounded down for decimal smaller
	 * than 0.5.
	 *
	 * @param dividend number to be divided
	 * @param divisor  number to divide by
	 * @return the quotient
	 * @throws ArithmeticException if {@code divisor} is zero
	 */
	public int divide(int dividend, int divisor);

	/**
	 * Operations for exercise 3
	 */

	/*
	 * @ensures summand1 + summand2 <= Integer.MAX_VALUE && summand1 + summand2 >=
	 * Integer.MIN_VALUE ==> \result summand1 + summand2
	 * 
	 */
	/**
	 * 
	 * calculates the sum of two integer values
	 * 
	 * if the sum is greater than the integer range an ArithmeticException is thrown
	 * with an Error Message. Which indicates that an Integer Overflow occured if
	 * the sum is lesser than the integer range an ArithmeticException is thrown
	 * with an Error Message. Which indicates that an Integer Underflow occured
	 * 
	 * @param summand1 first summand
	 * @param summand2 second summand
	 * @throws ArithmeticException if summand1 + summand2 are greater than
	 *                             Integer.MAX_Value or summand1 + summand2 are
	 *                             smaller than Integer.MIN_Value
	 * 
	 * @return sum of summand1 and summand2
	 * 
	 */
	public int addExact(final int summand1, final int summand2);

	/*
	 * @requires value != Integer.MIN_Value
	 * 
	 * @ensures value >= 0 ==> \result == value
	 * 
	 * @ensures value < 0 ==> \result == value*-1
	 * 
	 * 
	 */
	/**
	 * calculates absolute value of a given integer value
	 * 
	 * if the value is equal to minimal Integer Value a Arithmetic Exception is
	 * thrown because Integer.MIN_Value is not displayable as a positive number
	 * 
	 * @param integer value
	 * @return absolute value
	 * @throws ArithmeticException if value is equal to Integer.Min_Value
	 */
	public int abs(final int value);

}
