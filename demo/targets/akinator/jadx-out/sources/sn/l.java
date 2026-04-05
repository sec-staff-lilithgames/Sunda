package sn;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gn.x0;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import nh.b5;
import nh.ej;
import nh.l6;
import nh.og;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements v {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f85992b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f85993c;

    /* renamed from: d, reason: collision with root package name */
    public final p0 f85994d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f85995e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85996f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f85997g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85998h;

    /* renamed from: i, reason: collision with root package name */
    public final j f85999i;

    /* renamed from: j, reason: collision with root package name */
    public final go.t f86000j;

    /* renamed from: k, reason: collision with root package name */
    public final k f86001k;

    /* renamed from: l, reason: collision with root package name */
    public final long f86002l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f86003m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f86004n;

    /* renamed from: o, reason: collision with root package name */
    public final Set f86005o;

    /* renamed from: p, reason: collision with root package name */
    public int f86006p;

    /* renamed from: q, reason: collision with root package name */
    public i0 f86007q;

    /* renamed from: r, reason: collision with root package name */
    public d f86008r;

    /* renamed from: s, reason: collision with root package name */
    public d f86009s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f86010t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f86011u;

    /* renamed from: v, reason: collision with root package name */
    public int f86012v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f86013w;

    /* renamed from: x, reason: collision with root package name */
    public on.f0 f86014x;

    /* renamed from: y, reason: collision with root package name */
    public volatile g f86015y;

    public l(UUID uuid, g0 g0Var, p0 p0Var, HashMap map, boolean z10, int[] iArr, boolean z11, go.t tVar, long j10) {
        io.bidmachine.media3.common.util.a.checkNotNull(uuid);
        io.bidmachine.media3.common.util.a.checkArgument(!gn.l.f57985b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f85992b = uuid;
        this.f85993c = g0Var;
        this.f85994d = p0Var;
        this.f85995e = map;
        this.f85996f = z10;
        this.f85997g = iArr;
        this.f85998h = z11;
        this.f86000j = tVar;
        this.f85999i = new j(this);
        this.f86001k = new k(this);
        this.f86012v = 0;
        this.f86003m = new ArrayList();
        this.f86004n = og.newIdentityHashSet();
        this.f86005o = og.newIdentityHashSet();
        this.f86002l = j10;
    }

    public static boolean b(d dVar) {
        if (dVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((n) io.bidmachine.media3.common.util.a.checkNotNull(dVar.getError())).getCause();
        return (cause instanceof ResourceBusyException) || y.isFailureToConstructResourceBusyException(cause);
    }

    public static ArrayList e(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f60615f);
        for (int i10 = 0; i10 < drmInitData.f60615f; i10++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i10);
            if ((schemeData.matches(uuid) || (gn.l.f57986c.equals(uuid) && schemeData.matches(gn.l.f57985b))) && (schemeData.f60620g != null || z10)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public final o a(Looper looper, q qVar, io.bidmachine.media3.common.b bVar, boolean z10) {
        ArrayList arrayListE;
        if (this.f86015y == null) {
            this.f86015y = new g(this, looper);
        }
        DrmInitData drmInitData = bVar.f60669s;
        d dVar = null;
        if (drmInitData == null) {
            int trackType = x0.getTrackType(bVar.f60665o);
            i0 i0Var = (i0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86007q);
            if ((i0Var.getCryptoType() == 2 && j0.f85988c) || a1.linearSearch(this.f85997g, trackType) == -1 || i0Var.getCryptoType() == 1) {
                return null;
            }
            d dVar2 = this.f86008r;
            if (dVar2 == null) {
                d dVarD = d(b5.of(), true, null, z10);
                this.f86003m.add(dVarD);
                this.f86008r = dVarD;
            } else {
                dVar2.acquire(null);
            }
            return this.f86008r;
        }
        if (this.f86013w == null) {
            arrayListE = e((DrmInitData) io.bidmachine.media3.common.util.a.checkNotNull(drmInitData), this.f85992b, false);
            if (arrayListE.isEmpty()) {
                h hVar = new h("Media does not support uuid: " + this.f85992b);
                io.bidmachine.media3.common.util.b0.e("DefaultDrmSessionMgr", "DRM error", hVar);
                if (qVar != null) {
                    qVar.drmSessionManagerError(hVar);
                }
                return new a0(new n(hVar, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayListE = null;
        }
        if (this.f85996f) {
            Iterator it = this.f86003m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar3 = (d) it.next();
                if (Objects.equals(dVar3.f85937a, arrayListE)) {
                    dVar = dVar3;
                    break;
                }
            }
        } else {
            dVar = this.f86009s;
        }
        if (dVar != null) {
            dVar.acquire(qVar);
            return dVar;
        }
        d dVarD2 = d(arrayListE, false, qVar, z10);
        if (!this.f85996f) {
            this.f86009s = dVarD2;
        }
        this.f86003m.add(dVarD2);
        return dVarD2;
    }

    @Override // sn.v
    public o acquireSession(q qVar, io.bidmachine.media3.common.b bVar) {
        g(false);
        io.bidmachine.media3.common.util.a.checkState(this.f86006p > 0);
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f86010t);
        return a(this.f86010t, qVar, bVar, true);
    }

    public final d c(List list, boolean z10, q qVar) {
        io.bidmachine.media3.common.util.a.checkNotNull(this.f86007q);
        boolean z11 = this.f85998h | z10;
        d dVar = new d(this.f85992b, this.f86007q, this.f85999i, this.f86001k, list, this.f86012v, z11, z10, this.f86013w, this.f85995e, this.f85994d, (Looper) io.bidmachine.media3.common.util.a.checkNotNull(this.f86010t), this.f86000j, (on.f0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86014x));
        dVar.acquire(qVar);
        if (this.f86002l != C.TIME_UNSET) {
            dVar.acquire(null);
        }
        return dVar;
    }

    public final d d(List list, boolean z10, q qVar, boolean z11) {
        d dVarC = c(list, z10, qVar);
        boolean zB = b(dVarC);
        long j10 = this.f86002l;
        Set set = this.f86005o;
        if (zB && !set.isEmpty()) {
            ej it = l6.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((o) it.next()).release(null);
            }
            dVarC.release(qVar);
            if (j10 != C.TIME_UNSET) {
                dVarC.release(null);
            }
            dVarC = c(list, z10, qVar);
        }
        if (b(dVarC) && z11) {
            Set set2 = this.f86004n;
            if (!set2.isEmpty()) {
                ej it2 = l6.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    ej it3 = l6.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((o) it3.next()).release(null);
                    }
                }
                dVarC.release(qVar);
                if (j10 != C.TIME_UNSET) {
                    dVarC.release(null);
                }
                return c(list, z10, qVar);
            }
        }
        return dVarC;
    }

    public final void f() {
        if (this.f86007q != null && this.f86006p == 0 && this.f86003m.isEmpty() && this.f86004n.isEmpty()) {
            ((i0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86007q)).release();
            this.f86007q = null;
        }
    }

    public final void g(boolean z10) {
        if (z10 && this.f86010t == null) {
            io.bidmachine.media3.common.util.b0.w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) io.bidmachine.media3.common.util.a.checkNotNull(this.f86010t)).getThread()) {
            io.bidmachine.media3.common.util.b0.w("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f86010t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // sn.v
    public int getCryptoType(io.bidmachine.media3.common.b bVar) {
        g(false);
        int cryptoType = ((i0) io.bidmachine.media3.common.util.a.checkNotNull(this.f86007q)).getCryptoType();
        DrmInitData drmInitData = bVar.f60669s;
        if (drmInitData == null) {
            if (a1.linearSearch(this.f85997g, x0.getTrackType(bVar.f60665o)) == -1) {
                return 0;
            }
        } else if (this.f86013w == null) {
            UUID uuid = this.f85992b;
            if (e(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.f60615f == 1 && drmInitData.get(0).matches(gn.l.f57985b)) {
                    io.bidmachine.media3.common.util.b0.w("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = drmInitData.f60614e;
            if (str != null && !C.CENC_TYPE_cenc.equals(str) && (!C.CENC_TYPE_cbcs.equals(str) ? C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) : a1.f60679a < 25)) {
                return 1;
            }
        }
        return cryptoType;
    }

    @Override // sn.v
    public u preacquireSession(q qVar, io.bidmachine.media3.common.b bVar) {
        io.bidmachine.media3.common.util.a.checkState(this.f86006p > 0);
        io.bidmachine.media3.common.util.a.checkStateNotNull(this.f86010t);
        i iVar = new i(this, qVar);
        iVar.acquire(bVar);
        return iVar;
    }

    @Override // sn.v
    public final void prepare() {
        g(true);
        int i10 = this.f86006p;
        this.f86006p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f86007q == null) {
            i0 i0VarAcquireExoMediaDrm = ((k0) this.f85993c).acquireExoMediaDrm(this.f85992b);
            this.f86007q = i0VarAcquireExoMediaDrm;
            i0VarAcquireExoMediaDrm.setOnEventListener(new f(this));
            return;
        }
        if (this.f86002l == C.TIME_UNSET) {
            return;
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f86003m;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((d) arrayList.get(i11)).acquire(null);
            i11++;
        }
    }

    @Override // sn.v
    public final void release() {
        g(true);
        int i10 = this.f86006p - 1;
        this.f86006p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f86002l != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f86003m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).release(null);
            }
        }
        ej it = l6.copyOf((Collection) this.f86004n).iterator();
        while (it.hasNext()) {
            ((i) it.next()).release();
        }
        f();
    }

    public void setMode(int i10, byte[] bArr) {
        io.bidmachine.media3.common.util.a.checkState(this.f86003m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            io.bidmachine.media3.common.util.a.checkNotNull(bArr);
        }
        this.f86012v = i10;
        this.f86013w = bArr;
    }

    @Override // sn.v
    public void setPlayer(Looper looper, on.f0 f0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f86010t;
                if (looper2 == null) {
                    this.f86010t = looper;
                    this.f86011u = new Handler(looper);
                } else {
                    io.bidmachine.media3.common.util.a.checkState(looper2 == looper);
                    io.bidmachine.media3.common.util.a.checkNotNull(this.f86011u);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f86014x = f0Var;
    }
}
