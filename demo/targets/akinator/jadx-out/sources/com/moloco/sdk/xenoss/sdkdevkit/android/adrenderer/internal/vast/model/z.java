package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import com.vungle.ads.internal.protos.Sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final z f49418c = new z("XmlParsing", 0, 100);

    /* renamed from: e, reason: collision with root package name */
    public static final z f49419e = new z("Wrapper", 1, 300);

    /* renamed from: f, reason: collision with root package name */
    public static final z f49420f = new z("WrapperTimeout", 2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE);

    /* renamed from: g, reason: collision with root package name */
    public static final z f49421g = new z("WrapperLimit", 3, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public static final z f49422h = new z("WrapperNoAds", 4, 303);

    /* renamed from: i, reason: collision with root package name */
    public static final z f49423i = new z("Linear", 5, 400);

    /* renamed from: j, reason: collision with root package name */
    public static final z f49424j = new z("LinearFileNotFound", 6, 401);

    /* renamed from: k, reason: collision with root package name */
    public static final z f49425k = new z("LinearNotSupportedMedia", 7, 403);

    /* renamed from: l, reason: collision with root package name */
    public static final z f49426l = new z("Companion", 8, 600);

    /* renamed from: m, reason: collision with root package name */
    public static final z f49427m = new z("Undefined", 9, 900);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z[] f49428n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cv.a f49429o;

    /* renamed from: b, reason: collision with root package name */
    public final int f49430b;

    static {
        z[] zVarArrA = a();
        f49428n = zVarArrA;
        f49429o = cv.b.enumEntries(zVarArrA);
    }

    public z(String str, int i10, int i11) {
        this.f49430b = i11;
    }

    public static final /* synthetic */ z[] a() {
        return new z[]{f49418c, f49419e, f49420f, f49421g, f49422h, f49423i, f49424j, f49425k, f49426l, f49427m};
    }

    public static cv.a b() {
        return f49429o;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f49428n.clone();
    }

    public final int c() {
        return this.f49430b;
    }
}
