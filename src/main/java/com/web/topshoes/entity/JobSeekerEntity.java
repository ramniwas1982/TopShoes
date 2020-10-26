package com.web.topshoes.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobseeker_tbl")
public class JobSeekerEntity {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long seekerId;
    private long loginId;
    private String f_name;
    private String l_name;
    private String address;//master
    private String email;
    private String father_name;
    private Date dob;
    private String qualification;//master
    private String specilaziation;//master
    
    private int mobile_no;
    private String key_skills;//mapping with user
    private String technology;//master
    private String job_type;
    private String tot_work_experience;//master
    private String resume;
    private String t_n_c;
    private String employment;//mapping with user(Master)
    private String current_ctc;//master
    private String expected_ctc;//master
    private String position;//master
    private String job_location;//master
    private String projects;//mapping with user
    private boolean want_notification_message;
	public long getSeekerId() {
		return seekerId;
	}
	public void setSeekerId(long seekerId) {
		this.seekerId = seekerId;
	}
	public long getLoginId() {
		return loginId;
	}
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecilaziation() {
		return specilaziation;
	}
	public void setSpecilaziation(String specilaziation) {
		this.specilaziation = specilaziation;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getKey_skills() {
		return key_skills;
	}
	public void setKey_skills(String key_skills) {
		this.key_skills = key_skills;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getTot_work_experience() {
		return tot_work_experience;
	}
	public void setTot_work_experience(String tot_work_experience) {
		this.tot_work_experience = tot_work_experience;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getT_n_c() {
		return t_n_c;
	}
	public void setT_n_c(String t_n_c) {
		this.t_n_c = t_n_c;
	}
	public String getEmployment() {
		return employment;
	}
	public void setEmployment(String employment) {
		this.employment = employment;
	}
	public String getCurrent_ctc() {
		return current_ctc;
	}
	public void setCurrent_ctc(String current_ctc) {
		this.current_ctc = current_ctc;
	}
	public String getExpected_ctc() {
		return expected_ctc;
	}
	public void setExpected_ctc(String expected_ctc) {
		this.expected_ctc = expected_ctc;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJob_location() {
		return job_location;
	}
	public void setJob_location(String job_location) {
		this.job_location = job_location;
	}
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	public boolean isWant_notification_message() {
		return want_notification_message;
	}
	public void setWant_notification_message(boolean want_notification_message) {
		this.want_notification_message = want_notification_message;
	}
    
    
}
