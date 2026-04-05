package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements q {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f24643a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f24644b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24645c;

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f24643a = jArr;
        this.f24644b = jArr3;
        int length = iArr.length;
        if (length <= 0) {
            this.f24645c = 0L;
        } else {
            int i10 = length - 1;
            this.f24645c = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f24645c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f24643a[z.a(this.f24644b, j10, true)];
    }
}
