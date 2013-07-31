package com.mrroman.springgames.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

/**
 * Dyscyplina sportu
 * 
 */
@Entity
public class Discipline {

	@Id
	@GeneratedValue
	private int id;

	@Column
	@NotEmpty
	private String name;

	@Column
	@Range(min = 1)
	private int playersNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayersNumber() {
		return playersNumber;
	}

	public void setPlayersNumber(int playersNumber) {
		this.playersNumber = playersNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + playersNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discipline other = (Discipline) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (playersNumber != other.playersNumber)
			return false;
		return true;
	}

}
