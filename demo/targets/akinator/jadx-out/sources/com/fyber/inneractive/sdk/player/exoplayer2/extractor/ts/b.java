package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f25302a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25303b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25304c;

    /* renamed from: d, reason: collision with root package name */
    public String f25305d;

    /* renamed from: e, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25306e;

    /* renamed from: f, reason: collision with root package name */
    public int f25307f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f25308g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25309h;

    /* renamed from: i, reason: collision with root package name */
    public long f25310i;

    /* renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f25311j;

    /* renamed from: k, reason: collision with root package name */
    public int f25312k;

    /* renamed from: l, reason: collision with root package name */
    public long f25313l;

    public b(String str) {
        byte[] bArr = new byte[8];
        this.f25302a = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(bArr);
        this.f25303b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(bArr);
        this.f25304c = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25307f = 0;
        this.f25308g = 0;
        this.f25309h = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25305d = e0Var.f25362e;
        e0Var.b();
        this.f25306e = jVar.a(e0Var.f25361d, 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f25313l = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        int iA;
        int i10;
        String str;
        int iA2;
        int i11;
        while (true) {
            int i12 = nVar.f26044c - nVar.f26043b;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f25307f;
            if (i13 == 0) {
                while (true) {
                    if (nVar.f26044c - nVar.f26043b <= 0) {
                        break;
                    }
                    if (!this.f25309h) {
                        this.f25309h = nVar.j() == 11;
                    } else {
                        int iJ = nVar.j();
                        if (iJ == 119) {
                            this.f25309h = false;
                            this.f25307f = 1;
                            byte[] bArr = this.f25303b.f26042a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.f25308g = 2;
                            break;
                        }
                        this.f25309h = iJ == 11;
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f25303b.f26042a;
                int iMin = Math.min(i12, 8 - this.f25308g);
                nVar.a(bArr2, this.f25308g, iMin);
                int i14 = this.f25308g + iMin;
                this.f25308g = i14;
                if (i14 == 8) {
                    this.f25302a.b(0);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = this.f25302a;
                    int i15 = (mVar.f26039b * 8) + mVar.f26040c;
                    mVar.c(40);
                    Object[] objArr = mVar.a(5) == 16;
                    mVar.b(i15);
                    int i16 = 6;
                    if (objArr != false) {
                        mVar.c(21);
                        iA2 = (mVar.a(11) + 1) * 2;
                        int iA3 = mVar.a(2);
                        if (iA3 == 3) {
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f24490c[mVar.a(2)];
                        } else {
                            i16 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f24488a[mVar.a(2)];
                            i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f24489b[iA3];
                        }
                        i11 = i16 * NotificationCompat.FLAG_LOCAL_ONLY;
                        iA = mVar.a(3);
                        str = MimeTypes.AUDIO_E_AC3;
                    } else {
                        mVar.c(32);
                        int iA4 = mVar.a(2);
                        int iA5 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a(iA4, mVar.a(6));
                        mVar.c(8);
                        iA = mVar.a(3);
                        if ((iA & 1) != 0 && iA != 1) {
                            mVar.c(2);
                        }
                        if ((iA & 4) != 0) {
                            mVar.c(2);
                        }
                        if (iA == 2) {
                            mVar.c(2);
                        }
                        i10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f24489b[iA4];
                        str = MimeTypes.AUDIO_AC3;
                        iA2 = iA5;
                        i11 = 1536;
                    }
                    int i17 = i10;
                    String str2 = str;
                    int i18 = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f24491d[iA] + (mVar.b() ? 1 : 0);
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = this.f25311j;
                    if (oVar == null || i18 != oVar.f25713r || i17 != oVar.f25714s || str2 != oVar.f25701f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f25305d, str2, -1, -1, i18, i17, null, null, this.f25304c);
                        this.f25311j = oVarA;
                        this.f25306e.a(oVarA);
                    }
                    this.f25312k = iA2;
                    this.f25310i = (i11 * 1000000) / this.f25311j.f25714s;
                    this.f25303b.e(0);
                    this.f25306e.a(8, this.f25303b);
                    this.f25307f = 2;
                }
            } else if (i13 == 2) {
                int iMin2 = Math.min(i12, this.f25312k - this.f25308g);
                this.f25306e.a(iMin2, nVar);
                int i19 = this.f25308g + iMin2;
                this.f25308g = i19;
                int i20 = this.f25312k;
                if (i19 == i20) {
                    this.f25306e.a(this.f25313l, 1, i20, 0, null);
                    this.f25313l += this.f25310i;
                    this.f25307f = 0;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
