package com.inmobi.media;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class W3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32431a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f32432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32433c;

    /* renamed from: d, reason: collision with root package name */
    public V3 f32434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y3 f32435e;

    public W3(Y3 y32, String str) {
        this.f32435e = y32;
        this.f32431a = str;
        this.f32432b = new long[y32.f32544h];
    }

    public final File a(int i10) {
        return new File(this.f32435e.f32537a, this.f32431a + "." + i10);
    }

    public final File b(int i10) {
        return new File(this.f32435e.f32537a, this.f32431a + "." + i10 + ".tmp");
    }
}
