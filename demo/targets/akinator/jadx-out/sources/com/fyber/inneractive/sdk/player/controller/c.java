package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24395a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f24396b;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.model.vast.i.values().length];
        f24396b = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.model.vast.i.Static.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f24396b[com.fyber.inneractive.sdk.model.vast.i.Html.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f24396b[com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f24396b[com.fyber.inneractive.sdk.model.vast.i.Iframe.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[UnitDisplayType.values().length];
        f24395a = iArr2;
        try {
            iArr2[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f24395a[UnitDisplayType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
