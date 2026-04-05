package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final List f25528a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] f25529b;

    public x(List list) {
        this.f25528a = list;
        this.f25529b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i10 = 0; i10 < this.f25529b.length; i10++) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 3);
            com.fyber.inneractive.sdk.player.exoplayer2.o oVar = (com.fyber.inneractive.sdk.player.exoplayer2.o) this.f25528a.get(i10);
            String str = oVar.f25701f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = oVar.f25696a;
            if (str2 == null) {
                e0Var.b();
                str2 = e0Var.f25362e;
            }
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(str2, str, oVar.f25719x, oVar.f25720y, oVar.f25721z, null, Long.MAX_VALUE, Collections.EMPTY_LIST));
            this.f25529b[i10] = gVarA;
        }
    }
}
