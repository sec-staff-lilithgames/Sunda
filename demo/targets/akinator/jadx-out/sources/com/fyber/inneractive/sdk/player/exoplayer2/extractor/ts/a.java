package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f25292e = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f25293a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25294b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(2786);

    /* renamed from: c, reason: collision with root package name */
    public b f25295c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f25296d;

    public a(long j10) {
        this.f25293a = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        int iA;
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10);
        int i10 = 0;
        while (true) {
            bVar.a(nVar.f26042a, 0, 10, false);
            nVar.e(0);
            if (nVar.l() != f25292e) {
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
        int i13 = i10;
        while (true) {
            bVar.a(nVar.f26042a, 0, 5, false);
            nVar.e(0);
            if (nVar.o() != 2935) {
                bVar.f24651e = 0;
                i13++;
                if (i13 - i10 >= 8192) {
                    return false;
                }
                bVar.a(i13, false);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = nVar.f26042a;
                if (bArr.length < 5) {
                    iA = -1;
                } else {
                    byte b10 = bArr[4];
                    iA = com.fyber.inneractive.sdk.player.exoplayer2.audio.a.a((b10 & 192) >> 6, b10 & Utf8.REPLACEMENT_BYTE);
                }
                if (iA == -1) {
                    return false;
                }
                bVar.a(iA - 5, false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        b bVar = new b(null);
        this.f25295c = bVar;
        bVar.f25305d = "0";
        bVar.f25306e = jVar.a(0, 1);
        jVar.b();
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f25296d = false;
        this.f25295c.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, EOFException {
        int iMin;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar2;
        byte[] bArr = this.f25294b.f26042a;
        int i10 = bVar.f24652f;
        if (i10 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i10, 2786);
            System.arraycopy(bVar.f24650d, 0, bArr, 0, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            bVar2 = bVar;
            iMin = bVar2.a(bArr, 0, 2786, 0, true);
        } else {
            bVar2 = bVar;
        }
        if (iMin != -1) {
            bVar2.f24649c += iMin;
        }
        if (iMin == -1) {
            return -1;
        }
        this.f25294b.e(0);
        this.f25294b.d(iMin);
        if (!this.f25296d) {
            this.f25295c.f25313l = this.f25293a;
            this.f25296d = true;
        }
        this.f25295c.a(this.f25294b);
        return 0;
    }
}
