package com.inmobi.ads;

import com.inmobi.ads.InMobiBanner;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31583a;

    static {
        int[] iArr = new int[InMobiBanner.AnimationType.values().length];
        try {
            iArr[InMobiBanner.AnimationType.ANIMATION_ALPHA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_HORIZONTAL_AXIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InMobiBanner.AnimationType.ROTATE_VERTICAL_AXIS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f31583a = iArr;
    }
}
