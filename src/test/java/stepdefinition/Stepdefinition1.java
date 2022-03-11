package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition1 {
	
	WebDriver driver = hooks.hooks.driver;
	
	@Given("User is on the elearning platform")
	public void user_is_on_the_elearning_platform() {
		try{
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
		try{
			WebElement ob1= driver.findElement(By.name("login"));
			ob1.sendKeys("levi1500");
			Thread.sleep(1500);
			ob1= driver.findElement(By.name("password"));
			ob1.sendKeys("12345");
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
			ob1.click();
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
	}

	@Then("user verification message is displayed")
	public void user_verification_message_is_displayed() {
		try{
			WebElement ob2= driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
			String actualtext = ob2.getText();
			System.out.println(actualtext);
			String expectedtext = "Hello Levi Ackerman and welcome";
			Assert.assertTrue(actualtext.contains(expectedtext));
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		catch(Exception e){
			System.out.println("The actual text and expected text doesnot match");
		}
		
	}

	@Then("user clicks on social network tab")
	public void user_clicks_on_social_network_tab() {
		
		try{
			WebElement ob1 = driver.findElement(By.xpath("//li[@class='tab-social-network']"));
			ob1.click();
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@Then("clicks on my shared profile")
	public void clicks_on_my_shared_profile() {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//li[@class='shared-profile-icon']"));
			ob1.click();
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
	}

	@Then("types the message in input field")
	public void types_the_message_in_input_field() throws InterruptedException {
		
		try{
			WebElement ob1 = driver.findElement(By.name("social_wall_new_msg_main"));
			ob1.sendKeys("Arigato");
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@Then("clicks the post button")
	public void clicks_the_post_button() throws InterruptedException {
		
		try{
			WebElement ob1 = driver.findElement(By.name("wall_post_button"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}
	
	@Then("user clicks on inbox link under the profile tab")
	public void user_clicks_on_inbox_link_under_the_profile_tab() throws InterruptedException {
		
		try{
			WebElement ob1 = driver.findElement(By.xpath("//img[@title='Inbox']"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}
	
	@Given("user search for a message {string} in search field and clicks on the search button")
	public void user_search_for_a_message_in_search_field_and_clicks_on_the_search_button(String string) throws InterruptedException {
	    try{
	    	WebElement ob1= driver.findElement(By.xpath("//input[@name='keyword']"));
	    	ob1.sendKeys("Hii");
	    	Thread.sleep(1500);
	    	ob1 = driver.findElement(By.xpath("//button[@name='submit']"));
	    	ob1.click();
	    	Thread.sleep(1500);
	    	
	    }catch(NoSuchElementException e){
	    	System.out.println("Unable to locate the element");
	    }
	}

	@Then("the message is displayed successfully")
	public void the_message_is_displayed_successfully() {
	    try{
	    	WebElement ob1 =driver.findElement(By.xpath("(//a[text()='Hii'])[1]"));
	    	String actualmessage3 = ob1.getText();
	    	
			System.out.println(actualmessage3);
			String expectedmessage3 = "Hii";
			Assert.assertTrue(actualmessage3.contains(expectedmessage3));
			Thread.sleep(1500);
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}catch(Exception e){
			System.out.println("The actual message and expected message doesnot match");
		}
	    
	}

	@Then("user clicks on reply image")
	public void user_clicks_on_reply_image() throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//img[@title='Reply to this message']"));
		    ob1.click();
		    Thread.sleep(1500);
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	    
	}

	@Then("enters the message {string} field and clicks on send message button")
	public void enters_the_message_field_and_clicks_on_send_message_button(String string) throws InterruptedException {
	    try{
	    	WebElement ob2 = driver.findElement(By.name("title"));
			ob2.sendKeys(" Abc");
			Thread.sleep(5000);
			
	    	driver.switchTo().frame(0); 
	    	
			WebElement ob3 = driver.findElement(By.xpath("/html/body/p[2]"));
			ob3.sendKeys("Hello");
			
		    driver.switchTo().defaultContent();
		    Thread.sleep(2000);
		    
		    ob3 = driver.findElement(By.name("compose"));
			ob3.click();
			Thread.sleep(1500);
	    }catch(NoSuchFrameException e){
	    	System.out.println("This frame does not exists");
	    }
	    catch(NoSuchElementException e){
	    	System.out.println("Unable to locate the element");
	    }
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
		try{
			WebElement ob2= driver.findElement(By.xpath("//div[contains(text(),'The message')]"));
			String actualmessage4 = ob2.getText();
			System.out.println(actualmessage4);
			String expectedmessage4 = "The message has been sent to";
			Assert.assertTrue(actualmessage4.contains(expectedmessage4));
			Thread.sleep(1500);
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		catch(Exception e){
			System.out.println("The actual message and expected message doesnot match");
		}
	}
	
	@When("user clicks the back arrow image")
	public void user_clicks_the_back_arrow_image() throws InterruptedException {
		try{
            WebElement ob1 = driver.findElement(By.xpath("//img[@title='Back']"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@When("clicks on select all button and on the caret symbol")
	public void clicks_on_select_all_button_and_on_the_caret_symbol() throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//a[contains(text(),'Select all')]"));
			ob1.click();
			Thread.sleep(2000);
			
			ob1 = driver.findElement(By.xpath("//*[@id='form_message_inbox_id']/table[2]/tbody/tr/td[1]/div/div[2]/button[2]"));
    		ob1.click();
    		Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@When("clicks on mark as unread")
	public void clicks_on_mark_as_unread() throws InterruptedException {
	    try{
	    	WebElement ob1 = driver.findElement(By.xpath("//a[contains(text(),'Mark as')]"));
	        ob1.click();
	        Thread.sleep(1500);
	    }catch(NoSuchElementException e){
	    	System.out.println("Unable to locate the element");
	    }
	}

	@Then("the success message is displayed")
	public void the_success_message_is_displayed() {
		try{
			WebElement ob2= driver.findElement(By.xpath("//div[contains(text(),'Selected messages')]"));
			String actualmessage5 = ob2.getText();
			System.out.println(actualmessage5);
			String expectedmessage5 = "Selected messages have been marked as unread";
			Assert.assertTrue(actualmessage5.contains(expectedmessage5));
			Thread.sleep(1500);
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		catch(Exception e){
			System.out.println("The actual message and expected message doesnot match");
		}
	}
	

	@Given("user clicks on compose message image")
	public void user_clicks_on_compose_message_image() throws InterruptedException {
		
		try{
			WebElement ob1 = driver.findElement(By.xpath("//img[@title='Compose message']"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@When("user enters {string} in please select an option field")
	public void user_enters_in_please_select_an_option_field(String string) throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
			ob1.sendKeys("Dip");
			Thread.sleep(2000);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
		
	}
    
	
	@When("selects a name and enters the subject {string} and message {string} field")
	public void selects_a_name_and_enters_the_subject_and_message_field(String string, String string2) throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.xpath("(//li[text()='Dipti Anand'])[1]"));
			ob1.click();
			Thread.sleep(1500);
			
			ob1 = driver.findElement(By.name("title"));
			ob1.sendKeys("Hello");
			Thread.sleep(5000);
			
			driver.switchTo().frame(0);
			WebElement ob2 = driver.findElement(By.xpath("/html/body/p"));
			ob2.sendKeys("Ohayo");
		    driver.switchTo().parentFrame();
		}catch(NoSuchFrameException e){
	    	System.out.println("This frame does not exists");
	    }catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
	}
	
	@When("attaches a file and a description {string}")
	public void attaches_a_file_and_a_description(String string) throws InterruptedException {
		
		try{
			WebElement ob2 = driver.findElement(By.name("attach_1"));
			ob2.sendKeys("C:\\Users\\USER\\Downloads\\shinchan.jpg");
			
			Thread.sleep(2000);
			
			ob2 = driver.findElement(By.xpath("//*[@id='file-descrtiption']"));
			ob2.sendKeys("shinchan");
			Thread.sleep(1500);
		}catch(InvalidArgumentException e){
			System.out.println("File not found");
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@When("clicks on send message")
	public void clicks_on_send_message() throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.name("compose"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		
	}

	@Then("message sent is displayed")
	public void message_sent_is_displayed() throws InterruptedException {
		try{
			WebElement ob3= driver.findElement(By.xpath("//div[contains(text(),'The message')]"));
			String actualmessage = ob3.getText();
			System.out.println(actualmessage);
			String expectedmessage = "The message has been sent to Dipti Anand";
			Assert.assertTrue(actualmessage.contains(expectedmessage));
			Thread.sleep(1500);
			
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		catch(Exception e){
			System.out.println("The actual message and expected message doesnot match");
		}
		
	}
    
	@When("user clicks on outbox image")
	public void user_clicks_on_outbox_image() throws InterruptedException {
			
			try{
				WebElement ob1 = driver.findElement(By.xpath("//img[@title='Outbox']"));
				ob1.click();
				Thread.sleep(1500);
			}catch(NoSuchElementException e){
				System.out.println("Unable to locate the element");
			}
	}

	@When("user search for message in search field and clicks on search button")
	public void user_search_for_message_in_search_field_and_clicks_on_search_button() throws InterruptedException {
		try{
			WebElement ob1 = driver.findElement(By.xpath("//input[@name='keyword']"));
			ob1.sendKeys("Hello");
			Thread.sleep(1500);
			
			ob1 = driver.findElement(By.xpath("//button[@name='submit']"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@Then("searched message is displayed")
	public void searched_message_is_displayed() {
		
		try{
			WebElement ob1 =driver.findElement(By.xpath("(//a[text()='Hello'])[1]"));
			String actualmessage1 = ob1.getText();
			System.out.println(actualmessage1);
			String expectedmessage1 = "Hello";
			Assert.assertTrue(actualmessage1.contains(expectedmessage1));
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}catch(Exception e){
			System.out.println("The The actual message and expected message doesnot match");
		}
	}

	@When("user clicks on select all option")
	public void user_clicks_on_select_all_option() throws InterruptedException {
		
		try{
			WebElement ob1 = driver.findElement(By.xpath("//a[contains(text(),'Select all')]"));
			ob1.click();
			Thread.sleep(1500);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}
	
	@When("clicks on the caret symbol and delete selected message")
	public void clicks_on_the_caret_symbol_and_delete_selected_message() throws InterruptedException {
		try{
        	WebElement ob1 = driver.findElement(By.xpath("//*[@id='form_message_outbox_id']/table[2]/tbody/tr/td[1]/div/div[2]/button[2]"));
    		ob1.click();
    		Thread.sleep(2000);
    		
    		driver.findElement(By.xpath("//*[@id='form_message_outbox_id']/table[2]/tbody/tr/td[1]/div/div[2]/ul/li/a")).click();
            Thread.sleep(2000);
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
	}

	@Then("clicks on ok button of the pop up message")
	public void clicks_on_ok_button_of_the_pop_up_message() throws InterruptedException {
		try{
			driver.switchTo().alert().accept();
			Thread.sleep(1500);
		}catch(NoAlertPresentException e){
			System.out.println("No alert is present");
		}
		
	}

	@Then("the message is deleted")
	public void the_message_is_deleted() {
		try{
			WebElement ob4= driver.findElement(By.xpath("//div[contains(text(),'The selected messages')]"));
			String actualmessage2 = ob4.getText();
			System.out.println(actualmessage2);
			String expectedmessage2 = "The selected messages have been deleted";
			Assert.assertTrue(actualmessage2.contains(expectedmessage2));
			Thread.sleep(1500);	
		}catch(NoSuchElementException e){
			System.out.println("Unable to locate the element");
		}
		catch(Exception e){
			System.out.println("The actual message and expected message doesnot match");
		}
		
	}
	
	

	

	

	
}
