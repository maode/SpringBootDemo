package com.code0.bootDemo;

import com.code0.bootDemo.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootDemoApplication.class)
public class BootDemoApplicationTests {

	private MockMvc mvc;

	@Autowired
	HelloController helloController;
	@Autowired
	BootDemoProperties profiles;

	@Before
	public void setUp()throws Exception{
		mvc= MockMvcBuilders.standaloneSetup(helloController).build();
	}

	@Test
	public void getHello()throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(Matchers.equalTo("Hello World")));
	}

	@Test
	public void testProfiles()throws Exception{
		// Assert.assertEquals(profiles.getName(),"test name");
		// Assert.assertEquals(profiles.getTitle(),"test title");
		System.out.println(profiles.getActive());
		System.out.println(profiles.getTest());
		System.out.println(profiles.getName());
		System.out.println(profiles.getTitle());
		System.out.println(profiles.getValue());
	}

}
