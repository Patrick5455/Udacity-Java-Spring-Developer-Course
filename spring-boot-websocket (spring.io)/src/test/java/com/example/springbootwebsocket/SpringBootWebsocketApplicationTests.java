package com.example.springbootwebsocket;

import com.example.springbootwebsocket.controller.GreetingController;
import com.example.springbootwebsocket.model.Greeting;
import com.example.springbootwebsocket.model.HelloMessage;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringBootWebsocketApplication.class})
class SpringBootWebsocketApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGreeting(){

		GreetingController controller = new GreetingController();

		try {
			Greeting greeting = controller.greeting(new HelloMessage("Patrick"));

			Assert.assertEquals(greeting.getContent(), "Hello, Patrick!");
		}

		catch (Exception e){
			e.printStackTrace();
		}


	}

}
