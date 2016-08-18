package com.knongdai.account.repositories.sql;

public interface UserSQL {
	
	String R_USER_BY_EMAIL="SELECT"
			+ "		U.userid,"
			+ " 	U.email,"
			+ " 	U.password,"
			+ " 	U.gender,"
			+ " 	U.dateofbirth,"
			+ " 	U.phonenumber,"
			+ " 	U.registerdate,"
			+ " 	U.userimageurl,"
			+ " 	U.point,"
			+ "		U.universityid,"
			+ " 	U.departmentid,"
			+ " 	U.userstatus,"
			+ " 	U.sc_fb_id,"
			+ " 	U.sc_type,"
			+ " 	U.isconfirmed,"
			+ " 	U.signup_with,"
			+ "     U.username"
			+ " FROM"
			+ " 	tbluser U"
			+ " WHERE"
			+ " 	U.email = #{email} ";
	
	String R_ROLES_BY_USER_ID = "SELECT"
			+ "		UR.role_id , UR.user_id , R.role_name"
			+ " FROM"
			+ " 	tbluser_role UR"
			+ " INNER JOIN tblrole R ON UR.role_id = R.role_id"
			+ " WHERE"
			+ " 	UR.user_id = #{userId}";
	
	 

}
