package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//In this Project, I have used dummy data by inserting data manually in mysql database
//for checking for delivery , pid & id should be same other it will no available..
// for example, for product 1 , id should be 1 & pid should be 1 then only the controller function works;
//for product 2, id 2 & pid 2 then only the delivery availability can be displayed
//also i have add manually pincode for all pid&id (all product) such that :
//id =1, pincodes=211019, pid=1,estimateddays=4 then when user check for product 1 for pincode=211019 then it will show estimateddays as 4, 
//suppose if id=2 & pid=1 is inserted into the table then it will show not available. so pid& id should be same
@Entity
@Table(name="serviceability")
public class Serviceability {

	@Id
	int id;
	 @Column(name="pincodes")
	int pincodes;
	 @Column(name="pid")
		int pid;
	 @Column(name="estimateddays")
		int estimateddays;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPincodes() {
		return pincodes;
	}
	public void setPincodes(int pincodes) {
		this.pincodes = pincodes;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getEstimateddays() {
		return estimateddays;
	}
	public void setEstimateddays(int estimateddays) {
		this.estimateddays = estimateddays;
	}
	@Override
	public String toString() {
		return "Serviceability [id=" + id + ", pincodes=" + pincodes + ", pid=" + pid + ", estimateddays="
				+ estimateddays + "]";
	}
	 
}