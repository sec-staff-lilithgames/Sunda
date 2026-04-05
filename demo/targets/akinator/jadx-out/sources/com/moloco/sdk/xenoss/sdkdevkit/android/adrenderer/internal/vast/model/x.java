package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final x f49399b = new x("CreativeView", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f49400c = new x("Start", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final x f49401e = new x("FirstQuartile", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final x f49402f = new x("Midpoint", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final x f49403g = new x("ThirdQuartile", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final x f49404h = new x("Complete", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final x f49405i = new x("Mute", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final x f49406j = new x("UnMute", 7);

    /* renamed from: k, reason: collision with root package name */
    public static final x f49407k = new x("Pause", 8);

    /* renamed from: l, reason: collision with root package name */
    public static final x f49408l = new x("Rewind", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final x f49409m = new x("Resume", 10);

    /* renamed from: n, reason: collision with root package name */
    public static final x f49410n = new x("CloseLinear", 11);

    /* renamed from: o, reason: collision with root package name */
    public static final x f49411o = new x("Skip", 12);

    /* renamed from: p, reason: collision with root package name */
    public static final x f49412p = new x("Progress", 13);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ x[] f49413q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ cv.a f49414r;

    static {
        x[] xVarArrA = a();
        f49413q = xVarArrA;
        f49414r = cv.b.enumEntries(xVarArrA);
    }

    public x(String str, int i10) {
    }

    public static final /* synthetic */ x[] a() {
        return new x[]{f49399b, f49400c, f49401e, f49402f, f49403g, f49404h, f49405i, f49406j, f49407k, f49408l, f49409m, f49410n, f49411o, f49412p};
    }

    public static cv.a b() {
        return f49414r;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f49413q.clone();
    }
}
