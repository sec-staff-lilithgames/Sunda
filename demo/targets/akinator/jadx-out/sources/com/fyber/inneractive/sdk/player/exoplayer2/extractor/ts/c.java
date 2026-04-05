package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f25328e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f25329a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25330b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(200);

    /* renamed from: c, reason: collision with root package name */
    public d f25331c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25332d;

    public c(long j10) {
        this.f25329a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.m(nVar.f26042a);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f26042a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f25328e) {
                break;
            }
            nVar.e(nVar.f26043b + 3);
            int i11 = nVar.i();
            i10 += i11 + 10;
            bVar.a(i11, false);
        }
        bVar.f24651e = 0;
        bVar.a(i10, false);
        int i12 = 0;
        int i13 = 0;
        int i14 = i10;
        while (true) {
            bVar.a(nVar.f26042a, 0, 2, false);
            nVar.e(0);
            if ((nVar.o() & 65526) != 65520) {
                bVar.f24651e = 0;
                i14++;
                if (i14 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i14, false);
                i12 = 0;
                i13 = 0;
            } else {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                bVar.a(nVar.f26042a, 0, 4, false);
                mVar.b(14);
                int iA = mVar.a(13);
                if (iA <= 6) {
                    return false;
                }
                bVar.a(iA - 6, false);
                i13 += iA;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        d dVar = new d(true, null);
        this.f25331c = dVar;
        dVar.a(jVar, new e0(Integer.MIN_VALUE, 0, 1));
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f25332d = false;
        d dVar = this.f25331c;
        dVar.f25343h = 0;
        dVar.f25344i = 0;
        dVar.f25345j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f25330b.f26042a;
        int i10 = bVar.f24652f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 200);
            System.arraycopy(bVar.f24650d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 200, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f24649c += iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f25330b.e(0);
        this.f25330b.d(iMin);
        if (!this.f25332d) {
            this.f25331c.f25350o = this.f25329a;
            this.f25332d = true;
        }
        this.f25331c.a(this.f25330b);
        return 0;
    }
}
