package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.x;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements x {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b f24887a;

    /* renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j f24892f;

    /* renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f24895i;

    /* renamed from: j, reason: collision with root package name */
    public b f24896j;

    /* renamed from: k, reason: collision with root package name */
    public a f24897k;

    /* renamed from: l, reason: collision with root package name */
    public d f24898l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f24899m;

    /* renamed from: c, reason: collision with root package name */
    public final int f24889c = 3;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f24893g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final b0 f24894h = new b0("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: b, reason: collision with root package name */
    public final g f24888b = new g();

    /* renamed from: d, reason: collision with root package name */
    public final IdentityHashMap f24890d = new IdentityHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Handler f24891e = new Handler();

    public k(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j jVar) {
        this.f24887a = bVar;
        this.f24895i = fVar;
        this.f24892f = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11, boolean z10) {
        d0 d0Var = (d0) zVar;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24895i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
        long j12 = d0Var.f25927f;
        if (fVar.f25757b != null) {
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.c(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final void a(z zVar, long j10, long j11) {
        b bVar;
        d0 d0Var = (d0) zVar;
        e eVar = d0Var.f25925d;
        boolean z10 = eVar instanceof d;
        if (z10) {
            List listSingletonList = Collections.singletonList(new a(eVar.f24850a, new o("0", MimeTypes.APPLICATION_M3U8, null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null)));
            List list = Collections.EMPTY_LIST;
            bVar = new b(null, listSingletonList, list, list, null, null);
        } else {
            bVar = (b) eVar;
        }
        this.f24896j = bVar;
        this.f24897k = (a) bVar.f24822b.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(bVar.f24822b);
        arrayList.addAll(bVar.f24823c);
        arrayList.addAll(bVar.f24824d);
        int size = arrayList.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            this.f24890d.put(aVar, new h(this, aVar, jElapsedRealtime));
        }
        h hVar = (h) this.f24890d.get(this.f24897k);
        if (z10) {
            hVar.a((d) eVar);
        } else {
            hVar.b();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24895i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
        long j12 = d0Var.f25927f;
        if (fVar.f25757b != null) {
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.b(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.x
    public final int a(z zVar, long j10, long j11, IOException iOException) {
        d0 d0Var = (d0) zVar;
        boolean z10 = iOException instanceof r;
        com.fyber.inneractive.sdk.player.exoplayer2.source.f fVar = this.f24895i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = d0Var.f25922a;
        long j12 = d0Var.f25927f;
        if (fVar.f25757b != null) {
            fVar.f25756a.post(new com.fyber.inneractive.sdk.player.exoplayer2.source.d(fVar, kVar, 4, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, j10, j11, j12, iOException, z10));
        }
        return z10 ? 3 : 0;
    }

    public final d a(a aVar) {
        d dVar;
        h hVar = (h) this.f24890d.get(aVar);
        hVar.getClass();
        hVar.f24882g = SystemClock.elapsedRealtime();
        d dVar2 = hVar.f24879d;
        if (dVar2 != null && this.f24896j.f24822b.contains(aVar) && (((dVar = this.f24898l) == null || !dVar.f24844j) && ((h) this.f24890d.get(this.f24897k)).f24882g - SystemClock.elapsedRealtime() > MBInterstitialActivity.WEB_LOAD_TIME)) {
            this.f24897k = aVar;
            ((h) this.f24890d.get(aVar)).b();
        }
        return dVar2;
    }
}
