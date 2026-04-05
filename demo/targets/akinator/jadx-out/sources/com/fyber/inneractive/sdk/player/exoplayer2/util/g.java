package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f26020a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f26021b = new long[32];

    public final void a(long j10) {
        int i10 = this.f26020a;
        long[] jArr = this.f26021b;
        if (i10 == jArr.length) {
            this.f26021b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f26021b;
        int i11 = this.f26020a;
        this.f26020a = i11 + 1;
        jArr2[i11] = j10;
    }
}
