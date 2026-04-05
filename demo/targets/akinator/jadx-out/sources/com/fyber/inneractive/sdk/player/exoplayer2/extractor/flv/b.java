package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements i, q {

    /* renamed from: n, reason: collision with root package name */
    public static final int f24680n = z.a("FLV");

    /* renamed from: e, reason: collision with root package name */
    public j f24685e;

    /* renamed from: g, reason: collision with root package name */
    public int f24687g;

    /* renamed from: h, reason: collision with root package name */
    public int f24688h;

    /* renamed from: i, reason: collision with root package name */
    public int f24689i;

    /* renamed from: j, reason: collision with root package name */
    public long f24690j;

    /* renamed from: k, reason: collision with root package name */
    public a f24691k;

    /* renamed from: l, reason: collision with root package name */
    public f f24692l;

    /* renamed from: m, reason: collision with root package name */
    public c f24693m;

    /* renamed from: a, reason: collision with root package name */
    public final n f24681a = new n(4);

    /* renamed from: b, reason: collision with root package name */
    public final n f24682b = new n(9);

    /* renamed from: c, reason: collision with root package name */
    public final n f24683c = new n(11);

    /* renamed from: d, reason: collision with root package name */
    public final n f24684d = new n();

    /* renamed from: f, reason: collision with root package name */
    public int f24686f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return 0L;
    }

    public final n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        if (this.f24689i > this.f24684d.a()) {
            n nVar = this.f24684d;
            nVar.f26042a = new byte[Math.max(nVar.a() * 2, this.f24689i)];
            nVar.f26044c = 0;
            nVar.f26043b = 0;
        } else {
            this.f24684d.e(0);
        }
        this.f24684d.d(this.f24689i);
        bVar.b(this.f24684d.f26042a, 0, this.f24689i, false);
        return this.f24684d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f24693m.f24694b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        bVar.a(this.f24681a.f26042a, 0, 3, false);
        this.f24681a.e(0);
        if (this.f24681a.l() != f24680n) {
            return false;
        }
        bVar.a(this.f24681a.f26042a, 0, 2, false);
        this.f24681a.e(0);
        if ((this.f24681a.o() & 250) != 0) {
            return false;
        }
        bVar.a(this.f24681a.f26042a, 0, 4, false);
        this.f24681a.e(0);
        int iB = this.f24681a.b();
        bVar.f24651e = 0;
        bVar.a(iB, false);
        bVar.a(this.f24681a.f26042a, 0, 4, false);
        this.f24681a.e(0);
        return this.f24681a.b() == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f24685e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f24686f = 1;
        this.f24687g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        c cVar;
        f fVar;
        a aVar;
        while (true) {
            int i10 = this.f24686f;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar.a(this.f24687g);
                    this.f24687g = 0;
                    this.f24686f = 3;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        int i11 = this.f24688h;
                        if (i11 == 8 && (aVar = this.f24691k) != null) {
                            n nVarB = b(bVar);
                            long j10 = this.f24690j;
                            aVar.a(nVarB);
                            aVar.a(nVarB, j10);
                        } else if (i11 == 9 && (fVar = this.f24692l) != null) {
                            n nVarB2 = b(bVar);
                            long j11 = this.f24690j;
                            if (fVar.a(nVarB2)) {
                                fVar.a(nVarB2, j11);
                            }
                        } else if (i11 == 18 && (cVar = this.f24693m) != null) {
                            cVar.a(b(bVar), this.f24690j);
                        } else {
                            bVar.a(this.f24689i);
                            z10 = false;
                        }
                        this.f24687g = 4;
                        this.f24686f = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.f24683c.f26042a, 0, 11, true)) {
                        return -1;
                    }
                    this.f24683c.e(0);
                    this.f24688h = this.f24683c.j();
                    this.f24689i = this.f24683c.l();
                    this.f24690j = this.f24683c.l();
                    this.f24690j = ((this.f24683c.j() << 24) | this.f24690j) * 1000;
                    n nVar = this.f24683c;
                    nVar.e(nVar.f26043b + 3);
                    this.f24686f = 4;
                }
            } else {
                if (!bVar.b(this.f24682b.f26042a, 0, 9, true)) {
                    return -1;
                }
                this.f24682b.e(0);
                n nVar2 = this.f24682b;
                nVar2.e(nVar2.f26043b + 4);
                int iJ = this.f24682b.j();
                boolean z11 = (iJ & 4) != 0;
                boolean z12 = (iJ & 1) != 0;
                if (z11 && this.f24691k == null) {
                    this.f24691k = new a(this.f24685e.a(8, 1));
                }
                if (z12 && this.f24692l == null) {
                    this.f24692l = new f(this.f24685e.a(9, 2));
                }
                if (this.f24693m == null) {
                    this.f24693m = new c();
                }
                this.f24685e.b();
                this.f24685e.a(this);
                this.f24687g = this.f24682b.b() - 5;
                this.f24686f = 2;
            }
        }
    }
}
