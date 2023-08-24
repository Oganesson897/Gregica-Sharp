package me.oganesson.gregicas.api.utils;

import org.apache.logging.log4j.Logger;

public class GSLog {

    public static Logger logger;

    public GSLog() {}

    public static void init(Logger modLogger) {
        logger = modLogger;
    }

}
