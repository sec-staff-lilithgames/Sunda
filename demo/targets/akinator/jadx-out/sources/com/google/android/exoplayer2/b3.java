package com.google.android.exoplayer2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface b3 {
    static int create(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    static int getDecoderSupport(int i10) {
        return i10 & 384;
    }

    static int getFormatSupport(int i10) {
        return i10 & 7;
    }

    static int getHardwareAccelerationSupport(int i10) {
        return i10 & 64;
    }

    static int getTunnelingSupport(int i10) {
        return i10 & 32;
    }

    String getName();

    int getTrackType();

    int supportsFormat(z0 z0Var) throws r;

    int supportsMixedMimeTypeAdaptation() throws r;

    static int create(int i10) {
        return create(i10, 0, 0);
    }

    static int create(int i10, int i11, int i12) {
        return create(i10, i11, i12, 0, 128);
    }

    default void clearListener() {
    }

    default void setListener(a3 a3Var) {
    }
}
