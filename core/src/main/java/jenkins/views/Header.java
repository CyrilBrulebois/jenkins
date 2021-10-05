package jenkins.views;

import hudson.ExtensionPoint;

public abstract class Header implements ExtensionPoint {
    
    /**
     * Checks if header is enabled. By default it is if installed, but the logic is deferred in the plugins.
     * @return
     */
    public abstract boolean isHeaderEnabled();
 
}
