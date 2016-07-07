package uk.ac.rhul.cs.dice.toload;

import uk.ac.rhul.cs.dice.gawl.interfaces.actions.PhysicalAction;
import uk.ac.rhul.cs.dice.gawl.interfaces.actions.Result;
import uk.ac.rhul.cs.dice.gawl.interfaces.environment.Space;
import uk.ac.rhul.cs.dice.gawl.interfaces.environment.physics.Physics;

/**
 * This is a test class for the reflection example.
 * 
 * @author cloudstrife9999, a.k.a. Emanuele Uliana.
 *
 */
public class TestAction extends PhysicalAction {

	@Override
	public boolean isPossible(Physics physics, Space context) {
		return true;
	}

	@Override
	public boolean isNecessary(Physics physics, Space context) {
		return false;
	}

	@Override
	public Result perform(Physics physics, Space context) {
		return null;
	}

	@Override
	public boolean succeeded(Physics physics, Space context) {
		return true;
	}
}