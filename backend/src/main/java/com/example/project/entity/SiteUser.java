package com.example.project.entity;
import jakarta.persistence.*;import java.time.*;
@Entity @Table(name="site_users") public class SiteUser {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;@Column(nullable=false) private String name;@Column(nullable=false,unique=true) private String email;@Column(nullable=false) private String phone;@Column(nullable=false) private String passwordHash;private LocalDateTime createdAt=LocalDateTime.now();
 public Long getId(){return id;}public String getName(){return name;}public void setName(String v){name=v;}public String getEmail(){return email;}public void setEmail(String v){email=v==null?null:v.trim().toLowerCase();}public String getPhone(){return phone;}public void setPhone(String v){phone=v;}public String getPasswordHash(){return passwordHash;}public void setPasswordHash(String v){passwordHash=v;}
}