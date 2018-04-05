package com.helpdesk.api.dto;

import java.io.Serializable;

public class Summary implements Serializable {

	private static final long serialVersionUID = 947702615252892146L;
	
	private Integer amountNew;
	private Integer amountResolved;
	private Integer amoutApproved;
	private Integer amoutDisapproved;
	private Integer amoutAssigned;
	private Integer amoutClosed;
	
	public Integer getAmountNew() {
		return amountNew;
	}
	public void setAmountNew(Integer amountNew) {
		this.amountNew = amountNew;
	}
	public Integer getAmountResolved() {
		return amountResolved;
	}
	public void setAmountResolved(Integer amountResolved) {
		this.amountResolved = amountResolved;
	}
	public Integer getAmoutApproved() {
		return amoutApproved;
	}
	public void setAmoutApproved(Integer amoutApproved) {
		this.amoutApproved = amoutApproved;
	}
	public Integer getAmoutDisapproved() {
		return amoutDisapproved;
	}
	public void setAmoutDisapproved(Integer amoutDisapproved) {
		this.amoutDisapproved = amoutDisapproved;
	}
	public Integer getAmoutAssigned() {
		return amoutAssigned;
	}
	public void setAmoutAssigned(Integer amoutAssigned) {
		this.amoutAssigned = amoutAssigned;
	}
	public Integer getAmoutClosed() {
		return amoutClosed;
	}
	public void setAmoutClosed(Integer amoutClosed) {
		this.amoutClosed = amoutClosed;
	}
	
}
