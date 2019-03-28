package com.javachen.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.DateBridge;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.annotations.Store;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@Indexed(index = "users")
@Analyzer(impl = org.apache.lucene.analysis.standard.StandardAnalyzer.class)
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@DocumentId
	private int userId;
	
	@Field(index=Index.UN_TOKENIZED, store = Store.YES)
    @DateBridge(resolution=Resolution.DAY)
	private Date birthDay;
	
	@Field(index = Index.UN_TOKENIZED, store = Store.YES)
	private String firstName;
	
	@Field(index=Index.UN_TOKENIZED, store = Store.YES)
	private boolean male;
	
	@Field(index = Index.UN_TOKENIZED, store = Store.YES)
	private String name;

    public UserEntity() {
    }


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


    @Temporal( TemporalType.DATE)
	@Column(nullable=false)
	public Date getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	@Column(nullable=false, length=32)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Column(nullable=false)
	public boolean getMale() {
		return this.male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}


	@Column(nullable=false, length=32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}