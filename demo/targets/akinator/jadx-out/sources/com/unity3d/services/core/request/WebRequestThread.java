package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool = null;
    private static LinkedBlockingQueue<Runnable> _queue = null;
    private static boolean _ready = false;
    private static final Object _readyLock = new Object();

    public static synchronized void cancel() {
        try {
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
            if (cancelableThreadPoolExecutor != null) {
                cancelableThreadPoolExecutor.cancel();
                Iterator<Runnable> it = _queue.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    if (next instanceof WebRequestRunnable) {
                        ((WebRequestRunnable) next).setCancelStatus(true);
                    }
                }
                _queue.clear();
                _pool.purge();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void init() {
        _queue = new LinkedBlockingQueue<>();
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, TimeUnit.MILLISECONDS, _queue);
        _pool = cancelableThreadPoolExecutor;
        cancelableThreadPoolExecutor.prestartAllCoreThreads();
        _queue.add(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = WebRequestThread._ready = true;
                synchronized (WebRequestThread._readyLock) {
                    WebRequestThread._readyLock.notifyAll();
                }
            }
        });
        while (!_ready) {
            try {
                Object obj = _readyLock;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (InterruptedException unused) {
                DeviceLog.debug("Couldn't synchronize thread");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        request(str, requestType, map, null, num, num2, iWebRequestListener);
    }

    public static synchronized void reset() {
        cancel();
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.shutdown();
            try {
                _pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            _queue.clear();
            _pool = null;
            _queue = null;
            _ready = false;
        }
    }

    public static synchronized boolean resolve(final String str, final IResolveHostListener iResolveHostListener) {
        if (str != null) {
            if (str.length() >= 3) {
                new Thread(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2
                    @Override // java.lang.Runnable
                    public void run() {
                        Thread thread;
                        Exception e10;
                        final ConditionVariable conditionVariable = new ConditionVariable();
                        try {
                            thread = new Thread(new Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        String hostAddress = InetAddress.getByName(str).getHostAddress();
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        iResolveHostListener.onResolve(str, hostAddress);
                                    } catch (UnknownHostException e11) {
                                        DeviceLog.exception("Unknown host", e11);
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        iResolveHostListener.onFailed(str, ResolveHostError.UNKNOWN_HOST, e11.getMessage());
                                    }
                                    conditionVariable.open();
                                }
                            });
                        } catch (Exception e11) {
                            thread = null;
                            e10 = e11;
                        }
                        try {
                            thread.start();
                        } catch (Exception e12) {
                            e10 = e12;
                            DeviceLog.exception("Exception while resolving host", e10);
                            iResolveHostListener.onFailed(str, ResolveHostError.UNEXPECTED_EXCEPTION, e10.getMessage());
                            if (conditionVariable.block(20000L)) {
                                return;
                            } else {
                                return;
                            }
                        }
                        if (conditionVariable.block(20000L) || thread == null) {
                            return;
                        }
                        thread.interrupt();
                        iResolveHostListener.onFailed(str, ResolveHostError.TIMEOUT, AndroidInitializeBoldSDK.MSG_TIMEOUT);
                    }
                }).start();
                return true;
            }
        }
        iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
        return false;
    }

    public static synchronized void setConcurrentRequestCount(int i10) {
        _corePoolSize = i10;
        _maximumPoolSize = i10;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setCorePoolSize(i10);
            _pool.setMaximumPoolSize(_maximumPoolSize);
        }
    }

    public static synchronized void setKeepAliveTime(long j10) {
        _keepAliveTime = j10;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setKeepAliveTime(j10, TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized void setMaximumPoolSize(int i10) {
        _maximumPoolSize = i10;
        CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setMaximumPoolSize(i10);
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map<String, List<String>> map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        try {
            if (!_ready) {
                init();
            }
            if (str != null && str.length() >= 3) {
                _queue.add(new WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
                return;
            }
            iWebRequestListener.onFailed(str, "Request is NULL or too short");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
