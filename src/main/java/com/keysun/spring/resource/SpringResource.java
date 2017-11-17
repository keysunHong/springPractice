package com.keysun.spring.resource;

import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * Created by h on 2017/11/16.
 */
public class SpringResource implements Resource {
    public boolean exists() {
        return false;
    }

    public boolean isReadable() {
        return false;
    }

    public boolean isOpen() {
        return false;
    }

    public URL getURL() throws IOException {
        return null;
    }

    public URI getURI() throws IOException {
        return null;
    }

    public File getFile() throws IOException {
        return null;
    }

    public long contentLength() throws IOException {
        return 0;
    }

    public long lastModified() throws IOException {
        return 0;
    }

    public Resource createRelative(String s) throws IOException {
        return null;
    }

    public String getFilename() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public InputStream getInputStream() throws IOException {
        return null;
    }
}
