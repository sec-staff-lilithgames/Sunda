package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum w9 {
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    ERRORTYPE_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f47531b;

    w9(int i10) {
        this.f47531b = i10;
    }

    public static w9 forNumber(int i10) {
        if (i10 == 0) {
            return ERRORTYPE_NOT_SET;
        }
        if (i10 == 1) {
            return SERVER_ERROR;
        }
        if (i10 != 2) {
            return null;
        }
        return CLIENT_ERROR;
    }

    public int getNumber() {
        return this.f47531b;
    }

    @Deprecated
    public static w9 valueOf(int i10) {
        return forNumber(i10);
    }
}
