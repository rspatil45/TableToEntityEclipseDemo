package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the app_audit_actions database table.
 * 
 */
@Entity
@Table(name="app_audit_actions")
@NamedQuery(name="AppAuditAction.findAll", query="SELECT a FROM AppAuditAction a")
public class AppAuditAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOG_ACTION_SRNO")
	private long logActionSrno;

	@Column(name="ACTION_PERFORMED")
	private String actionPerformed;

	@Column(name="LANG_CD")
	private int langCd;

	@Column(name="LOGIN_ID")
	private String loginId;

	@Column(name="ONLINE_OFFLINE")
	private String onlineOffline;

	@Temporal(TemporalType.DATE)
	@Column(name="RECORD_CREATED_DT")
	private Date recordCreatedDt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RECORD_CREATED_ON")
	private Date recordCreatedOn;

	@Column(name="USE_CASE_NUM")
	private String useCaseNum;

	public AppAuditAction() {
	}

	public long getLogActionSrno() {
		return this.logActionSrno;
	}

	public void setLogActionSrno(long logActionSrno) {
		this.logActionSrno = logActionSrno;
	}

	public String getActionPerformed() {
		return this.actionPerformed;
	}

	public void setActionPerformed(String actionPerformed) {
		this.actionPerformed = actionPerformed;
	}

	public int getLangCd() {
		return this.langCd;
	}

	public void setLangCd(int langCd) {
		this.langCd = langCd;
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOnlineOffline() {
		return this.onlineOffline;
	}

	public void setOnlineOffline(String onlineOffline) {
		this.onlineOffline = onlineOffline;
	}

	public Date getRecordCreatedDt() {
		return this.recordCreatedDt;
	}

	public void setRecordCreatedDt(Date recordCreatedDt) {
		this.recordCreatedDt = recordCreatedDt;
	}

	public Date getRecordCreatedOn() {
		return this.recordCreatedOn;
	}

	public void setRecordCreatedOn(Date recordCreatedOn) {
		this.recordCreatedOn = recordCreatedOn;
	}

	public String getUseCaseNum() {
		return this.useCaseNum;
	}

	public void setUseCaseNum(String useCaseNum) {
		this.useCaseNum = useCaseNum;
	}

}