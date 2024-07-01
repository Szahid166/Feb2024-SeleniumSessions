package naveenTestNGSessions2024;

import org.testng.annotations.Test;

// Always create independent test and avoid dependency.
// This this the best way to CRUD oparetion --> also called AAA pattern

public class CRUDTest {
// puplic void addUser
public int addUser() {
	return 123;
		
	}
		
//public void getUser(int uid) {
	public String getUser(int uid) {
	return "user info" + uid;
	
}

//public void upDateUser() {
	public String upDateUser(int uid) {
	
	return "upDated user info" + uid;
	
}

public void deleteUser(int uid) {
	System.out.println("User is deleted");
	
}

@Test
public void adduserTest() {
	addUser();
}

@Test
public void getUserTest() {
	//getUserTest();
	int uid = addUser();
	String userinfo = getUser(uid);
	System.out.println(userinfo);


}
// update user
@Test
public void upDatedUserTest() {
	int uid = addUser();
	upDateUser (uid);
	getUser(uid);
	}

// delete User
@Test
public void deleteUserTest() {
	int uid = addUser();
	deleteUser (uid);
	getUser(uid);
	}

}