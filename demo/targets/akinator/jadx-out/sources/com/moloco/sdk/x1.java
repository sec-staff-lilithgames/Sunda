package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum x1 {
    TITLE(3),
    IMG(4),
    VIDEO(5),
    DATA(6),
    ASSETONEOF_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f47546b;

    x1(int i10) {
        this.f47546b = i10;
    }

    public static x1 forNumber(int i10) {
        if (i10 == 0) {
            return ASSETONEOF_NOT_SET;
        }
        if (i10 == 3) {
            return TITLE;
        }
        if (i10 == 4) {
            return IMG;
        }
        if (i10 == 5) {
            return VIDEO;
        }
        if (i10 != 6) {
            return null;
        }
        return DATA;
    }

    public int getNumber() {
        return this.f47546b;
    }

    @Deprecated
    public static x1 valueOf(int i10) {
        return forNumber(i10);
    }
}
