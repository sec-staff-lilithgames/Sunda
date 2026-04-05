package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final h f25496a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f25497b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f25498c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f25499d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f25500e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25501f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25502g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25503h;

    /* renamed from: i, reason: collision with root package name */
    public int f25504i;

    /* renamed from: j, reason: collision with root package name */
    public int f25505j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25506k;

    /* renamed from: l, reason: collision with root package name */
    public long f25507l;

    public s(h hVar) {
        this.f25496a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f25500e = vVar;
        this.f25496a.a(jVar, e0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f25498c = 0;
        this.f25499d = 0;
        this.f25503h = false;
        this.f25496a.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int i10;
        if (z10) {
            int i11 = this.f25498c;
            if (i11 == 2) {
                Log.w("PesReader", "Unexpected start indicator reading extended header");
            } else if (i11 == 3) {
                if (this.f25505j != -1) {
                    Log.w("PesReader", "Unexpected start indicator: expected " + this.f25505j + " more bytes");
                }
                this.f25496a.b();
            }
            this.f25498c = 1;
            this.f25499d = 0;
        }
        while (true) {
            int i12 = nVar.f26044c;
            int i13 = nVar.f26043b;
            int i14 = i12 - i13;
            if (i14 <= 0) {
                return;
            }
            int i15 = this.f25498c;
            if (i15 == 0) {
                nVar.e(i14 + i13);
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (a(nVar, this.f25497b.f26038a, Math.min(10, this.f25504i)) && a(nVar, (byte[]) null, this.f25504i)) {
                        this.f25497b.b(0);
                        this.f25507l = C.TIME_UNSET;
                        if (this.f25501f) {
                            this.f25497b.c(4);
                            this.f25497b.c(1);
                            this.f25497b.c(1);
                            long jA = (this.f25497b.a(3) << 30) | (this.f25497b.a(15) << 15) | this.f25497b.a(15);
                            this.f25497b.c(1);
                            if (!this.f25503h && this.f25502g) {
                                this.f25497b.c(4);
                                this.f25497b.c(1);
                                this.f25497b.c(1);
                                this.f25497b.c(1);
                                this.f25500e.b((this.f25497b.a(3) << 30) | (this.f25497b.a(15) << 15) | this.f25497b.a(15));
                                this.f25503h = true;
                            }
                            this.f25507l = this.f25500e.b(jA);
                        }
                        this.f25496a.a(this.f25506k, this.f25507l);
                        this.f25498c = 3;
                        this.f25499d = 0;
                    }
                } else if (i15 == 3) {
                    int i16 = this.f25505j;
                    int i17 = i16 == -1 ? 0 : i14 - i16;
                    if (i17 > 0) {
                        i14 -= i17;
                        nVar.d(i13 + i14);
                    }
                    this.f25496a.a(nVar);
                    int i18 = this.f25505j;
                    if (i18 != -1) {
                        int i19 = i18 - i14;
                        this.f25505j = i19;
                        if (i19 == 0) {
                            this.f25496a.b();
                            this.f25498c = 1;
                            this.f25499d = 0;
                        }
                    }
                }
            } else if (a(nVar, this.f25497b.f26038a, 9)) {
                this.f25497b.b(0);
                int iA = this.f25497b.a(24);
                if (iA != 1) {
                    o2.u(iA, "Unexpected start code prefix: ", "PesReader");
                    this.f25505j = -1;
                    i10 = 0;
                } else {
                    this.f25497b.c(8);
                    int iA2 = this.f25497b.a(16);
                    this.f25497b.c(5);
                    this.f25506k = this.f25497b.b();
                    this.f25497b.c(2);
                    this.f25501f = this.f25497b.b();
                    this.f25502g = this.f25497b.b();
                    this.f25497b.c(6);
                    int iA3 = this.f25497b.a(8);
                    this.f25504i = iA3;
                    if (iA2 == 0) {
                        this.f25505j = -1;
                    } else {
                        this.f25505j = (iA2 - 3) - iA3;
                    }
                    i10 = 2;
                }
                this.f25498c = i10;
                this.f25499d = 0;
            }
        }
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, byte[] bArr, int i10) {
        int iMin = Math.min(nVar.f26044c - nVar.f26043b, i10 - this.f25499d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            nVar.e(nVar.f26043b + iMin);
        } else {
            nVar.a(bArr, this.f25499d, iMin);
        }
        int i11 = this.f25499d + iMin;
        this.f25499d = i11;
        return i11 == i10;
    }
}
