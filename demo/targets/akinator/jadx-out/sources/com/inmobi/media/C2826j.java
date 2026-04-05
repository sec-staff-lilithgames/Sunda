package com.inmobi.media;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2826j {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f32938m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f32939a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32940b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32941c;

    /* renamed from: d, reason: collision with root package name */
    public int f32942d;

    /* renamed from: e, reason: collision with root package name */
    public long f32943e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32944f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32945g;

    /* renamed from: h, reason: collision with root package name */
    public final long f32946h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32947i;

    /* renamed from: j, reason: collision with root package name */
    public String f32948j;

    /* renamed from: k, reason: collision with root package name */
    public long f32949k;

    /* renamed from: l, reason: collision with root package name */
    public byte f32950l;

    public C2826j(int i10, String url, String str, int i11, long j10, long j11, long j12, long j13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f32939a = i10;
        this.f32940b = url;
        this.f32941c = str;
        this.f32942d = i11;
        this.f32943e = j10;
        this.f32944f = j11;
        this.f32945g = j12;
        this.f32946h = j13;
    }

    public final void a(byte b10) {
        this.f32950l = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2826j) {
            return kotlin.jvm.internal.e0.areEqual(this.f32940b, ((C2826j) obj).f32940b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32940b.hashCode();
    }

    public final String toString() {
        return j1.o2.o(new StringBuilder("AdAsset{url='"), this.f32940b, "'}");
    }

    public final boolean a() {
        return D2.a(this.f32941c) && new File(this.f32941c).exists();
    }
}
