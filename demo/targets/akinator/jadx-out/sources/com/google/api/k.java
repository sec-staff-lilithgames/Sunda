package com.google.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum k {
    LINEAR_BUCKETS(1),
    EXPONENTIAL_BUCKETS(2),
    EXPLICIT_BUCKETS(3),
    OPTIONS_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f29650b;

    k(int i10) {
        this.f29650b = i10;
    }

    public static k forNumber(int i10) {
        if (i10 == 0) {
            return OPTIONS_NOT_SET;
        }
        if (i10 == 1) {
            return LINEAR_BUCKETS;
        }
        if (i10 == 2) {
            return EXPONENTIAL_BUCKETS;
        }
        if (i10 != 3) {
            return null;
        }
        return EXPLICIT_BUCKETS;
    }

    public int getNumber() {
        return this.f29650b;
    }

    @Deprecated
    public static k valueOf(int i10) {
        return forNumber(i10);
    }
}
