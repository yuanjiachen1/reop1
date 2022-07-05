package cn.tedu.store.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 502115816215016493L;
/**
	 * 
	 */
	  private String name;
	  private String gender;
	  private String nid;
	  private String company;
	  private String position;
	  private String phone;
	  private String Cname;
	  private String Studyplace;
	  private String Studytime;
	  private String teacher;
	  private Integer achievement;
	  private Integer Classhours;
	  private String pcourse;
	  private Date startime;
	  private Date endtime;

	
  @Override
	public String toString() {
		return "User [name=" + name + ", gender=" + gender + ", nid=" + nid + ", company=" + company + ", position="
				+ position + ", phone=" + phone + ", Cname=" + Cname + ", Studyplace=" + Studyplace + ", Studytime="
				+ Studytime + ", teacher=" + teacher + ", achievement=" + achievement + ", Classhours=" + Classhours
				+ ", pcourse=" + pcourse + ", startime=" + startime + ", endtime=" + endtime + ", id=" + id + "]";
	}


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


	public String getCname() {
		return Cname;
	}


	public void setCname(String cname) {
		Cname = cname;
	}


	public String getStudyplace() {
		return Studyplace;
	}


	public void setStudyplace(String studyplace) {
		Studyplace = studyplace;
	}


	public String getStudytime() {
		return Studytime;
	}


	public void setStudytime(String studytime) {
		Studytime = studytime;
	}


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public Integer getAchievement() {
		return achievement;
	}


	public void setAchievement(Integer achievement) {
		this.achievement = achievement;
	}


	public Integer getClasshours() {
		return Classhours;
	}


	public void setClasshours(Integer classhours) {
		Classhours = classhours;
	}


	public String getPcourse() {
		return pcourse;
	}


	public void setPcourse(String pcourse) {
		this.pcourse = pcourse;
	}


	public Date getStartime() {
		return startime;
	}


	public void setStartime(Date startime) {
		this.startime = startime;
	}
	

	public Date getEndtime() {
		return endtime;
	}


	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
   

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


private Integer id;

}
