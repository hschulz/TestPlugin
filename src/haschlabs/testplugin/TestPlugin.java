
package haschlabs.testplugin;

import haschlabs.pluginapplication.api.plugin.SpecificPlugin;
import haschlabs.pluginapplication.ImplPluginManager;
import haschlabs.pluginmanager.interfaces.PluginManager;

/**
 * This is an example implementation of the PluginManager Plugin interface.
 *
 * @author Hauke Schulz <hauke27@googlemail.com>
 */
public class TestPlugin implements SpecificPlugin {

    /**
     * The manager for this plugin.
     */
    private ImplPluginManager manager = null;

    /**
     * Name of this plugin.
     */
    private String name = "";

    /**
     * The verseion of this plugin.
     */
    private String version = "";

    /**
     * The target version for the application this plugin was written for.
     */
    private String appVersion = "";

    /**
     * An array of authors.
     */
    private String[] authors = new String[1];

    /**
     * A description of this plugin.
     */
    private String description = "";

    /**
     * Initializes the plugin with the default values.
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     */
    public TestPlugin() {
        this.manager = null;
        this.name = "TestPlugin";
        this.version = "0.0.1";
        this.appVersion = "0.0.1";
        this.authors = new String[] {"Hauke Schulz <hauke27@googlemail.com>"};
        this.description = "This plugin is used for testing only.";
    }

    @Override
    public String specificMethod() {
        return "This is a reference implementation.";
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @param manager
     */
    @Override
    public void setPluginManager(PluginManager manager) {
        if (manager instanceof ImplPluginManager) {
            this.manager = (ImplPluginManager) manager;
        }
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public PluginManager getPluginManager() {
        return this.manager;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public boolean start() {
        if (this.manager != null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public boolean stop() {
        if (this.manager != null) {
            return true;
        }
        return false;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String toString() {
        return this.getClass().getName();
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String getApplicationVersion() {
        return this.appVersion;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     *
     * @author Hauke Schulz <hauke27@googlemail.com>
     * @return
     */
    @Override
    public String[] getAuthors() {
        return this.authors;
    }
}
