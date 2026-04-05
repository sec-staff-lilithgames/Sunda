package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum ca {
    SUCCESS(1),
    FAILURE(2),
    INITSTATUS_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f45691b;

    ca(int i10) {
        this.f45691b = i10;
    }

    public static ca forNumber(int i10) {
        if (i10 == 0) {
            return INITSTATUS_NOT_SET;
        }
        if (i10 == 1) {
            return SUCCESS;
        }
        if (i10 != 2) {
            return null;
        }
        return FAILURE;
    }

    public int getNumber() {
        return this.f45691b;
    }

    @Deprecated
    public static ca valueOf(int i10) {
        return forNumber(i10);
    }
}
