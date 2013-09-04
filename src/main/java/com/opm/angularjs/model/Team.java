package com.opm.angularjs.model;

public class Team {
	private String name;
	private Integer pj;
	private Integer pg;
	private Integer pp;
	private Integer gf;
	private Integer gc;
	
	public Team() {
	
	}
	
	public Team(String name, Integer pj, Integer pg, Integer pp,
			Integer gf, Integer gc) {
		
		this.setName(name);
		this.pj = pj;
		this.pg = pg;
		this.pp = pp;
		this.gf = gf;
		this.gc = gc;
	}

	public Integer getPj() {
		return pj;
	}
	public void setPj(Integer pj) {
		this.pj = pj;
	}
	public Integer getPg() {
		return pg;
	}
	public void setPg(Integer pg) {
		this.pg = pg;
	}
	public Integer getPp() {
		return pp;
	}
	public void setPp(Integer pp) {
		this.pp = pp;
	}
	public Integer getGf() {
		return gf;
	}
	public void setGf(Integer gf) {
		this.gf = gf;
	}
	public Integer getGc() {
		return gc;
	}
	public void setGc(Integer gc) {
		this.gc = gc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
