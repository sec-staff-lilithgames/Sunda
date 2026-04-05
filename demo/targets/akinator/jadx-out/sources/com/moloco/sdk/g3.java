package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum g3 {
    REQUEST(1),
    REQUEST_NATIVE(50),
    REQUESTONEOF_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f45797b;

    g3(int i10) {
        this.f45797b = i10;
    }

    public static g3 forNumber(int i10) {
        if (i10 == 0) {
            return REQUESTONEOF_NOT_SET;
        }
        if (i10 == 1) {
            return REQUEST;
        }
        if (i10 != 50) {
            return null;
        }
        return REQUEST_NATIVE;
    }

    public int getNumber() {
        return this.f45797b;
    }

    @Deprecated
    public static g3 valueOf(int i10) {
        return forNumber(i10);
    }
}
