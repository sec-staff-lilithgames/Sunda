package io.odeeo.internal.p0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.f0;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements x {

    /* renamed from: d, reason: collision with root package name */
    public static final c f65746d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f65747e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f65748f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f65749g;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f65750a;

    /* renamed from: b, reason: collision with root package name */
    public d<? extends e> f65751b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f65752c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b<T extends e> {
        void onLoadCanceled(T t10, long j10, long j11, boolean z10);

        void onLoadCompleted(T t10, long j10, long j11);

        c onLoadError(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f65753a;

        /* renamed from: b, reason: collision with root package name */
        public final long f65754b;

        public boolean isRetry() {
            int i10 = this.f65753a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f65753a = i10;
            this.f65754b = j10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f65755a;

        /* renamed from: b, reason: collision with root package name */
        public final T f65756b;

        /* renamed from: c, reason: collision with root package name */
        public final long f65757c;

        /* renamed from: e, reason: collision with root package name */
        public b<T> f65758e;

        /* renamed from: f, reason: collision with root package name */
        public IOException f65759f;

        /* renamed from: g, reason: collision with root package name */
        public int f65760g;

        /* renamed from: h, reason: collision with root package name */
        public Thread f65761h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f65762i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f65763j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f65756b = t10;
            this.f65758e = bVar;
            this.f65755a = i10;
            this.f65757c = j10;
        }

        public final void a() {
            this.f65759f = null;
            w.this.f65750a.execute((Runnable) io.odeeo.internal.q0.a.checkNotNull(w.this.f65751b));
        }

        public final void b() {
            w.this.f65751b = null;
        }

        public final long c() {
            return Math.min((this.f65760g - 1) * 1000, 5000);
        }

        public void cancel(boolean z10) {
            this.f65763j = z10;
            this.f65759f = null;
            if (hasMessages(0)) {
                this.f65762i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f65762i = true;
                        this.f65756b.cancelLoad();
                        Thread thread = this.f65761h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                b();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) io.odeeo.internal.q0.a.checkNotNull(this.f65758e)).onLoadCanceled(this.f65756b, jElapsedRealtime, jElapsedRealtime - this.f65757c, true);
                this.f65758e = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f65763j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                a();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            b();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f65757c;
            b bVar = (b) io.odeeo.internal.q0.a.checkNotNull(this.f65758e);
            if (this.f65762i) {
                bVar.onLoadCanceled(this.f65756b, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.onLoadCompleted(this.f65756b, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    io.odeeo.internal.q0.p.e("LoadTask", "Unexpected exception handling load completed", e10);
                    w.this.f65752c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f65759f = iOException;
            int i12 = this.f65760g + 1;
            this.f65760g = i12;
            c cVarOnLoadError = bVar.onLoadError(this.f65756b, jElapsedRealtime, j10, iOException, i12);
            if (cVarOnLoadError.f65753a == 3) {
                w.this.f65752c = this.f65759f;
            } else if (cVarOnLoadError.f65753a != 2) {
                if (cVarOnLoadError.f65753a == 1) {
                    this.f65760g = 1;
                }
                start(cVarOnLoadError.f65754b != C.TIME_UNSET ? cVarOnLoadError.f65754b : c());
            }
        }

        public void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.f65759f;
            if (iOException != null && this.f65760g > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f65762i;
                    this.f65761h = Thread.currentThread();
                }
                if (!z10) {
                    f0.beginSection("load:".concat(this.f65756b.getClass().getSimpleName()));
                    try {
                        this.f65756b.load();
                        f0.endSection();
                    } catch (Throwable th2) {
                        f0.endSection();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f65761h = null;
                    Thread.interrupted();
                }
                if (this.f65763j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f65763j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Exception e11) {
                if (this.f65763j) {
                    return;
                }
                io.odeeo.internal.q0.p.e("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(2, new h(e11)).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f65763j) {
                    return;
                }
                io.odeeo.internal.q0.p.e("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(2, new h(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f65763j) {
                    io.odeeo.internal.q0.p.e("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }

        public void start(long j10) {
            io.odeeo.internal.q0.a.checkState(w.this.f65751b == null);
            w.this.f65751b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                a();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface e {
        void cancelLoad();

        void load() throws IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface f {
        void onLoaderReleased();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f f65765a;

        public g(f fVar) {
            this.f65765a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f65765a.onLoaderReleased();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        long j10 = C.TIME_UNSET;
        f65746d = createRetryAction(false, C.TIME_UNSET);
        f65747e = createRetryAction(true, C.TIME_UNSET);
        f65748f = new c(2, j10);
        f65749g = new c(3, j10);
    }

    public w(String str) {
        this.f65750a = g0.newSingleThreadExecutor("ExoPlayer:Loader:" + str);
    }

    public static c createRetryAction(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void cancelLoading() {
        ((d) io.odeeo.internal.q0.a.checkStateNotNull(this.f65751b)).cancel(false);
    }

    public void clearFatalError() {
        this.f65752c = null;
    }

    public boolean hasFatalError() {
        return this.f65752c != null;
    }

    public boolean isLoading() {
        return this.f65751b != null;
    }

    @Override // io.odeeo.internal.p0.x
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends e> long startLoading(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) io.odeeo.internal.q0.a.checkStateNotNull(Looper.myLooper());
        this.f65752c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // io.odeeo.internal.p0.x
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.f65752c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f65751b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f65755a;
            }
            dVar.maybeThrowError(i10);
        }
    }

    public void release(f fVar) {
        d<? extends e> dVar = this.f65751b;
        if (dVar != null) {
            dVar.cancel(true);
        }
        if (fVar != null) {
            this.f65750a.execute(new g(fVar));
        }
        this.f65750a.shutdown();
    }
}
