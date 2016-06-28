package me.xiaochutian.entity;

/**
 * Line message. @author MyEclipse Persistence Tools
 */

public class Line implements java.io.Serializable {

	// Fields

	private Integer idline;
	private String linecode;
	private String linename;
	private String citycode;
	private Integer linestationcount;
	private Integer linekilocount;
	private Integer linestatus;
	private Integer levelonecount;
	private Integer leveltwocount;
	private Integer levelthreecount;

	// Constructors

	/** default constructor */
	public Line() {
	}

	/** full constructor */
	public Line(String linecode, String linename, String citycode,
			Integer linestationcount, Integer linekilocount,
			Integer linestatus, Integer levelonecount, Integer leveltwocount,
			Integer levelthreecount) {
		this.linecode = linecode;
		this.linename = linename;
		this.citycode = citycode;
		this.linestationcount = linestationcount;
		this.linekilocount = linekilocount;
		this.linestatus = linestatus;
		this.levelonecount = levelonecount;
		this.leveltwocount = leveltwocount;
		this.levelthreecount = levelthreecount;
	}

	// Property accessors

	public Integer getIdline() {
		return this.idline;
	}

	public void setIdline(Integer idline) {
		this.idline = idline;
	}

	public String getLinecode() {
		return this.linecode;
	}

	public void setLinecode(String linecode) {
		this.linecode = linecode;
	}

	public String getLinename() {
		return this.linename;
	}

	public void setLinename(String linename) {
		this.linename = linename;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Integer getLinestationcount() {
		return this.linestationcount;
	}

	public void setLinestationcount(Integer linestationcount) {
		this.linestationcount = linestationcount;
	}

	public Integer getLinekilocount() {
		return this.linekilocount;
	}

	public void setLinekilocount(Integer linekilocount) {
		this.linekilocount = linekilocount;
	}

	public Integer getLinestatus() {
		return this.linestatus;
	}

	public void setLinestatus(Integer linestatus) {
		this.linestatus = linestatus;
	}

	public Integer getLevelonecount() {
		return this.levelonecount;
	}

	public void setLevelonecount(Integer levelonecount) {
		this.levelonecount = levelonecount;
	}

	public Integer getLeveltwocount() {
		return this.leveltwocount;
	}

	public void setLeveltwocount(Integer leveltwocount) {
		this.leveltwocount = leveltwocount;
	}

	public Integer getLevelthreecount() {
		return this.levelthreecount;
	}

	public void setLevelthreecount(Integer levelthreecount) {
		this.levelthreecount = levelthreecount;
	}

}