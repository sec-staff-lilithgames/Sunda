package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f25374a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f25375b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25376c;

    /* renamed from: d, reason: collision with root package name */
    public int f25377d;

    /* renamed from: e, reason: collision with root package name */
    public int f25378e;

    /* renamed from: f, reason: collision with root package name */
    public long f25379f;

    public g(List list) {
        this.f25374a = list;
        this.f25375b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25376c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.f25376c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f25375b) {
                rVar.a(this.f25379f, 1, this.f25378e, 0, null);
            }
            this.f25376c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f25375b.length; i10++) {
            c0 c0Var = (c0) this.f25374a.get(i10);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 3);
            e0Var.b();
            gVarA.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.f25362e, null, MimeTypes.APPLICATION_DVBSUBS, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.f25333a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.f25334b), null, null));
            this.f25375b[i10] = gVarA;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f25376c = true;
            this.f25379f = j10;
            this.f25378e = 0;
            this.f25377d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z10;
        boolean z11;
        if (this.f25376c) {
            if (this.f25377d == 2) {
                if (nVar.f26044c - nVar.f26043b == 0) {
                    z11 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.f25376c = false;
                    }
                    this.f25377d--;
                    z11 = this.f25376c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f25377d == 1) {
                if (nVar.f26044c - nVar.f26043b == 0) {
                    z10 = false;
                } else {
                    if (nVar.j() != 0) {
                        this.f25376c = false;
                    }
                    this.f25377d--;
                    z10 = this.f25376c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = nVar.f26043b;
            int i11 = nVar.f26044c - i10;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.f25375b) {
                nVar.e(i10);
                rVar.a(i11, nVar);
            }
            this.f25378e += i11;
        }
    }
}
