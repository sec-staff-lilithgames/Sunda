package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.t f25955a = new com.fyber.inneractive.sdk.player.exoplayer2.util.t();

    /* renamed from: b, reason: collision with root package name */
    public int f25956b;

    /* renamed from: c, reason: collision with root package name */
    public long f25957c;

    /* renamed from: d, reason: collision with root package name */
    public long f25958d;

    /* renamed from: e, reason: collision with root package name */
    public long f25959e;

    /* renamed from: f, reason: collision with root package name */
    public long f25960f;

    public final synchronized void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar;
        int i10;
        float f10;
        try {
            if (this.f25956b <= 0) {
                throw new IllegalStateException();
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i11 = (int) (jElapsedRealtime - this.f25957c);
            long j10 = i11;
            this.f25959e += j10;
            long j11 = this.f25960f;
            long j12 = this.f25958d;
            this.f25960f = j11 + j12;
            if (i11 > 0) {
                float f11 = (8000 * j12) / j10;
                com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar = this.f25955a;
                int iSqrt = (int) Math.sqrt(j12);
                if (tVar.f26058d != 1) {
                    Collections.sort(tVar.f26056b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f26053h);
                    tVar.f26058d = 1;
                }
                int i12 = tVar.f26061g;
                if (i12 > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr = tVar.f26057c;
                    int i13 = i12 - 1;
                    tVar.f26061g = i13;
                    sVar = sVarArr[i13];
                } else {
                    sVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.s();
                }
                int i14 = tVar.f26059e;
                tVar.f26059e = i14 + 1;
                sVar.f26050a = i14;
                sVar.f26051b = iSqrt;
                sVar.f26052c = f11;
                tVar.f26056b.add(sVar);
                tVar.f26060f += iSqrt;
                while (true) {
                    int i15 = tVar.f26060f;
                    int i16 = tVar.f26055a;
                    i10 = 0;
                    if (i15 <= i16) {
                        break;
                    }
                    int i17 = i15 - i16;
                    com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar.f26056b.get(0);
                    int i18 = sVar2.f26051b;
                    if (i18 <= i17) {
                        tVar.f26060f -= i18;
                        tVar.f26056b.remove(0);
                        int i19 = tVar.f26061g;
                        if (i19 < 5) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s[] sVarArr2 = tVar.f26057c;
                            tVar.f26061g = i19 + 1;
                            sVarArr2[i19] = sVar2;
                        }
                    } else {
                        sVar2.f26051b = i18 - i17;
                        tVar.f26060f -= i17;
                    }
                }
                if (this.f25959e >= 2000 || this.f25960f >= 524288) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.t tVar2 = this.f25955a;
                    if (tVar2.f26058d != 0) {
                        Collections.sort(tVar2.f26056b, com.fyber.inneractive.sdk.player.exoplayer2.util.t.f26054i);
                        tVar2.f26058d = 0;
                    }
                    float f12 = 0.5f * tVar2.f26060f;
                    int i20 = 0;
                    while (true) {
                        if (i10 < tVar2.f26056b.size()) {
                            com.fyber.inneractive.sdk.player.exoplayer2.util.s sVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.util.s) tVar2.f26056b.get(i10);
                            i20 += sVar3.f26051b;
                            if (i20 >= f12) {
                                f10 = sVar3.f26052c;
                                break;
                            }
                            i10++;
                        } else if (tVar2.f26056b.isEmpty()) {
                            f10 = Float.NaN;
                        } else {
                            ArrayList arrayList = tVar2.f26056b;
                            f10 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) arrayList.get(arrayList.size() - 1)).f26052c;
                        }
                    }
                    Float.isNaN(f10);
                }
            }
            int i21 = this.f25956b - 1;
            this.f25956b = i21;
            if (i21 > 0) {
                this.f25957c = jElapsedRealtime;
            }
            this.f25958d = 0L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
