package io.odeeo.internal.f;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.odeeo.internal.f.e;
import io.odeeo.internal.f.f;
import io.odeeo.internal.f.g;
import io.odeeo.internal.f.m;
import io.odeeo.internal.p0.v;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nh.n1;
import o9.b3;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b implements io.odeeo.internal.f.f {

    /* renamed from: a, reason: collision with root package name */
    public final List<e.b> f63831a;

    /* renamed from: b, reason: collision with root package name */
    public final m f63832b;

    /* renamed from: c, reason: collision with root package name */
    public final a f63833c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0608b f63834d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63835e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63837g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f63838h;

    /* renamed from: i, reason: collision with root package name */
    public final io.odeeo.internal.q0.i<g.a> f63839i;

    /* renamed from: j, reason: collision with root package name */
    public final v f63840j;

    /* renamed from: k, reason: collision with root package name */
    public final r f63841k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f63842l;

    /* renamed from: m, reason: collision with root package name */
    public final e f63843m;

    /* renamed from: n, reason: collision with root package name */
    public int f63844n;

    /* renamed from: o, reason: collision with root package name */
    public int f63845o;

    /* renamed from: p, reason: collision with root package name */
    public HandlerThread f63846p;

    /* renamed from: q, reason: collision with root package name */
    public c f63847q;

    /* renamed from: r, reason: collision with root package name */
    public io.odeeo.internal.e.b f63848r;

    /* renamed from: s, reason: collision with root package name */
    public f.a f63849s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f63850t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f63851u;

    /* renamed from: v, reason: collision with root package name */
    public m.b f63852v;

    /* renamed from: w, reason: collision with root package name */
    public m.h f63853w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onProvisionCompleted();

        void onProvisionError(Exception exc, boolean z10);

        void provisionRequired(b bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.f.b$b, reason: collision with other inner class name */
    public interface InterfaceC0608b {
        void onReferenceCountDecremented(b bVar, int i10);

        void onReferenceCountIncremented(b bVar, int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f63856a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f63857b;

        /* renamed from: c, reason: collision with root package name */
        public final long f63858c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f63859d;

        /* renamed from: e, reason: collision with root package name */
        public int f63860e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f63856a = j10;
            this.f63857b = z10;
            this.f63858c = j11;
            this.f63859d = obj;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                b.this.b(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                b.this.a(obj, obj2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends IOException {
        public f(Throwable th2) {
            super(th2);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC0608b interfaceC0608b, List<e.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, r rVar, Looper looper, v vVar) {
        if (i10 == 1 || i10 == 3) {
            io.odeeo.internal.q0.a.checkNotNull(bArr);
        }
        this.f63842l = uuid;
        this.f63833c = aVar;
        this.f63834d = interfaceC0608b;
        this.f63832b = mVar;
        this.f63835e = i10;
        this.f63836f = z10;
        this.f63837g = z11;
        if (bArr != null) {
            this.f63851u = bArr;
            this.f63831a = null;
        } else {
            this.f63831a = Collections.unmodifiableList((List) io.odeeo.internal.q0.a.checkNotNull(list));
        }
        this.f63838h = map;
        this.f63841k = rVar;
        this.f63839i = new io.odeeo.internal.q0.i<>();
        this.f63840j = vVar;
        this.f63844n = 2;
        this.f63843m = new e(looper);
    }

    @Override // io.odeeo.internal.f.f
    public void acquire(g.a aVar) {
        if (this.f63845o < 0) {
            io.odeeo.internal.q0.p.e("DefaultDrmSession", "Session reference count less than zero: " + this.f63845o);
            this.f63845o = 0;
        }
        if (aVar != null) {
            this.f63839i.add(aVar);
        }
        int i10 = this.f63845o + 1;
        this.f63845o = i10;
        if (i10 == 1) {
            io.odeeo.internal.q0.a.checkState(this.f63844n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f63846p = handlerThread;
            handlerThread.start();
            this.f63847q = new c(this.f63846p.getLooper());
            if (d()) {
                a(true);
            }
        } else if (aVar != null && b() && this.f63839i.count(aVar) == 1) {
            aVar.drmSessionAcquired(this.f63844n);
        }
        this.f63834d.onReferenceCountIncremented(this, this.f63845o);
    }

    public final void c() {
        if (this.f63835e == 0 && this.f63844n == 4) {
            g0.castNonNull(this.f63850t);
            a(false);
        }
    }

    @EnsuresNonNullIf(expression = {JsonStorageKeyNames.SESSION_ID_KEY}, result = true)
    public final boolean d() {
        if (b()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f63832b.openSession();
            this.f63850t = bArrOpenSession;
            this.f63848r = this.f63832b.createCryptoConfig(bArrOpenSession);
            this.f63844n = 3;
            a(new n1(28));
            io.odeeo.internal.q0.a.checkNotNull(this.f63850t);
            return true;
        } catch (NotProvisionedException unused) {
            this.f63833c.provisionRequired(this);
            return false;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    @RequiresNonNull({JsonStorageKeyNames.SESSION_ID_KEY, "offlineLicenseKeySetId"})
    public final boolean e() {
        try {
            this.f63832b.restoreKeys(this.f63850t, this.f63851u);
            return true;
        } catch (Exception e10) {
            a(e10, 1);
            return false;
        }
    }

    @Override // io.odeeo.internal.f.f
    public final io.odeeo.internal.e.b getCryptoConfig() {
        return this.f63848r;
    }

    @Override // io.odeeo.internal.f.f
    public final f.a getError() {
        if (this.f63844n == 1) {
            return this.f63849s;
        }
        return null;
    }

    @Override // io.odeeo.internal.f.f
    public byte[] getOfflineLicenseKeySetId() {
        return this.f63851u;
    }

    @Override // io.odeeo.internal.f.f
    public final UUID getSchemeUuid() {
        return this.f63842l;
    }

    @Override // io.odeeo.internal.f.f
    public final int getState() {
        return this.f63844n;
    }

    public boolean hasSessionId(byte[] bArr) {
        return Arrays.equals(this.f63850t, bArr);
    }

    public void onMediaDrmEvent(int i10) {
        if (i10 != 2) {
            return;
        }
        c();
    }

    public void onProvisionCompleted() {
        if (d()) {
            a(true);
        }
    }

    public void onProvisionError(Exception exc, boolean z10) {
        a(exc, z10 ? 1 : 3);
    }

    @Override // io.odeeo.internal.f.f
    public boolean playClearSamplesWithoutKeys() {
        return this.f63836f;
    }

    public void provision() {
        this.f63853w = this.f63832b.getProvisionRequest();
        ((c) g0.castNonNull(this.f63847q)).a(0, io.odeeo.internal.q0.a.checkNotNull(this.f63853w), true);
    }

    @Override // io.odeeo.internal.f.f
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f63850t;
        if (bArr == null) {
            return null;
        }
        return this.f63832b.queryKeyStatus(bArr);
    }

    @Override // io.odeeo.internal.f.f
    public void release(g.a aVar) {
        int i10 = this.f63845o;
        if (i10 <= 0) {
            io.odeeo.internal.q0.p.e("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f63845o = i11;
        if (i11 == 0) {
            this.f63844n = 0;
            ((e) g0.castNonNull(this.f63843m)).removeCallbacksAndMessages(null);
            ((c) g0.castNonNull(this.f63847q)).release();
            this.f63847q = null;
            ((HandlerThread) g0.castNonNull(this.f63846p)).quit();
            this.f63846p = null;
            this.f63848r = null;
            this.f63849s = null;
            this.f63852v = null;
            this.f63853w = null;
            byte[] bArr = this.f63850t;
            if (bArr != null) {
                this.f63832b.closeSession(bArr);
                this.f63850t = null;
            }
        }
        if (aVar != null) {
            this.f63839i.remove(aVar);
            if (this.f63839i.count(aVar) == 0) {
                aVar.drmSessionReleased();
            }
        }
        this.f63834d.onReferenceCountDecremented(this, this.f63845o);
    }

    @Override // io.odeeo.internal.f.f
    public boolean requiresSecureDecoder(String str) {
        return this.f63832b.requiresSecureDecoder((byte[]) io.odeeo.internal.q0.a.checkStateNotNull(this.f63850t), str);
    }

    public final void b(Object obj, Object obj2) {
        if (obj == this.f63853w) {
            if (this.f63844n == 2 || b()) {
                this.f63853w = null;
                if (obj2 instanceof Exception) {
                    this.f63833c.onProvisionError((Exception) obj2, false);
                    return;
                }
                try {
                    this.f63832b.provideProvisionResponse((byte[]) obj2);
                    this.f63833c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f63833c.onProvisionError(e10, true);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public boolean f63854a;

        public c(Looper looper) {
            super(looper);
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(io.odeeo.internal.a0.n.getNewId(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thExecuteProvisionRequest;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    b bVar = b.this;
                    thExecuteProvisionRequest = bVar.f63841k.executeProvisionRequest(bVar.f63842l, (m.h) dVar.f63859d);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    b bVar2 = b.this;
                    thExecuteProvisionRequest = bVar2.f63841k.executeKeyRequest(bVar2.f63842l, (m.b) dVar.f63859d);
                }
            } catch (s e10) {
                boolean zA = a(message, e10);
                thExecuteProvisionRequest = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                io.odeeo.internal.q0.p.w("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                thExecuteProvisionRequest = e11;
            }
            b.this.f63840j.onLoadTaskConcluded(dVar.f63856a);
            synchronized (this) {
                try {
                    if (!this.f63854a) {
                        b.this.f63843m.obtainMessage(message.what, Pair.create(dVar.f63859d, thExecuteProvisionRequest)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public synchronized void release() {
            removeCallbacksAndMessages(null);
            this.f63854a = true;
        }

        public final boolean a(Message message, s sVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.f63857b) {
                return false;
            }
            int i10 = dVar.f63860e + 1;
            dVar.f63860e = i10;
            if (i10 > b.this.f63840j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            io.odeeo.internal.a0.n nVar = new io.odeeo.internal.a0.n(dVar.f63856a, sVar.f63947a, sVar.f63948b, sVar.f63949c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f63858c, sVar.f63950d);
            io.odeeo.internal.a0.q qVar = new io.odeeo.internal.a0.q(3);
            if (sVar.getCause() instanceof IOException) {
                fVar = (IOException) sVar.getCause();
            } else {
                fVar = new f(sVar.getCause());
            }
            long retryDelayMsFor = b.this.f63840j.getRetryDelayMsFor(new v.c(nVar, qVar, fVar, dVar.f63860e));
            if (retryDelayMsFor == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f63854a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), retryDelayMsFor);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @RequiresNonNull({JsonStorageKeyNames.SESSION_ID_KEY})
    public final void a(boolean z10) {
        if (this.f63837g) {
            return;
        }
        byte[] bArr = (byte[]) g0.castNonNull(this.f63850t);
        int i10 = this.f63835e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f63851u == null || e()) {
                    a(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            io.odeeo.internal.q0.a.checkNotNull(this.f63851u);
            io.odeeo.internal.q0.a.checkNotNull(this.f63850t);
            a(this.f63851u, 3, z10);
            return;
        }
        if (this.f63851u == null) {
            a(bArr, 1, z10);
            return;
        }
        if (this.f63844n == 4 || e()) {
            long jA = a();
            if (this.f63835e == 0 && jA <= 60) {
                io.odeeo.internal.q0.p.d("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jA);
                a(bArr, 2, z10);
                return;
            }
            if (jA <= 0) {
                a(new q(), 2);
            } else {
                this.f63844n = 4;
                a(new n1(27));
            }
        }
    }

    @EnsuresNonNullIf(expression = {JsonStorageKeyNames.SESSION_ID_KEY}, result = true)
    public final boolean b() {
        int i10 = this.f63844n;
        return i10 == 3 || i10 == 4;
    }

    public final long a() {
        if (!io.odeeo.internal.b.h.f62712d.equals(this.f63842l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) io.odeeo.internal.q0.a.checkNotNull(u.getLicenseDurationRemainingSec(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public final void a(byte[] bArr, int i10, boolean z10) {
        try {
            this.f63852v = this.f63832b.getKeyRequest(bArr, this.f63831a, i10, this.f63838h);
            ((c) g0.castNonNull(this.f63847q)).a(1, io.odeeo.internal.q0.a.checkNotNull(this.f63852v), z10);
        } catch (Exception e10) {
            a(e10, true);
        }
    }

    public final void a(Object obj, Object obj2) {
        if (obj == this.f63852v && b()) {
            this.f63852v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f63835e == 3) {
                    this.f63832b.provideKeyResponse((byte[]) g0.castNonNull(this.f63851u), bArr);
                    a(new n1(25));
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f63832b.provideKeyResponse(this.f63850t, bArr);
                int i10 = this.f63835e;
                if ((i10 == 2 || (i10 == 0 && this.f63851u != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f63851u = bArrProvideKeyResponse;
                }
                this.f63844n = 4;
                a(new n1(26));
            } catch (Exception e10) {
                a(e10, true);
            }
        }
    }

    public final void a(Exception exc, boolean z10) {
        if (exc instanceof NotProvisionedException) {
            this.f63833c.provisionRequired(this);
        } else {
            a(exc, z10 ? 1 : 2);
        }
    }

    public final void a(Exception exc, int i10) {
        this.f63849s = new f.a(exc, j.getErrorCodeForMediaDrmException(exc, i10));
        io.odeeo.internal.q0.p.e("DefaultDrmSession", "DRM session error", exc);
        a(new b3(exc, 4));
        if (this.f63844n != 4) {
            this.f63844n = 1;
        }
    }

    public final void a(io.odeeo.internal.q0.h<g.a> hVar) {
        Iterator<g.a> it = this.f63839i.elementSet().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }
}
