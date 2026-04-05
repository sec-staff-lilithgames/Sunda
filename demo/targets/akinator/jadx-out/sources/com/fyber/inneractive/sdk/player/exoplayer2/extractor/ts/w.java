package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f25522a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25523b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(32);

    /* renamed from: c, reason: collision with root package name */
    public int f25524c;

    /* renamed from: d, reason: collision with root package name */
    public int f25525d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25526e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25527f;

    public w(v vVar) {
        this.f25522a = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        this.f25522a.a(vVar, jVar, e0Var);
        this.f25527f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a() {
        this.f25527f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.f0
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, boolean z10) {
        int iJ = z10 ? nVar.f26043b + nVar.j() : -1;
        if (this.f25527f) {
            if (!z10) {
                return;
            }
            this.f25527f = false;
            nVar.e(iJ);
            this.f25525d = 0;
        }
        while (true) {
            int i10 = nVar.f26044c - nVar.f26043b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f25525d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iJ2 = nVar.j();
                    nVar.e(nVar.f26043b - 1);
                    if (iJ2 == 255) {
                        this.f25527f = true;
                        return;
                    }
                }
                int iMin = Math.min(nVar.f26044c - nVar.f26043b, 3 - this.f25525d);
                nVar.a(this.f25523b.f26042a, this.f25525d, iMin);
                int i12 = this.f25525d + iMin;
                this.f25525d = i12;
                if (i12 == 3) {
                    this.f25523b.c(3);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f25523b;
                    nVar2.e(nVar2.f26043b + 1);
                    int iJ3 = this.f25523b.j();
                    int iJ4 = this.f25523b.j();
                    this.f25526e = (iJ3 & 128) != 0;
                    this.f25524c = (((iJ3 & 15) << 8) | iJ4) + 3;
                    int iA = this.f25523b.a();
                    int i13 = this.f25524c;
                    if (iA < i13) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.f25523b;
                        byte[] bArr = nVar3.f26042a;
                        nVar3.c(Math.min(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE, Math.max(i13, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f25523b.f26042a, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(i10, this.f25524c - i11);
                nVar.a(this.f25523b.f26042a, this.f25525d, iMin2);
                int i14 = this.f25525d + iMin2;
                this.f25525d = i14;
                int i15 = this.f25524c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (this.f25526e) {
                        byte[] bArr2 = this.f25523b.f26042a;
                        int i16 = -1;
                        for (int i17 = 0; i17 < i15; i17++) {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26077h[((i16 >>> 24) ^ (bArr2[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i16 << 8);
                        }
                        int i18 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f26070a;
                        if (i16 != 0) {
                            this.f25527f = true;
                            return;
                        }
                        this.f25523b.c(this.f25524c - 4);
                    } else {
                        this.f25523b.c(i15);
                    }
                    this.f25522a.a(this.f25523b);
                    this.f25525d = 0;
                }
            }
        }
    }
}
