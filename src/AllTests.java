package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configrations/springConfig.xml", "classpath:configrations/batchConfig.xml",
		"classpath:configrations/databaseConfig.xml" })

public class AllTests {

	public AllTests() {
	}

	@Test
	public void GetString() {
		Assert.assertEquals(true, true);
	}
}
