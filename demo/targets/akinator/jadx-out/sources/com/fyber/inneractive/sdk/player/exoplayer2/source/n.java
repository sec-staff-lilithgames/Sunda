package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] f25775a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f25776b;

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f25777c;

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f25775a = iVarArr;
        this.f25776b = jVar;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws a0 {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.f25777c;
        if (iVar != null) {
            return iVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.f25775a;
        int length = iVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 = iVarArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                bVar.f24651e = 0;
                throw th2;
            }
            if (iVar2.a(bVar)) {
                this.f25777c = iVar2;
                bVar.f24651e = 0;
                break;
            }
            continue;
            bVar.f24651e = 0;
            i10++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.f25777c;
        if (iVar3 != null) {
            iVar3.a(this.f25776b);
            return this.f25777c;
        }
        StringBuilder sb2 = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr2 = this.f25775a;
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
        StringBuilder sb3 = new StringBuilder();
        for (int i12 = 0; i12 < iVarArr2.length; i12++) {
            sb3.append(iVarArr2[i12].getClass().getSimpleName());
            if (i12 < iVarArr2.length - 1) {
                sb3.append(", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(") could read the stream.");
        throw new a0(sb2.toString());
    }
}
