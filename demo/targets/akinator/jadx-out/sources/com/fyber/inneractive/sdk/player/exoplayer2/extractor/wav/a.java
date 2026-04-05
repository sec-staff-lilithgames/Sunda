package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements i, q {

    /* renamed from: a, reason: collision with root package name */
    public j f25535a;

    /* renamed from: b, reason: collision with root package name */
    public r f25536b;

    /* renamed from: c, reason: collision with root package name */
    public b f25537c;

    /* renamed from: d, reason: collision with root package name */
    public int f25538d;

    /* renamed from: e, reason: collision with root package name */
    public int f25539e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return ((this.f25537c.f25547h / r0.f25543d) * 1000000) / r0.f25541b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return d.a(bVar) != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f25535a = jVar;
        this.f25536b = jVar.a(0, 1);
        this.f25537c = null;
        jVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f25539e = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        if (this.f25537c == null) {
            b bVarA = d.a(bVar);
            this.f25537c = bVarA;
            if (bVarA != null) {
                int i10 = bVarA.f25541b;
                int i11 = bVarA.f25544e * i10;
                int i12 = bVarA.f25540a;
                this.f25536b.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, MimeTypes.AUDIO_RAW, i11 * i12, 32768, i12, i10, bVarA.f25545f, -1, -1, null, null, 0, null, null));
                this.f25538d = this.f25537c.f25543d;
            } else {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unsupported or unrecognized wav header.");
            }
        }
        b bVar2 = this.f25537c;
        if (bVar2.f25546g == 0 || bVar2.f25547h == 0) {
            bVar.f24651e = 0;
            n nVar = new n(8);
            c cVarA = c.a(bVar, nVar);
            while (cVarA.f25548a != z.a("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + cVarA.f25548a);
                long j10 = cVarA.f25549b + 8;
                if (cVarA.f25548a == z.a("RIFF")) {
                    j10 = 12;
                }
                if (j10 <= 2147483647L) {
                    bVar.a((int) j10);
                    cVarA = c.a(bVar, nVar);
                } else {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Chunk is too large (~2GB+) to skip; id: " + cVarA.f25548a);
                }
            }
            bVar.a(8);
            long j11 = bVar.f24649c;
            long j12 = cVarA.f25549b;
            bVar2.f25546g = j11;
            bVar2.f25547h = j12;
            this.f25535a.a(this);
        }
        int iA = this.f25536b.a(bVar, 32768 - this.f25539e, true);
        if (iA != -1) {
            this.f25539e += iA;
        }
        int i13 = this.f25539e;
        int i14 = this.f25538d;
        int i15 = i13 / i14;
        if (i15 > 0) {
            long j13 = ((bVar.f24649c - i13) * 1000000) / this.f25537c.f25542c;
            int i16 = i15 * i14;
            int i17 = i13 - i16;
            this.f25539e = i17;
            this.f25536b.a(j13, 1, i16, i17, null);
        }
        return iA == -1 ? -1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        b bVar = this.f25537c;
        long j11 = (j10 * bVar.f25542c) / 1000000;
        long j12 = bVar.f25543d;
        return Math.min((j11 / j12) * j12, bVar.f25547h - j12) + bVar.f25546g;
    }
}
