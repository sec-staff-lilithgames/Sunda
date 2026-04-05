package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.Initialization;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f46423a;

    static {
        int[] iArr = new int[Initialization.values().length];
        try {
            iArr[Initialization.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Initialization.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f46423a = iArr;
    }
}
