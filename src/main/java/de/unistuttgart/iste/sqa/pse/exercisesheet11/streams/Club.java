package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

import java.util.List;

/**
 * Club Interface providing an array of methods to process a list of club members  
 */
public interface Club {
	/*@
	 *@ invariant members != null
	 *@/
		
	
	/*@  
	 *@ ensures \result only contains the names of all members sorted alphabetically
	 *@/
	/**
	 * Maps the names of all members to a new list of alphabetically sorted Strings
	 * 
	 * @return alph. sorted list of the names of all members
	 */
	public List<String> getNameOfMembers();
	
	
	/*@  
	 *@ ensures \result is the sum of all contributions across all members
	 *@/
	/**
	 * Totals the amount of contributions this club can expect.
	 * 
	 * @return the sum of total contributions across all members
	 */
	public Double getTotalContributions();
	
	
	/*@  
	 *@ ensures the contributions of all members above the specified age was reduced by the specific amount
	 *@/
	/**
	 * Applies a discount to all members above a certain age. 
	 * Calling this method multiple times will provide a stacking discount.
	 */
	public void applyDiscount();
	
	
	/*@  
	 *@ ensures \result only contains all members with unpaid membership fees
	 *@/
	/**
	 * Filters the list of members for those that have'nt payed their membership-fees yet.
	 * 
	 * @return list of all members with outstanding fees
	 */
	public List<ClubMember> getMembersWithUnpaidFees();
	
	
	/*@  
	 *@ ensures \result is the club member with the highest age value
	 *@ ensures that if two or more members share the highest age value,
	 *@         the member with the alph. highest ranking name is returned   
	 *@/
	/**
	 * Searches the List of members for the oldest individual, alphabetical order acts as a tie-breaker.
	 * 
	 * @throws NoSuchElementException if there is no oldest member 
	 * @return oldest member of this club
	 */
	public ClubMember getOldestMember();
	
	
	/*@  
	 *@ ensures \result is the exact list of member objects of this club
	 *@/
	/**
	 * Getter Method for the member field.
	 * 
	 * @return list of members, this club possesses
	 */
	public List<ClubMember> getMembers();
	
}
