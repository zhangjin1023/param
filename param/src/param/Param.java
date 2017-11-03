package param;

public class Param {
	@PadRightWithSpace(len = 10)
	private String acctNM;
	@PadRightWithSpace(len = 4)
	private String transCode;
	@PadRightWithSpace(len = 4)
	private String procCode;
	@PadRightWithSpace(len = 15)
	private String merNo;
	@PadLeftWithZero(len = 12)
	private String amt;
	@PadRightWithSpace(len = 19)
	private String acctNo;
	@PadRightWithSpace(len = 15)
	private String payNo;
	
	

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getProcCode() {
		return procCode;
	}

	public void setProcCode(String procCode) {
		this.procCode = procCode;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getAcctNM() {
		return acctNM;
	}

	public void setAcctNM(String acctNM) {
		this.acctNM = acctNM;
	}

}
