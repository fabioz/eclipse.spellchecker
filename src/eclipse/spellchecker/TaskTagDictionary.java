/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package eclipse.spellchecker;

import java.net.URL;

import org.eclipse.core.runtime.Preferences.IPropertyChangeListener;
import org.eclipse.core.runtime.Preferences.PropertyChangeEvent;

import eclipse.spellchecker.engine.AbstractSpellDictionary;

/**
 * Dictionary for task tags.
 *
 * @since 3.0
 */
public class TaskTagDictionary extends AbstractSpellDictionary implements IPropertyChangeListener {

	/*
	 * @see eclipse.spellchecker.engine.AbstractSpellDictionary#getName()
	 */
	@Override
	protected final URL getURL() {
		return null;
	}

	/*
	 * @see org.eclipse.jdt.ui.text.spelling.engine.AbstractSpellDictionary#load(java.net.URL)
	 */
	@Override
	protected synchronized boolean load(final URL url) {
//		Activator.getJavaCorePluginPreferences().addPropertyChangeListener(this);
		return updateTaskTags();
	}

	/*
	 * @see org.eclipse.core.runtime.Preferences.IPropertyChangeListener#propertyChange(org.eclipse.core.runtime.Preferences.PropertyChangeEvent)
	 */
	public void propertyChange(final PropertyChangeEvent event) {

//		if (JavaCore.COMPILER_TASK_TAGS.equals(event.getProperty()))
//			updateTaskTags();
	}

	/*
	 * @see org.eclipse.jdt.ui.text.spelling.engine.ISpellDictionary#unload()
	 */
	@Override
	public synchronized void unload() {
//		JavaPlugin.getJavaCorePluginPreferences().removePropertyChangeListener(this);
		super.unload();
	}

	/**
	 * Handles the compiler task tags property change event.
	 *
	 * @return  <code>true</code> if the task tags got updated
	 */
	protected boolean updateTaskTags() {
		return true;
//		final String tags= JavaCore.getOption(JavaCore.COMPILER_TASK_TAGS);
//		if (tags != null) {
//
//			unload();
//
//			final StringTokenizer tokenizer= new StringTokenizer(tags, ","); //$NON-NLS-1$
//			while (tokenizer.hasMoreTokens())
//				hashWord(tokenizer.nextToken());
//
//			return true;
//		}
//		return false;
	}

	/*
	 * @see eclipse.spellchecker.engine.AbstractSpellDictionary#stripNonLetters(java.lang.String)
	 * @since 3.3
	 */
	@Override
	protected String stripNonLetters(String word) {
		return word;
	}
}
