package com.inmobi.sdk;

import com.inmobi.sdk.InMobiSdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f33731a;

    static {
        int[] iArr = new int[InMobiSdk.LogLevel.values().length];
        try {
            iArr[InMobiSdk.LogLevel.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiSdk.LogLevel.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiSdk.LogLevel.DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f33731a = iArr;
    }
}
