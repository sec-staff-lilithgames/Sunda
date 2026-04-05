package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25364b;

    /* renamed from: c, reason: collision with root package name */
    public String f25365c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25366d;

    /* renamed from: e, reason: collision with root package name */
    public int f25367e;

    /* renamed from: f, reason: collision with root package name */
    public int f25368f;

    /* renamed from: g, reason: collision with root package name */
    public int f25369g;

    /* renamed from: h, reason: collision with root package name */
    public long f25370h;

    /* renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f25371i;

    /* renamed from: j, reason: collision with root package name */
    public int f25372j;

    /* renamed from: k, reason: collision with root package name */
    public long f25373k;

    public f(String str) {
        byte[] bArr = new byte[15];
        this.f25363a = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        bArr[0] = AbstractJsonLexerKt.TC_INVALID;
        bArr[1] = -2;
        bArr[2] = -128;
        bArr[3] = 1;
        this.f25367e = 0;
        this.f25364b = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25367e = 0;
        this.f25368f = 0;
        this.f25369g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25365c = e0Var.f25362e;
        e0Var.b();
        this.f25366d = jVar.a(e0Var.f25361d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f25373k = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        char c10;
        while (true) {
            int i10 = nVar.f26044c - nVar.f26043b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f25367e;
            if (i11 == 0) {
                while (true) {
                    if (nVar.f26044c - nVar.f26043b > 0) {
                        int i12 = this.f25369g << 8;
                        this.f25369g = i12;
                        int iJ = i12 | nVar.j();
                        this.f25369g = iJ;
                        if (iJ == 2147385345) {
                            this.f25369g = 0;
                            this.f25368f = 4;
                            this.f25367e = 1;
                            break;
                        }
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr = this.f25363a.f26042a;
                int iMin = Math.min(i10, 15 - this.f25368f);
                nVar.a(bArr, this.f25368f, iMin);
                int i13 = this.f25368f + iMin;
                this.f25368f = i13;
                if (i13 == 15) {
                    byte[] bArr2 = this.f25363a.f26042a;
                    if (this.f25371i == null) {
                        String str = this.f25365c;
                        String str2 = this.f25364b;
                        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr2);
                        mVar.c(60);
                        int i14 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f24566a[mVar.a(6)];
                        int i15 = com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f24567b[mVar.a(4)];
                        int iA = mVar.a(5);
                        c10 = 5;
                        int i16 = iA >= 29 ? -1 : (com.fyber.inneractive.sdk.player.exoplayer2.audio.t.f24568c[iA] * 1000) / 2;
                        mVar.c(10);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(str, MimeTypes.AUDIO_DTS, i16, -1, i14 + (mVar.a(2) > 0 ? 1 : 0), i15, null, null, str2);
                        this.f25371i = oVarA;
                        this.f25366d.a(oVarA);
                    } else {
                        c10 = 5;
                    }
                    this.f25372j = (((bArr2[c10] & 2) << 12) | ((bArr2[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                    this.f25370h = (int) (((((((bArr2[4] & 1) << 6) | ((r3 & 252) >> 2)) + 1) * 32) * 1000000) / this.f25371i.f25714s);
                    this.f25363a.e(0);
                    this.f25366d.a(15, this.f25363a);
                    this.f25367e = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f25372j - this.f25368f);
                this.f25366d.a(iMin2, nVar);
                int i17 = this.f25368f + iMin2;
                this.f25368f = i17;
                int i18 = this.f25372j;
                if (i17 == i18) {
                    this.f25366d.a(this.f25373k, 1, i18, 0, null);
                    this.f25373k += this.f25370h;
                    this.f25367e = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
