package com.sunda.demo;

final class NativeScanner {
    static {
        System.loadLibrary("demo_scan");
    }

    private NativeScanner() {
    }

    static native String runScan(String reason);

    static native String runCalibration(String reason);
}
