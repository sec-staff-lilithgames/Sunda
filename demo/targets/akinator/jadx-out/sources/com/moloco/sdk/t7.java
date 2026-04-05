package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum t7 {
    MAX(3),
    LEVELPLAY(4),
    PLATFORM_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f47495b;

    t7(int i10) {
        this.f47495b = i10;
    }

    public static t7 forNumber(int i10) {
        if (i10 == 0) {
            return PLATFORM_NOT_SET;
        }
        if (i10 == 3) {
            return MAX;
        }
        if (i10 != 4) {
            return null;
        }
        return LEVELPLAY;
    }

    public int getNumber() {
        return this.f47495b;
    }

    @Deprecated
    public static t7 valueOf(int i10) {
        return forNumber(i10);
    }
}
