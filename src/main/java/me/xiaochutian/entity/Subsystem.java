package me.xiaochutian.entity;

/**
 * Subsystem message. @author MyEclipse Persistence Tools
 */

public class Subsystem implements java.io.Serializable {

	// Fields

	private Integer idsubsystem;
	private String subsystemcode;
	private String subsystemname;

	// Constructors

	/** default constructor */
	public Subsystem() {
	}

	/** full constructor */
	public Subsystem(String subsystemcode, String subsystemname) {
		this.subsystemcode = subsystemcode;
		this.subsystemname = subsystemname;
	}

	// Property accessors

	public Integer getIdsubsystem() {
		return this.idsubsystem;
	}

	public void setIdsubsystem(Integer idsubsystem) {
		this.idsubsystem = idsubsystem;
	}

	public String getSubsystemcode() {
		return this.subsystemcode;
	}

	public void setSubsystemcode(String subsystemcode) {
		this.subsystemcode = subsystemcode;
	}

	public String getSubsystemname() {
		return this.subsystemname;
	}

	public void setSubsystemname(String subsystemname) {
		this.subsystemname = subsystemname;
	}

}