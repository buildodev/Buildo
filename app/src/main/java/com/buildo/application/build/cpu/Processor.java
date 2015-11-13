package com.buildo.application.build.cpu;

public class Processor {
    private String name;
    private String imageURL;
    private String desc;
    private float cpuClock;
    private float turboClock;
    private int cores;
    private int threads;
    private String codename;
    private int tdp;
    private int lithography;
    private String socket;
    private String productURL;
    private String bitWidth;
    private int maxTemp;
    private int memChannels;
    private int maxMemory;
    private String processorGPU;
    private boolean notebookCPU;
    private boolean unlocked;
    private int cacheL1;
    private int cacheL2;
    private int cacheL3;

    public Processor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getCpuClock() {
        return cpuClock;
    }

    public void setCpuClock(float cpuClock) {
        this.cpuClock = cpuClock;
    }

    public float getTurboClock() {
        return turboClock;
    }

    public void setTurboClock(float turboClock) {
        this.turboClock = turboClock;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public int getLithography() {
        return lithography;
    }

    public void setLithography(int lithography) {
        this.lithography = lithography;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }

    public String getBitWidth() {
        return bitWidth;
    }

    public void setBitWidth(String bitWidth) {
        this.bitWidth = bitWidth;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMemChannels() {
        return memChannels;
    }

    public void setMemChannels(int memChannels) {
        this.memChannels = memChannels;
    }

    public int getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(int maxMemory) {
        this.maxMemory = maxMemory;
    }

    public String getProcessorGPU() {
        return processorGPU;
    }

    public void setProcessorGPU(String processorGPU) {
        this.processorGPU = processorGPU;
    }

    public boolean isNotebookCPU() {
        return notebookCPU;
    }

    public void setNotebookCPU(boolean notebookCPU) {
        this.notebookCPU = notebookCPU;
    }

    public boolean isUnlocked() {
        return unlocked;
    }

    public void setUnlocked(boolean unlocked) {
        this.unlocked = unlocked;
    }

    public int getCacheL1() {
        return cacheL1;
    }

    public void setCacheL1(int cacheL1) {
        this.cacheL1 = cacheL1;
    }

    public int getCacheL2() {
        return cacheL2;
    }

    public void setCacheL2(int cacheL2) {
        this.cacheL2 = cacheL2;
    }

    public int getCacheL3() {
        return cacheL3;
    }

    public void setCacheL3(int cacheL3) {
        this.cacheL3 = cacheL3;
    }
}
