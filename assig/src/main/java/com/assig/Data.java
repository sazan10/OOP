package com.assig;

public class Data {
	private String title;
	private String author;
	private String Publisher;
	private double sysid;

	public double getSysid() {
		return sysid;
	}

	public void setSysid(double d) {
		this.sysid = d;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		sysid++;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	@Override
	public String toString() {
		return "Data [title=" + title + ", author=" + author + ", Publisher=" + Publisher + ", "+sysid+"]";
	}



}
