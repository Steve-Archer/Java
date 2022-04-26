package com.steve.startup.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ideas")
public class Idea {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="Startup idea required")
	@Size(min=3, max=30, message="Idea must be between 3 and 30 characters")
	private String name;
	
	@NotNull(message="funding amount is required")
	@Min(value=1, message="funding amount must be at least $1")
	private double funding;
	
	@NotEmpty(message="Category required")
	@Size(min=8, message="Category must be at least 8 characters")
	private String category;
	
	@NotEmpty(message="Description required")
	@Size(min=10, message="Description must be at least 10 characters")
	private String description;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="uploader_id")
	private User uploader;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    
	public Idea() {}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFunding() {
		return funding;
	}

	public void setFunding(double funding) {
		this.funding = funding;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUploader() {
		return uploader;
	}

	public void setUploader(User uploader) {
		this.uploader = uploader;
	}

	
	
	
}
