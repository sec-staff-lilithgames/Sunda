package com.moloco.sdk.internal.ilrd.model;

import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46035b = new a("MAX", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f46036c = new a("LEVELPLAY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f46037e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cv.a f46038f;

    static {
        a[] aVarArrA = a();
        f46037e = aVarArrA;
        f46038f = b.enumEntries(aVarArrA);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f46035b, f46036c};
    }

    public static cv.a b() {
        return f46038f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f46037e.clone();
    }
}
