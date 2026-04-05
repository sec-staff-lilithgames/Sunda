package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.t;
import com.fyber.inneractive.sdk.player.exoplayer2.source.u;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.d0;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.y;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f24778a;

    /* renamed from: b, reason: collision with root package name */
    public final b f24779b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.f f24780c;

    /* renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f24781d;

    /* renamed from: e, reason: collision with root package name */
    public t f24782e;

    public j(Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, Handler handler, b0 b0Var) {
        b bVar = new b(gVar);
        this.f24778a = uri;
        this.f24779b = bVar;
        this.f24780c = new com.fyber.inneractive.sdk.player.exoplayer2.source.f(handler, b0Var);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(t tVar) {
        if (this.f24781d != null) {
            throw new IllegalStateException();
        }
        Uri uri = this.f24778a;
        b bVar = this.f24779b;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k(uri, bVar, this.f24780c, this);
        this.f24781d = kVar;
        this.f24782e = tVar;
        d0 d0Var = new d0(bVar.f24719a.a(), uri, kVar.f24888b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.b0 b0Var = kVar.f24894h;
        b0Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        y yVar = new y(b0Var, looperMyLooper, d0Var, kVar, 3, SystemClock.elapsedRealtime());
        if (b0Var.f25852b != null) {
            throw new IllegalStateException();
        }
        b0Var.f25852b = yVar;
        yVar.f26003e = null;
        b0Var.f25851a.execute(yVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f24781d;
        if (kVar != null) {
            kVar.f24894h.a(null);
            Iterator it = kVar.f24890d.values().iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) it.next()).f24877b.a(null);
            }
            kVar.f24891e.removeCallbacksAndMessages(null);
            kVar.f24890d.clear();
            this.f24781d = null;
        }
        this.f24782e = null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar = this.f24781d;
        kVar.f24894h.b();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a aVar = kVar.f24897k;
        if (aVar != null) {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.h) kVar.f24890d.get(aVar);
            hVar.f24877b.b();
            IOException iOException = hVar.f24885j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final s a(int i10, com.fyber.inneractive.sdk.player.exoplayer2.upstream.b bVar, long j10) {
        if (i10 == 0) {
            return new i(this.f24781d, this.f24779b, this.f24780c, bVar, j10);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.u
    public final void a(s sVar) {
        i iVar = (i) sVar;
        iVar.f24762a.f24893g.remove(iVar);
        iVar.f24769h.removeCallbacksAndMessages(null);
        n[] nVarArr = iVar.f24775n;
        if (nVarArr != null) {
            for (n nVar : nVarArr) {
                int size = nVar.f24795j.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) nVar.f24795j.valueAt(i10)).b();
                }
                nVar.f24792g.a(null);
                nVar.f24798m.removeCallbacksAndMessages(null);
                nVar.f24804s = true;
            }
        }
    }
}
