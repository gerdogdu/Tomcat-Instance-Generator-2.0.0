package com.managecat.instance.generator.knowledgebase;

/**
 * ReplacementDefinitions
 *
 * Created by schenkje on 2/22/2017.
 */
public final class ReplacementDefinitions {
    /**
     * Do not Allow Instantiation of this Object.
     */
    private ReplacementDefinitions(){}

    /**
     * Replacement Tag Names used throughout for replacing
     * Text with customized or established Value.
     */

    public static final String TOMCAT_INSTANCE_UUID_TAG = "${TOMCAT_INSTANCE_UUID}";
    public static final String TOMCAT_INSTANCE_NAME_TAG = "${TOMCAT_INSTANCE_NAME}";
    public static final String TOMCAT_INSTANCE_HOSTNAME_TAG = "${TOMCAT_INSTANCE_HOSTNAME}";
    public static final String TOMCAT_ENVIRONMENT_NAME_TAG = "${TOMCAT_ENVIRONMENT_NAME}";
    public static final String TOMCAT_VERSION_TAG = "${TOMCAT_VERSION}";

    public static final String TOMCAT_PRIMARY_PORT_TAG = "${TOMCAT_PRIMARY_PORT}";
    public static final String TOMCAT_PRIMARY_PORT_PROTOCOL_TAG = "${TOMCAT_PRIMARY_PORT_PROTOCOL}";

    public static final String TOMCAT_SHUTDOWN_PORT_TAG = "${TOMCAT_SHUTDOWN_PORT}";
    public static final String TOMCAT_AJP_PORT_TAG = "${TOMCAT_AJP_PORT}";

    public static final String TOMCAT_DEBUG_PORT_TAG = "${TOMCAT_DEBUG_PORT}";

    public static final String TOMCAT_SECURE_PORT_TAG = "${TOMCAT_SECURE_PORT}";
    public static final String TOMCAT_SECURE_PORT_PROTOCOL_TAG = "${TOMCAT_SECURE_PORT_PROTOCOL}";
    public static final String TOMCAT_KEYSTORE_TAG = "${TOMCAT_KEYSTORE}";
    public static final String TOMCAT_KEYSTORE_CREDENTIALS_TAG = "${TOMCAT_KEYSTORE_CREDENTIALS}";

    public static final String TOMCAT_JVM_OPTIONS = "${JVM_OPTS}";
    public static final String TOMCAT_INSTANCE_PROPERTIES = "${INSTANCE_PROPERTIES}";
    public static final String TOMCAT_INSTANCE_MANAGEMENT_PROPERTIES = "${INSTANCE_MANAGEMENT_PROPERTIES}";

    public static final String MANAGECAT_LICENSE_KEY_TAG = "${MANAGECAT_LICENSE_KEY_TAG}";

    public static final String REPLACEMENT_UPGRADE_VERSION_TAG = "${REPLACEMENT_UPGRADE_VERSION}";

}
