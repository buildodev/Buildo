package com.buildo.application.build.gpu;

public class Graphics {
    private String name;
    private String imageURL;
    private String desc;
    private int coreClock;
    private int boostClock;
    private String architecture;
    private int memory;
    private int memorySpeed;
    private int memoryBus;
    private int memoryType;
    private float memoryBandwidth;
    private int cacheL2;
    private int technology;
    private int TMU;
    private int textureRate;
    private int ROP;
    private int pixelRate;
    private int SPU;
    private float directX;
    private float shader;
    private float openGL;
    private int maxResolutionWidth;
    private int maxResolutionHeight;
    private int maxPower;
    private String psu;
    private int pin4;
    private int pin6;
    private int pin8;
    private boolean notebookGPU;
    private boolean sli_crossfire;
    private boolean dedicated;
    private boolean integrated;
    private int vga;
    private int dvi;
    private int hdmi;
    private int displayPort;
    private String bestCPU;
    private int bestRAM;

    public Graphics() {
    }

    public int getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(int memoryType) {
        this.memoryType = memoryType;
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

    public int getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(int coreClock) {
        this.coreClock = coreClock;
    }

    public int getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(int boostClock) {
        this.boostClock = boostClock;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemorySpeed() {
        return memorySpeed;
    }

    public void setMemorySpeed(int memorySpeed) {
        this.memorySpeed = memorySpeed;
    }

    public int getMemoryBus() {
        return memoryBus;
    }

    public void setMemoryBus(int memoryBus) {
        this.memoryBus = memoryBus;
    }

    public float getMemoryBandwidth() {
        return memoryBandwidth;
    }

    public void setMemoryBandwidth(float memoryBandwidth) {
        this.memoryBandwidth = memoryBandwidth;
    }

    public int getCacheL2() {
        return cacheL2;
    }

    public void setCacheL2(int cacheL2) {
        this.cacheL2 = cacheL2;
    }

    public int getTechnology() {
        return technology;
    }

    public void setTechnology(int technology) {
        this.technology = technology;
    }

    public int getTMU() {
        return TMU;
    }

    public void setTMU(int TMU) {
        this.TMU = TMU;
    }

    public int getTextureRate() {
        return textureRate;
    }

    public void setTextureRate(int textureRate) {
        this.textureRate = textureRate;
    }

    public int getROP() {
        return ROP;
    }

    public void setROP(int ROP) {
        this.ROP = ROP;
    }

    public int getPixelRate() {
        return pixelRate;
    }

    public void setPixelRate(int pixelRate) {
        this.pixelRate = pixelRate;
    }

    public int getSPU() {
        return SPU;
    }

    public void setSPU(int SPU) {
        this.SPU = SPU;
    }

    public float getDirectX() {
        return directX;
    }

    public void setDirectX(float directX) {
        this.directX = directX;
    }

    public float getShader() {
        return shader;
    }

    public void setShader(float shader) {
        this.shader = shader;
    }

    public float getOpenGL() {
        return openGL;
    }

    public void setOpenGL(float openGL) {
        this.openGL = openGL;
    }

    public int getMaxResolutionWidth() {
        return maxResolutionWidth;
    }

    public void setMaxResolutionWidth(int maxResolutionWidth) {
        this.maxResolutionWidth = maxResolutionWidth;
    }

    public int getMaxResolutionHeight() {
        return maxResolutionHeight;
    }

    public void setMaxResolutionHeight(int maxResolutionHeight) {
        this.maxResolutionHeight = maxResolutionHeight;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public int getPin4() {
        return pin4;
    }

    public void setPin4(int pin4) {
        this.pin4 = pin4;
    }

    public int getPin6() {
        return pin6;
    }

    public void setPin6(int pin6) {
        this.pin6 = pin6;
    }

    public int getPin8() {
        return pin8;
    }

    public void setPin8(int pin8) {
        this.pin8 = pin8;
    }

    public boolean isNotebookGPU() {
        return notebookGPU;
    }

    public void setNotebookGPU(boolean notebookGPU) {
        this.notebookGPU = notebookGPU;
    }

    public boolean isSli_crossfire() {
        return sli_crossfire;
    }

    public void setSli_crossfire(boolean sli_crossfire) {
        this.sli_crossfire = sli_crossfire;
    }

    public boolean isDedicated() {
        return dedicated;
    }

    public void setDedicated(boolean dedicated) {
        this.dedicated = dedicated;
    }

    public boolean isIntegrated() {
        return integrated;
    }

    public void setIntegrated(boolean integrated) {
        this.integrated = integrated;
    }

    public int getVga() {
        return vga;
    }

    public void setVga(int vga) {
        this.vga = vga;
    }

    public int getDvi() {
        return dvi;
    }

    public void setDvi(int dvi) {
        this.dvi = dvi;
    }

    public int getHdmi() {
        return hdmi;
    }

    public void setHdmi(int hdmi) {
        this.hdmi = hdmi;
    }

    public int getDisplayPort() {
        return displayPort;
    }

    public void setDisplayPort(int displayPort) {
        this.displayPort = displayPort;
    }

    public String getBestCPU() {
        return bestCPU;
    }

    public void setBestCPU(String bestCPU) {
        this.bestCPU = bestCPU;
    }

    public int getBestRAM() {
        return bestRAM;
    }

    public void setBestRAM(int bestRAM) {
        this.bestRAM = bestRAM;
    }
}
