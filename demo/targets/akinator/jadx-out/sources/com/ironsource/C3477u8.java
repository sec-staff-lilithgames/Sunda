package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3477u8 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f39044c = 1001;

    /* renamed from: a, reason: collision with root package name */
    private String f39045a;

    /* renamed from: b, reason: collision with root package name */
    private int f39046b;

    public C3477u8(int i10, String str) {
        this.f39046b = i10;
        this.f39045a = str == null ? "" : str;
    }

    public int a() {
        return this.f39046b;
    }

    public String b() {
        return this.f39045a;
    }

    public String toString() {
        return "error - code:" + this.f39046b + ", message:" + this.f39045a;
    }
}
