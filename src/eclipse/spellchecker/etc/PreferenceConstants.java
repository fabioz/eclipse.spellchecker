/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Guven Demir <guven.internet+eclipse@gmail.com> - [package explorer] Alternative package name shortening: abbreviation - https://bugs.eclipse.org/bugs/show_bug.cgi?id=299514
 *******************************************************************************/
package eclipse.spellchecker.etc;

import java.util.Locale;

import org.eclipse.jface.preference.IPreferenceStore;

import eclipse.spellchecker.Activator;
import eclipse.spellchecker.SpellCheckEngine;



/**
 * Preference constants used in the JDT-UI preference store. Clients should only read the
 * JDT-UI preference store using these values. Clients are not allowed to modify the
 * preference store programmatically.
 * <p>
 * This class it is not intended to be instantiated or subclassed by clients.
 * </p>
 *
 * @since 2.0
 *
 * @noinstantiate This class is not intended to be instantiated by clients.
 * @noextend This class is not intended to be subclassed by clients.
  */
public class PreferenceConstants {

	/**
	 * A named preference that controls whether Java comments should be
	 * spell checked.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @deprecated since 3.1, use {@link org.eclipse.ui.texteditor.spelling.SpellingService#PREFERENCE_SPELLING_ENABLED}
	 *             and {@link org.eclipse.ui.texteditor.spelling.SpellingService#PREFERENCE_SPELLING_ENGINE}
	 * @since 3.0
	 */
	public final static String SPELLING_CHECK_SPELLING= "spelling_check_spelling"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether words containing digits should
	 * be skipped during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_IGNORE_DIGITS= "spelling_ignore_digits"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether mixed case words should be
	 * skipped during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_IGNORE_MIXED= "spelling_ignore_mixed"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether sentence capitalization should
	 * be ignored during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_IGNORE_SENTENCE= "spelling_ignore_sentence"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether upper case words should be
	 * skipped during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_IGNORE_UPPER= "spelling_ignore_upper"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether URLs should be ignored during
	 * spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_IGNORE_URLS= "spelling_ignore_urls"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether single letters
	 * should be ignored during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.3
	 */
	public final static String SPELLING_IGNORE_SINGLE_LETTERS= "spelling_ignore_single_letters"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether '&' in
	 * Java properties files are ignored.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.3
	 */
	public final static String SPELLING_IGNORE_AMPERSAND_IN_PROPERTIES= "spelling_ignore_ampersand_in_properties"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether non-letters at word boundaries
	 * should be ignored during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.3
	 */
	public final static String SPELLING_IGNORE_NON_LETTERS= "spelling_ignore_non_letters"; //$NON-NLS-1$

	/**
	 * A named preference that controls whether Java strings
	 * should be ignored during spell checking.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.4
	 */
	public static final String SPELLING_IGNORE_JAVA_STRINGS= "spelling_ignore_java_strings"; //$NON-NLS-1$;

	/**
	 * A named preference that controls the locale used for spell checking.
	 * <p>
	 * Value is of type <code>String</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_LOCALE= "spelling_locale"; //$NON-NLS-1$

	/**
	 * A named preference that controls the number of proposals offered during
	 * spell checking.
	 * <p>
	 * Value is of type <code>Integer</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_PROPOSAL_THRESHOLD= "spelling_proposal_threshold"; //$NON-NLS-1$

	/**
	 * A named preference that controls the maximum number of problems reported during spell checking.
	 * <p>
	 * Value is of type <code>Integer</code>.
	 * </p>
	 *
	 * @since 3.4
	 */
	public final static String SPELLING_PROBLEMS_THRESHOLD= "spelling_problems_threshold"; //$NON-NLS-1$

	/**
	 * A named preference that specifies the workspace user dictionary.
	 * <p>
	 * Value is of type <code>Integer</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_USER_DICTIONARY= "spelling_user_dictionary"; //$NON-NLS-1$

	/**
	 * A named preference that specifies encoding of the workspace user dictionary.
	 * <p>
	 * Value is of type <code>String</code>.
	 * </p>
	 *
	 * @since 3.3
	 */
	public final static String SPELLING_USER_DICTIONARY_ENCODING= "spelling_user_dictionary_encoding"; //$NON-NLS-1$

	/**
	 * A named preference that specifies whether spelling dictionaries are available to content assist.
	 *
	 * <strong>Note:</strong> This is currently not supported because the spelling engine
	 * cannot return word proposals but only correction proposals.
	 * <p>
	 * Value is of type <code>Boolean</code>.
	 * </p>
	 *
	 * @since 3.0
	 */
	public final static String SPELLING_ENABLE_CONTENTASSIST= "spelling_enable_contentassist"; //$NON-NLS-1$

	private PreferenceConstants() {
	}

	public static IPreferenceStore getPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	/**
	 * Initializes the given preference store with the default values.
	 *
	 * @param store the preference store to be initialized
	 *
	 * @since 2.1
	 */
	public static void initializeDefaultValues(IPreferenceStore store) {
		// spell checking
		store.setDefault(PreferenceConstants.SPELLING_LOCALE, "en_US"); //$NON-NLS-1$
		String isInitializedKey= "spelling_locale_initialized"; //$NON-NLS-1$
		if (!store.getBoolean(isInitializedKey)) {
			store.setValue(isInitializedKey, true);
			Locale locale= SpellCheckEngine.getDefaultLocale();
			locale= SpellCheckEngine.findClosestLocale(locale);
			if (locale != null)
				store.setValue(PreferenceConstants.SPELLING_LOCALE, locale.toString());
		}
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_DIGITS, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_MIXED, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_SENTENCE, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_UPPER, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_URLS, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_SINGLE_LETTERS, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_AMPERSAND_IN_PROPERTIES, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_NON_LETTERS, true);
		store.setDefault(PreferenceConstants.SPELLING_IGNORE_JAVA_STRINGS, true);
		store.setDefault(PreferenceConstants.SPELLING_USER_DICTIONARY, ""); //$NON-NLS-1$

		// Note: For backwards compatibility we must use the property and not the workspace default
		store.setDefault(PreferenceConstants.SPELLING_USER_DICTIONARY_ENCODING, System.getProperty("file.encoding")); //$NON-NLS-1$

		store.setDefault(PreferenceConstants.SPELLING_PROPOSAL_THRESHOLD, 20);
		store.setDefault(PreferenceConstants.SPELLING_PROBLEMS_THRESHOLD, 100);
		/*
		 * XXX: This is currently disabled because the spelling engine
		 * cannot return word proposals but only correction proposals.
		 */
		store.setToDefault(PreferenceConstants.SPELLING_ENABLE_CONTENTASSIST);

	}
}

