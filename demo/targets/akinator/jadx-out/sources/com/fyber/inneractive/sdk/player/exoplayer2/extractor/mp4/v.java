package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f25198a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f25199b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f25200c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25201d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f25202e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f25203f;

    public v(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2) {
        if (iArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (jArr.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != jArr2.length) {
            throw new IllegalArgumentException();
        }
        this.f25199b = jArr;
        this.f25200c = iArr;
        this.f25201d = i10;
        this.f25202e = jArr2;
        this.f25203f = iArr2;
        this.f25198a = jArr.length;
    }
}
