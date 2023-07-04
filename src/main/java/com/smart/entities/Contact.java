package com.smart.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String contactName;
	private String secondName;
	private String work;
	private String email;
	private String password;
	private String imageUrl;
	@Column(length = 5000)
	private String descriptionOfContact;
	
	@ManyToOne
	private User user;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Contact(Long cid, String contactName, String secondName, String work, String email, String password,
			String imageUrl, String descriptionOfContact, User user) {
		super();
		this.cid = cid;
		this.contactName = contactName;
		this.secondName = secondName;
		this.work = work;
		this.email = email;
		this.password = password;
		this.imageUrl = imageUrl;
		this.descriptionOfContact = descriptionOfContact;
		this.user = user;
	}

	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDescriptionOfContact() {
		return descriptionOfContact;
	}
	public void setDescriptionOfContact(String descriptionOfContact) {
		this.descriptionOfContact = descriptionOfContact;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}