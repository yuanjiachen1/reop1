package cn.tedu.store.entity;

import java.io.Serializable;
import java.util.Date;

public class Class implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 5594890812963682056L;
	private String Cname;
	  private String Studyplace;
	  private String Studytime;
	  private String teacher;
	  private Integer achievement;
	  private Integer Classhours;
	  private String pcourse;
	  private Date startime;
	  private Date endtime;
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
	@Override
	public String toString() {
		return "Class [Cname=" + Cname + ", Studyplace=" + Studyplace + ", Studytime=" + Studytime + ", teacher="
				+ teacher + ", achievement=" + achievement + ", Classhours=" + Classhours + ", pcourse=" + pcourse
				+ ", startime=" + startime + ", endtime=" + endtime + "]";
	}
	
}
