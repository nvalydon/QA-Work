import static org.junit.Assert.*;

import org.junit.Test;

import Main.InputSystem;
import junit.framework.Assert;

public class tests {

	@Test
	public void testUserInput() {

		InputSystem inputSystem = new InputSystem();

		int inputTest =  inputSystem.getPlayerInput();
		int inputTest2 = inputSystem.getPlayerInput();
		int inputTest3 = inputSystem.getPlayerInput();

		assertEquals(1, inputTest);
		assertEquals(2, inputTest2);
		assertEquals(3, inputTest3);

	}
	
	
	
	@Test
	public void testCPUInput() {
		InputSystem CPUInput = new InputSystem();
		
		int CPUTest = CPUInput.getCPUInput();
		
		assertEquals(1, CPUTest);
		
		
		
	}
	
	
	
	

}
