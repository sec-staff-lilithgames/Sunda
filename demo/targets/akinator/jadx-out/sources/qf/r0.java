package qf;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.i1;
import com.google.android.exoplayer2.util.n1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 implements u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f82976d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f82977e;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f82978a;

    /* renamed from: b, reason: collision with root package name */
    public a f82979b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f82980c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f82981b;

        /* renamed from: c, reason: collision with root package name */
        public final s0 f82982c;

        /* renamed from: e, reason: collision with root package name */
        public final long f82983e;

        /* renamed from: f, reason: collision with root package name */
        public p0 f82984f;

        /* renamed from: g, reason: collision with root package name */
        public IOException f82985g;

        /* renamed from: h, reason: collision with root package name */
        public int f82986h;

        /* renamed from: i, reason: collision with root package name */
        public Thread f82987i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f82988j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f82989k;

        public a(Looper looper, s0 s0Var, p0 p0Var, int i10, long j10) {
            super(looper);
            this.f82982c = s0Var;
            this.f82984f = p0Var;
            this.f82981b = i10;
            this.f82983e = j10;
        }

        public void cancel(boolean z10) {
            this.f82989k = z10;
            this.f82985g = null;
            if (hasMessages(0)) {
                this.f82988j = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f82988j = true;
                        this.f82982c.cancelLoad();
                        Thread thread = this.f82987i;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                r0.this.f82979b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((p0) com.google.android.exoplayer2.util.a.checkNotNull(this.f82984f)).onLoadCanceled(this.f82982c, jElapsedRealtime, jElapsedRealtime - this.f82983e, true);
                this.f82984f = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f82989k) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.f82985g = null;
                r0 r0Var = r0.this;
                r0Var.f82978a.execute((Runnable) com.google.android.exoplayer2.util.a.checkNotNull(r0Var.f82979b));
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            r0.this.f82979b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f82983e;
            p0 p0Var = (p0) com.google.android.exoplayer2.util.a.checkNotNull(this.f82984f);
            if (this.f82988j) {
                p0Var.onLoadCanceled(this.f82982c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    p0Var.onLoadCompleted(this.f82982c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    com.google.android.exoplayer2.util.f0.e("LoadTask", "Unexpected exception handling load completed", e10);
                    r0.this.f82980c = new c(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f82985g = iOException;
            int i12 = this.f82986h + 1;
            this.f82986h = i12;
            q0 q0VarOnLoadError = p0Var.onLoadError(this.f82982c, jElapsedRealtime, j10, iOException, i12);
            int i13 = q0VarOnLoadError.f82968a;
            if (i13 == 3) {
                r0.this.f82980c = this.f82985g;
            } else if (i13 != 2) {
                if (i13 == 1) {
                    this.f82986h = 1;
                }
                long jMin = q0VarOnLoadError.f82969b;
                if (jMin == C.TIME_UNSET) {
                    jMin = Math.min((this.f82986h - 1) * 1000, 5000);
                }
                start(jMin);
            }
        }

        public void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.f82985g;
            if (iOException != null && this.f82986h > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f82988j;
                    this.f82987i = Thread.currentThread();
                }
                if (!z10) {
                    i1.beginSection("load:".concat(this.f82982c.getClass().getSimpleName()));
                    try {
                        this.f82982c.load();
                        i1.endSection();
                    } catch (Throwable th2) {
                        i1.endSection();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f82987i = null;
                    Thread.interrupted();
                }
                if (this.f82989k) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f82989k) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f82989k) {
                    return;
                }
                com.google.android.exoplayer2.util.f0.e("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new c(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f82989k) {
                    return;
                }
                com.google.android.exoplayer2.util.f0.e("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new c(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f82989k) {
                    com.google.android.exoplayer2.util.f0.e("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }

        public void start(long j10) {
            r0 r0Var = r0.this;
            com.google.android.exoplayer2.util.a.checkState(r0Var.f82979b == null);
            r0Var.f82979b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                this.f82985g = null;
                r0Var.f82978a.execute((Runnable) com.google.android.exoplayer2.util.a.checkNotNull(r0Var.f82979b));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final t0 f82991b;

        public b(t0 t0Var) {
            this.f82991b = t0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f82991b.onLoaderReleased();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends IOException {
        public c(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        createRetryAction(false, C.TIME_UNSET);
        createRetryAction(true, C.TIME_UNSET);
        f82976d = new q0(2, C.TIME_UNSET);
        f82977e = new q0(3, C.TIME_UNSET);
    }

    public r0(String str) {
        this.f82978a = n1.newSingleThreadExecutor("ExoPlayer:Loader:" + str);
    }

    public static q0 createRetryAction(boolean z10, long j10) {
        return new q0(z10 ? 1 : 0, j10);
    }

    public void cancelLoading() {
        ((a) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f82979b)).cancel(false);
    }

    public void clearFatalError() {
        this.f82980c = null;
    }

    public boolean hasFatalError() {
        return this.f82980c != null;
    }

    public boolean isLoading() {
        return this.f82979b != null;
    }

    @Override // qf.u0
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends s0> long startLoading(T t10, p0 p0Var, int i10) {
        Looper looper = (Looper) com.google.android.exoplayer2.util.a.checkStateNotNull(Looper.myLooper());
        this.f82980c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new a(looper, t10, p0Var, i10, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // qf.u0
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.f82980c;
        if (iOException != null) {
            throw iOException;
        }
        a aVar = this.f82979b;
        if (aVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = aVar.f82981b;
            }
            aVar.maybeThrowError(i10);
        }
    }

    public void release(t0 t0Var) {
        a aVar = this.f82979b;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ExecutorService executorService = this.f82978a;
        if (t0Var != null) {
            executorService.execute(new b(t0Var));
        }
        executorService.shutdown();
    }
}
