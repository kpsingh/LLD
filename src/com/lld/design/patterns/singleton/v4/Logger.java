package com.lld.design.patterns.singleton.v4;

import java.util.concurrent.Callable;

public class Logger implements Callable<Logger> {
    private static Logger loggerInstance = null;

    private Logger() {

    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            synchronized (Logger.class) {
                if (loggerInstance == null) {
                    loggerInstance = new Logger();
                }
            }
        }
        return loggerInstance;
    }

    @Override
    public Logger call() throws Exception {
        return loggerInstance;
    }
}
