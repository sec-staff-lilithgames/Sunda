package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final n f48086b = new n("SkipOrClose", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f48087c = new n("ClickThrough", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n[] f48088e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48089f;

    static {
        n[] nVarArrA = a();
        f48088e = nVarArrA;
        f48089f = cv.b.enumEntries(nVarArrA);
    }

    public n(String str, int i10) {
    }

    public static final /* synthetic */ n[] a() {
        return new n[]{f48086b, f48087c};
    }

    public static cv.a b() {
        return f48089f;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f48088e.clone();
    }
}
