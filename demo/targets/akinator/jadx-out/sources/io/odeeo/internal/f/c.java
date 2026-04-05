package io.odeeo.internal.f;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.f.b;
import io.odeeo.internal.f.e;
import io.odeeo.internal.f.f;
import io.odeeo.internal.f.g;
import io.odeeo.internal.f.h;
import io.odeeo.internal.f.m;
import io.odeeo.internal.p0.v;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.q1;
import io.odeeo.internal.u0.q3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import on.w;
import on.z;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c implements io.odeeo.internal.f.h {

    /* renamed from: c, reason: collision with root package name */
    public final UUID f63862c;

    /* renamed from: d, reason: collision with root package name */
    public final m.g f63863d;

    /* renamed from: e, reason: collision with root package name */
    public final r f63864e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<String, String> f63865f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63866g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f63867h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f63868i;

    /* renamed from: j, reason: collision with root package name */
    public final g f63869j;

    /* renamed from: k, reason: collision with root package name */
    public final v f63870k;

    /* renamed from: l, reason: collision with root package name */
    public final h f63871l;

    /* renamed from: m, reason: collision with root package name */
    public final long f63872m;

    /* renamed from: n, reason: collision with root package name */
    public final List<io.odeeo.internal.f.b> f63873n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<f> f63874o;

    /* renamed from: p, reason: collision with root package name */
    public final Set<io.odeeo.internal.f.b> f63875p;

    /* renamed from: q, reason: collision with root package name */
    public int f63876q;

    /* renamed from: r, reason: collision with root package name */
    public m f63877r;

    /* renamed from: s, reason: collision with root package name */
    public io.odeeo.internal.f.b f63878s;

    /* renamed from: t, reason: collision with root package name */
    public io.odeeo.internal.f.b f63879t;

    /* renamed from: u, reason: collision with root package name */
    public Looper f63880u;

    /* renamed from: v, reason: collision with root package name */
    public Handler f63881v;

    /* renamed from: w, reason: collision with root package name */
    public int f63882w;

    /* renamed from: x, reason: collision with root package name */
    public byte[] f63883x;

    /* renamed from: y, reason: collision with root package name */
    public volatile d f63884y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public boolean f63888d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f63890f;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f63885a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        public UUID f63886b = io.odeeo.internal.b.h.f62712d;

        /* renamed from: c, reason: collision with root package name */
        public m.g f63887c = o.f63939d;

        /* renamed from: g, reason: collision with root package name */
        public v f63891g = new io.odeeo.internal.p0.r();

        /* renamed from: e, reason: collision with root package name */
        public int[] f63889e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        public long f63892h = 300000;

        public c build(r rVar) {
            return new c(this.f63886b, this.f63887c, rVar, this.f63885a, this.f63888d, this.f63889e, this.f63890f, this.f63891g, this.f63892h);
        }

        public b setKeyRequestParameters(Map<String, String> map) {
            this.f63885a.clear();
            if (map != null) {
                this.f63885a.putAll(map);
            }
            return this;
        }

        public b setLoadErrorHandlingPolicy(v vVar) {
            this.f63891g = (v) io.odeeo.internal.q0.a.checkNotNull(vVar);
            return this;
        }

        public b setMultiSession(boolean z10) {
            this.f63888d = z10;
            return this;
        }

        public b setPlayClearSamplesWithoutKeys(boolean z10) {
            this.f63890f = z10;
            return this;
        }

        public b setSessionKeepaliveMs(long j10) {
            io.odeeo.internal.q0.a.checkArgument(j10 > 0 || j10 == C.TIME_UNSET);
            this.f63892h = j10;
            return this;
        }

        public b setUseDrmSessionsForClearContent(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                io.odeeo.internal.q0.a.checkArgument(z10);
            }
            this.f63889e = (int[]) iArr.clone();
            return this;
        }

        public b setUuidAndExoMediaDrmProvider(UUID uuid, m.g gVar) {
            this.f63886b = (UUID) io.odeeo.internal.q0.a.checkNotNull(uuid);
            this.f63887c = (m.g) io.odeeo.internal.q0.a.checkNotNull(gVar);
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.f.c$c, reason: collision with other inner class name */
    public class C0609c implements m.d {
        public C0609c() {
        }

        @Override // io.odeeo.internal.f.m.d
        public void onEvent(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) io.odeeo.internal.q0.a.checkNotNull(c.this.f63884y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (io.odeeo.internal.f.b bVar : c.this.f63873n) {
                if (bVar.hasSessionId(bArr)) {
                    bVar.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements h.b {

        /* renamed from: b, reason: collision with root package name */
        public final g.a f63895b;

        /* renamed from: c, reason: collision with root package name */
        public io.odeeo.internal.f.f f63896c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f63897d;

        public f(g.a aVar) {
            this.f63895b = aVar;
        }

        public void acquire(io.odeeo.internal.b.t tVar) {
            ((Handler) io.odeeo.internal.q0.a.checkNotNull(c.this.f63881v)).post(new z(6, this, tVar));
        }

        @Override // io.odeeo.internal.f.h.b
        public void release() {
            g0.postOrRun((Handler) io.odeeo.internal.q0.a.checkNotNull(c.this.f63881v), new w(this, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(io.odeeo.internal.b.t tVar) {
            if (c.this.f63876q == 0 || this.f63897d) {
                return;
            }
            c cVar = c.this;
            this.f63896c = cVar.a((Looper) io.odeeo.internal.q0.a.checkNotNull(cVar.f63880u), this.f63895b, tVar, false);
            c.this.f63874o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (this.f63897d) {
                return;
            }
            io.odeeo.internal.f.f fVar = this.f63896c;
            if (fVar != null) {
                fVar.release(this.f63895b);
            }
            c.this.f63874o.remove(this);
            this.f63897d = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final Set<io.odeeo.internal.f.b> f63899a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public io.odeeo.internal.f.b f63900b;

        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.f.b.a
        public void onProvisionCompleted() {
            this.f63900b = null;
            h1 h1VarCopyOf = h1.copyOf((Collection) this.f63899a);
            this.f63899a.clear();
            q3 it = h1VarCopyOf.iterator();
            while (it.hasNext()) {
                ((io.odeeo.internal.f.b) it.next()).onProvisionCompleted();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.f.b.a
        public void onProvisionError(Exception exc, boolean z10) {
            this.f63900b = null;
            h1 h1VarCopyOf = h1.copyOf((Collection) this.f63899a);
            this.f63899a.clear();
            q3 it = h1VarCopyOf.iterator();
            while (it.hasNext()) {
                ((io.odeeo.internal.f.b) it.next()).onProvisionError(exc, z10);
            }
        }

        public void onSessionFullyReleased(io.odeeo.internal.f.b bVar) {
            this.f63899a.remove(bVar);
            if (this.f63900b == bVar) {
                this.f63900b = null;
                if (this.f63899a.isEmpty()) {
                    return;
                }
                io.odeeo.internal.f.b next = this.f63899a.iterator().next();
                this.f63900b = next;
                next.provision();
            }
        }

        @Override // io.odeeo.internal.f.b.a
        public void provisionRequired(io.odeeo.internal.f.b bVar) {
            this.f63899a.add(bVar);
            if (this.f63900b != null) {
                return;
            }
            this.f63900b = bVar;
            bVar.provision();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements b.InterfaceC0608b {
        public h() {
        }

        @Override // io.odeeo.internal.f.b.InterfaceC0608b
        public void onReferenceCountDecremented(io.odeeo.internal.f.b bVar, int i10) {
            if (i10 == 1 && c.this.f63876q > 0 && c.this.f63872m != C.TIME_UNSET) {
                c.this.f63875p.add(bVar);
                ((Handler) io.odeeo.internal.q0.a.checkNotNull(c.this.f63881v)).postAtTime(new w(bVar, 2), bVar, c.this.f63872m + SystemClock.uptimeMillis());
            } else if (i10 == 0) {
                c.this.f63873n.remove(bVar);
                if (c.this.f63878s == bVar) {
                    c.this.f63878s = null;
                }
                if (c.this.f63879t == bVar) {
                    c.this.f63879t = null;
                }
                c.this.f63869j.onSessionFullyReleased(bVar);
                if (c.this.f63872m != C.TIME_UNSET) {
                    ((Handler) io.odeeo.internal.q0.a.checkNotNull(c.this.f63881v)).removeCallbacksAndMessages(bVar);
                    c.this.f63875p.remove(bVar);
                }
            }
            c.this.a();
        }

        @Override // io.odeeo.internal.f.b.InterfaceC0608b
        public void onReferenceCountIncremented(io.odeeo.internal.f.b bVar, int i10) {
            if (c.this.f63872m != C.TIME_UNSET) {
                c.this.f63875p.remove(bVar);
                ((Handler) io.odeeo.internal.q0.a.checkNotNull(c.this.f63881v)).removeCallbacksAndMessages(bVar);
            }
        }
    }

    @Override // io.odeeo.internal.f.h
    public io.odeeo.internal.f.f acquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar) {
        io.odeeo.internal.q0.a.checkState(this.f63876q > 0);
        a(looper);
        return a(looper, aVar, tVar, true);
    }

    @Override // io.odeeo.internal.f.h
    public int getCryptoType(io.odeeo.internal.b.t tVar) {
        int cryptoType = ((m) io.odeeo.internal.q0.a.checkNotNull(this.f63877r)).getCryptoType();
        io.odeeo.internal.f.e eVar = tVar.f62974o;
        if (eVar == null) {
            if (g0.linearSearch(this.f63867h, io.odeeo.internal.q0.t.getTrackType(tVar.f62971l)) == -1) {
                return 0;
            }
        } else if (!a(eVar)) {
            return 1;
        }
        return cryptoType;
    }

    @Override // io.odeeo.internal.f.h
    public h.b preacquireSession(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar) {
        io.odeeo.internal.q0.a.checkState(this.f63876q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.acquire(tVar);
        return fVar;
    }

    @Override // io.odeeo.internal.f.h
    public final void prepare() {
        int i10 = this.f63876q;
        this.f63876q = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f63877r == null) {
            m mVarAcquireExoMediaDrm = this.f63863d.acquireExoMediaDrm(this.f63862c);
            this.f63877r = mVarAcquireExoMediaDrm;
            mVarAcquireExoMediaDrm.setOnEventListener(new C0609c());
        } else if (this.f63872m != C.TIME_UNSET) {
            for (int i11 = 0; i11 < this.f63873n.size(); i11++) {
                this.f63873n.get(i11).acquire(null);
            }
        }
    }

    @Override // io.odeeo.internal.f.h
    public final void release() {
        int i10 = this.f63876q - 1;
        this.f63876q = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f63872m != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.f63873n);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((io.odeeo.internal.f.b) arrayList.get(i11)).release(null);
            }
        }
        c();
        a();
    }

    public void setMode(int i10, byte[] bArr) {
        io.odeeo.internal.q0.a.checkState(this.f63873n.isEmpty());
        if (i10 == 1 || i10 == 3) {
            io.odeeo.internal.q0.a.checkNotNull(bArr);
        }
        this.f63882w = i10;
        this.f63883x = bArr;
    }

    @Deprecated
    public c(UUID uuid, m mVar, r rVar, HashMap<String, String> map) {
        this(uuid, mVar, rVar, map == null ? new HashMap<>() : map, false, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        q3 it = q1.copyOf((Collection) this.f63874o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public final void b(Looper looper) {
        if (this.f63884y == null) {
            this.f63884y = new d(looper);
        }
    }

    @Deprecated
    public c(UUID uuid, m mVar, r rVar, HashMap<String, String> map, boolean z10) {
        this(uuid, mVar, rVar, map == null ? new HashMap<>() : map, z10, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final io.odeeo.internal.f.f a(Looper looper, g.a aVar, io.odeeo.internal.b.t tVar, boolean z10) {
        List<e.b> listA;
        b(looper);
        io.odeeo.internal.f.e eVar = tVar.f62974o;
        if (eVar == null) {
            return a(io.odeeo.internal.q0.t.getTrackType(tVar.f62971l), z10);
        }
        io.odeeo.internal.f.b bVar = null;
        Object[] objArr = 0;
        if (this.f63883x == null) {
            listA = a((io.odeeo.internal.f.e) io.odeeo.internal.q0.a.checkNotNull(eVar), this.f63862c, false);
            if (listA.isEmpty()) {
                e eVar2 = new e(this.f63862c);
                io.odeeo.internal.q0.p.e("DefaultDrmSessionMgr", "DRM error", eVar2);
                if (aVar != null) {
                    aVar.drmSessionManagerError(eVar2);
                }
                return new l(new f.a(eVar2, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            listA = null;
        }
        if (!this.f63866g) {
            bVar = this.f63879t;
        } else {
            Iterator<io.odeeo.internal.f.b> it = this.f63873n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                io.odeeo.internal.f.b next = it.next();
                if (g0.areEqual(next.f63831a, listA)) {
                    bVar = next;
                    break;
                }
            }
        }
        if (bVar == null) {
            io.odeeo.internal.f.b bVarA = a(listA, false, aVar, z10);
            if (!this.f63866g) {
                this.f63879t = bVarA;
            }
            this.f63873n.add(bVarA);
            return bVarA;
        }
        bVar.acquire(aVar);
        return bVar;
    }

    public final void b() {
        q3 it = q1.copyOf((Collection) this.f63875p).iterator();
        while (it.hasNext()) {
            ((io.odeeo.internal.f.f) it.next()).release(null);
        }
    }

    @Deprecated
    public c(UUID uuid, m mVar, r rVar, HashMap<String, String> map, boolean z10, int i10) {
        this(uuid, new m.a(mVar), rVar, map == null ? new HashMap<>() : map, z10, new int[0], false, new io.odeeo.internal.p0.r(i10), 300000L);
    }

    public c(UUID uuid, m.g gVar, r rVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, v vVar, long j10) {
        io.odeeo.internal.q0.a.checkNotNull(uuid);
        io.odeeo.internal.q0.a.checkArgument(!io.odeeo.internal.b.h.f62710b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f63862c = uuid;
        this.f63863d = gVar;
        this.f63864e = rVar;
        this.f63865f = map;
        this.f63866g = z10;
        this.f63867h = iArr;
        this.f63868i = z11;
        this.f63870k = vVar;
        this.f63869j = new g();
        this.f63871l = new h();
        this.f63882w = 0;
        this.f63873n = new ArrayList();
        this.f63874o = e3.newIdentityHashSet();
        this.f63875p = e3.newIdentityHashSet();
        this.f63872m = j10;
    }

    public final io.odeeo.internal.f.f a(int i10, boolean z10) {
        m mVar = (m) io.odeeo.internal.q0.a.checkNotNull(this.f63877r);
        if ((mVar.getCryptoType() == 2 && n.f63935d) || g0.linearSearch(this.f63867h, i10) == -1 || mVar.getCryptoType() == 1) {
            return null;
        }
        io.odeeo.internal.f.b bVar = this.f63878s;
        if (bVar == null) {
            io.odeeo.internal.f.b bVarA = a((List<e.b>) h1.of(), true, (g.a) null, z10);
            this.f63873n.add(bVarA);
            this.f63878s = bVarA;
        } else {
            bVar.acquire(null);
        }
        return this.f63878s;
    }

    public final boolean a(io.odeeo.internal.f.e eVar) {
        if (this.f63883x != null) {
            return true;
        }
        if (a(eVar, this.f63862c, true).isEmpty()) {
            if (eVar.f63911d != 1 || !eVar.get(0).matches(io.odeeo.internal.b.h.f62710b)) {
                return false;
            }
            io.odeeo.internal.q0.p.w("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f63862c);
        }
        String str = eVar.f63910c;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        return C.CENC_TYPE_cbcs.equals(str) ? g0.f65861a >= 25 : (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void a(Looper looper) {
        try {
            Looper looper2 = this.f63880u;
            if (looper2 == null) {
                this.f63880u = looper;
                this.f63881v = new Handler(looper);
            } else {
                io.odeeo.internal.q0.a.checkState(looper2 == looper);
                io.odeeo.internal.q0.a.checkNotNull(this.f63881v);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final io.odeeo.internal.f.b a(List<e.b> list, boolean z10, g.a aVar, boolean z11) {
        io.odeeo.internal.f.b bVarA = a(list, z10, aVar);
        if (a(bVarA) && !this.f63875p.isEmpty()) {
            b();
            a(bVarA, aVar);
            bVarA = a(list, z10, aVar);
        }
        if (!a(bVarA) || !z11 || this.f63874o.isEmpty()) {
            return bVarA;
        }
        c();
        if (!this.f63875p.isEmpty()) {
            b();
        }
        a(bVarA, aVar);
        return a(list, z10, aVar);
    }

    public static boolean a(io.odeeo.internal.f.f fVar) {
        if (fVar.getState() == 1) {
            return g0.f65861a < 19 || (((f.a) io.odeeo.internal.q0.a.checkNotNull(fVar.getError())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    public final void a(io.odeeo.internal.f.f fVar, g.a aVar) {
        fVar.release(aVar);
        if (this.f63872m != C.TIME_UNSET) {
            fVar.release(null);
        }
    }

    public final io.odeeo.internal.f.b a(List<e.b> list, boolean z10, g.a aVar) {
        io.odeeo.internal.q0.a.checkNotNull(this.f63877r);
        io.odeeo.internal.f.b bVar = new io.odeeo.internal.f.b(this.f63862c, this.f63877r, this.f63869j, this.f63871l, list, this.f63882w, this.f63868i | z10, z10, this.f63883x, this.f63865f, this.f63864e, (Looper) io.odeeo.internal.q0.a.checkNotNull(this.f63880u), this.f63870k);
        bVar.acquire(aVar);
        if (this.f63872m != C.TIME_UNSET) {
            bVar.acquire(null);
        }
        return bVar;
    }

    public final void a() {
        if (this.f63877r != null && this.f63876q == 0 && this.f63873n.isEmpty() && this.f63874o.isEmpty()) {
            ((m) io.odeeo.internal.q0.a.checkNotNull(this.f63877r)).release();
            this.f63877r = null;
        }
    }

    public static List<e.b> a(io.odeeo.internal.f.e eVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(eVar.f63911d);
        for (int i10 = 0; i10 < eVar.f63911d; i10++) {
            e.b bVar = eVar.get(i10);
            if ((bVar.matches(uuid) || (io.odeeo.internal.b.h.f62711c.equals(uuid) && bVar.matches(io.odeeo.internal.b.h.f62710b))) && (bVar.f63916e != null || z10)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
