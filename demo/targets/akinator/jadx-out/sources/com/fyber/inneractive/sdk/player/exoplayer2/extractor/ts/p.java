package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25473a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25474b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25475c;

    /* renamed from: d, reason: collision with root package name */
    public long f25476d;

    /* renamed from: e, reason: collision with root package name */
    public int f25477e;

    /* renamed from: f, reason: collision with root package name */
    public int f25478f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25475c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        int i10;
        if (this.f25475c && (i10 = this.f25477e) != 0 && this.f25478f == i10) {
            this.f25474b.a(this.f25476d, 1, i10, 0, null);
            this.f25475c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 4);
        this.f25474b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f25362e, MimeTypes.APPLICATION_ID3, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        if (z10) {
            this.f25475c = true;
            this.f25476d = j10;
            this.f25477e = 0;
            this.f25478f = 0;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        if (this.f25475c) {
            int i10 = nVar.f26044c - nVar.f26043b;
            int i11 = this.f25478f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(nVar.f26042a, nVar.f26043b, this.f25473a.f26042a, this.f25478f, iMin);
                if (this.f25478f + iMin == 10) {
                    this.f25473a.e(0);
                    if (73 == this.f25473a.j() && 68 == this.f25473a.j() && 51 == this.f25473a.j()) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25473a;
                        nVar2.e(nVar2.f26043b + 3);
                        this.f25477e = this.f25473a.i() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f25475c = false;
                        return;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f25477e - this.f25478f);
            this.f25474b.a(iMin2, nVar);
            this.f25478f += iMin2;
        }
    }
}
