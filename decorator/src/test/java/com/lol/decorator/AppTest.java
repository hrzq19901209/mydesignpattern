package com.lol.abstract_factory;

import org.junit.Test;
import com.lol.decorator.App;

public class AppTest{
	@Test
	public void testApp(){
		App app = new App();
		app.test();
	}
}