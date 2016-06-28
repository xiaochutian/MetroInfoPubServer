package me.xiaochutian.entity;

/**
 * Worninglevel message. @author MyEclipse Persistence Tools
 */

public class Worninglevel implements java.io.Serializable {

	// Fields

	private Integer idworninglevel;
	private Integer worninglevelcode;
	private String worninglevelname;

	// Constructors

	/** default constructor */
	public Worninglevel() {
	}

	/** full constructor */
	public Worninglevel(Integer worninglevelcode, String worninglevelname) {
		this.worninglevelcode = worninglevelcode;
		this.worninglevelname = worninglevelname;
	}

	// Property accessors

	public Integer getIdworninglevel() {
		return this.idworninglevel;
	}

	public void setIdworninglevel(Integer idworninglevel) {
		this.idworninglevel = idworninglevel;
	}

	public Integer getWorninglevelcode() {
		return this.worninglevelcode;
	}

	public void setWorninglevelcode(Integer worninglevelcode) {
		this.worninglevelcode = worninglevelcode;
	}

	public String getWorninglevelname() {
		return this.worninglevelname;
	}

	public void setWorninglevelname(String worninglevelname) {
		this.worninglevelname = worninglevelname;
	}

}