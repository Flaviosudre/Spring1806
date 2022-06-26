package com.flaviosudre.cursomc.resources.exception;

import java.io.Serializable;
import java.util.Objects;

public class StandardError implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer Status;
	private String msg;
	private Long timeStamp;
	
	public StandardError(Integer status, String msg, Long timeStamp) {
		super();
		Status = status;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Status, msg, timeStamp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardError other = (StandardError) obj;
		return Objects.equals(Status, other.Status) && Objects.equals(msg, other.msg)
				&& Objects.equals(timeStamp, other.timeStamp);
	}

	@Override
	public String toString() {
		return "StandardError [Status=" + Status + ", msg=" + msg + ", timeStamp=" + timeStamp + "]";
	}
	
	
	

}
