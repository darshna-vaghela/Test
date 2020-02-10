package com.unique;

public class Student {
int sid;
String sname;
String saddress;
public Student(int sid, String sname, String saddress) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.saddress = saddress;
}
public Student() {
	System.out.println("---Employee object constructed");
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + "]";
}


}
