package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23431a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        f23431a = iArr;
        try {
            iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f23431a[UnitDisplayType.BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f23431a[UnitDisplayType.MRECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f23431a[UnitDisplayType.REWARDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
