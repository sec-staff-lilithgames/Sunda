package com.fyber.inneractive.sdk.player.exoplayer2;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.s f25570a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25571b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.v[] f25572c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f25573d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25574e;

    /* renamed from: f, reason: collision with root package name */
    public int f25575f;

    /* renamed from: g, reason: collision with root package name */
    public long f25576g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25577h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25578i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25579j;

    /* renamed from: k, reason: collision with root package name */
    public h f25580k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25581l;

    /* renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f25582m;

    /* renamed from: n, reason: collision with root package name */
    public final a[] f25583n;

    /* renamed from: o, reason: collision with root package name */
    public final a[] f25584o;

    /* renamed from: p, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f25585p;

    /* renamed from: q, reason: collision with root package name */
    public final c f25586q;

    /* renamed from: r, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.u f25587r;

    /* renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.j f25588s;

    public h(a[] aVarArr, a[] aVarArr2, long j10, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i iVar, c cVar, com.fyber.inneractive.sdk.player.exoplayer2.source.u uVar, Object obj, int i10, boolean z10, long j11) {
        this.f25583n = aVarArr;
        this.f25584o = aVarArr2;
        this.f25574e = j10;
        this.f25585p = iVar;
        this.f25586q = cVar;
        this.f25587r = uVar;
        obj.getClass();
        this.f25571b = obj;
        this.f25575f = i10;
        this.f25577h = z10;
        this.f25576g = j11;
        this.f25572c = new com.fyber.inneractive.sdk.player.exoplayer2.source.v[aVarArr.length];
        this.f25573d = new boolean[aVarArr.length];
        this.f25570a = uVar.a(i10, cVar.f24613a, j11);
    }

    public final long a(long j10, boolean z10, boolean[] zArr) {
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = this.f25582m.f25846b;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= hVar.f25842a) {
                break;
            }
            boolean[] zArr2 = this.f25573d;
            if (z10 || !this.f25582m.a(this.f25588s, i11)) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        long jA = this.f25570a.a((com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[]) hVar.f25843b.clone(), this.f25573d, this.f25572c, zArr, j10);
        this.f25588s = this.f25582m;
        this.f25579j = false;
        int i12 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.source.v[] vVarArr = this.f25572c;
            if (i12 >= vVarArr.length) {
                c cVar = this.f25586q;
                a[] aVarArr = this.f25583n;
                z zVar = this.f25582m.f25845a;
                cVar.f24618f = 0;
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (hVar.f25843b[i13] != null) {
                        int i14 = cVar.f24618f;
                        int i15 = aVarArr[i13].f24481a;
                        int i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
                        if (i15 == 0) {
                            i10 = 16777216;
                        } else if (i15 == 1) {
                            i10 = C.DEFAULT_AUDIO_BUFFER_SIZE;
                        } else if (i15 == 2) {
                            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                throw new IllegalStateException();
                            }
                            i10 = 131072;
                        }
                        cVar.f24618f = i14 + i10;
                    }
                }
                cVar.f24613a.a(cVar.f24618f);
                return jA;
            }
            if (vVarArr[i12] != null) {
                if (hVar.f25843b[i12] == null) {
                    throw new IllegalStateException();
                }
                this.f25579j = true;
            } else if (hVar.f25843b[i12] != null) {
                throw new IllegalStateException();
            }
            i12++;
        }
    }

    public final void a() {
        try {
            this.f25587r.a(this.f25570a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }
}
