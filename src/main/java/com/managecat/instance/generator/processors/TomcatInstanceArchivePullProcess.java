package com.managecat.instance.generator.processors;

import com.managecat.instance.generator.model.TomcatAvailableArchives;
import com.managecat.instance.generator.model.TomcatInstance;
import com.managecat.instance.generator.util.TomcatArchiveUtility;
import org.slf4j.Logger;

/**
 * TomcatInstanceGeneratorProcess
 *
 * Drives the Tomcat Instance Generation from a Command Line Interface.
 * 
 * Created by schenkje on 9/10/2018.
 */
public class TomcatInstanceArchivePullProcess extends TomcatInstanceProcessBase {
    /**
     * Primary Logger for Generation utility ...
     */
    private final Logger LOGGER;
    /**
     * YAML Configuration Files to be Read.
     */
    private final String[] overrides;

    /**
     * Default Constructor
     */
    public TomcatInstanceArchivePullProcess(Logger LOGGER, String[] overrides) {
        this.LOGGER = LOGGER;
        this.overrides = overrides;
    }

    /**
     * Perform the Pull process of Newer Versions to replace our existing Knowledge Base.
     * @param tomcatInstance -- Reference is Ignored if Null.
     */
    @Override
    public boolean performProcess(TomcatInstance tomcatInstance) {
        try {
            TomcatAvailableArchives tomcatAvailableArchives = TomcatArchiveUtility.resolveApacheMirror();
            TomcatArchiveUtility.getLatest(LOGGER, tomcatAvailableArchives);
            showAvailableArchives(tomcatAvailableArchives);
            return true;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(),e);
            return false;
        }
    }

}
