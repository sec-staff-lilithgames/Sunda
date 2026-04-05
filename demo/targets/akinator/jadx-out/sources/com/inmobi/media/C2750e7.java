package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2750e7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32807a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32808b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32809c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32810d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32811e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32812f;

    public C2750e7(String fileName, long j10, int i10, long j11, boolean z10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileName, "fileName");
        this.f32807a = fileName;
        this.f32808b = j10;
        this.f32809c = i10;
        this.f32810d = j11;
        this.f32811e = z10;
        this.f32812f = i11;
    }

    public /* synthetic */ C2750e7(String str, long j10, int i10, long j11, boolean z10, int i11, int i12) {
        this(str, j10, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0L : j11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? 0 : i11);
    }
}
