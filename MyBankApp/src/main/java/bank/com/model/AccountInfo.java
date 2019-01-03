package bank.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity 
@DynamicInsert
@Table(name="accountinfo", catalog="sjbank")
public class AccountInfo {
	public AccountInfo() {
		
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="accountno")
	Integer accountno;
    //@Column(name="accountFname")
	String accountfname;
    //@Column(name="accountLname")
	String accountlname;
    //@Column(name="accountAddress")
	String accountaddress;
    //@Column(name="dob")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	Date dob;
    //@Column(name="panNo")
	String panno;
    //@Column(name="nominee")
	String nominee;
    //@Column(name="accountBal")
	double accountbal;
    //@Column(name="accountType")
	String accounttype;
    //@Column(name="contactNo")
	String contactno;
    //@Column(name="altContactNo")
	String altcontactno;
    //@Column(name="emailId")
	String emailid;
    //@Column(name="status")
	String status;
	public Integer getAccountno() {
		return accountno;
	}
	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}
	public String getAccountfname() {
		return accountfname;
	}
	public void setAccountfname(String accountfname) {
		this.accountfname = accountfname;
	}
	public String getAccountlname() {
		return accountlname;
	}
	public void setAccountlname(String accountlname) {
		this.accountlname = accountlname;
	}
	public String getAccountaddress() {
		return accountaddress;
	}
	public void setAccountaddress(String accountaddress) {
		this.accountaddress = accountaddress;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public double getAccountbal() {
		return accountbal;
	}
	public void setAccountbal(double accountbal) {
		this.accountbal = accountbal;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAltcontactno() {
		return altcontactno;
	}
	public void setAltcontactno(String altcontactno) {
		this.altcontactno = altcontactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	

}
