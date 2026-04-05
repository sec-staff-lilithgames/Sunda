package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import de.f0;
import de.g;
import de.h;
import de.h0;
import de.i;
import de.j;
import de.j0;
import de.m;
import de.n;
import de.p;
import de.p0;
import de.s;
import de.t;
import de.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import nh.b5;
import nh.ej;
import nh.l6;
import nh.og;
import qf.o0;
import zd.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f27409b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f27410c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f27411d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f27412e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27413f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f27414g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27415h;

    /* renamed from: i, reason: collision with root package name */
    public final i f27416i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f27417j;

    /* renamed from: k, reason: collision with root package name */
    public final j f27418k;

    /* renamed from: l, reason: collision with root package name */
    public final long f27419l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f27420m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f27421n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f27422o;

    /* renamed from: p, reason: collision with root package name */
    public int f27423p;

    /* renamed from: q, reason: collision with root package name */
    public e f27424q;

    /* renamed from: r, reason: collision with root package name */
    public a f27425r;

    /* renamed from: s, reason: collision with root package name */
    public a f27426s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f27427t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f27428u;

    /* renamed from: v, reason: collision with root package name */
    public int f27429v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f27430w;

    /* renamed from: x, reason: collision with root package name */
    public c0 f27431x;

    /* renamed from: y, reason: collision with root package name */
    public volatile de.f f27432y;

    public b(UUID uuid, f0 f0Var, p0 p0Var, HashMap map, boolean z10, int[] iArr, boolean z11, o0 o0Var, long j10) {
        com.google.android.exoplayer2.util.a.checkNotNull(uuid);
        com.google.android.exoplayer2.util.a.checkArgument(!com.google.android.exoplayer2.j.f27535b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27409b = uuid;
        this.f27410c = f0Var;
        this.f27411d = p0Var;
        this.f27412e = map;
        this.f27413f = z10;
        this.f27414g = iArr;
        this.f27415h = z11;
        this.f27417j = o0Var;
        this.f27416i = new i(this);
        this.f27418k = new j(this);
        this.f27429v = 0;
        this.f27420m = new ArrayList();
        this.f27421n = og.newIdentityHashSet();
        this.f27422o = og.newIdentityHashSet();
        this.f27419l = j10;
    }

    public static boolean b(a aVar) {
        if (aVar.getState() == 1) {
            return n1.f28506a < 19 || (((m) com.google.android.exoplayer2.util.a.checkNotNull(aVar.getError())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    public static ArrayList e(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f27370f);
        for (int i10 = 0; i10 < drmInitData.f27370f; i10++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i10);
            if ((schemeData.matches(uuid) || (com.google.android.exoplayer2.j.f27536c.equals(uuid) && schemeData.matches(com.google.android.exoplayer2.j.f27535b))) && (schemeData.f27375g != null || z10)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final n a(Looper looper, p pVar, z0 z0Var, boolean z10) {
        ArrayList arrayListE;
        if (this.f27432y == null) {
            this.f27432y = new de.f(this, looper);
        }
        DrmInitData drmInitData = z0Var.f28805q;
        a aVar = null;
        if (drmInitData == null) {
            int trackType = l0.getTrackType(z0Var.f28802n);
            e eVar = (e) com.google.android.exoplayer2.util.a.checkNotNull(this.f27424q);
            if ((eVar.getCryptoType() == 2 && h0.f52132d) || n1.linearSearch(this.f27414g, trackType) == -1 || eVar.getCryptoType() == 1) {
                return null;
            }
            a aVar2 = this.f27425r;
            if (aVar2 == null) {
                a aVarD = d(b5.of(), true, null, z10);
                this.f27420m.add(aVarD);
                this.f27425r = aVarD;
            } else {
                aVar2.acquire(null);
            }
            return this.f27425r;
        }
        if (this.f27430w == null) {
            arrayListE = e((DrmInitData) com.google.android.exoplayer2.util.a.checkNotNull(drmInitData), this.f27409b, false);
            if (arrayListE.isEmpty()) {
                g gVar = new g("Media does not support uuid: " + this.f27409b);
                com.google.android.exoplayer2.util.f0.e("DefaultDrmSessionMgr", "DRM error", gVar);
                if (pVar != null) {
                    pVar.drmSessionManagerError(gVar);
                }
                return new z(new m(gVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayListE = null;
        }
        if (this.f27413f) {
            Iterator it = this.f27420m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar3 = (a) it.next();
                if (n1.areEqual(aVar3.f27376a, arrayListE)) {
                    aVar = aVar3;
                    break;
                }
            }
        } else {
            aVar = this.f27426s;
        }
        if (aVar != null) {
            aVar.acquire(pVar);
            return aVar;
        }
        a aVarD2 = d(arrayListE, false, pVar, z10);
        if (!this.f27413f) {
            this.f27426s = aVarD2;
        }
        this.f27420m.add(aVarD2);
        return aVarD2;
    }

    @Override // de.t
    public n acquireSession(p pVar, z0 z0Var) {
        g(false);
        com.google.android.exoplayer2.util.a.checkState(this.f27423p > 0);
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f27427t);
        return a(this.f27427t, pVar, z0Var, true);
    }

    public final a c(List list, boolean z10, p pVar) {
        com.google.android.exoplayer2.util.a.checkNotNull(this.f27424q);
        boolean z11 = this.f27415h | z10;
        a aVar = new a(this.f27409b, this.f27424q, this.f27416i, this.f27418k, list, this.f27429v, z11, z10, this.f27430w, this.f27412e, this.f27411d, (Looper) com.google.android.exoplayer2.util.a.checkNotNull(this.f27427t), this.f27417j, (c0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27431x));
        aVar.acquire(pVar);
        if (this.f27419l != C.TIME_UNSET) {
            aVar.acquire(null);
        }
        return aVar;
    }

    public final a d(List list, boolean z10, p pVar, boolean z11) {
        a aVarC = c(list, z10, pVar);
        boolean zB = b(aVarC);
        long j10 = this.f27419l;
        Set set = this.f27422o;
        if (zB && !set.isEmpty()) {
            ej it = l6.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((n) it.next()).release(null);
            }
            aVarC.release(pVar);
            if (j10 != C.TIME_UNSET) {
                aVarC.release(null);
            }
            aVarC = c(list, z10, pVar);
        }
        if (b(aVarC) && z11) {
            Set set2 = this.f27421n;
            if (!set2.isEmpty()) {
                ej it2 = l6.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((h) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    ej it3 = l6.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((n) it3.next()).release(null);
                    }
                }
                aVarC.release(pVar);
                if (j10 != C.TIME_UNSET) {
                    aVarC.release(null);
                }
                return c(list, z10, pVar);
            }
        }
        return aVarC;
    }

    public final void f() {
        if (this.f27424q != null && this.f27423p == 0 && this.f27420m.isEmpty() && this.f27421n.isEmpty()) {
            ((e) com.google.android.exoplayer2.util.a.checkNotNull(this.f27424q)).release();
            this.f27424q = null;
        }
    }

    public final void g(boolean z10) {
        if (z10 && this.f27427t == null) {
            com.google.android.exoplayer2.util.f0.w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) com.google.android.exoplayer2.util.a.checkNotNull(this.f27427t)).getThread()) {
            com.google.android.exoplayer2.util.f0.w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f27427t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // de.t
    public int getCryptoType(z0 z0Var) {
        g(false);
        int cryptoType = ((e) com.google.android.exoplayer2.util.a.checkNotNull(this.f27424q)).getCryptoType();
        DrmInitData drmInitData = z0Var.f28805q;
        if (drmInitData == null) {
            if (n1.linearSearch(this.f27414g, l0.getTrackType(z0Var.f28802n)) == -1) {
                return 0;
            }
        } else if (this.f27430w == null) {
            UUID uuid = this.f27409b;
            if (e(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.f27370f == 1 && drmInitData.get(0).matches(com.google.android.exoplayer2.j.f27535b)) {
                    com.google.android.exoplayer2.util.f0.w("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.f27369e;
            if (str != null && !C.CENC_TYPE_cenc.equals(str) && (!C.CENC_TYPE_cbcs.equals(str) ? C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) : n1.f28506a < 25)) {
                return 1;
            }
        }
        return cryptoType;
    }

    @Override // de.t
    public s preacquireSession(p pVar, z0 z0Var) {
        com.google.android.exoplayer2.util.a.checkState(this.f27423p > 0);
        com.google.android.exoplayer2.util.a.checkStateNotNull(this.f27427t);
        h hVar = new h(this, pVar);
        hVar.acquire(z0Var);
        return hVar;
    }

    @Override // de.t
    public final void prepare() {
        g(true);
        int i10 = this.f27423p;
        this.f27423p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f27424q == null) {
            e eVarAcquireExoMediaDrm = ((j0) this.f27410c).acquireExoMediaDrm(this.f27409b);
            this.f27424q = eVarAcquireExoMediaDrm;
            eVarAcquireExoMediaDrm.setOnEventListener(new de.e(this));
            return;
        }
        if (this.f27419l == C.TIME_UNSET) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f27420m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i11)).acquire(null);
            i11++;
        }
    }

    @Override // de.t
    public final void release() {
        g(true);
        int i10 = this.f27423p - 1;
        this.f27423p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f27419l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f27420m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((a) arrayList.get(i11)).release(null);
            }
        }
        ej it = l6.copyOf((Collection) this.f27421n).iterator();
        while (it.hasNext()) {
            ((h) it.next()).release();
        }
        f();
    }

    public void setMode(int i10, byte[] bArr) {
        com.google.android.exoplayer2.util.a.checkState(this.f27420m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            com.google.android.exoplayer2.util.a.checkNotNull(bArr);
        }
        this.f27429v = i10;
        this.f27430w = bArr;
    }

    @Override // de.t
    public void setPlayer(Looper looper, c0 c0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f27427t;
                if (looper2 == null) {
                    this.f27427t = looper;
                    this.f27428u = new Handler(looper);
                } else {
                    com.google.android.exoplayer2.util.a.checkState(looper2 == looper);
                    com.google.android.exoplayer2.util.a.checkNotNull(this.f27428u);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f27431x = c0Var;
    }
}
