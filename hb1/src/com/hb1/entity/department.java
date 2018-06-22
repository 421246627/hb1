package com.hb1.entity;

import java.util.Date;

public class department {
	private Integer did;
	private String dname;
	private Integer upuid;
	private Date uptime;
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getUpuid() {
		return upuid;
	}
	public void setUpuid(Integer upuid) {
		this.upuid = upuid;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public department(Integer did, String dname, Integer upuid, Date uptime) {
		super();
		this.did = did;
		this.dname = dname;
		this.upuid = upuid;
		this.uptime = uptime;
	}
	public department() {
		super();
	}
	@Override
	public String toString() {
		return "department [did=" + did + ", dname=" + dname + ", upuid="
				+ upuid + ", uptime=" + uptime + "]";
	}
}
