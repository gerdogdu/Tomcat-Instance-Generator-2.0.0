package com.managecat.instance.generator.processors;

import com.managecat.instance.generator.model.TomcatInstance;

/**
 * TomcatInstanceProcess
 * 
 * Created by schenkje on 2/20/2017.
 */
public interface TomcatInstanceProcess {

    boolean performProcess(TomcatInstance tomcatInstance);
}
