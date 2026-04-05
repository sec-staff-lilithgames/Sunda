package com.inmobi.media;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F1 {

    /* renamed from: b, reason: collision with root package name */
    public static final E1 f31761b;

    /* renamed from: c, reason: collision with root package name */
    public static final SparseArray f31762c;

    /* renamed from: d, reason: collision with root package name */
    public static final F1 f31763d;

    /* renamed from: e, reason: collision with root package name */
    public static final F1 f31764e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ F1[] f31765f;

    /* renamed from: a, reason: collision with root package name */
    public final int f31766a;

    static {
        F1 f12 = new F1(0, 0, "UNKNOWN");
        f31763d = f12;
        F1 f13 = new F1(1, 1, "PLAYING");
        f31764e = f13;
        F1[] f1Arr = {f12, f13, new F1(2, 2, "PAUSED"), new F1(3, 3, "COMPLETED")};
        f31765f = f1Arr;
        cv.b.enumEntries(f1Arr);
        f31761b = new E1();
        f31762c = new SparseArray();
        for (F1 f14 : values()) {
            f31762c.put(f14.f31766a, f14);
        }
    }

    public F1(int i10, int i11, String str) {
        this.f31766a = i11;
    }

    public static F1 valueOf(String str) {
        return (F1) Enum.valueOf(F1.class, str);
    }

    public static F1[] values() {
        return (F1[]) f31765f.clone();
    }
}
