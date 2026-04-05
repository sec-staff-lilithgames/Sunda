package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.i f25551a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f25552b;

    /* renamed from: c, reason: collision with root package name */
    public final f f25553c;

    /* renamed from: d, reason: collision with root package name */
    public final l f25554d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f25555e;

    /* renamed from: f, reason: collision with root package name */
    public final w f25556f;

    /* renamed from: g, reason: collision with root package name */
    public final v f25557g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25558h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f25559i;

    /* renamed from: j, reason: collision with root package name */
    public int f25560j;

    /* renamed from: k, reason: collision with root package name */
    public int f25561k;

    /* renamed from: l, reason: collision with root package name */
    public int f25562l;

    /* renamed from: m, reason: collision with root package name */
    public x f25563m;

    /* renamed from: n, reason: collision with root package name */
    public Object f25564n;

    /* renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h f25565o;

    /* renamed from: p, reason: collision with root package name */
    public s f25566p;

    /* renamed from: q, reason: collision with root package name */
    public i f25567q;

    /* renamed from: r, reason: collision with root package name */
    public int f25568r;

    /* renamed from: s, reason: collision with root package name */
    public long f25569s;

    public g(a[] aVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d dVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + z.f26074e + C3191e4.i.f36531e);
        if (aVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f25551a = dVar;
        this.f25559i = false;
        this.f25560j = 1;
        this.f25555e = new CopyOnWriteArraySet();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b[aVarArr.length]);
        this.f25552b = hVar;
        this.f25563m = x.f26159a;
        this.f25556f = new w();
        this.f25557g = new v();
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.source.z.f25824d;
        this.f25565o = hVar;
        this.f25566p = s.f25723d;
        f fVar = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f25553c = fVar;
        i iVar = new i(0, 0L);
        this.f25567q = iVar;
        this.f25554d = new l(aVarArr, dVar, cVar, this.f25559i, fVar, iVar, this);
    }

    public final void a(boolean z10) {
        if (this.f25559i != z10) {
            this.f25559i = z10;
            this.f25554d.f25604f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator it = this.f25555e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a(this.f25560j, z10);
            }
        }
    }

    public final void a(int i10, long j10) {
        long j11;
        if (i10 >= 0 && (this.f25563m.c() || i10 < this.f25563m.b())) {
            this.f25561k++;
            this.f25568r = i10;
            boolean zC = this.f25563m.c();
            long j12 = C.TIME_UNSET;
            if (zC) {
                j11 = 1000;
            } else {
                this.f25563m.a(i10, this.f25556f, 0L);
                long j13 = j10 == C.TIME_UNSET ? this.f25556f.f26156e : j10;
                w wVar = this.f25556f;
                int i11 = wVar.f26154c;
                long j14 = wVar.f26158g;
                int i12 = b.f24611a;
                long j15 = (j13 == C.TIME_UNSET ? -9223372036854775807L : j13 * 1000) + j14;
                j11 = 1000;
                long j16 = this.f25563m.a(i11, this.f25557g, false).f26081d;
                while (j16 != C.TIME_UNSET && j15 >= j16 && i11 < this.f25556f.f26155d) {
                    j15 -= j16;
                    i11++;
                    j16 = this.f25563m.a(i11, this.f25557g, false).f26081d;
                }
            }
            if (j10 == C.TIME_UNSET) {
                this.f25569s = 0L;
                this.f25554d.f25604f.obtainMessage(3, new j(this.f25563m, i10, C.TIME_UNSET)).sendToTarget();
                return;
            }
            this.f25569s = j10;
            l lVar = this.f25554d;
            x xVar = this.f25563m;
            int i13 = b.f24611a;
            if (j10 != C.TIME_UNSET) {
                j12 = j10 * j11;
            }
            lVar.f25604f.obtainMessage(3, new j(xVar, i10, j12)).sendToTarget();
            Iterator it = this.f25555e.iterator();
            while (it.hasNext()) {
                ((b0) it.next()).getClass();
            }
            return;
        }
        throw new q();
    }

    public final void a(e... eVarArr) {
        l lVar = this.f25554d;
        if (lVar.f25615q) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            lVar.f25604f.obtainMessage(11, eVarArr).sendToTarget();
        }
    }

    public final int a() {
        if (!this.f25563m.c() && this.f25561k <= 0) {
            return this.f25563m.a(this.f25567q.f25589a, this.f25557g, false).f26080c;
        }
        return this.f25568r;
    }
}
