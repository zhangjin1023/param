package param;

public class Param {
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

}
