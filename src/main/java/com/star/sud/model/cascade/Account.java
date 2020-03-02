/**
 * 
 */
package com.star.sud.model.cascade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_ACCOUNT")
public class Account {

	// Attributes
	/////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACCN_ID", nullable = false, unique = true)
	private int accnId;

	@Column(name = "ACCN__ID")
	private String accnName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_ID")
	private Employee employee;

	
	/**
	 * 
	 */
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accnId
	 * @param accnName
	 * @param employee
	 */
	public Account(String accnName) {
		this.accnName = accnName;
	}

	// Properties
	////////////////
	/**
	 * @return the accnId
	 */
	public int getAccnId() {
		return accnId;
	}

	/**
	 * @param accnId the accnId to set
	 */
	public void setAccnId(int accnId) {
		this.accnId = accnId;
	}

	/**
	 * @return the accnName
	 */
	public String getAccnName() {
		return accnName;
	}

	/**
	 * @param accnName the accnName to set
	 */
	public void setAccnName(String accnName) {
		this.accnName = accnName;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
