package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final h f25928a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c f25929b;

    public e0(h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar) {
        hVar.getClass();
        this.f25928a = hVar;
        cVar.getClass();
        this.f25929b = cVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(k kVar) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        long jA = this.f25928a.a(kVar);
        if (kVar.f25947d == -1 && jA != -1) {
            kVar = new k(kVar.f25944a, kVar.f25945b, kVar.f25946c, jA, kVar.f25948e, kVar.f25949f);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f25929b;
        cVar.getClass();
        if (kVar.f25947d == -1 && (kVar.f25949f & 2) != 2) {
            cVar.f25857d = null;
            return jA;
        }
        cVar.f25857d = kVar;
        cVar.f25862i = 0L;
        try {
            cVar.b();
            return jA;
        } catch (IOException e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b {
        try {
            this.f25928a.close();
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f25929b;
            if (cVar.f25857d == null) {
                return;
            }
            try {
                cVar.a();
            } catch (IOException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar2 = this.f25929b;
            if (cVar2.f25857d != null) {
                try {
                    cVar2.a();
                } catch (IOException e11) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e11);
                }
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f25928a.read(bArr, i10, i11);
        if (i12 > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.c cVar = this.f25929b;
            if (cVar.f25857d != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (cVar.f25861h == cVar.f25855b) {
                            cVar.a();
                            cVar.b();
                        }
                        int iMin = (int) Math.min(i12 - i13, cVar.f25855b - cVar.f25861h);
                        cVar.f25859f.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        cVar.f25861h += j10;
                        cVar.f25862i += j10;
                    } catch (IOException e10) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b(e10);
                    }
                }
            }
        }
        return i12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        return this.f25928a.a();
    }
}
