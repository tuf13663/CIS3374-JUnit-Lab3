package com.lab3.admiterator;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import org.junit.Test;
@RunWith(JUnitParamsRunner.class)
public class AdmiteratorTest{

	@Test
	@Parameters(method= "method_for_params")
		
	public void name_of_test(Type parameter1, Type param2)
	{your test goes here}
	private Object method_for_params( { return new 
			Object[][] {{arg1_for_run1, arg2_for_run1, etc...},
			{arg1_for_run2, arg2_for_run2} };
	}
	}
	public void test() {
		fail("Not yet implemented");
	}

}
