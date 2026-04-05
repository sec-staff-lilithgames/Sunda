package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements h {

    /* renamed from: n, reason: collision with root package name */
    public static final double[] f25384n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f25385a;

    /* renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f25386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25387c;

    /* renamed from: d, reason: collision with root package name */
    public long f25388d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f25389e = new boolean[4];

    /* renamed from: f, reason: collision with root package name */
    public final i f25390f = new i();

    /* renamed from: g, reason: collision with root package name */
    public boolean f25391g;

    /* renamed from: h, reason: collision with root package name */
    public long f25392h;

    /* renamed from: i, reason: collision with root package name */
    public long f25393i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25394j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f25395k;

    /* renamed from: l, reason: collision with root package name */
    public long f25396l;

    /* renamed from: m, reason: collision with root package name */
    public long f25397m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(this.f25389e);
        i iVar = this.f25390f;
        iVar.f25380a = false;
        iVar.f25381b = 0;
        iVar.f25382c = 0;
        this.f25394j = false;
        this.f25391g = false;
        this.f25392h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        e0Var.a();
        e0Var.b();
        this.f25385a = e0Var.f25362e;
        e0Var.b();
        this.f25386b = jVar.a(e0Var.f25361d, 2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z10, long j10) {
        boolean z11 = j10 != C.TIME_UNSET;
        this.f25394j = z11;
        if (z11) {
            this.f25393i = j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n r28) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j.a(com.fyber.inneractive.sdk.player.exoplayer2.util.n):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
    }
}
