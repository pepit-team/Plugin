package org.pepit.plugin;

import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;

public interface Interface {
	
	/**
	 * Return plugin metadata. 
	 * @return Metadata
	 */
	public Info getInfo();
	
	/**
	 * Return a layout to display a presentation of the plugin
	 * (an image and one line of text for instance).
	 * @param ctx Current Context
	 * @param rootResource Root directory for resources
	 * @return Layout to display
	 */
	public LinearLayout getExercisePresentationLayout(Context ctx,
			File rootResource);

	/**
	 * Return the exercises for the plugin.
	 * @return Exercises list
	 */
	public String[] getExerciseList();

	/**
	 * Return a layout to display an explanation of the plugin
	 * (how to play in one screen).
	 * @param ctx Current Context
	 * @param rootResource Root directory for resources
	 * @param selectedExercise Number of selected exercise
	 * @return Layout to display
	 */
	public LinearLayout getExplanationPresentationLayout(Context ctx,
			File rootResource, int selectedExercise);

	/**
	 * Return the modules for an exercise.
	 * @param exercise Number of exercise
	 * @return Modules list
	 */
	public String[] getModuleList(int exercise);

	/**
	 * Return a layout to display one question.
	 * @param ctx Current Context
	 * @param act Current Activity
	 * @param rootResource Root directory for resources
	 * @param selectedExercise Number of selected exercise
	 * @param selectedModule Number of selected module
	 * @param numQuestion Number of question
	 * @return Layout to display
	 */
	public LinearLayout getQuestionLayout(Context ctx, Activity act,
			File rootResource, int selectedExercise, int selectedModule,
			int numQuestion);
	
	/**
	 * Return the number of question(s) for an exercise and a module.
	 * @param selectedExercise Number of selected exercise
	 * @param selectedModule Number of selected module
	 * @return Number of question(s)
	 */
	public int getNbQuestion(int selectedExercise, int selectedModule);
	
	/**
	 * Method called before starting a sequence of questions.
	 */
	public void startQuestionSequence();
	
	/**
	 * Method called after the end of a sequence of questions.
	 */
	public void finishQuestionSequence();
	
	/**
	 * Text to display in the "Next question" button.
	 * @return Text
	 */
	public String getNextQuestionButtonText();
	
	/**
	 * Return the current global score for the plugin.
	 * @return Score
	 */
	public int getScore();
}
