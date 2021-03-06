package com.studentapp.junit.studentinfo;

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

@RunWith(SerenityRunner.class)
public class FirstSerenityTest {
	
	@BeforeClass
	public static void init()
	{
		RestAssured.baseURI = "http://localhost:8080/student";
	}
	
	@Test
	public void getAllStudents()
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
