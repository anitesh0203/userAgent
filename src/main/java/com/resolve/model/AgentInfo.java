package com.resolve.model;

public class AgentInfo {

    private String manufacturer;
    private String brand;
    private String model;
    private String browser;
    private String version;
    private String lastUsed;

    public AgentInfo() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }

    @Override
    public String toString() {
        return "AgentInfo{" +
                "manufacturer='" + manufacturer + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", browser='" + browser + '\'' +
                ", version='" + version + '\'' +
                ", lastUsed='" + lastUsed + '\'' +
                '}';
    }
}



