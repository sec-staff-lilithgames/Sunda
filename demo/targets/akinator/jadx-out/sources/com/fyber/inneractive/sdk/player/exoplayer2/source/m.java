package com.fyber.inneractive.sdk.player.exoplayer2.source;

import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.z {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f25765a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f25766b;

    /* renamed from: c, reason: collision with root package name */
    public final n f25767c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.e f25768d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.o f25769e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f25770f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25771g;

    /* renamed from: h, reason: collision with root package name */
    public long f25772h;

    /* renamed from: i, reason: collision with root package name */
    public long f25773i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f25774j;

    public m(p pVar, Uri uri, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar) {
        this.f25774j = pVar;
        uri.getClass();
        this.f25765a = uri;
        hVar.getClass();
        this.f25766b = hVar;
        nVar.getClass();
        this.f25767c = nVar;
        this.f25768d = eVar;
        this.f25769e = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.o();
        this.f25771g = true;
        this.f25773i = -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f25770f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f25770f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() throws Throwable {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar;
        int iA = 0;
        while (iA == 0 && !this.f25770f) {
            try {
                long j10 = this.f25769e.f25218a;
                long jA = this.f25766b.a(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(this.f25765a, j10, j10, -1L, this.f25774j.f25787h, 0));
                this.f25773i = jA;
                if (jA != -1) {
                    this.f25773i = jA + j10;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f25766b;
                bVar = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b(hVar, j10, this.f25773i);
                try {
                    n nVar = this.f25767c;
                    hVar.a();
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVarA = nVar.a(bVar);
                    if (this.f25771g) {
                        iVarA.a(j10, this.f25772h);
                        this.f25771g = false;
                    }
                    while (iA == 0 && !this.f25770f) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.e eVar = this.f25768d;
                        synchronized (eVar) {
                            while (!eVar.f26015a) {
                                eVar.wait();
                            }
                        }
                        iA = iVarA.a(bVar, this.f25769e);
                        long j11 = bVar.f24649c;
                        if (j11 > 1048576 + j10) {
                            this.f25768d.a();
                            p pVar = this.f25774j;
                            pVar.f25793n.post(pVar.f25792m);
                            j10 = j11;
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else {
                        this.f25769e.f25218a = bVar.f24649c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f25766b);
                } catch (Throwable th2) {
                    th = th2;
                    if (iA != 1 && bVar != null) {
                        this.f25769e.f25218a = bVar.f24649c;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f25766b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = null;
            }
        }
    }
}
