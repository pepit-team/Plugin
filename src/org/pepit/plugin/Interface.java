/**
 * @file org/pepit/plugin/Interface.java
 * 
 * PepitMobil: an educational software
 * This file is a part of the PepitMobil environment
 * http://pepit.be
 *
 * Copyright (C) 2012-2013 Pepit Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.pepit.plugin;

import android.content.Context;
import android.widget.LinearLayout;

public interface Interface {

	/**
	 * Return plugin metadata.
	 * 
	 * @return Metadata
	 */
	public Info getInfo();

	/**
	 * Return a layout to display a presentation of the plugin (an image and one
	 * line of text for instance).
	 * 
	 * @param ctx
	 *            Current Context
	 * @return Layout to display
	 */
	public LinearLayout getExercisePresentationLayout(Context ctx);

	/**
	 * Return the exercises for the plugin.
	 * 
	 * @return Exercises list
	 */
	public String[] getExerciseList();

	/**
	 * Return a layout to display an explanation of the plugin (how to play in
	 * one screen).
	 * 
	 * @param ctx
	 *            Current Context
	 * @param selectedExercise
	 *            Number of selected exercise
	 * @return Layout to display
	 */
	public LinearLayout getExplanationPresentationLayout(Context ctx,
			int selectedExercise);

	/**
	 * Return the modules for an exercise.
	 * 
	 * @param exercise
	 *            Number of exercise
	 * @return Modules list
	 */
	public String[] getModuleList(int exercise);

	/**
	 * Return a layout to display one question.
	 * 
	 * @param ctx
	 *            Current Context
	 * @param selectedExercise
	 *            Number of selected exercise
	 * @param selectedModule
	 *            Number of selected module
	 * @param numQuestion
	 *            Number of question
	 * @return Layout to display
	 */
	public LinearLayout getQuestionLayout(Context ctx, int selectedExercise,
			int selectedModule, int numQuestion);

	/**
	 * Return the number of question(s) for an exercise and a module.
	 * 
	 * @param selectedExercise
	 *            Number of selected exercise
	 * @param selectedModule
	 *            Number of selected module
	 * @return Number of question(s)
	 */
	public int getQuestionCount(int selectedExercise, int selectedModule);

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
	 * 
	 * @return Text
	 */
	public String getNextQuestionButtonText();

	/**
	 * Check if the current answer is the right one.
	 * 
	 * @return TRUE if right
	 */
	public boolean currentAnswerIsRight();

	/**
	 * Ask the plugin to show to the user that her current answer is right.
	 */
	public void showAnswerIsRight();

	/**
	 * Ask the plugin to show to the user that her current answer is wrong.
	 */
	public void showAnswerIsWrong();

	/**
	 * Return the current global score for the plugin.
	 * 
	 * @return Score
	 */
	public int getScore();
}
