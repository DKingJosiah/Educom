package com.example.schoolmanagementsystem.user.entity;

import com.example.schoolmanagementsystem.common.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseEntity {


	@Column(name = "first_name", nullable = false, length = 100)
	private String firstName;

	@Column(name="last_name",nullable = false, length = 100)
	private String lastName;

	@Column(name = "middle_name", length = 100)
	private String middleName;


	@Column(nullable = false, unique = true ,length = 254)
	private String email;

	@Column(name = "password_hash", nullable = false)
	private String passwordHash;



	@Column(name = "phone_number", length = 20)
	private String phoneNumber;


	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 30)
	private UserStatus status = UserStatus.PENDING_VERIFICATION;

	@Column(name = "email_verified", nullable = false)
	private boolean emailVerified = false;

	protected User() {
	}

	public User( String firstName,
				 String lastName,
				 String email,
				 String passwordHash) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passwordHash = passwordHash;
		this.status = UserStatus.PENDING_VERIFICATION;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public UserStatus getStatus() {
		return status;
	}

	public boolean isEmailVerified() {
		return emailVerified;
	}
}
