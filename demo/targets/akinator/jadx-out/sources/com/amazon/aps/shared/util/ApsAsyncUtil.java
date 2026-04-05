package com.amazon.aps.shared.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.browser.customtabs.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsAsyncUtil {
    private static ApsAsyncUtil INSTANCE = null;
    private static final String TAG = "ApsAsyncUtil";
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);
    private boolean shutdownInProgress = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ApsExecutionListener<T> {
        void onExecutionCompleted(ApsResult apsResult, T t10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface ApsReturnRunnable<T> {
        T run();
    }

    private ApsAsyncUtil() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.aps.shared.util.ApsAsyncUtil.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ApsAsyncUtil.this.shutdownInProgress = true;
                    Log.d(ApsAsyncUtil.TAG, "App is shutting down, terminating the thread executor");
                    ApsAsyncUtil.this.executorService.shutdown();
                } catch (RuntimeException e10) {
                    Log.e(ApsAsyncUtil.TAG, "Error in stopping the executor", e10);
                }
            }
        });
    }

    public static ApsAsyncUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApsAsyncUtil();
        }
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runAsyncAndCallback$4(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        ApsResult apsResult = ApsResult.FAILURE;
        Object objRun = null;
        try {
            try {
                objRun = apsReturnRunnable.run();
                ApsResult apsResult2 = ApsResult.SUCCESS;
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult2, objRun);
                }
            } catch (Exception e10) {
                Log.e(TAG, "Error running the thread", e10);
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult, objRun);
                }
            }
        } catch (Throwable th2) {
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult, objRun);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runAsyncAndCallbackOnUiThread$2(ApsExecutionListener apsExecutionListener, ApsResult apsResult, Object obj) {
        if (apsExecutionListener != null) {
            apsExecutionListener.onExecutionCompleted(apsResult, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runAsyncAndCallbackOnUiThread$3(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        ApsResult apsResult = ApsResult.FAILURE;
        Object objRun = null;
        try {
            try {
                objRun = apsReturnRunnable.run();
                new Handler(Looper.getMainLooper()).post(new g(apsExecutionListener, 4, ApsResult.SUCCESS, objRun));
            } catch (Exception e10) {
                Log.e(TAG, "Error running the thread", e10);
                new Handler(Looper.getMainLooper()).post(new g(apsExecutionListener, 4, apsResult, objRun));
            }
        } catch (Throwable th2) {
            new Handler(Looper.getMainLooper()).post(new g(apsExecutionListener, 4, apsResult, objRun));
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runOnUiThreadAndAsyncCallback$1(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        Object objRun;
        try {
            objRun = apsReturnRunnable.run();
        } catch (RuntimeException unused) {
            objRun = null;
        }
        if (apsExecutionListener != null) {
            getInstance().runAsyncAndCallback(new b(objRun), apsExecutionListener);
        }
    }

    public synchronized <T> void runAsyncAndCallback(ApsReturnRunnable<T> apsReturnRunnable, ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new a(apsReturnRunnable, apsExecutionListener, 0));
            }
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }

    public synchronized <T> void runAsyncAndCallbackOnUiThread(ApsReturnRunnable<T> apsReturnRunnable, ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable, apsExecutionListener);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new a(apsReturnRunnable, apsExecutionListener, 2));
            }
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }

    public <T> void runOnUiThreadAndAsyncCallback(ApsReturnRunnable<T> apsReturnRunnable, ApsExecutionListener<T> apsExecutionListener) throws IllegalArgumentException {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (this.shutdownInProgress) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new a(apsReturnRunnable, apsExecutionListener, 1));
        } catch (RuntimeException e10) {
            Log.e(TAG, "Error running the thread", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$runOnUiThreadAndAsyncCallback$0(Object obj) {
        return obj;
    }
}
