package com.knongdai.account.entities;

import java.sql.Date;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.knongdai.account.utilities.Encryption;

public class User implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("USER_ID")
	private int userId;
	
	@JsonProperty("ENC_USER_ID")
	private String encUserId;
	
	@JsonProperty("EMAIL")
	private String email;
	
	@JsonProperty("PASSWORD")
	private String password;
	
	@JsonProperty("USERNAME")
	private String username;
	
	@JsonProperty("GENDER")
	private String gender;
	
	@JsonProperty("REGISTERED_DATE")
	private Date registeredDate;
	
	@JsonProperty("USER_IAMGE_URL")
	private String userImageUrl;
	
	@JsonProperty("POINT")
	private int point;
	@JsonProperty("UNIVERSITY_ID")
	private int universityId;
	
	@JsonProperty("DEPARTMENT_ID")
	private int departmentId;
	
	@JsonProperty("USER_STATUS")
	private boolean userStatus;
	
	@JsonProperty("SOCIAL_ID")
	private String socialId;
	
	@JsonProperty("SOCIAL_TYPE")
	private String socialType;
	
	@JsonProperty("IS_CONFIRMED")
	private boolean isConfirmed;
	
	@JsonProperty("SIGN_UP_WITH")
	private String signUpWith;
	
	@JsonProperty("ROLES")
	private List<Role> roles;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getUserImageUrl() {
		return userImageUrl;
	}
	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public boolean isUserStatus() {
		return userStatus;
	}
	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}
	public String getSocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
	public String getSocialType() {
		return socialType;
	}
	public void setSocialType(String socialType) {
		this.socialType = socialType;
	}
	public boolean isConfirmed() {
		return isConfirmed;
	}
	public void setConfirmed(boolean isConfirmed) {
		this.isConfirmed = isConfirmed;
	}
	public String getSignUpWith() {
		return signUpWith;
	}
	public void setSignUpWith(String signUpWith) {
		this.signUpWith = signUpWith;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return roles;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public String getEncUserId() {
		return Encryption.encode(encUserId);
	}
	public void setEncUserId(String encUserId) {
		this.encUserId = encUserId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
