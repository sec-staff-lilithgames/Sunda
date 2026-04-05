package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2897n2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f33110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33111b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f33112c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f33113d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33114e;

    /* renamed from: f, reason: collision with root package name */
    public int f33115f;

    /* renamed from: g, reason: collision with root package name */
    public long f33116g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33117h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f33118i;

    public C2897n2(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f33110a = i10;
        this.f33111b = url;
        this.f33112c = map;
        this.f33113d = z10;
        this.f33114e = z11;
        this.f33115f = i11;
        this.f33116g = j10;
        this.f33117h = j11;
        this.f33118i = new AtomicBoolean(false);
    }

    public /* synthetic */ C2897n2(String str, Map map, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, (i11 & 4) != 0 ? null : map, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
