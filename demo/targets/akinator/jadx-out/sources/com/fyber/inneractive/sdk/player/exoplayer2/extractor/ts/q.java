package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25479a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f25480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25481c;

    /* renamed from: d, reason: collision with root package name */
    public String f25482d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25483e;

    /* renamed from: f, reason: collision with root package name */
    public int f25484f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f25485g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25486h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25487i;

    /* renamed from: j, reason: collision with root package name */
    public long f25488j;

    /* renamed from: k, reason: collision with root package name */
    public int f25489k;

    /* renamed from: l, reason: collision with root package name */
    public long f25490l;

    public q(String str) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4);
        this.f25479a = nVar;
        nVar.f26042a[0] = -1;
        this.f25480b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();
        this.f25481c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25484f = 0;
        this.f25485g = 0;
        this.f25487i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25482d = e0Var.f25362e;
        e0Var.b();
        this.f25483e = jVar.a(e0Var.f25361d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f25490l = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        while (true) {
            int i10 = nVar.f26044c;
            int i11 = nVar.f26043b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f25484f;
            if (i13 == 0) {
                byte[] bArr = nVar.f26042a;
                while (true) {
                    if (i11 < i10) {
                        byte b10 = bArr[i11];
                        boolean z10 = (b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                        boolean z11 = this.f25487i && (b10 & 224) == 224;
                        this.f25487i = z10;
                        if (z11) {
                            nVar.e(i11 + 1);
                            this.f25487i = false;
                            this.f25479a.f26042a[1] = bArr[i11];
                            this.f25485g = 2;
                            this.f25484f = 1;
                            break;
                        }
                        i11++;
                    } else {
                        nVar.e(i10);
                        break;
                    }
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f25485g);
                nVar.a(this.f25479a.f26042a, this.f25485g, iMin);
                int i14 = this.f25485g + iMin;
                this.f25485g = i14;
                if (i14 >= 4) {
                    this.f25479a.e(0);
                    if (!com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f25479a.b(), this.f25480b)) {
                        this.f25485g = 0;
                        this.f25484f = 1;
                    } else {
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n nVar2 = this.f25480b;
                        this.f25489k = nVar2.f25213c;
                        if (!this.f25486h) {
                            int i15 = nVar2.f25214d;
                            this.f25488j = (nVar2.f25217g * 1000000) / i15;
                            this.f25483e.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f25482d, nVar2.f25212b, -1, 4096, nVar2.f25215e, i15, null, null, this.f25481c));
                            this.f25486h = true;
                        }
                        this.f25479a.e(0);
                        this.f25483e.a(4, this.f25479a);
                        this.f25484f = 2;
                    }
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f25489k - this.f25485g);
                this.f25483e.a(iMin2, nVar);
                int i16 = this.f25485g + iMin2;
                this.f25485g = i16;
                int i17 = this.f25489k;
                if (i16 >= i17) {
                    this.f25483e.a(this.f25490l, 1, i17, 0, null);
                    this.f25490l += this.f25488j;
                    this.f25485g = 0;
                    this.f25484f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
