package uk.ac.rhul.cs.dice.toload;

import java.util.List;

import uk.ac.rhul.cs.dice.gawl.interfaces.actions.Action;
import uk.ac.rhul.cs.dice.gawl.interfaces.actions.speech.SpeechWrapper;
import uk.ac.rhul.cs.dice.gawl.interfaces.perception.Perception;

/**
 * This class is what the students will need to write.
 * 
 * @author cloudstrife9999 a.k.a. Emanuele Uliana.
 *
 */
public class DecisionMaker implements DecisionMakerInterface {
	private List<Action> availableActions;
	private Perception perception;
	private List<SpeechWrapper> speeches;
	
	@Override
	public void updateAvailableActions(List<Action> availableActions) {
		this.availableActions = availableActions; //example of what the students should do: storing the available actions list.
	}
	
	@Override
	public void updatePerception(Perception perception) {
		this.perception = perception; //example of what the students should do: storing the speeches list.
	}
	
	@Override
	public void updateReceivedSpeeches(List<SpeechWrapper> speeches) {
		this.speeches = speeches; //example of what the students should do: storing the perception.
	}
	
	@Override
	public Action decide() {
		/*Here the students should use this.availableActions, this.perception and this.speeches to decide the next action.
		  We can add a jar containing the vacuumworld action classes, the SpeechWrapper class and the VacuumWorldPerception class
		  as a dependency, so that the students will have everything needed to write their code.*/
		
		return new TestAction();
	}
}	