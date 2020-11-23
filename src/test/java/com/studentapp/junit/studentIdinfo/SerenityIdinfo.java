package com.studentapp.junit.studentIdinfo;

import java.io.File;
import java.io.FileReader;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Manual;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityIdinfo {
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "http://localhost:8080/student";
	}
	
	@Test
	public void getAllStudents()
	{
		SerenityRest.given()
		.when().get("/list")
		.then()
		.statusCode(200);
	}
	
	@Title("This test will get the information of all the students from the Student App")
	@Test
	public void test01()
	{
		SerenityRest.rest().given()
		.when().get("/list")
		.then()
		.statusCode(200);
	}
	@Test
	public void thisIsAFailingTest()
	{
		SerenityRest.given()
		.when().get("/list")
		.then()
		.statusCode(500);
	}
	
	@Pending
	@Test
	public void thisIsPendingTest()
	{
		SerenityRest.given()
		.when().get("/list")
		.then()
		.statusCode(500);
	}
	
	@Ignore
	@Test
	public void thisIsSkippedTest()
	{
		SerenityRest.given()
		.when().get("/list")
		.then()
		.statusCode(500);
	}
	
	
	

	@Test
	public void thisIsTestWithError()
	{
		System.out.println(5/0);
	}
	
	
	@Test
	public void fileDoesNotExist() throws Exception
	{
		File file=new File("C://tomtom.txt");
		FileReader reader = new FileReader(file);
		System.out.println(reader);
	}
	
	@Manual
	@Test
	public void thisTestShouldBeExecuteManually() 
	{
		/**
		 * Manually execute through Postman
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
