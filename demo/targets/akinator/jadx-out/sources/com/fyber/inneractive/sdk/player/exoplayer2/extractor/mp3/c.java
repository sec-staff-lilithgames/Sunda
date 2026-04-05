package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements i {

    /* renamed from: m, reason: collision with root package name */
    public static final int f24976m = z.a("Xing");

    /* renamed from: n, reason: collision with root package name */
    public static final int f24977n = z.a("Info");

    /* renamed from: o, reason: collision with root package name */
    public static final int f24978o = z.a("VBRI");

    /* renamed from: a, reason: collision with root package name */
    public final long f24979a;

    /* renamed from: e, reason: collision with root package name */
    public j f24983e;

    /* renamed from: f, reason: collision with root package name */
    public r f24984f;

    /* renamed from: g, reason: collision with root package name */
    public int f24985g;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f24986h;

    /* renamed from: i, reason: collision with root package name */
    public b f24987i;

    /* renamed from: k, reason: collision with root package name */
    public long f24989k;

    /* renamed from: l, reason: collision with root package name */
    public int f24990l;

    /* renamed from: b, reason: collision with root package name */
    public final n f24980b = new n(10);

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.n f24981c = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.n();

    /* renamed from: d, reason: collision with root package name */
    public final m f24982d = new m();

    /* renamed from: j, reason: collision with root package name */
    public long f24988j = C.TIME_UNSET;

    public c(long j10) {
        this.f24979a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return a(bVar, true);
    }

    public final a b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        bVar.a(this.f24980b.f26042a, 0, 4, false);
        this.f24980b.e(0);
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(this.f24980b.b(), this.f24981c);
        return new a(this.f24981c.f25216f, bVar.f24649c, bVar.f24648b);
    }

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, boolean z10) throws Throwable {
        int i10;
        int i11;
        int iA;
        int i12 = z10 ? 16384 : 131072;
        bVar.f24651e = 0;
        if (bVar.f24649c == 0) {
            int i13 = 0;
            while (true) {
                bVar.a(this.f24980b.f26042a, 0, 10, false);
                this.f24980b.e(0);
                if (this.f24980b.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f25687b) {
                    break;
                }
                n nVar = this.f24980b;
                nVar.e(nVar.f26043b + 3);
                int i14 = this.f24980b.i();
                int i15 = i14 + 10;
                if (this.f24986h == null) {
                    byte[] bArr = new byte[i15];
                    System.arraycopy(this.f24980b.f26042a, 0, bArr, 0, 10);
                    bVar.a(bArr, 10, i14, false);
                    com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n(null).a(i15, bArr);
                    this.f24986h = bVarA;
                    if (bVarA != null) {
                        this.f24982d.a(bVarA);
                    }
                } else {
                    bVar.a(i14, false);
                }
                i13 += i15;
            }
            bVar.f24651e = 0;
            bVar.a(i13, false);
            i10 = (int) (bVar.f24649c + bVar.f24651e);
            if (!z10) {
                bVar.a(i10);
            }
            i11 = 0;
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i16 = i11;
        int i17 = i16;
        while (true) {
            if (!bVar.a(this.f24980b.f26042a, 0, 4, i11 > 0)) {
                break;
            }
            this.f24980b.e(0);
            int iB = this.f24980b.b();
            if ((i16 == 0 || ((-128000) & iB) == (i16 & (-128000))) && (iA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB)) != -1) {
                i11++;
                if (i11 != 1) {
                    if (i11 == 4) {
                        break;
                    }
                } else {
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.n.a(iB, this.f24981c);
                    i16 = iB;
                }
                bVar.a(iA - 4, false);
            } else {
                int i18 = i17 + 1;
                if (i17 == i12) {
                    if (z10) {
                        return false;
                    }
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Searched too many bytes.");
                }
                if (z10) {
                    bVar.f24651e = 0;
                    bVar.a(i10 + i18, false);
                } else {
                    bVar.a(1);
                }
                i16 = 0;
                i17 = i18;
                i11 = 0;
            }
        }
        if (z10) {
            bVar.a(i10 + i17);
        } else {
            bVar.f24651e = 0;
        }
        this.f24985g = i16;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f24983e = jVar;
        this.f24984f = jVar.a(0, 1);
        this.f24983e.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f24985g = 0;
        this.f24988j = C.TIME_UNSET;
        this.f24989k = 0L;
        this.f24990l = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r42, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }
}
