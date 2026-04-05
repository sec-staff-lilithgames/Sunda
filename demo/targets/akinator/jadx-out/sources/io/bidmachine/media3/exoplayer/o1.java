package io.bidmachine.media3.exoplayer;

import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f61488a;

    /* renamed from: b, reason: collision with root package name */
    public final m1 f61489b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.g f61490c;

    /* renamed from: d, reason: collision with root package name */
    public final gn.u1 f61491d;

    /* renamed from: e, reason: collision with root package name */
    public int f61492e;

    /* renamed from: f, reason: collision with root package name */
    public Object f61493f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f61494g;

    /* renamed from: h, reason: collision with root package name */
    public int f61495h;

    /* renamed from: i, reason: collision with root package name */
    public long f61496i = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public boolean f61497j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f61498k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f61499l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f61500m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f61501n;

    public o1(m1 m1Var, n1 n1Var, gn.u1 u1Var, int i10, io.bidmachine.media3.common.util.g gVar, Looper looper) {
        this.f61489b = m1Var;
        this.f61488a = n1Var;
        this.f61491d = u1Var;
        this.f61494g = looper;
        this.f61490c = gVar;
        this.f61495h = i10;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            io.bidmachine.media3.common.util.a.checkState(this.f61498k);
            io.bidmachine.media3.common.util.a.checkState(this.f61494g.getThread() != Thread.currentThread());
            while (!this.f61500m) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f61499l;
    }

    public synchronized o1 cancel() {
        io.bidmachine.media3.common.util.a.checkState(this.f61498k);
        this.f61501n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.f61497j;
    }

    public Looper getLooper() {
        return this.f61494g;
    }

    public int getMediaItemIndex() {
        return this.f61495h;
    }

    public Object getPayload() {
        return this.f61493f;
    }

    public long getPositionMs() {
        return this.f61496i;
    }

    public n1 getTarget() {
        return this.f61488a;
    }

    public gn.u1 getTimeline() {
        return this.f61491d;
    }

    public int getType() {
        return this.f61492e;
    }

    public synchronized boolean isCanceled() {
        return this.f61501n;
    }

    public synchronized void markAsProcessed(boolean z10) {
        this.f61499l = z10 | this.f61499l;
        this.f61500m = true;
        notifyAll();
    }

    public o1 send() {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        if (this.f61496i == C.TIME_UNSET) {
            io.bidmachine.media3.common.util.a.checkArgument(this.f61497j);
        }
        this.f61498k = true;
        this.f61489b.sendMessage(this);
        return this;
    }

    public o1 setDeleteAfterDelivery(boolean z10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        this.f61497j = z10;
        return this;
    }

    public o1 setLooper(Looper looper) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        this.f61494g = looper;
        return this;
    }

    public o1 setPayload(Object obj) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        this.f61493f = obj;
        return this;
    }

    public o1 setPosition(long j10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        this.f61496i = j10;
        return this;
    }

    public o1 setType(int i10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        this.f61492e = i10;
        return this;
    }

    public o1 setPosition(int i10, long j10) {
        io.bidmachine.media3.common.util.a.checkState(!this.f61498k);
        io.bidmachine.media3.common.util.a.checkArgument(j10 != C.TIME_UNSET);
        gn.u1 u1Var = this.f61491d;
        if (i10 >= 0 && (u1Var.isEmpty() || i10 < u1Var.getWindowCount())) {
            this.f61495h = i10;
            this.f61496i = j10;
            return this;
        }
        throw new gn.y(u1Var, i10, j10);
    }

    public synchronized boolean blockUntilDelivered(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            io.bidmachine.media3.common.util.a.checkState(this.f61498k);
            io.bidmachine.media3.common.util.a.checkState(this.f61494g.getThread() != Thread.currentThread());
            long jElapsedRealtime = ((io.bidmachine.media3.common.util.q0) this.f61490c).elapsedRealtime() + j10;
            while (true) {
                z10 = this.f61500m;
                if (z10 || j10 <= 0) {
                    break;
                }
                ((io.bidmachine.media3.common.util.q0) this.f61490c).onThreadBlocked();
                wait(j10);
                j10 = jElapsedRealtime - ((io.bidmachine.media3.common.util.q0) this.f61490c).elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f61499l;
    }
}
