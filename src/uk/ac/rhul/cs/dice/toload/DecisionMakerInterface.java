package uk.ac.rhul.cs.dice.toload;

import java.util.List;

import uk.ac.rhul.cs.dice.gawl.interfaces.actions.Action;
import uk.ac.rhul.cs.dice.gawl.interfaces.actions.speech.SpeechWrapper;
import uk.ac.rhul.cs.dice.gawl.interfaces.perception.Perception;

/**
 * This interface is the prototype that wil be given to students.
 * 
 * @author cloudstrife9999, a.k.a. Emanuele Uliana.
 *
 */
public interface DecisionMakerInterface {	
	public void updateAvailableActions(List<Action> availableActions);
	public void updatePerception(Perception perception);
	public void updateReceivedSpeeches(List<SpeechWrapper> speeches);
	public Action decide();
}