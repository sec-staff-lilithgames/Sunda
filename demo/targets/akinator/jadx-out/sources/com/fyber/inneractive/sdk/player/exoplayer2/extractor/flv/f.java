package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.m;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends e {

    /* renamed from: b, reason: collision with root package name */
    public final n f24696b;

    /* renamed from: c, reason: collision with root package name */
    public final n f24697c;

    /* renamed from: d, reason: collision with root package name */
    public int f24698d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24699e;

    /* renamed from: f, reason: collision with root package name */
    public int f24700f;

    public f(r rVar) {
        super(rVar);
        this.f24696b = new n(l.f26034a);
        this.f24697c = new n(4);
    }

    public final boolean a(n nVar) throws d {
        int iJ = nVar.j();
        int i10 = (iJ >> 4) & 15;
        int i11 = iJ & 15;
        if (i11 != 7) {
            throw new d(m.a("Video format not supported: ", i11));
        }
        this.f24700f = i10;
        return i10 != 5;
    }

    public final void a(n nVar, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        int iJ = nVar.j();
        long jL = (nVar.l() * 1000) + j10;
        if (iJ == 0 && !this.f24699e) {
            byte[] bArr = new byte[nVar.f26044c - nVar.f26043b];
            n nVar2 = new n(bArr);
            nVar.a(bArr, 0, nVar.f26044c - nVar.f26043b);
            com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(nVar2);
            this.f24698d = aVarA.f26101b;
            this.f24695a.a(o.a(null, "video/avc", -1, aVarA.f26102c, aVarA.f26103d, aVarA.f26100a, -1, aVarA.f26104e, null, -1, null, null));
            this.f24699e = true;
            return;
        }
        if (iJ == 1 && this.f24699e) {
            byte[] bArr2 = this.f24697c.f26042a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i10 = 4 - this.f24698d;
            int i11 = 0;
            while (nVar.f26044c - nVar.f26043b > 0) {
                nVar.a(this.f24697c.f26042a, i10, this.f24698d);
                this.f24697c.e(0);
                int iM = this.f24697c.m();
                this.f24696b.e(0);
                this.f24695a.a(4, this.f24696b);
                this.f24695a.a(iM, nVar);
                i11 = i11 + 4 + iM;
            }
            this.f24695a.a(jL, this.f24700f == 1 ? 1 : 0, i11, 0, null);
        }
    }
}
