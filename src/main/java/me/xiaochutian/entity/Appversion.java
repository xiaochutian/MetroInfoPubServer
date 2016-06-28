package me.xiaochutian.entity;

/**
 * Appversion message. @author MyEclipse Persistence Tools
 */

public class Appversion implements java.io.Serializable {

	// Fields

	private Integer idappversion;
	private Integer type;
	private String version;
	private String versioncode;
	private Integer force;
	private String url;
	private String remarks;
	private String pubtime;

	// Constructors

	/** default constructor */
	public Appversion() {
	}

	/** full constructor */
	public Appversion(Integer type, String version, String versioncode,
			Integer force, String url, String remarks, String pubtime) {
		this.type = type;
		this.version = version;
		this.versioncode = versioncode;
		this.force = force;
		this.url = url;
		this.remarks = remarks;
		this.pubtime = pubtime;
	}

	// Property accessors

	public Integer getIdappversion() {
		return this.idappversion;
	}

	public void setIdappversion(Integer idappversion) {
		this.idappversion = idappversion;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersioncode() {
		return this.versioncode;
	}

	public void setVersioncode(String versioncode) {
		this.versioncode = versioncode;
	}

	public Integer getForce() {
		return this.force;
	}

	public void setForce(Integer force) {
		this.force = force;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getPubtime() {
		return this.pubtime;
	}

	public void setPubtime(String pubtime) {
		this.pubtime = pubtime;
	}

}