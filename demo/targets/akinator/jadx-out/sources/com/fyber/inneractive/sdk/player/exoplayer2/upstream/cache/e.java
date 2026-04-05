package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.e0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final l f25865a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f25866b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f25867c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f25868d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25869e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25870f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25871g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f25872h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25873i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f25874j;

    /* renamed from: k, reason: collision with root package name */
    public int f25875k;

    /* renamed from: l, reason: collision with root package name */
    public String f25876l;

    /* renamed from: m, reason: collision with root package name */
    public long f25877m;

    /* renamed from: n, reason: collision with root package name */
    public long f25878n;

    /* renamed from: o, reason: collision with root package name */
    public m f25879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25880p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f25881q;

    public e(l lVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar2, c cVar) {
        this.f25865a = lVar;
        this.f25866b = hVar2;
        this.f25868d = hVar;
        if (cVar != null) {
            this.f25867c = new e0(hVar, cVar);
        } else {
            this.f25867c = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 1
            android.net.Uri r1 = r9.f25944a     // Catch: java.io.IOException -> L23
            r8.f25874j = r1     // Catch: java.io.IOException -> L23
            int r2 = r9.f25949f     // Catch: java.io.IOException -> L23
            r8.f25875k = r2     // Catch: java.io.IOException -> L23
            java.lang.String r2 = r9.f25948e     // Catch: java.io.IOException -> L23
            if (r2 == 0) goto Le
            goto L12
        Le:
            java.lang.String r2 = r1.toString()     // Catch: java.io.IOException -> L23
        L12:
            r8.f25876l = r2     // Catch: java.io.IOException -> L23
            long r3 = r9.f25946c     // Catch: java.io.IOException -> L23
            r8.f25877m = r3     // Catch: java.io.IOException -> L23
            boolean r1 = r8.f25870f     // Catch: java.io.IOException -> L23
            r3 = -1
            if (r1 == 0) goto L25
            boolean r1 = r8.f25880p     // Catch: java.io.IOException -> L23
            if (r1 != 0) goto L2f
            goto L25
        L23:
            r9 = move-exception
            goto L63
        L25:
            long r5 = r9.f25947d     // Catch: java.io.IOException -> L23
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            boolean r1 = r8.f25871g     // Catch: java.io.IOException -> L23
            if (r1 == 0) goto L31
        L2f:
            r1 = r0
            goto L32
        L31:
            r1 = 0
        L32:
            r8.f25881q = r1     // Catch: java.io.IOException -> L23
            long r5 = r9.f25947d     // Catch: java.io.IOException -> L23
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L5b
            if (r1 == 0) goto L3d
            goto L5b
        L3d:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l r1 = r8.f25865a     // Catch: java.io.IOException -> L23
            long r1 = r1.a(r2)     // Catch: java.io.IOException -> L23
            r8.f25878n = r1     // Catch: java.io.IOException -> L23
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L5d
            long r3 = r9.f25946c     // Catch: java.io.IOException -> L23
            long r1 = r1 - r3
            r8.f25878n = r1     // Catch: java.io.IOException -> L23
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 <= 0) goto L55
            goto L5d
        L55:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.i r9 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.i     // Catch: java.io.IOException -> L23
            r9.<init>()     // Catch: java.io.IOException -> L23
            throw r9     // Catch: java.io.IOException -> L23
        L5b:
            r8.f25878n = r5     // Catch: java.io.IOException -> L23
        L5d:
            r8.a(r0)     // Catch: java.io.IOException -> L23
            long r0 = r8.f25878n     // Catch: java.io.IOException -> L23
            return r0
        L63:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r1 = r8.f25872h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r2 = r8.f25866b
            if (r1 == r2) goto L6d
            boolean r1 = r9 instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a
            if (r1 == 0) goto L6f
        L6d:
            r8.f25880p = r0
        L6f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    public final void b() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f25872h;
        if (hVar == null) {
            return;
        }
        try {
            hVar.close();
            this.f25872h = null;
            this.f25873i = false;
            m mVar = this.f25879o;
            if (mVar != null) {
                l lVar = this.f25865a;
                synchronized (lVar) {
                    if (mVar != lVar.f25909c.remove(mVar.f25886a)) {
                        throw new IllegalStateException();
                    }
                    lVar.notifyAll();
                }
                this.f25879o = null;
            }
        } catch (Throwable th2) {
            m mVar2 = this.f25879o;
            if (mVar2 != null) {
                this.f25865a.b(mVar2);
                this.f25879o = null;
            }
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() throws IOException {
        this.f25874j = null;
        try {
            b();
        } catch (IOException e10) {
            if (this.f25872h == this.f25866b || (e10 instanceof a)) {
                this.f25880p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f25878n == 0) {
            return -1;
        }
        try {
            int i12 = this.f25872h.read(bArr, i10, i11);
            if (i12 >= 0) {
                long j10 = i12;
                this.f25877m += j10;
                long j11 = this.f25878n;
                if (j11 != -1) {
                    this.f25878n = j11 - j10;
                    return i12;
                }
            } else {
                if (this.f25873i) {
                    a(this.f25877m);
                    this.f25878n = 0L;
                }
                b();
                long j12 = this.f25878n;
                if ((j12 > 0 || j12 == -1) && a(false)) {
                    return read(bArr, i10, i11);
                }
            }
            return i12;
        } catch (IOException e10) {
            if (this.f25872h == this.f25866b || (e10 instanceof a)) {
                this.f25880p = true;
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.f25872h;
        return hVar == this.f25868d ? hVar.a() : this.f25874j;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.e.a(boolean):boolean");
    }

    public final void a(long j10) {
        if (this.f25872h == this.f25867c) {
            l lVar = this.f25865a;
            String str = this.f25876l;
            synchronized (lVar) {
                try {
                    i iVar = lVar.f25910d;
                    h hVar = (h) iVar.f25896a.get(str);
                    if (hVar == null) {
                        iVar.a(str, j10);
                    } else if (hVar.f25895d != j10) {
                        hVar.f25895d = j10;
                        iVar.f25901f = true;
                    }
                    lVar.f25910d.b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
