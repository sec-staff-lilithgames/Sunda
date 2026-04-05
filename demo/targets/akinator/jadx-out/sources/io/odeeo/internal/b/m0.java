package io.odeeo.internal.b;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f62818a;

    /* renamed from: b, reason: collision with root package name */
    public final a f62819b;

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.q0.d f62820c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f62821d;

    /* renamed from: e, reason: collision with root package name */
    public int f62822e;

    /* renamed from: f, reason: collision with root package name */
    public Object f62823f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f62824g;

    /* renamed from: h, reason: collision with root package name */
    public int f62825h;

    /* renamed from: i, reason: collision with root package name */
    public long f62826i = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public boolean f62827j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f62828k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f62829l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f62830m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f62831n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void sendMessage(m0 m0Var);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void handleMessage(int i10, Object obj) throws n;
    }

    public m0(a aVar, b bVar, y0 y0Var, int i10, io.odeeo.internal.q0.d dVar, Looper looper) {
        this.f62819b = aVar;
        this.f62818a = bVar;
        this.f62821d = y0Var;
        this.f62824g = looper;
        this.f62820c = dVar;
        this.f62825h = i10;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            io.odeeo.internal.q0.a.checkState(this.f62828k);
            io.odeeo.internal.q0.a.checkState(this.f62824g.getThread() != Thread.currentThread());
            while (!this.f62830m) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62829l;
    }

    public synchronized m0 cancel() {
        io.odeeo.internal.q0.a.checkState(this.f62828k);
        this.f62831n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.f62827j;
    }

    public Looper getLooper() {
        return this.f62824g;
    }

    public int getMediaItemIndex() {
        return this.f62825h;
    }

    public Object getPayload() {
        return this.f62823f;
    }

    public long getPositionMs() {
        return this.f62826i;
    }

    public b getTarget() {
        return this.f62818a;
    }

    public y0 getTimeline() {
        return this.f62821d;
    }

    public int getType() {
        return this.f62822e;
    }

    public synchronized boolean isCanceled() {
        return this.f62831n;
    }

    public synchronized void markAsProcessed(boolean z10) {
        this.f62829l = z10 | this.f62829l;
        this.f62830m = true;
        notifyAll();
    }

    public m0 send() {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        if (this.f62826i == C.TIME_UNSET) {
            io.odeeo.internal.q0.a.checkArgument(this.f62827j);
        }
        this.f62828k = true;
        this.f62819b.sendMessage(this);
        return this;
    }

    public m0 setDeleteAfterDelivery(boolean z10) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        this.f62827j = z10;
        return this;
    }

    @Deprecated
    public m0 setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public m0 setLooper(Looper looper) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        this.f62824g = looper;
        return this;
    }

    public m0 setPayload(Object obj) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        this.f62823f = obj;
        return this;
    }

    public m0 setPosition(long j10) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        this.f62826i = j10;
        return this;
    }

    public m0 setType(int i10) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        this.f62822e = i10;
        return this;
    }

    public m0 setPosition(int i10, long j10) {
        io.odeeo.internal.q0.a.checkState(!this.f62828k);
        io.odeeo.internal.q0.a.checkArgument(j10 != C.TIME_UNSET);
        if (i10 >= 0 && (this.f62821d.isEmpty() || i10 < this.f62821d.getWindowCount())) {
            this.f62825h = i10;
            this.f62826i = j10;
            return this;
        }
        throw new w(this.f62821d, i10, j10);
    }

    public synchronized boolean blockUntilDelivered(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            io.odeeo.internal.q0.a.checkState(this.f62828k);
            io.odeeo.internal.q0.a.checkState(this.f62824g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.f62820c.elapsedRealtime() + j10;
            while (true) {
                z10 = this.f62830m;
                if (z10 || j10 <= 0) {
                    break;
                }
                this.f62820c.onThreadBlocked();
                wait(j10);
                j10 = jElapsedRealtime - this.f62820c.elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62829l;
    }
}
