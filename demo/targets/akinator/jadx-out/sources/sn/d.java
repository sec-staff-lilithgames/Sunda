package sn;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f85937a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f85938b;

    /* renamed from: c, reason: collision with root package name */
    public final sn.b f85939c;

    /* renamed from: d, reason: collision with root package name */
    public final sn.c f85940d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85941e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85942f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85943g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f85944h;

    /* renamed from: i, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.l f85945i;

    /* renamed from: j, reason: collision with root package name */
    public final go.t f85946j;

    /* renamed from: k, reason: collision with root package name */
    public final on.f0 f85947k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f85948l;

    /* renamed from: m, reason: collision with root package name */
    public final UUID f85949m;

    /* renamed from: n, reason: collision with root package name */
    public final Looper f85950n;

    /* renamed from: o, reason: collision with root package name */
    public final c f85951o;

    /* renamed from: p, reason: collision with root package name */
    public int f85952p;

    /* renamed from: q, reason: collision with root package name */
    public int f85953q;

    /* renamed from: r, reason: collision with root package name */
    public HandlerThread f85954r;

    /* renamed from: s, reason: collision with root package name */
    public a f85955s;

    /* renamed from: t, reason: collision with root package name */
    public nn.b f85956t;

    /* renamed from: u, reason: collision with root package name */
    public n f85957u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f85958v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f85959w;

    /* renamed from: x, reason: collision with root package name */
    public b0 f85960x;

    /* renamed from: y, reason: collision with root package name */
    public h0 f85961y;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85962a;

        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Exception excExecuteProvisionRequest;
            b bVar = (b) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    d dVar = d.this;
                    excExecuteProvisionRequest = dVar.f85948l.executeProvisionRequest(dVar.f85949m, (h0) bVar.f85967d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    d dVar2 = d.this;
                    excExecuteProvisionRequest = dVar2.f85948l.executeKeyRequest(dVar2.f85949m, (b0) bVar.f85967d);
                }
            } catch (q0 e10) {
                b bVar2 = (b) message.obj;
                excExecuteProvisionRequest = e10;
                if (bVar2.f85965b) {
                    int i11 = bVar2.f85968e + 1;
                    bVar2.f85968e = i11;
                    excExecuteProvisionRequest = e10;
                    if (i11 <= d.this.f85946j.getMinimumLoadableRetryCount(3)) {
                        long retryDelayMsFor = d.this.f85946j.getRetryDelayMsFor(new go.s(new ao.b0(bVar2.f85964a, e10.f86039b, e10.f86040c, e10.f86041e, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - bVar2.f85966c, e10.f86042f), new ao.g0(3), e10.getCause() instanceof IOException ? (IOException) e10.getCause() : new C0780d(e10.getCause()), bVar2.f85968e));
                        excExecuteProvisionRequest = e10;
                        if (retryDelayMsFor != C.TIME_UNSET) {
                            synchronized (this) {
                                try {
                                    if (!this.f85962a) {
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
                io.bidmachine.media3.common.util.b0.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                excExecuteProvisionRequest = e11;
            }
            d.this.f85946j.onLoadTaskConcluded(bVar.f85964a);
            synchronized (this) {
                try {
                    if (!this.f85962a) {
                        d.this.f85951o.obtainMessage(message.what, Pair.create(bVar.f85967d, excExecuteProvisionRequest)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.f85962a = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f85964a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f85965b;

        /* renamed from: c, reason: collision with root package name */
        public final long f85966c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f85967d;

        /* renamed from: e, reason: collision with root package name */
        public int f85968e;

        public b(long j10, boolean z10, long j11, Object obj) {
            this.f85964a = j10;
            this.f85965b = z10;
            this.f85966c = j11;
            this.f85967d = obj;
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
            d dVar = d.this;
            if (i10 == 1) {
                sn.b bVar = dVar.f85939c;
                if (obj == dVar.f85961y) {
                    if (dVar.f85952p == 2 || dVar.b()) {
                        dVar.f85961y = null;
                        if (obj2 instanceof Exception) {
                            bVar.onProvisionError((Exception) obj2, false);
                            return;
                        }
                        try {
                            dVar.f85938b.provideProvisionResponse((byte[]) obj2);
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
            if (i10 != 2) {
                return;
            }
            io.bidmachine.media3.common.util.l lVar = dVar.f85945i;
            i0 i0Var = dVar.f85938b;
            int i11 = dVar.f85941e;
            if (obj == dVar.f85960x && dVar.b()) {
                dVar.f85960x = null;
                if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                    dVar.d((Throwable) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (i11 == 3) {
                        i0Var.provideKeyResponse((byte[]) a1.castNonNull(dVar.f85959w), bArr);
                        Iterator<Object> it = lVar.elementSet().iterator();
                        while (it.hasNext()) {
                            ((q) it.next()).drmKeysRemoved();
                        }
                        return;
                    }
                    byte[] bArrProvideKeyResponse = i0Var.provideKeyResponse(dVar.f85958v, bArr);
                    if ((i11 == 2 || (i11 == 0 && dVar.f85959w != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                        dVar.f85959w = bArrProvideKeyResponse;
                    }
                    dVar.f85952p = 4;
                    Iterator<Object> it2 = lVar.elementSet().iterator();
                    while (it2.hasNext()) {
                        ((q) it2.next()).drmKeysLoaded();
                    }
                } catch (Exception e11) {
                    e = e11;
                    dVar.d(e, true);
                } catch (NoSuchMethodError e12) {
                    e = e12;
                    dVar.d(e, true);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: sn.d$d, reason: collision with other inner class name */
    public static final class C0780d extends IOException {
        public C0780d(Throwable th2) {
            super(th2);
        }
    }

    public d(UUID uuid, i0 i0Var, sn.b bVar, sn.c cVar, List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p0 p0Var, Looper looper, go.t tVar, on.f0 f0Var) {
        if (i10 == 1 || i10 == 3) {
            io.bidmachine.media3.common.util.a.checkNotNull(bArr);
        }
        this.f85949m = uuid;
        this.f85939c = bVar;
        this.f85940d = cVar;
        this.f85938b = i0Var;
        this.f85941e = i10;
        this.f85942f = z10;
        this.f85943g = z11;
        if (bArr != null) {
            this.f85959w = bArr;
            this.f85937a = null;
        } else {
            this.f85937a = Collections.unmodifiableList((List) io.bidmachine.media3.common.util.a.checkNotNull(list));
        }
        this.f85944h = map;
        this.f85948l = p0Var;
        this.f85945i = new io.bidmachine.media3.common.util.l();
        this.f85946j = tVar;
        this.f85947k = f0Var;
        this.f85952p = 2;
        this.f85950n = looper;
        this.f85951o = new c(looper);
    }

    public final void a(boolean z10) {
        long jMin;
        if (this.f85943g) {
            return;
        }
        byte[] bArr = (byte[]) a1.castNonNull(this.f85958v);
        int i10 = this.f85941e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f85959w == null || g()) {
                    f(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            io.bidmachine.media3.common.util.a.checkNotNull(this.f85959w);
            io.bidmachine.media3.common.util.a.checkNotNull(this.f85958v);
            f(this.f85959w, 3, z10);
            return;
        }
        if (this.f85959w == null) {
            f(bArr, 1, z10);
            return;
        }
        if (this.f85952p == 4 || g()) {
            if (gn.l.f57987d.equals(this.f85949m)) {
                Pair pair = (Pair) io.bidmachine.media3.common.util.a.checkNotNull(s0.getLicenseDurationRemainingSec(this));
                jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
            } else {
                jMin = Long.MAX_VALUE;
            }
            if (i10 == 0 && jMin <= 60) {
                io.bidmachine.media3.common.util.b0.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
                f(bArr, 2, z10);
                return;
            }
            if (jMin <= 0) {
                c(new o0(), 2);
                return;
            }
            this.f85952p = 4;
            Iterator<Object> it = this.f85945i.elementSet().iterator();
            while (it.hasNext()) {
                ((q) it.next()).drmKeysRestored();
            }
        }
    }

    @Override // sn.o
    public void acquire(q qVar) {
        h();
        if (this.f85953q < 0) {
            io.bidmachine.media3.common.util.b0.e("DefaultDrmSession", "Session reference count less than zero: " + this.f85953q);
            this.f85953q = 0;
        }
        io.bidmachine.media3.common.util.l lVar = this.f85945i;
        if (qVar != null) {
            lVar.add(qVar);
        }
        int i10 = this.f85953q + 1;
        this.f85953q = i10;
        if (i10 == 1) {
            io.bidmachine.media3.common.util.a.checkState(this.f85952p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f85954r = handlerThread;
            handlerThread.start();
            this.f85955s = new a(this.f85954r.getLooper());
            if (e()) {
                a(true);
            }
        } else if (qVar != null && b() && lVar.count(qVar) == 1) {
            qVar.drmSessionAcquired(this.f85952p);
        }
        ((k) this.f85940d).onReferenceCountIncremented(this, this.f85953q);
    }

    public final boolean b() {
        int i10 = this.f85952p;
        return i10 == 3 || i10 == 4;
    }

    public final void d(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || y.isFailureToConstructNotProvisionedException(th2)) {
            this.f85939c.provisionRequired(this);
        } else {
            c(th2, z10 ? 1 : 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            r5 = this;
            sn.b r0 = r5.f85939c
            sn.i0 r1 = r5.f85938b
            boolean r2 = r5.b()
            r3 = 1
            if (r2 == 0) goto Lc
            return r3
        Lc:
            byte[] r2 = r1.openSession()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            r5.f85958v = r2     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            on.f0 r4 = r5.f85947k     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            r1.setPlayerIdForSession(r2, r4)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            byte[] r2 = r5.f85958v     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            nn.b r1 = r1.createCryptoConfig(r2)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            r5.f85956t = r1     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            r1 = 3
            r5.f85952p = r1     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            io.bidmachine.media3.common.util.l r2 = r5.f85945i     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            java.util.Set r2 = r2.elementSet()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
        L2c:
            boolean r4 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            sn.q r4 = (sn.q) r4     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            r4.drmSessionAcquired(r1)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            goto L2c
        L3c:
            byte[] r1 = r5.f85958v     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            io.bidmachine.media3.common.util.a.checkNotNull(r1)     // Catch: java.lang.NoSuchMethodError -> L42 java.lang.Exception -> L44 android.media.NotProvisionedException -> L53
            return r3
        L42:
            r1 = move-exception
            goto L45
        L44:
            r1 = move-exception
        L45:
            boolean r2 = sn.y.isFailureToConstructNotProvisionedException(r1)
            if (r2 == 0) goto L4f
            r0.provisionRequired(r5)
            goto L56
        L4f:
            r5.c(r1, r3)
            goto L56
        L53:
            r0.provisionRequired(r5)
        L56:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sn.d.e():boolean");
    }

    public final void f(byte[] bArr, int i10, boolean z10) {
        try {
            this.f85960x = this.f85938b.getKeyRequest(bArr, this.f85937a, i10, this.f85944h);
            a aVar = (a) a1.castNonNull(this.f85955s);
            Object objCheckNotNull = io.bidmachine.media3.common.util.a.checkNotNull(this.f85960x);
            aVar.getClass();
            aVar.obtainMessage(2, new b(ao.b0.getNewId(), z10, SystemClock.elapsedRealtime(), objCheckNotNull)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            d(e10, true);
        }
    }

    public final boolean g() {
        try {
            this.f85938b.restoreKeys(this.f85958v, this.f85959w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            c(e10, 1);
            return false;
        }
    }

    @Override // sn.o
    public final nn.b getCryptoConfig() {
        h();
        return this.f85956t;
    }

    @Override // sn.o
    public final n getError() {
        h();
        if (this.f85952p == 1) {
            return this.f85957u;
        }
        return null;
    }

    @Override // sn.o
    public byte[] getOfflineLicenseKeySetId() {
        h();
        return this.f85959w;
    }

    @Override // sn.o
    public final UUID getSchemeUuid() {
        h();
        return this.f85949m;
    }

    @Override // sn.o
    public final int getState() {
        h();
        return this.f85952p;
    }

    public final void h() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f85950n;
        if (threadCurrentThread != looper.getThread()) {
            io.bidmachine.media3.common.util.b0.w("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }

    public boolean hasSessionId(byte[] bArr) {
        h();
        return Arrays.equals(this.f85958v, bArr);
    }

    @Override // sn.o
    public boolean playClearSamplesWithoutKeys() {
        h();
        return this.f85942f;
    }

    @Override // sn.o
    public Map<String, String> queryKeyStatus() {
        h();
        byte[] bArr = this.f85958v;
        if (bArr == null) {
            return null;
        }
        return this.f85938b.queryKeyStatus(bArr);
    }

    @Override // sn.o
    public void release(q qVar) {
        h();
        int i10 = this.f85953q;
        if (i10 <= 0) {
            io.bidmachine.media3.common.util.b0.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f85953q = i11;
        if (i11 == 0) {
            this.f85952p = 0;
            ((c) a1.castNonNull(this.f85951o)).removeCallbacksAndMessages(null);
            ((a) a1.castNonNull(this.f85955s)).release();
            this.f85955s = null;
            ((HandlerThread) a1.castNonNull(this.f85954r)).quit();
            this.f85954r = null;
            this.f85956t = null;
            this.f85957u = null;
            this.f85960x = null;
            this.f85961y = null;
            byte[] bArr = this.f85958v;
            if (bArr != null) {
                this.f85938b.closeSession(bArr);
                this.f85958v = null;
            }
        }
        if (qVar != null) {
            io.bidmachine.media3.common.util.l lVar = this.f85945i;
            lVar.remove(qVar);
            if (lVar.count(qVar) == 0) {
                qVar.drmSessionReleased();
            }
        }
        ((k) this.f85940d).onReferenceCountDecremented(this, this.f85953q);
    }

    @Override // sn.o
    public boolean requiresSecureDecoder(String str) {
        h();
        return this.f85938b.requiresSecureDecoder((byte[]) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f85958v), str);
    }

    public final void c(Throwable th2, int i10) {
        this.f85957u = new n(th2, y.getErrorCodeForMediaDrmException(th2, i10));
        io.bidmachine.media3.common.util.b0.e(wHkgq.GZZqjltGStmq, "DRM session error", th2);
        if (th2 instanceof Exception) {
            Iterator<Object> it = this.f85945i.elementSet().iterator();
            while (it.hasNext()) {
                ((q) it.next()).drmSessionManagerError((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!y.isFailureToConstructResourceBusyException(th2) && !y.isFailureToConstructNotProvisionedException(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f85952p != 4) {
            this.f85952p = 1;
        }
    }
}
