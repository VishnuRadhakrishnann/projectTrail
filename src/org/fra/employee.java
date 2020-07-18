package org.fra;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee {
	
	private String empname;
	
	private int empId;
	
	private long mobno;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getMobno() {
		return mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

}
