package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final z f25999a;

    /* renamed from: b, reason: collision with root package name */
    public final x f26000b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26001c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26002d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f26003e;

    /* renamed from: f, reason: collision with root package name */
    public int f26004f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Thread f26005g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f26006h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f26007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper, z zVar, x xVar, int i10, long j10) {
        super(looper);
        this.f26007i = b0Var;
        this.f25999a = zVar;
        this.f26000b = xVar;
        this.f26001c = i10;
        this.f26002d = j10;
    }

    public final void a(boolean z10) {
        this.f26006h = z10;
        this.f26003e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.f25999a.b();
            if (this.f26005g != null) {
                this.f26005g.interrupt();
            }
        }
        if (z10) {
            this.f26007i.f25852b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f26000b.a(this.f25999a, jElapsedRealtime, jElapsedRealtime - this.f26002d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f26006h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f26003e = null;
            b0 b0Var = this.f26007i;
            b0Var.f25851a.execute(b0Var.f25852b);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f26007i.f25852b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f26002d;
        if (this.f25999a.a()) {
            this.f26000b.a(this.f25999a, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            this.f26000b.a(this.f25999a, jElapsedRealtime, j10, false);
            return;
        }
        if (i11 == 2) {
            this.f26000b.a(this.f25999a, jElapsedRealtime, j10);
            return;
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f26003e = iOException;
        int iA = this.f26000b.a(this.f25999a, jElapsedRealtime, j10, iOException);
        if (iA == 3) {
            this.f26007i.f25853c = this.f26003e;
            return;
        }
        if (iA != 2) {
            int i12 = iA == 1 ? 1 : this.f26004f + 1;
            this.f26004f = i12;
            long jMin = Math.min((i12 - 1) * 1000, 5000);
            b0 b0Var2 = this.f26007i;
            if (b0Var2.f25852b != null) {
                throw new IllegalStateException();
            }
            b0Var2.f25852b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f26003e = null;
                b0Var2.f25851a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f26005g = Thread.currentThread();
            if (!this.f25999a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f25999a.getClass().getSimpleName()));
                try {
                    this.f25999a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (Throwable th2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th2;
                }
            }
            if (this.f26006h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f26006h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            Log.e("LoadTask", "Unexpected error loading stream", e11);
            if (!this.f26006h) {
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (InterruptedException unused) {
            if (!this.f25999a.a()) {
                throw new IllegalStateException();
            }
            if (this.f26006h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e12) {
            Log.e("LoadTask", "Unexpected exception loading stream", e12);
            if (this.f26006h) {
                return;
            }
            obtainMessage(3, new a0(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e13);
            if (this.f26006h) {
                return;
            }
            obtainMessage(3, new a0(e13)).sendToTarget();
        }
    }
}
