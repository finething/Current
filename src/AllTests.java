package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configrations/springConfig.xml", "classpath:configrations/batchConfig.xml",
		"classpath:configrations/databaseConfig.xml" })

public class AllTests {
	@Autowired
	private ApplicationContext context;
	SimpleJobLauncher here;
   @Before
	public void kllTests() {
	   System.out.println("hi");
	   here=(SimpleJobLauncher)context.getBean("jobLauncher");

	}

	@Test
	public void GetString() {
				Assert.assertNotNull(new String("hi"));
		//Assert.assertEquals(true, true);
	}
}
