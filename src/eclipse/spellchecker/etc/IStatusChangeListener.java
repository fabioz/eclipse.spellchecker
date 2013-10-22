package eclipse.spellchecker.etc;

import org.eclipse.core.runtime.IStatus;

public interface IStatusChangeListener {

	/**
	 * Notifies this listener that the given status has changed.
	 *
	 * @param	status	the new status
	 */
	void statusChanged(IStatus status);
}
