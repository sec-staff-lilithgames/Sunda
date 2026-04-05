package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.amazon.device.ads.DTBAdActivity;
import com.unity3d.ads.BuildConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f48132c = new w("Loading", 0, "loading");

    /* renamed from: e, reason: collision with root package name */
    public static final w f48133e = new w("Default", 1, BuildConfig.FLAVOR);

    /* renamed from: f, reason: collision with root package name */
    public static final w f48134f = new w("Resized", 2, "resized");

    /* renamed from: g, reason: collision with root package name */
    public static final w f48135g = new w("Expanded", 3, DTBAdActivity.EXPANDED);

    /* renamed from: h, reason: collision with root package name */
    public static final w f48136h = new w("Hidden", 4, "hidden");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w[] f48137i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48138j;

    /* renamed from: b, reason: collision with root package name */
    public final String f48139b;

    static {
        w[] wVarArrA = a();
        f48137i = wVarArrA;
        f48138j = cv.b.enumEntries(wVarArrA);
    }

    public w(String str, int i10, String str2) {
        this.f48139b = str2;
    }

    public static final /* synthetic */ w[] a() {
        return new w[]{f48132c, f48133e, f48134f, f48135g, f48136h};
    }

    public static cv.a b() {
        return f48138j;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f48137i.clone();
    }

    public final String c() {
        return this.f48139b;
    }
}
