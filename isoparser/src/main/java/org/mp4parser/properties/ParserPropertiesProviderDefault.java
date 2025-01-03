package org.mp4parser;

import java.io.InputStream;

public class ParserPropertiesProviderDefault implements ParserPropertiesProvider {
    public InputStream get() {
        return ClassLoader.getSystemResourceAsStream("isoparser2-default.properties");
    }
}