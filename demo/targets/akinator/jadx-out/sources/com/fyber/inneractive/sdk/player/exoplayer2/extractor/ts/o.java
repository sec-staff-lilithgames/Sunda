package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements h {

    /* renamed from: a, reason: collision with root package name */
    public final x f25459a;

    /* renamed from: b, reason: collision with root package name */
    public String f25460b;

    /* renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25461c;

    /* renamed from: d, reason: collision with root package name */
    public n f25462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25463e;

    /* renamed from: l, reason: collision with root package name */
    public long f25470l;

    /* renamed from: m, reason: collision with root package name */
    public long f25471m;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f25464f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final r f25465g = new r(32);

    /* renamed from: h, reason: collision with root package name */
    public final r f25466h = new r(33);

    /* renamed from: i, reason: collision with root package name */
    public final r f25467i = new r(34);

    /* renamed from: j, reason: collision with root package name */
    public final r f25468j = new r(39);

    /* renamed from: k, reason: collision with root package name */
    public final r f25469k = new r(40);

    /* renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f25472n = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    public o(x xVar) {
        this.f25459a = xVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f25464f);
        r rVar = this.f25465g;
        rVar.f25492b = false;
        rVar.f25493c = false;
        r rVar2 = this.f25466h;
        rVar2.f25492b = false;
        rVar2.f25493c = false;
        r rVar3 = this.f25467i;
        rVar3.f25492b = false;
        rVar3.f25493c = false;
        r rVar4 = this.f25468j;
        rVar4.f25492b = false;
        rVar4.f25493c = false;
        r rVar5 = this.f25469k;
        rVar5.f25492b = false;
        rVar5.f25493c = false;
        n nVar = this.f25462d;
        nVar.f25451f = false;
        nVar.f25452g = false;
        nVar.f25453h = false;
        nVar.f25454i = false;
        nVar.f25455j = false;
        this.f25470l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25460b = e0Var.f25362e;
        e0Var.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(e0Var.f25361d, 2);
        this.f25461c = gVarA;
        this.f25462d = new n(gVarA);
        this.f25459a.a(jVar, e0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[PHI: r12 r15 r17 r18
      0x00ab: PHI (r12v2 int) = (r12v0 int), (r12v0 int), (r12v0 int), (r12v4 int) binds: [B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:34:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r15v7 int) binds: [B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:34:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r17v1 int) = (r17v0 int), (r17v0 int), (r17v0 int), (r17v3 int) binds: [B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:34:0x009c] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r18v1 long) = (r18v0 long), (r18v0 long), (r18v0 long), (r18v3 long) binds: [B:37:0x00d2, B:39:0x00d8, B:41:0x00de, B:34:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r43) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        this.f25471m = j10;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f25463e) {
            n nVar = this.f25462d;
            if (nVar.f25451f) {
                int i12 = nVar.f25449d;
                int i13 = (i10 + 2) - i12;
                if (i13 < i11) {
                    nVar.f25452g = (bArr[i13] & 128) != 0;
                    nVar.f25451f = false;
                } else {
                    nVar.f25449d = (i11 - i10) + i12;
                }
            }
        } else {
            this.f25465g.a(bArr, i10, i11);
            this.f25466h.a(bArr, i10, i11);
            this.f25467i.a(bArr, i10, i11);
        }
        this.f25468j.a(bArr, i10, i11);
        this.f25469k.a(bArr, i10, i11);
    }
}
