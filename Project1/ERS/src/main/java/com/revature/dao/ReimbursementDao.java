package com.revature.dao;

import java.io.OutputStream;
import java.util.List;

import com.revature.beans.Reimbursement;
import com.revature.beans.Reimbursement.RequestStatus;
import com.revature.beans.Reimbursement.RequestType;

public interface ReimbursementDao {

	public boolean denyRequest(int req_id, int reolver_id);
	public boolean approveRequest(int req_id, int resolver_id);
	public List<Reimbursement> getPendingRequests(int employee_id);
	public List<Reimbursement> getResolvedRequests(int employee_id);
	public List<Reimbursement> getPendingRequests();
	public List<Reimbursement> getResolvedRequests();
	//public boolean createRequest(double amount,String description, 
	//		InputStream receipt_image, int user_id, RequestPayload type);
	//public boolean createRequest(double amount,String description, 
	//		InputStream receipt_image, int user_id, RequestType type);
	public void getReceipt(int receipt_id, OutputStream out);
	public void getReceipt(int user_id, int receipt_id, OutputStream out);
}
