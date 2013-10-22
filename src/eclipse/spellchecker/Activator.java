package eclipse.spellchecker;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public static final String ID_PLUGIN = "eclipse.spellchecker";
	private static Activator plugin; // The shared instance.

	/**
	 * The constructor.
	 */
	public Activator() {
		super();
		plugin = this;
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This is called when the plugin is being stopped.
	 *
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		try {
			if (fDialogsFormToolkit != null) {
				fDialogsFormToolkit.dispose();
				fDialogsFormToolkit = null;
			}

		} finally {
			super.stop(context);
		}
	}

	public static Activator getDefault() {
		return plugin;
	}

	public static void logErrorMessage(String message) {
		IStatus s = new Status(IStatus.ERROR, ID_PLUGIN, message);
		plugin.getLog().log(s);
	}

	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}

	public static Shell getActiveWorkbenchShell() {
		IWorkbenchWindow window = getActiveWorkbenchWindow();
		if (window != null) {
			return window.getShell();
		}
		return null;
	}

	public static void log(Exception ex) {
		IStatus s = new Status(IStatus.ERROR, ID_PLUGIN, ex.getMessage(), ex);
		plugin.getLog().log(s);
	}

	public static void log(IStatus status) {
		plugin.getLog().log(status);
	}

	private FormToolkit fDialogsFormToolkit;

	public FormToolkit getDialogsFormToolkit() {
		if (fDialogsFormToolkit == null) {
			FormColors colors = new FormColors(Display.getCurrent());
			colors.setBackground(null);
			colors.setForeground(null);
			fDialogsFormToolkit = new FormToolkit(colors);
		}
		return fDialogsFormToolkit;
	}

	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

}
