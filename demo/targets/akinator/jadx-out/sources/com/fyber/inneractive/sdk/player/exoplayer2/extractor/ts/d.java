package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements h {

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f25335r = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25336a;

    /* renamed from: d, reason: collision with root package name */
    public final String f25339d;

    /* renamed from: e, reason: collision with root package name */
    public String f25340e;

    /* renamed from: f, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25341f;

    /* renamed from: g, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25342g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25346k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25347l;

    /* renamed from: m, reason: collision with root package name */
    public long f25348m;

    /* renamed from: n, reason: collision with root package name */
    public int f25349n;

    /* renamed from: o, reason: collision with root package name */
    public long f25350o;

    /* renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25351p;

    /* renamed from: q, reason: collision with root package name */
    public long f25352q;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m f25337b = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25338c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(Arrays.copyOf(f25335r, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f25343h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f25344i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f25345j = NotificationCompat.FLAG_LOCAL_ONLY;

    public d(boolean z10, String str) {
        this.f25336a = z10;
        this.f25339d = str;
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
            int i13 = this.f25343h;
            if (i13 == 0) {
                byte[] bArr = nVar.f26042a;
                while (true) {
                    if (i11 >= i10) {
                        nVar.e(i11);
                        break;
                    }
                    int i14 = i11 + 1;
                    byte b10 = bArr[i11];
                    int i15 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i16 = this.f25345j;
                    if (i16 != 512 || i15 < 240 || i15 == 255) {
                        int i17 = i16 | i15;
                        if (i17 == 329) {
                            this.f25345j = 768;
                        } else if (i17 == 511) {
                            this.f25345j = 512;
                        } else if (i17 == 836) {
                            this.f25345j = 1024;
                        } else {
                            if (i17 == 1075) {
                                this.f25343h = 1;
                                this.f25344i = 3;
                                this.f25349n = 0;
                                this.f25338c.e(0);
                                nVar.e(i14);
                                break;
                            }
                            if (i16 != 256) {
                                this.f25345j = NotificationCompat.FLAG_LOCAL_ONLY;
                            }
                        }
                        i11 = i14;
                    } else {
                        this.f25346k = (b10 & 1) == 0;
                        this.f25343h = 2;
                        this.f25344i = 0;
                        nVar.e(i14);
                    }
                }
            } else if (i13 == 1) {
                byte[] bArr2 = this.f25338c.f26042a;
                int iMin = Math.min(i12, 10 - this.f25344i);
                nVar.a(bArr2, this.f25344i, iMin);
                int i18 = this.f25344i + iMin;
                this.f25344i = i18;
                if (i18 == 10) {
                    this.f25342g.a(10, this.f25338c);
                    this.f25338c.e(6);
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar = this.f25342g;
                    int i19 = this.f25338c.i() + 10;
                    this.f25343h = 3;
                    this.f25344i = 10;
                    this.f25351p = rVar;
                    this.f25352q = 0L;
                    this.f25349n = i19;
                }
            } else if (i13 == 2) {
                int i20 = this.f25346k ? 7 : 5;
                byte[] bArr3 = this.f25337b.f26038a;
                int iMin2 = Math.min(i12, i20 - this.f25344i);
                nVar.a(bArr3, this.f25344i, iMin2);
                int i21 = this.f25344i + iMin2;
                this.f25344i = i21;
                if (i21 == i20) {
                    this.f25337b.b(0);
                    if (this.f25347l) {
                        this.f25337b.c(10);
                    } else {
                        int iA = this.f25337b.a(2) + 1;
                        if (iA != 2) {
                            Log.w("AdtsReader", "Detected audio object type: " + iA + ", but assuming AAC LC.");
                            iA = 2;
                        }
                        int iA2 = this.f25337b.a(4);
                        this.f25337b.c(1);
                        byte[] bArr4 = {(byte) (((iA << 3) & 248) | ((iA2 >> 1) & 7)), (byte) (((iA2 << 7) & 128) | ((this.f25337b.a(3) << 3) & AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL))};
                        Pair pairA = com.fyber.inneractive.sdk.player.exoplayer2.util.d.a(bArr4);
                        com.fyber.inneractive.sdk.player.exoplayer2.o oVarA = com.fyber.inneractive.sdk.player.exoplayer2.o.a(this.f25340e, MimeTypes.AUDIO_AAC, -1, -1, ((Integer) pairA.second).intValue(), ((Integer) pairA.first).intValue(), Collections.singletonList(bArr4), null, this.f25339d);
                        this.f25348m = 1024000000 / oVarA.f25714s;
                        this.f25341f.a(oVarA);
                        this.f25347l = true;
                    }
                    this.f25337b.c(4);
                    int iA3 = this.f25337b.a(13);
                    int i22 = iA3 - 7;
                    if (this.f25346k) {
                        i22 = iA3 - 9;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar2 = this.f25341f;
                    long j10 = this.f25348m;
                    this.f25343h = 3;
                    this.f25344i = 0;
                    this.f25351p = rVar2;
                    this.f25352q = j10;
                    this.f25349n = i22;
                }
            } else if (i13 == 3) {
                int iMin3 = Math.min(i12, this.f25349n - this.f25344i);
                this.f25351p.a(iMin3, nVar);
                int i23 = this.f25344i + iMin3;
                this.f25344i = i23;
                int i24 = this.f25349n;
                if (i23 == i24) {
                    this.f25351p.a(this.f25350o, 1, i24, 0, null);
                    this.f25350o += this.f25352q;
                    this.f25343h = 0;
                    this.f25344i = 0;
                    this.f25345j = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25340e = e0Var.f25362e;
        e0Var.b();
        this.f25341f = jVar.a(e0Var.f25361d, 1);
        if (this.f25336a) {
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 4);
            this.f25342g = gVarA;
            e0Var.b();
            gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(e0Var.f25362e, MimeTypes.APPLICATION_ID3, (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) null));
            return;
        }
        this.f25342g = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.h();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f25350o = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.f25343h = 0;
        this.f25344i = 0;
        this.f25345j = NotificationCompat.FLAG_LOCAL_ONLY;
    }
}
