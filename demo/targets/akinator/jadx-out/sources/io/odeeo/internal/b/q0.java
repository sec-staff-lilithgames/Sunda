package io.odeeo.internal.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface q0 {
    static int create(int i10, int i11, int i12) {
        return i10 | i11 | i12;
    }

    static int getAdaptiveSupport(int i10) {
        return i10 & 24;
    }

    static int getFormatSupport(int i10) {
        return i10 & 7;
    }

    static int getTunnelingSupport(int i10) {
        return i10 & 32;
    }

    String getName();

    int getTrackType();

    int supportsFormat(t tVar) throws n;

    int supportsMixedMimeTypeAdaptation() throws n;

    static int create(int i10) {
        return create(i10, 0, 0);
    }
}
