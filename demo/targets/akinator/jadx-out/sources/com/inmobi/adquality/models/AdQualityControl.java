package com.inmobi.adquality.models;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class AdQualityControl {
    private String beacon;
    private boolean enableSdkAdQuality;
    private float screenshotDelayInSeconds;
    private boolean takeScreenshot;

    public final String getBeacon() {
        return this.beacon;
    }

    public final boolean getEnableSdkAdQuality() {
        return this.enableSdkAdQuality;
    }

    public final float getScreenshotDelayInSeconds() {
        return this.screenshotDelayInSeconds;
    }

    public final boolean getTakeScreenshot() {
        return this.takeScreenshot;
    }

    public final void setBeacon(String str) {
        this.beacon = str;
    }

    public final void setEnableSdkAdQuality(boolean z10) {
        this.enableSdkAdQuality = z10;
    }

    public final void setScreenshotDelayInSeconds(float f10) {
        this.screenshotDelayInSeconds = f10;
    }

    public final void setTakeScreenshot(boolean z10) {
        this.takeScreenshot = z10;
    }
}
