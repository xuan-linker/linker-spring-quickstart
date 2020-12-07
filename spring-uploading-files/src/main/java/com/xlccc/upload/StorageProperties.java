package com.xlccc.upload;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Linker
 * @date 2020/12/7 10:59
 * @description：
 */

@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
