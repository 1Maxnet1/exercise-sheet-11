package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a description for your HamsterClub class.
 *
 * @author Max Buchholz, Jannik Funk
 * @version 11.02.2021
 */
public class HamsterClub implements Club {

    private final List<ClubMember> members;
    private final Comparator<ClubMember> clubComparator;

    /**
     *
     * @param members
     */
    /*
     *@ requires
     *@ ensures
     */
    public HamsterClub(final List<ClubMember> members) {
	if (members != null) {
	    this.members = members;
	} else {
	    throw new IllegalArgumentException();
	}

	this.clubComparator = generateComparator();
    }

    /**
     * Get the List of all Names of the ClubMembers
     * @return List with all members
     */
    /*
     *@ requires
     *@ ensures
     */
    @Override public List<String> getNameOfMembers() {
	return members.stream().map(ClubMember::getName).collect(Collectors.toList());
    }

    /**
     *
     * @return List with
     */
    /*
     *@ requires
     *@ ensures
     */
    @Override public Double getTotalContributions() {
	return members.stream().mapToDouble(ClubMember::getContributions).sum();
    }

    /**
     *
     */
    /*
     *@ requires
     *@ ensures
     */
    @Override public void applyDiscount() {
	members.stream().filter(b -> b.getAge() > 60).forEach(c->c.setContributions(c.getContributions()*0.9));
    }

    /**
     *
     * @return
     */
    @Override public List<ClubMember> getMembersWithUnpaidFees() {
	return members.stream().filter(b -> !b.getHasPaidContributions()).collect(Collectors.toList());
    }

    /**
     * implement your Comparator here
     */
    /*
     *@ requires
     *@ ensures
     */
    private Comparator<ClubMember> generateComparator() {
	return null;
    }

    /**
     *
     * @return
     */
    /*
     *@ requires
     *@ ensures
     */
    @Override public ClubMember getOldestMember() {
	return null;
    }

    /**
     *
     * @return
     */
    /*
     *@ requires
     *@ ensures
     */
    @Override public List<ClubMember> getMembers() {
	return members;
    }

}
