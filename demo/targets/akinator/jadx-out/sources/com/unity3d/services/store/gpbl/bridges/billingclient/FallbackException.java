package com.unity3d.services.store.gpbl.bridges.billingclient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FallbackException extends Exception {
    private final int detectedVersion;

    public FallbackException(int i10) {
        this.detectedVersion = i10;
    }

    public final int getDetectedVersion() {
        return this.detectedVersion;
    }
}
