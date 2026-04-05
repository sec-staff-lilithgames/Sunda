package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b {
    public static final AtomicInteger G = new AtomicInteger();
    public int A;
    public int B;
    public boolean C;
    public n D;
    public volatile boolean E;
    public volatile boolean F;

    /* renamed from: j, reason: collision with root package name */
    public final int f24745j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24746k;

    /* renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f24747l;

    /* renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f24748m;

    /* renamed from: n, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.k f24749n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f24750o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f24751p;

    /* renamed from: q, reason: collision with root package name */
    public final v f24752q;

    /* renamed from: r, reason: collision with root package name */
    public final String f24753r;

    /* renamed from: s, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f24754s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24755t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24756u;

    /* renamed from: v, reason: collision with root package name */
    public final List f24757v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f24758w;

    /* renamed from: x, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n f24759x;

    /* renamed from: y, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f24760y;

    /* renamed from: z, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f24761z;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar2, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar, List list, int i10, Object obj, long j10, long j11, int i11, int i12, boolean z10, v vVar, h hVar2, byte[] bArr, byte[] bArr2) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h aVar2 = (bArr == null || bArr2 == null) ? hVar : new a(hVar, bArr, bArr2);
        super(i10, i11, j10, j11, aVar.f24821b, aVar2, kVar, obj);
        this.f24746k = i12;
        this.f24749n = kVar2;
        this.f24747l = aVar;
        this.f24757v = list;
        this.f24751p = z10;
        this.f24752q = vVar;
        this.f24750o = aVar2 instanceof a;
        String lastPathSegment = kVar.f25944a.getLastPathSegment();
        this.f24753r = lastPathSegment;
        boolean z11 = true;
        boolean z12 = lastPathSegment.endsWith(".aac") || lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3") || lastPathSegment.endsWith(".mp3");
        this.f24758w = z12;
        if (hVar2 != null) {
            this.f24759x = hVar2.f24759x;
            this.f24760y = hVar2.f24760y;
            this.f24754s = hVar2.f24761z;
            boolean z13 = hVar2.f24747l != aVar;
            this.f24755t = z13;
            if (hVar2.f24746k == i12 && !z13) {
                z11 = false;
            }
            this.f24756u = z11;
        } else {
            this.f24759x = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n() : null;
            this.f24760y = z12 ? new com.fyber.inneractive.sdk.player.exoplayer2.util.n(10) : null;
            this.f24754s = null;
            this.f24755t = false;
            this.f24756u = true;
        }
        this.f24748m = hVar;
        this.f24745j = G.getAndIncrement();
    }

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVarA;
        bVar.f24651e = 0;
        if (!bVar.a(this.f24760y.f26042a, 0, 10, true)) {
            return C.TIME_UNSET;
        }
        this.f24760y.c(10);
        if (this.f24760y.l() != com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.n.f25687b) {
            return C.TIME_UNSET;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f24760y;
        nVar.e(nVar.f26043b + 3);
        int i10 = this.f24760y.i();
        int i11 = i10 + 10;
        if (i11 > this.f24760y.a()) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f24760y;
            byte[] bArr = nVar2.f26042a;
            nVar2.c(i11);
            System.arraycopy(bArr, 0, this.f24760y.f26042a, 0, 10);
        }
        if (!bVar.a(this.f24760y.f26042a, 10, i10, true) || (bVarA = this.f24759x.a(i10, this.f24760y.f26042a)) == null) {
            return C.TIME_UNSET;
        }
        int length = bVarA.f25660a.length;
        for (int i12 = 0; i12 < length; i12++) {
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o oVar = bVarA.f25660a[i12];
            if (oVar instanceof q) {
                q qVar = (q) oVar;
                if ("com.apple.streaming.transportStreamTimestamp".equals(qVar.f25690b)) {
                    System.arraycopy(qVar.f25691c, 0, this.f24760y.f26042a, 0, 8);
                    this.f24760y.c(8);
                    return this.f24760y.g();
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.E = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ef A[Catch: all -> 0x01fe, TryCatch #3 {all -> 0x01fe, blocks: (B:128:0x01de, B:130:0x01ef, B:132:0x01f7, B:136:0x0202, B:135:0x0200, B:138:0x020a, B:147:0x0228, B:145:0x021d, B:146:0x0227, B:140:0x0211, B:142:0x0215), top: B:158:0x01de, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020a A[Catch: all -> 0x01fe, TRY_LEAVE, TryCatch #3 {all -> 0x01fe, blocks: (B:128:0x01de, B:130:0x01ef, B:132:0x01f7, B:136:0x0202, B:135:0x0200, B:138:0x020a, B:147:0x0228, B:145:0x021d, B:146:0x0227, B:140:0x0211, B:142:0x0215), top: B:158:0x01de, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load() {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.h.load():void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.E;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(long j10) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i aVar;
        if (this.f24753r.endsWith(".aac")) {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.c(j10);
        } else if (!this.f24753r.endsWith(".ac3") && !this.f24753r.endsWith(".ec3")) {
            if (this.f24753r.endsWith(".mp3")) {
                aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c(j10);
            } else {
                throw new IllegalArgumentException("Unkown extension for audio file: " + this.f24753r);
            }
        } else {
            aVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.a(j10);
        }
        aVar.a(this.D);
        return aVar;
    }
}
