package com.moloco.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum za {
    IMP_INTERACTION(100),
    CLICK_INTERACTION(101),
    APP_FOREGROUNDING_INTERACTION(102),
    APP_BACKGROUNDING_INTERACTION(103),
    INFOEXT_NOT_SET(0);


    /* renamed from: b, reason: collision with root package name */
    public final int f50342b;

    za(int i10) {
        this.f50342b = i10;
    }

    public static za forNumber(int i10) {
        if (i10 == 0) {
            return INFOEXT_NOT_SET;
        }
        switch (i10) {
            case 100:
                return IMP_INTERACTION;
            case 101:
                return CLICK_INTERACTION;
            case 102:
                return APP_FOREGROUNDING_INTERACTION;
            case 103:
                return APP_BACKGROUNDING_INTERACTION;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.f50342b;
    }

    @Deprecated
    public static za valueOf(int i10) {
        return forNumber(i10);
    }
}
