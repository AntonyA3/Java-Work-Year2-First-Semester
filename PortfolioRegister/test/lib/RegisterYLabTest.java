package lib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import org.junit.Test;

public class RegisterYLabTest {
	
	@Test
	public void testAddNameOverload() {
		Register r = new Register();
		
		Name x = new Name("Tim", "Bloggs");
		Name y = new Name("Fred", "Bloggs");
		r.addName(x);
		r.addName(y);
		
		Name n = new Name("Don", "Bloggs");
		
			
		r.addName(0, n); //test with legit index
		
		assertSame("Register's first element should be the newly inserted name object", n, r.getName(0));
		
		assertSame("Register's second element should remain unchanged", x, r.getName(1));
		assertSame("Register's third element should remain unchanged", y, r.getName(2));
		
		assertEquals("Register's size should have increased to 3", 3, r.registerSize());
		
		
		Name n2 = new Name("Bob", "Hawks");
		r.addName(3, n2); //test with different legit index 
		
		assertSame("Register's forth element should be the newly inserted name object", n2, r.getName(3));
		
		assertSame("Register's first element should remain unchanged", n, r.getName(0));
		assertSame("Register's second element should remain unchanged", x, r.getName(1));
		assertSame("Register's third element should remain unchanged", y, r.getName(2));
		
		assertEquals("Register's size should have increased to 4", 4, r.registerSize());

	}
	
	
	@Test
	public void testAddNameOverload2() {
		Register r = new Register();
		
		Name x = new Name("Tim", "Bloggs");
		Name y = new Name("Fred", "Bloggs");
		r.addName(x);
		r.addName(y);
		
		Name n = new Name("Don", "Bloggs");
		
		
		/* EXTENSION */
		
		r.addName(-1, n); //test with < index
		
		r.addName(3, n); //test with > index
		
		assertEquals("Register's size should have remained unchanged", 2, r.registerSize());
		
		/* ------- */
		
		
		r.addName(0, n); //test with legit index
		
		assertSame("Register's first element should be the newly inserted name object", n, r.getName(0));
		
		assertSame("Register's second element should remain unchanged", x, r.getName(1));
		assertSame("Register's third element should remain unchanged", y, r.getName(2));
		
		assertEquals("Register's size should have increased to 3", 3, r.registerSize());
		
		
		Name n2 = new Name("Bob", "Hawks");
		r.addName(3, n2); //test with different legit index 
		
		assertSame("Register's forth element should be the newly inserted name object", n2, r.getName(3));
		
		assertSame("Register's first element should remain unchanged", n, r.getName(0));
		assertSame("Register's second element should remain unchanged", x, r.getName(1));
		assertSame("Register's third element should remain unchanged", y, r.getName(2));
		
		assertEquals("Register's size should have increased to 4", 4, r.registerSize());

	}

	
	@Test
	public void testGetNameOverridden() {
		Register r = new Register();
		
		r.addName(new Name("Joe", "Bloggs"));
		
		assertEquals("Name should have been returned unchanged", new Name("Joe", "Bloggs"), r.getName(0));
		
		
		r = new RegisterY(); //create instance of subclass
		
		Name n = new Name("Joe", "Bloggs");
		r.addName(n);
		
		//using overridden getName
		assertSame("The same Name object reference passed to the method should have been returned", n, r.getName(0)); 
		assertEquals("Name should have been returned in uppercase", new Name("JOE", "BLOGGS"), r.getName(0));
		
		
		//Other checks to ensure you have passed this test in the intended manner
		Field[] fields = Register.class.getDeclaredFields();
		assertTrue("All fields must remain private", Arrays.stream(fields).allMatch(f -> (Modifier.PRIVATE & f.getModifiers()) != 0));
		
		Field[] fieldsB = RegisterY.class.getDeclaredFields();
		assertEquals("The RegisterY class should not define any fields", 0, fieldsB.length);
		
		Method[] methodsB = RegisterY.class.getDeclaredMethods();
		assertTrue("The RegisterY class should only have 1 method called getName", 
				methodsB.length == 1 && methodsB[0].getName().equals("getName"));
	}
	
}