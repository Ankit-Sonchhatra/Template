package com.statravel.autoqa.domain.browser;

import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 
 * @author Created by STA Automation QA Team
 *
 */
public class Browser {

    private String name;
    private DesiredCapabilities capabilities;

    /**
     * @param name
     *            browser name
     * @param capabilities
     *            browser capabilities
     */
    public Browser(final String name, final DesiredCapabilities capabilities) {
        this.name = name;
        this.capabilities = capabilities;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the capabilities
     */
    public DesiredCapabilities getCapabilities() {
        return capabilities;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Browser [name=" + name + ", capabilities=" + capabilities + "]";
    }

}
