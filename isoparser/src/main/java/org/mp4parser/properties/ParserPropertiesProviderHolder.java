package org.mp4parser;

class ParserPropertiesProviderHolder {
    /**
     * The consumer of this library needs to set this up
     * in the way that works on the platform being used.
     * On Android that's via the assets directory.
     */
    public static ParserPropertiesProvider get = new ParserPropertiesProviderDefault();
}