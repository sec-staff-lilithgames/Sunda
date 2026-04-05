package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final t2 f28118a;

    /* renamed from: b, reason: collision with root package name */
    public final s2 f28119b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.d f28120c;

    /* renamed from: d, reason: collision with root package name */
    public final m3 f28121d;

    /* renamed from: e, reason: collision with root package name */
    public int f28122e;

    /* renamed from: f, reason: collision with root package name */
    public Object f28123f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f28124g;

    /* renamed from: h, reason: collision with root package name */
    public int f28125h;

    /* renamed from: i, reason: collision with root package name */
    public long f28126i = C.TIME_UNSET;

    /* renamed from: j, reason: collision with root package name */
    public boolean f28127j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28128k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f28129l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f28130m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f28131n;

    public u2(s2 s2Var, t2 t2Var, m3 m3Var, int i10, com.google.android.exoplayer2.util.d dVar, Looper looper) {
        this.f28119b = s2Var;
        this.f28118a = t2Var;
        this.f28121d = m3Var;
        this.f28124g = looper;
        this.f28120c = dVar;
        this.f28125h = i10;
    }

    public synchronized boolean blockUntilDelivered() throws InterruptedException {
        try {
            com.google.android.exoplayer2.util.a.checkState(this.f28128k);
            com.google.android.exoplayer2.util.a.checkState(this.f28124g.getThread() != Thread.currentThread());
            while (!this.f28130m) {
                wait();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f28129l;
    }

    public synchronized u2 cancel() {
        com.google.android.exoplayer2.util.a.checkState(this.f28128k);
        this.f28131n = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.f28127j;
    }

    public Looper getLooper() {
        return this.f28124g;
    }

    public int getMediaItemIndex() {
        return this.f28125h;
    }

    public Object getPayload() {
        return this.f28123f;
    }

    public long getPositionMs() {
        return this.f28126i;
    }

    public t2 getTarget() {
        return this.f28118a;
    }

    public m3 getTimeline() {
        return this.f28121d;
    }

    public int getType() {
        return this.f28122e;
    }

    public synchronized boolean isCanceled() {
        return this.f28131n;
    }

    public synchronized void markAsProcessed(boolean z10) {
        this.f28129l = z10 | this.f28129l;
        this.f28130m = true;
        notifyAll();
    }

    public u2 send() {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        if (this.f28126i == C.TIME_UNSET) {
            com.google.android.exoplayer2.util.a.checkArgument(this.f28127j);
        }
        this.f28128k = true;
        this.f28119b.sendMessage(this);
        return this;
    }

    public u2 setDeleteAfterDelivery(boolean z10) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        this.f28127j = z10;
        return this;
    }

    @Deprecated
    public u2 setHandler(Handler handler) {
        return setLooper(handler.getLooper());
    }

    public u2 setLooper(Looper looper) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        this.f28124g = looper;
        return this;
    }

    public u2 setPayload(Object obj) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        this.f28123f = obj;
        return this;
    }

    public u2 setPosition(long j10) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        this.f28126i = j10;
        return this;
    }

    public u2 setType(int i10) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        this.f28122e = i10;
        return this;
    }

    public u2 setPosition(int i10, long j10) {
        com.google.android.exoplayer2.util.a.checkState(!this.f28128k);
        com.google.android.exoplayer2.util.a.checkArgument(j10 != C.TIME_UNSET);
        m3 m3Var = this.f28121d;
        if (i10 >= 0 && (m3Var.isEmpty() || i10 < m3Var.getWindowCount())) {
            this.f28125h = i10;
            this.f28126i = j10;
            return this;
        }
        throw new c1(m3Var, i10, j10);
    }

    public synchronized boolean blockUntilDelivered(long j10) throws InterruptedException, TimeoutException {
        boolean z10;
        try {
            com.google.android.exoplayer2.util.a.checkState(this.f28128k);
            com.google.android.exoplayer2.util.a.checkState(this.f28124g.getThread() != Thread.currentThread());
            long jElapsedRealtime = ((com.google.android.exoplayer2.util.d1) this.f28120c).elapsedRealtime() + j10;
            while (true) {
                z10 = this.f28130m;
                if (z10 || j10 <= 0) {
                    break;
                }
                ((com.google.android.exoplayer2.util.d1) this.f28120c).onThreadBlocked();
                wait(j10);
                j10 = jElapsedRealtime - ((com.google.android.exoplayer2.util.d1) this.f28120c).elapsedRealtime();
            }
            if (!z10) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f28129l;
    }
}
