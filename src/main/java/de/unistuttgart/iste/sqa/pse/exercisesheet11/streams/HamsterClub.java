package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

import java.util.Comparator;
import java.util.List;

/**
 * Write a description for your HamsterClub class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HamsterClub implements Club {

	private final List<ClubMember> members;
	private final Comparator<ClubMember> clubMemberComparator;
	
	public HamsterClub(final List<ClubMember> members) {
		if(members != null) {
			this.members = members;
		} else {
			throw new IllegalArgumentException();
		}
		
		this.clubMemberComparator = generateComparator();
	}
	
	
	
	@Override
	public List<String> getNameOfMembers() {
		return null;
	}

	@Override
	public Double getTotalContributions() {
		return 0.0;
	}

	@Override
	public void applyDiscount() {
	
	}

	@Override
	public List<ClubMember> getMembersWithUnpaidFees() {
		return null;
	}

	/**
	 * implement your Comparator here
	 */
	private Comparator<ClubMember> generateComparator() {
		return null;
	}

	@Override
	public ClubMember getOldestMember() {
		return null;
	}
	
	@Override
	public List<ClubMember> getMembers(){
		return members;
	}

}
