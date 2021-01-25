package de.unistuttgart.iste.sqa.pse.exercisesheet11.streams;

/**
 * Individual member of a Club. 
 * @see {@link de.unistuttgart.iste.sqa.pse.exercisesheet11.streams.Club}
 * 
 */
public class ClubMember implements Comparable<ClubMember> {
	
	private String name;
	private int age;
	private Double contributions;
	private boolean hasPaidFees;
	
	public ClubMember(final String name, final int age, final Double contributions, final boolean hasPaidFees) {
		this.name = name;
		this.age = age;
		this.contributions = contributions;
		this.hasPaidFees = hasPaidFees;
	}
	
	/**
	 * Overridden equals method to enable proper comparisons
	 */
	@Override
	public boolean equals(final Object obj) { 
		  
        if (obj == this) { 
            return true; 
        } 
          
        if (!(obj instanceof ClubMember)) { 
            return false; 
        } 
          
        ClubMember member = (ClubMember) obj; 
          
        return member.getName().equals(name) &&
        	   member.getAge() == age &&
        	   member.getContributions() == contributions &&
        	   member.getHasPaidContributions() == hasPaidFees; 
    } 
 
	/**
	 * Overridden compareTo method for use with clubMemberComparator
	 */
	@Override
	public int compareTo(final ClubMember arg0) {
		return this.age - arg0.getAge();
	}
		
	
	//Getter & Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Double getContributions() {
		return contributions;
	}
	public void setContributions(Double contributions) {
		this.contributions = contributions;
	}
	public boolean getHasPaidContributions() {
		return hasPaidFees;
	}
	public void setHasPaidContributions(boolean hasPaidFees) {
		this.hasPaidFees = hasPaidFees;
	}

	
	
	

}
