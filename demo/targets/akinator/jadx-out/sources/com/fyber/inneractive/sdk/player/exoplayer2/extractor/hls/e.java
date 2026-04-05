package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b {

    /* renamed from: g, reason: collision with root package name */
    public int f24728g;

    public e(y yVar, int[] iArr) {
        super(yVar, iArr);
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.o oVar = yVar.f25822b[0];
        while (true) {
            if (i10 >= this.f25834b) {
                i10 = -1;
                break;
            } else if (this.f25836d[i10] == oVar) {
                break;
            } else {
                i10++;
            }
        }
        this.f24728g = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int a() {
        return this.f24728g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final Object b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final int c() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b
    public final void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f25837e[this.f24728g] > jElapsedRealtime) {
            for (int i10 = this.f25834b - 1; i10 >= 0; i10--) {
                if (this.f25837e[i10] <= jElapsedRealtime) {
                    this.f24728g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
