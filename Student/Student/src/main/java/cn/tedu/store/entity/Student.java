package cn.tedu.store.entity;

import java.io.Serializable;

public class Student implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 773025038821332177L;
	private String name;
	  private String gender;
	  private String nid;
	  private String company;
	  private String position;
	  private String phone;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNid() {
		return nid;
	}
	public void setNid(String nid) {
		this.nid = nid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", nid=" + nid + ", company=" + company + ", position="
				+ position + ", phone=" + phone + "]";
	}
	
}
