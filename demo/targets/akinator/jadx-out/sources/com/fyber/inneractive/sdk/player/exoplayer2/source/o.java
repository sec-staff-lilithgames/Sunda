package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f25778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25779b;

    public o(p pVar, int i10) {
        this.f25779b = pVar;
        this.f25778a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a() throws IOException {
        this.f25779b.f25788i.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final boolean isReady() {
        boolean z10;
        p pVar = this.f25779b;
        int i10 = this.f25778a;
        if (!pVar.F) {
            if (pVar.D == C.TIME_UNSET) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.e eVar = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f25794o.valueAt(i10)).f24703c;
                synchronized (eVar) {
                    z10 = eVar.f24666i == 0;
                }
                if (!z10) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar, boolean z10) {
        p pVar2 = this.f25779b;
        int i10 = this.f25778a;
        if (pVar2.f25800u || pVar2.D != C.TIME_UNSET) {
            return -3;
        }
        return ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar2.f25794o.valueAt(i10)).a(pVar, cVar, z10, pVar2.F, pVar2.C);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.v
    public final void a(long j10) {
        p pVar = this.f25779b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) pVar.f25794o.valueAt(this.f25778a);
        if (pVar.F && j10 > gVar.d()) {
            gVar.f();
        } else {
            gVar.a(true, j10);
        }
    }
}
