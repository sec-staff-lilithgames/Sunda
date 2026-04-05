package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface u1 {
    static int create(int i10, int i11, int i12, int i13, int i14, int i15) {
        return i10 | i11 | i12 | i13 | i14 | i15;
    }

    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    static int getAudioOffloadSupport(int i10) {
        return i10 & 3584;
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

    static boolean isFormatSupported(int i10, boolean z10) {
        int formatSupport = getFormatSupport(i10);
        if (formatSupport != 4) {
            return z10 && formatSupport == 3;
        }
        return true;
    }

    String getName();

    int getTrackType();

    int supportsFormat(io.bidmachine.media3.common.b bVar) throws a0;

    int supportsMixedMimeTypeAdaptation() throws a0;

    static int create(int i10) {
        return create(i10, 0, 0, 0);
    }

    static int create(int i10, int i11, int i12) {
        return create(i10, i11, i12, 0, 128, 0);
    }

    static int create(int i10, int i11, int i12, int i13) {
        return create(i10, i11, i12, 0, 128, i13);
    }

    static int create(int i10, int i11, int i12, int i13, int i14) {
        return create(i10, i11, i12, i13, i14, 0);
    }

    default void clearListener() {
    }

    default void setListener(t1 t1Var) {
    }
}
