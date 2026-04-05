package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import bf.t;
import bf.y;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.i;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import de.a0;
import de.g0;
import de.m;
import de.n;
import de.p;
import de.p0;
import de.q0;
import de.s0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import qf.n0;
import qf.o0;
import zd.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f27376a;

    /* renamed from: b, reason: collision with root package name */
    public final e f27377b;

    /* renamed from: c, reason: collision with root package name */
    public final de.b f27378c;

    /* renamed from: d, reason: collision with root package name */
    public final de.c f27379d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27380e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27381f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27382g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f27383h;

    /* renamed from: i, reason: collision with root package name */
    public final i f27384i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f27385j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f27386k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f27387l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f27388m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f27389n;

    /* renamed from: o, reason: collision with root package name */
    public final c f27390o;

    /* renamed from: p, reason: collision with root package name */
    public int f27391p;

    /* renamed from: q, reason: collision with root package name */
    public int f27392q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f27393r;

    /* renamed from: s, reason: collision with root package name */
    public HandlerC0158a f27394s;

    /* renamed from: t, reason: collision with root package name */
    public ce.b f27395t;

    /* renamed from: u, reason: collision with root package name */
    public m f27396u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f27397v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f27398w;

    /* renamed from: x, reason: collision with root package name */
    public a0 f27399x;

    /* renamed from: y, reason: collision with root package name */
    public g0 f27400y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.google.android.exoplayer2.drm.a$a, reason: collision with other inner class name */
    public class HandlerC0158a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f27401a;

        public HandlerC0158a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Exception excExecuteProvisionRequest;
            b bVar = (b) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    a aVar = a.this;
                    excExecuteProvisionRequest = aVar.f27387l.executeProvisionRequest(aVar.f27388m, (g0) bVar.f27406d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    a aVar2 = a.this;
                    excExecuteProvisionRequest = aVar2.f27387l.executeKeyRequest(aVar2.f27388m, (a0) bVar.f27406d);
                }
            } catch (q0 e10) {
                b bVar2 = (b) message.obj;
                excExecuteProvisionRequest = e10;
                if (bVar2.f27404b) {
                    int i11 = bVar2.f27407e + 1;
                    bVar2.f27407e = i11;
                    excExecuteProvisionRequest = e10;
                    if (i11 <= a.this.f27385j.getMinimumLoadableRetryCount(3)) {
                        long retryDelayMsFor = a.this.f27385j.getRetryDelayMsFor(new n0(new t(bVar2.f27403a, e10.f52164b, e10.f52165c, e10.f52166e, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - bVar2.f27405c, e10.f52167f), new y(3), e10.getCause() instanceof IOException ? (IOException) e10.getCause() : new d(e10.getCause()), bVar2.f27407e));
                        excExecuteProvisionRequest = e10;
                        if (retryDelayMsFor != C.TIME_UNSET) {
                            synchronized (this) {
                                try {
                                    if (!this.f27401a) {
                                        sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                                        return;
                                    }
                                    excExecuteProvisionRequest = e10;
                                } finally {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                f0.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                excExecuteProvisionRequest = e11;
            }
            a.this.f27385j.onLoadTaskConcluded(bVar.f27403a);
            synchronized (this) {
                try {
                    if (!this.f27401a) {
                        a.this.f27390o.obtainMessage(message.what, Pair.create(bVar.f27406d, excExecuteProvisionRequest)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.f27401a = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f27403a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27404b;

        /* renamed from: c, reason: collision with root package name */
        public final long f27405c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f27406d;

        /* renamed from: e, reason: collision with root package name */
        public int f27407e;

        public b(long j10, boolean z10, long j11, Object obj) {
            this.f27403a = j10;
            this.f27404b = z10;
            this.f27405c = j11;
            this.f27406d = obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            a aVar = a.this;
            if (i10 == 0) {
                de.b bVar = aVar.f27378c;
                if (obj == aVar.f27400y) {
                    if (aVar.f27391p == 2 || aVar.b()) {
                        aVar.f27400y = null;
                        if (obj2 instanceof Exception) {
                            bVar.onProvisionError((Exception) obj2, false);
                            return;
                        }
                        try {
                            aVar.f27377b.provideProvisionResponse((byte[]) obj2);
                            bVar.onProvisionCompleted();
                            return;
                        } catch (Exception e10) {
                            bVar.onProvisionError(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != 1) {
                return;
            }
            i iVar = aVar.f27384i;
            e eVar = aVar.f27377b;
            int i11 = aVar.f27380e;
            if (obj == aVar.f27399x && aVar.b()) {
                aVar.f27399x = null;
                if (obj2 instanceof Exception) {
                    aVar.d((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (i11 == 3) {
                        eVar.provideKeyResponse((byte[]) n1.castNonNull(aVar.f27398w), bArr);
                        Iterator<Object> it = iVar.elementSet().iterator();
                        while (it.hasNext()) {
                            ((p) it.next()).drmKeysRemoved();
                        }
                        return;
                    }
                    byte[] bArrProvideKeyResponse = eVar.provideKeyResponse(aVar.f27397v, bArr);
                    if ((i11 == 2 || (i11 == 0 && aVar.f27398w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        aVar.f27398w = bArrProvideKeyResponse;
                    }
                    aVar.f27391p = 4;
                    Iterator<Object> it2 = iVar.elementSet().iterator();
                    while (it2.hasNext()) {
                        ((p) it2.next()).drmKeysLoaded();
                    }
                } catch (Exception e11) {
                    aVar.d(e11, true);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends IOException {
        public d(Throwable th2) {
            super(th2);
        }
    }

    public a(UUID uuid, e eVar, de.b bVar, de.c cVar, List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p0 p0Var, Looper looper, o0 o0Var, c0 c0Var) {
        if (i10 == 1 || i10 == 3) {
            com.google.android.exoplayer2.util.a.checkNotNull(bArr);
        }
        this.f27388m = uuid;
        this.f27378c = bVar;
        this.f27379d = cVar;
        this.f27377b = eVar;
        this.f27380e = i10;
        this.f27381f = z10;
        this.f27382g = z11;
        if (bArr != null) {
            this.f27398w = bArr;
            this.f27376a = null;
        } else {
            this.f27376a = Collections.unmodifiableList((List) com.google.android.exoplayer2.util.a.checkNotNull(list));
        }
        this.f27383h = map;
        this.f27387l = p0Var;
        this.f27384i = new i();
        this.f27385j = o0Var;
        this.f27386k = c0Var;
        this.f27391p = 2;
        this.f27389n = looper;
        this.f27390o = new c(looper);
    }

    public final void a(boolean z10) {
        long jMin;
        if (this.f27382g) {
            return;
        }
        byte[] bArr = (byte[]) n1.castNonNull(this.f27397v);
        e eVar = this.f27377b;
        int i10 = this.f27380e;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                com.google.android.exoplayer2.util.a.checkNotNull(this.f27398w);
                com.google.android.exoplayer2.util.a.checkNotNull(this.f27397v);
                f(this.f27398w, 3, z10);
                return;
            }
            byte[] bArr2 = this.f27398w;
            if (bArr2 != null) {
                try {
                    eVar.restoreKeys(this.f27397v, bArr2);
                } catch (Exception e10) {
                    c(e10, 1);
                    return;
                }
            }
            f(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f27398w;
        if (bArr3 == null) {
            f(bArr, 1, z10);
            return;
        }
        if (this.f27391p != 4) {
            try {
                eVar.restoreKeys(this.f27397v, bArr3);
            } catch (Exception e11) {
                c(e11, 1);
                return;
            }
        }
        if (j.f27537d.equals(this.f27388m)) {
            Pair pair = (Pair) com.google.android.exoplayer2.util.a.checkNotNull(s0.getLicenseDurationRemainingSec(this));
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (i10 == 0 && jMin <= 60) {
            f0.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            f(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            c(new de.o0(), 2);
            return;
        }
        this.f27391p = 4;
        Iterator<Object> it = this.f27384i.elementSet().iterator();
        while (it.hasNext()) {
            ((p) it.next()).drmKeysRestored();
        }
    }

    @Override // de.n
    public void acquire(p pVar) {
        g();
        if (this.f27392q < 0) {
            f0.e("DefaultDrmSession", "Session reference count less than zero: " + this.f27392q);
            this.f27392q = 0;
        }
        i iVar = this.f27384i;
        if (pVar != null) {
            iVar.add(pVar);
        }
        int i10 = this.f27392q + 1;
        this.f27392q = i10;
        if (i10 == 1) {
            com.google.android.exoplayer2.util.a.checkState(this.f27391p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f27393r = handlerThread;
            handlerThread.start();
            this.f27394s = new HandlerC0158a(this.f27393r.getLooper());
            if (e()) {
                a(true);
            }
        } else if (pVar != null && b() && iVar.count(pVar) == 1) {
            pVar.drmSessionAcquired(this.f27391p);
        }
        ((de.j) this.f27379d).onReferenceCountIncremented(this, this.f27392q);
    }

    public final boolean b() {
        int i10 = this.f27391p;
        return i10 == 3 || i10 == 4;
    }

    public final void c(Exception exc, int i10) {
        this.f27396u = new m(exc, de.y.getErrorCodeForMediaDrmException(exc, i10));
        f0.e("DefaultDrmSession", "DRM session error", exc);
        Iterator<Object> it = this.f27384i.elementSet().iterator();
        while (it.hasNext()) {
            ((p) it.next()).drmSessionManagerError(exc);
        }
        if (this.f27391p != 4) {
            this.f27391p = 1;
        }
    }

    public final void d(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f27378c.provisionRequired(this);
        } else {
            c(exc, z10 ? 1 : 2);
        }
    }

    public final boolean e() {
        e eVar = this.f27377b;
        if (b()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = eVar.openSession();
            this.f27397v = bArrOpenSession;
            eVar.setPlayerIdForSession(bArrOpenSession, this.f27386k);
            this.f27395t = eVar.createCryptoConfig(this.f27397v);
            this.f27391p = 3;
            Iterator<Object> it = this.f27384i.elementSet().iterator();
            while (it.hasNext()) {
                ((p) it.next()).drmSessionAcquired(3);
            }
            com.google.android.exoplayer2.util.a.checkNotNull(this.f27397v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f27378c.provisionRequired(this);
            return false;
        } catch (Exception e10) {
            c(e10, 1);
            return false;
        }
    }

    public final void f(byte[] bArr, int i10, boolean z10) {
        try {
            this.f27399x = this.f27377b.getKeyRequest(bArr, this.f27376a, i10, this.f27383h);
            HandlerC0158a handlerC0158a = (HandlerC0158a) n1.castNonNull(this.f27394s);
            Object objCheckNotNull = com.google.android.exoplayer2.util.a.checkNotNull(this.f27399x);
            handlerC0158a.getClass();
            handlerC0158a.obtainMessage(1, new b(t.getNewId(), z10, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
        } catch (Exception e10) {
            d(e10, true);
        }
    }

    public final void g() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f27389n;
        if (threadCurrentThread != looper.getThread()) {
            f0.w("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // de.n
    public final ce.b getCryptoConfig() {
        g();
        return this.f27395t;
    }

    @Override // de.n
    public final m getError() {
        g();
        if (this.f27391p == 1) {
            return this.f27396u;
        }
        return null;
    }

    @Override // de.n
    public byte[] getOfflineLicenseKeySetId() {
        g();
        return this.f27398w;
    }

    @Override // de.n
    public final UUID getSchemeUuid() {
        g();
        return this.f27388m;
    }

    @Override // de.n
    public final int getState() {
        g();
        return this.f27391p;
    }

    public boolean hasSessionId(byte[] bArr) {
        g();
        return Arrays.equals(this.f27397v, bArr);
    }

    @Override // de.n
    public boolean playClearSamplesWithoutKeys() {
        g();
        return this.f27381f;
    }

    @Override // de.n
    public Map<String, String> queryKeyStatus() {
        g();
        byte[] bArr = this.f27397v;
        if (bArr == null) {
            return null;
        }
        return this.f27377b.queryKeyStatus(bArr);
    }

    @Override // de.n
    public void release(p pVar) {
        g();
        int i10 = this.f27392q;
        if (i10 <= 0) {
            f0.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f27392q = i11;
        if (i11 == 0) {
            this.f27391p = 0;
            ((c) n1.castNonNull(this.f27390o)).removeCallbacksAndMessages(null);
            ((HandlerC0158a) n1.castNonNull(this.f27394s)).release();
            this.f27394s = null;
            ((HandlerThread) n1.castNonNull(this.f27393r)).quit();
            this.f27393r = null;
            this.f27395t = null;
            this.f27396u = null;
            this.f27399x = null;
            this.f27400y = null;
            byte[] bArr = this.f27397v;
            if (bArr != null) {
                this.f27377b.closeSession(bArr);
                this.f27397v = null;
            }
        }
        if (pVar != null) {
            i iVar = this.f27384i;
            iVar.remove(pVar);
            if (iVar.count(pVar) == 0) {
                pVar.drmSessionReleased();
            }
        }
        ((de.j) this.f27379d).onReferenceCountDecremented(this, this.f27392q);
    }

    @Override // de.n
    public boolean requiresSecureDecoder(String str) {
        g();
        return this.f27377b.requiresSecureDecoder((byte[]) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f27397v), str);
    }
}
