package go;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e6.h0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.w0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final v f58370d = createRetryAction(false, C.TIME_UNSET);

    /* renamed from: e, reason: collision with root package name */
    public static final v f58371e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f58372f;

    /* renamed from: a, reason: collision with root package name */
    public final ho.b f58373a;

    /* renamed from: b, reason: collision with root package name */
    public a f58374b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f58375c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends Handler implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final int f58376b;

        /* renamed from: c, reason: collision with root package name */
        public final x f58377c;

        /* renamed from: e, reason: collision with root package name */
        public final long f58378e;

        /* renamed from: f, reason: collision with root package name */
        public u f58379f;

        /* renamed from: g, reason: collision with root package name */
        public IOException f58380g;

        /* renamed from: h, reason: collision with root package name */
        public int f58381h;

        /* renamed from: i, reason: collision with root package name */
        public Thread f58382i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f58383j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f58384k;

        public a(Looper looper, x xVar, u uVar, int i10, long j10) {
            super(looper);
            this.f58377c = xVar;
            this.f58379f = uVar;
            this.f58376b = i10;
            this.f58378e = j10;
        }

        public final void a() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((u) io.bidmachine.media3.common.util.a.checkNotNull(this.f58379f)).onLoadStarted(this.f58377c, jElapsedRealtime, jElapsedRealtime - this.f58378e, this.f58381h);
            this.f58380g = null;
            w wVar = w.this;
            ((ho.a) wVar.f58373a).execute((Runnable) io.bidmachine.media3.common.util.a.checkNotNull(wVar.f58374b));
        }

        public void cancel(boolean z10) {
            this.f58384k = z10;
            this.f58380g = null;
            if (hasMessages(1)) {
                this.f58383j = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f58383j = true;
                        this.f58377c.cancelLoad();
                        Thread thread = this.f58382i;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                w.this.f58374b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((u) io.bidmachine.media3.common.util.a.checkNotNull(this.f58379f)).onLoadCanceled(this.f58377c, jElapsedRealtime, jElapsedRealtime - this.f58378e, true);
                this.f58379f = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f58384k) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                a();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            w.this.f58374b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f58378e;
            u uVar = (u) io.bidmachine.media3.common.util.a.checkNotNull(this.f58379f);
            if (this.f58383j) {
                uVar.onLoadCanceled(this.f58377c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    uVar.onLoadCompleted(this.f58377c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    io.bidmachine.media3.common.util.b0.e("LoadTask", "Unexpected exception handling load completed", e10);
                    w.this.f58375c = new c(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f58380g = iOException;
            int i12 = this.f58381h + 1;
            this.f58381h = i12;
            v vVarOnLoadError = uVar.onLoadError(this.f58377c, jElapsedRealtime, j10, iOException, i12);
            int i13 = vVarOnLoadError.f58368a;
            if (i13 == 3) {
                w.this.f58375c = this.f58380g;
            } else if (i13 != 2) {
                if (i13 == 1) {
                    this.f58381h = 1;
                }
                long jMin = vVarOnLoadError.f58369b;
                if (jMin == C.TIME_UNSET) {
                    jMin = Math.min((this.f58381h - 1) * 1000, 5000);
                }
                start(jMin);
            }
        }

        public void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.f58380g;
            if (iOException != null && this.f58381h > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f58383j;
                    this.f58382i = Thread.currentThread();
                }
                if (!z10) {
                    w0.beginSection("load:".concat(this.f58377c.getClass().getSimpleName()));
                    try {
                        this.f58377c.load();
                        w0.endSection();
                    } catch (Throwable th2) {
                        w0.endSection();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f58382i = null;
                    Thread.interrupted();
                }
                if (this.f58384k) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f58384k) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f58384k) {
                    return;
                }
                io.bidmachine.media3.common.util.b0.e("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new c(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f58384k) {
                    return;
                }
                io.bidmachine.media3.common.util.b0.e("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new c(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f58384k) {
                    io.bidmachine.media3.common.util.b0.e("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            }
        }

        public void start(long j10) {
            w wVar = w.this;
            io.bidmachine.media3.common.util.a.checkState(wVar.f58374b == null);
            wVar.f58374b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                a();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final y f58386b;

        public b(y yVar) {
            this.f58386b = yVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f58386b.onLoaderReleased();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends IOException {
        public c(Throwable th2) {
            StringBuilder sb2 = new StringBuilder("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            sb2.append(th2.getMessage() != null ? e2.o(th2, new StringBuilder(": ")) : "");
            super(sb2.toString(), th2);
        }
    }

    static {
        createRetryAction(true, C.TIME_UNSET);
        f58371e = new v(2, C.TIME_UNSET);
        f58372f = new v(3, C.TIME_UNSET);
    }

    public w(String str) {
        this(ho.b.from(a1.newSingleThreadExecutor("ExoPlayer:Loader:" + str), new h0(17)));
    }

    public static v createRetryAction(boolean z10, long j10) {
        return new v(z10 ? 1 : 0, j10);
    }

    public void cancelLoading() {
        ((a) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f58374b)).cancel(false);
    }

    public void clearFatalError() {
        this.f58375c = null;
    }

    public boolean hasFatalError() {
        return this.f58375c != null;
    }

    public boolean isLoading() {
        return this.f58374b != null;
    }

    @Override // go.a0
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends x> long startLoading(T t10, u uVar, int i10) {
        Looper looper = (Looper) io.bidmachine.media3.common.util.a.checkStateNotNull(Looper.myLooper());
        this.f58375c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new a(looper, t10, uVar, i10, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // go.a0
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.f58375c;
        if (iOException != null) {
            throw iOException;
        }
        a aVar = this.f58374b;
        if (aVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = aVar.f58376b;
            }
            aVar.maybeThrowError(i10);
        }
    }

    public void release(y yVar) {
        a aVar = this.f58374b;
        if (aVar != null) {
            aVar.cancel(true);
        }
        ho.b bVar = this.f58373a;
        if (yVar != null) {
            ((ho.a) bVar).execute(new b(yVar));
        }
        ((ho.a) bVar).release();
    }

    public w(ho.b bVar) {
        this.f58373a = bVar;
    }
}
