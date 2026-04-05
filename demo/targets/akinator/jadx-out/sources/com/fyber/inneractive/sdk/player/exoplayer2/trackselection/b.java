package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final y f25833a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25834b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f25835c;

    /* renamed from: d, reason: collision with root package name */
    public final o[] f25836d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f25837e;

    /* renamed from: f, reason: collision with root package name */
    public int f25838f;

    public b(y yVar, int... iArr) {
        if (iArr.length <= 0) {
            throw new IllegalStateException();
        }
        yVar.getClass();
        this.f25833a = yVar;
        int length = iArr.length;
        this.f25834b = length;
        this.f25836d = new o[length];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f25836d[i11] = yVar.f25822b[iArr[i11]];
        }
        Arrays.sort(this.f25836d, new a());
        this.f25835c = new int[this.f25834b];
        while (true) {
            int i12 = this.f25834b;
            if (i10 >= i12) {
                this.f25837e = new long[i12];
                return;
            } else {
                this.f25835c[i10] = yVar.a(this.f25836d[i10]);
                i10++;
            }
        }
    }

    public abstract int a();

    public final boolean a(int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f25837e[i10] > jElapsedRealtime;
        int i11 = 0;
        while (i11 < this.f25834b && !z10) {
            z10 = i11 != i10 && this.f25837e[i11] <= jElapsedRealtime;
            i11++;
        }
        if (!z10) {
            return false;
        }
        long[] jArr = this.f25837e;
        jArr[i10] = Math.max(jArr[i10], jElapsedRealtime + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        return true;
    }

    public abstract Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f25833a == bVar.f25833a && Arrays.equals(this.f25835c, bVar.f25835c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25838f == 0) {
            this.f25838f = Arrays.hashCode(this.f25835c) + (System.identityHashCode(this.f25833a) * 31);
        }
        return this.f25838f;
    }
}
