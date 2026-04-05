package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.v;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements x, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final a f24876a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f24877b = new b0("HlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final d0 f24878c;

    /* renamed from: d, reason: collision with root package name */
    public d f24879d;

    /* renamed from: e, reason: collision with root package name */
    public long f24880e;

    /* renamed from: f, reason: collision with root package name */
    public long f24881f;

    /* renamed from: g, reason: collision with root package name */
    public long f24882g;

    /* renamed from: h, reason: collision with root package name */
    public long f24883h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24884i;

    /* renamed from: j, reason: collision with root package name */
    public IOException f24885j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f24886k;

    public h(k kVar, a aVar, long j10) {
        this.f24886k = kVar;
        this.f24876a = aVar;
        this.f24882g = j10;
        this.f24878c = new d0(kVar.f24887a.f24719a.a(), com.fyber.inneractive.sdk.player.exoplayer2.util.x.a(kVar.f24896j.f24850a, aVar.f24820a), kVar.f24888b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24886k.f24895i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
        long j12 = d0Var.f25927f;
        if (fVar.f25757b != null) {
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12));
        }
    }

    public final void b() {
        this.f24883h = 0L;
        if (this.f24884i || this.f24877b.a()) {
            return;
        }
        b0 b0Var = this.f24877b;
        d0 d0Var = this.f24878c;
        int i10 = this.f24886k.f24889c;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, this, i10, SystemClock.elapsedRealtime());
        if (b0Var.f25852b != null) {
            throw new IllegalStateException();
        }
        b0Var.f25852b = yVar;
        yVar.f26003e = null;
        b0Var.f25851a.execute(yVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24884i = false;
        b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f25925d;
        if (eVar instanceof d) {
            a((d) eVar);
            com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24886k.f24895i;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
            long j12 = d0Var.f25927f;
            if (fVar.f25757b != null) {
                fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12));
                return;
            }
            return;
        }
        this.f24885j = new r("Loaded playlist has unexpected type.");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        int i10;
        IOException iOException2 = iOException;
        d0 d0Var = (d0) zVar;
        boolean z10 = iOException2 instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24886k.f24895i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
        long j12 = d0Var.f25927f;
        if (fVar.f25757b != null) {
            iOException2 = iOException;
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, iOException, z10));
        }
        if (z10) {
            return 3;
        }
        if ((iOException2 instanceof v) && ((i10 = ((v) iOException2).f25996a) == 404 || i10 == 410)) {
            a();
            k kVar2 = this.f24886k;
            if (kVar2.f24897k != this.f24876a) {
                return 2;
            }
            List list = kVar2.f24896j.f24822b;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = (h) kVar2.f24890d.get(list.get(i11));
                if (jElapsedRealtime > hVar.f24883h) {
                    kVar2.f24897k = hVar.f24876a;
                    hVar.b();
                    return 2;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d r29) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d):void");
    }

    public final void a() {
        this.f24883h = SystemClock.elapsedRealtime() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        k kVar = this.f24886k;
        a aVar = this.f24876a;
        int size = kVar.f24893g.size();
        for (int i10 = 0; i10 < size; i10++) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i iVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.i) kVar.f24893g.get(i10);
            for (n nVar : iVar.f24775n) {
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f fVar = nVar.f24788c;
                int iA = fVar.f24734f.a(aVar.f24821b);
                if (iA != -1) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = fVar.f24744p;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= bVar.f25834b) {
                            i11 = -1;
                            break;
                        } else if (bVar.f25835c[i11] == iA) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (i11 != -1) {
                        fVar.f24744p.a(i11);
                    }
                }
            }
            if (iVar.f24774m != null) {
                l lVar = (l) iVar.f24771j;
                lVar.getClass();
                lVar.f25604f.obtainMessage(9, iVar).sendToTarget();
            } else {
                for (n nVar2 : iVar.f24775n) {
                    if (!nVar2.f24800o) {
                        nVar2.b(nVar2.f24808w);
                    }
                }
            }
        }
    }
}
