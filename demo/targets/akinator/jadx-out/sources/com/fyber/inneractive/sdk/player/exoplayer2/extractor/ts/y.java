package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y implements v {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.v f25530a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25531b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25532c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f25530a = vVar;
        e0Var.a();
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 4);
        this.f25531b = gVarA;
        e0Var.b();
        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f25362e, MimeTypes.APPLICATION_SCTE35, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        long j10;
        long j11;
        boolean z10 = this.f25532c;
        long j12 = C.TIME_UNSET;
        if (!z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar = this.f25530a;
            long j13 = 0;
            if ((vVar.f26066a == Long.MAX_VALUE ? 0L : vVar.f26068c == C.TIME_UNSET ? -9223372036854775807L : vVar.f26067b) == C.TIME_UNSET) {
                return;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f25531b;
            com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar2 = this.f25530a;
            if (vVar2.f26066a == Long.MAX_VALUE) {
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, MimeTypes.APPLICATION_SCTE35, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f25532c = true;
            } else if (vVar2.f26068c == C.TIME_UNSET) {
                j11 = -9223372036854775807L;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, MimeTypes.APPLICATION_SCTE35, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f25532c = true;
            } else {
                j13 = vVar2.f26067b;
                j11 = j13;
                rVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(null, null, MimeTypes.APPLICATION_SCTE35, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j11, null, null, null));
                this.f25532c = true;
            }
        }
        int i10 = nVar.f26044c - nVar.f26043b;
        this.f25531b.a(i10, nVar);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f25531b;
        com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar3 = this.f25530a;
        if (vVar3.f26068c != C.TIME_UNSET) {
            j12 = vVar3.f26068c;
        } else {
            long j14 = vVar3.f26066a;
            if (j14 != Long.MAX_VALUE) {
                j10 = j14;
            }
            rVar2.a(j10, 1, i10, 0, null);
        }
        j10 = j12;
        rVar2.a(j10, 1, i10, 0, null);
    }
}
