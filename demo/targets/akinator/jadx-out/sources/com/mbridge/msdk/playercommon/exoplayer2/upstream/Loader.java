package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.TraceUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Loader implements LoaderErrorThrower {
    public static final int DONT_RETRY = 2;
    public static final int DONT_RETRY_FATAL = 3;
    public static final int RETRY = 0;
    public static final int RETRY_RESET_ERROR_COUNT = 1;
    private LoadTask<? extends Loadable> currentTask;
    private final ExecutorService downloadExecutorService;
    private IOException fatalError;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Callback<T extends Loadable> {
        void onLoadCanceled(T t10, long j10, long j11, boolean z10);

        void onLoadCompleted(T t10, long j10, long j11);

        int onLoadError(T t10, long j10, long j11, IOException iOException);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_CANCEL = 1;
        private static final int MSG_END_OF_SOURCE = 2;
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 0;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private volatile boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private volatile Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;

        public LoadTask(Looper looper, T t10, Callback<T> callback, int i10, long j10) {
            super(looper);
            this.loadable = t10;
            this.callback = callback;
            this.defaultMinRetryCount = i10;
            this.startTimeMs = j10;
        }

        private void execute() {
            this.currentError = null;
            Loader.this.downloadExecutorService.execute(Loader.this.currentTask);
        }

        private void finish() {
            Loader.this.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public void cancel(boolean z10) {
            this.released = z10;
            this.currentError = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                this.canceled = true;
                this.loadable.cancelLoad();
                if (this.executorThread != null) {
                    this.executorThread.interrupt();
                }
            }
            if (z10) {
                finish();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.callback.onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                execute();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            finish();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.startTimeMs;
            if (this.canceled) {
                this.callback.onLoadCanceled(this.loadable, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                this.callback.onLoadCanceled(this.loadable, jElapsedRealtime, j10, false);
                return;
            }
            if (i11 == 2) {
                try {
                    this.callback.onLoadCompleted(this.loadable, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    Log.e(TAG, "Unexpected exception handling load completed", e10);
                    Loader.this.fatalError = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.currentError = iOException;
            int iOnLoadError = this.callback.onLoadError(this.loadable, jElapsedRealtime, j10, iOException);
            if (iOnLoadError == 3) {
                Loader.this.fatalError = this.currentError;
            } else if (iOnLoadError != 2) {
                this.errorCount = iOnLoadError != 1 ? 1 + this.errorCount : 1;
                start(getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i10) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i10) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.executorThread = Thread.currentThread();
                if (!this.canceled) {
                    TraceUtil.beginSection("load:".concat(this.loadable.getClass().getSimpleName()));
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th2) {
                        TraceUtil.endSection();
                        throw th2;
                    }
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                Log.e(TAG, "Unexpected error loading stream", e11);
                if (!this.released) {
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (InterruptedException unused) {
                Assertions.checkState(this.canceled);
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e12) {
                Log.e(TAG, "Unexpected exception loading stream", e12);
                if (this.released) {
                    return;
                }
                obtainMessage(3, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                Log.e(TAG, "OutOfMemory error loading stream", e13);
                if (this.released) {
                    return;
                }
                obtainMessage(3, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }

        public void start(long j10) {
            Assertions.checkState(Loader.this.currentTask == null);
            Loader.this.currentTask = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                execute();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Loadable {
        void cancelLoad();

        void load() throws InterruptedException, IOException;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RetryAction {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public Loader(String str) {
        this.downloadExecutorService = Util.newSingleThreadExecutor(str);
    }

    public void cancelLoading() {
        this.currentTask.cancel(false);
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public <T extends Loadable> long startLoading(T t10, Callback<T> callback, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        Assertions.checkState(looperMyLooper != null);
        this.fatalError = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(looperMyLooper, t10, callback, i10, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.LoaderErrorThrower
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i10);
        }
    }

    public void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutorService.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutorService.shutdown();
    }
}
