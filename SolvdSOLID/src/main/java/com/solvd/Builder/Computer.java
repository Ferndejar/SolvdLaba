package com.solvd.Builder;

public class Computer {

    //Product

    private String CPU;
    private String GPU;
    private String RAM;

    private String storage;

    private boolean isRtxEnabled;
    private boolean isRgbEnabled;

    public boolean isRtxEnabled() {
        return isRtxEnabled;
    }

    public boolean isRgbEnabled() {
        return isRgbEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isRtxEnabled = builder.isRtxEnabled;
        this.isRgbEnabled = builder.isRgbEnabled;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + storage + '\'' +
                '}';
    }


    public static class ComputerBuilder {


        private boolean isRtxEnabled;
        private boolean isRgbEnabled;

        private String CPU;
        private String GPU;
        private String RAM;
        private String storage;

        public boolean isRtxEnabled() {
            return isRtxEnabled;
        }

        public boolean isRgbEnabled() {
            return isRgbEnabled;
        }

        public String getCPU() {
            return CPU;
        }

        public void setCPU(String CPU) {
            this.CPU = CPU;
        }

        public String getGPU() {
            return GPU;
        }

        public void setGPU(String GPU) {
            this.GPU = GPU;
        }

        public String getRAM() {
            return RAM;
        }

        public void setRAM(String RAM) {
            this.RAM = RAM;
        }

        public String getStorage() {
            return storage;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }



        public ComputerBuilder(String CPU, String GPU, String RAM, String storage) {
            this.CPU = CPU;
            this.GPU = GPU;
            this.RAM = RAM;
            this.storage = storage;
        }


        public ComputerBuilder setRtxEnabled(boolean isRtxEnabled) {
            this.isRtxEnabled= isRtxEnabled;
            return this;
        }

        public ComputerBuilder setRgbEnabled(boolean isRgbEnabled ) {
            this.isRgbEnabled = isRgbEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }
}
