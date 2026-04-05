package com.moloco.sdk.acm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f45644b = new m("INITIALIZED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f45645c = new m("INITIALIZING", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final m f45646e = new m("UNINITIALIZED", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ m[] f45647f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cv.a f45648g;

    static {
        m[] mVarArrA = a();
        f45647f = mVarArrA;
        f45648g = cv.b.enumEntries(mVarArrA);
    }

    public m(String str, int i10) {
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{f45644b, f45645c, f45646e};
    }

    public static cv.a b() {
        return f45648g;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f45647f.clone();
    }
}
