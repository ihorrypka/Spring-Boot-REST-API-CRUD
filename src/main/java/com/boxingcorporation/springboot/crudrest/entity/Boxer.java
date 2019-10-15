package com.boxingcorporation.springboot.crudrest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="boxer")
public class Boxer {

	// define fields
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="total_fights")
	private int totalFights;
	
	@Column(name="wins")
	private int wins;
	
	@Column(name="twitter")
	private String twitter;
	
	// define constructors
	
	public Boxer() {
		
	}

	public Boxer(int id, String firstName, String lastName, String nationality, 
				 int totalFights, int wins, String twitter) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.totalFights = totalFights;
		this.wins = wins;
		this.twitter = twitter;
	}

	public Boxer(String firstName, String lastName, String nationality, 
			 	 int totalFights, int wins, String twitter) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationality = nationality;
		this.totalFights = totalFights;
		this.wins = wins;
		this.twitter = twitter;
	}

	// define getter/setter
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getTotalFights() {
		return totalFights;
	}

	public void setTotalFights(int totalFights) {
		this.totalFights = totalFights;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	// define toString
	
	@Override
	public String toString() {
		return "Boxer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality="
				+ nationality + ", totalFights=" + totalFights + ", wins=" + wins + ", twitter=" + twitter + "]";
	}		
	
}
