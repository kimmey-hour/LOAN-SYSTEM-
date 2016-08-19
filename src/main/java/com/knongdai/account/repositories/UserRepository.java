package com.knongdai.account.repositories;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.knongdai.account.entities.Role;
import com.knongdai.account.entities.User;
import com.knongdai.account.entities.forms.UserLogin;
import com.knongdai.account.repositories.sql.UserSQL;

@Repository
public interface UserRepository {
	
	@Select(UserSQL.R_USER_BY_EMAIL)
	@Results(value={
			@Result(property="userId" , column="userid"),
			@Result(property="email" , column="email"),
			@Result(property="password" , column="password"),
			@Result(property="username" , column="username"),
			@Result(property="gender" , column="gender"),
			@Result(property="registeredDate" , column="registerdate"),
			@Result(property="userImageUrl" , column="userimageurl"),
			@Result(property="point" , column="point"),
			@Result(property="universityId" , column="universityid"),
			@Result(property="departmentId" , column="departmentid"),
			@Result(property="userStatus" , column="userstatus"),
			@Result(property="socialId" , column="sc_fb_id"),
			@Result(property="socialType" , column="sc_type"),
			@Result(property="isConfirmed" , column="isconfirmed"),
			@Result(property="signUpWith" , column="signup_with"),
			@Result(property="encUserId" , column="userid"),
			@Result(property="roles" , column="userid" ,
					many = @Many(select = "findRolesByUserId")
			)
	})
	User findUserByEmail(UserLogin userLogin);

	@Select(UserSQL.R_ROLES_BY_USER_ID)
	@Results(value={
			@Result(property="roleId" , column="role_id"),
			@Result(property="roleName" , column="role_name")
	})
	List<Role> findRolesByUserId(@Param("userid") int userid);
	
}
