package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.jpo;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile Handler f18555jd;
    private static final Object jpo = new Object();
    private static final LinkedList<Runnable> wqx = new LinkedList<>();

    /* renamed from: cm, reason: collision with root package name */
    private static Object f18554cm = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends Handler {
        public jpo(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    jd.wqx();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    private static Handler jd() {
        Handler handler;
        if (f18555jd != null) {
            return f18555jd;
        }
        synchronized (jpo) {
            try {
                if (f18555jd == null) {
                    jpo.InterfaceC0086jpo interfaceC0086jpo = com.bytedance.sdk.component.jpo.jpo;
                    HandlerThread safeHandlerThread = interfaceC0086jpo != null ? interfaceC0086jpo.getSafeHandlerThread("queued-work-looper", -2) : null;
                    if (safeHandlerThread == null) {
                        safeHandlerThread = new HandlerThread("queued-work-looper", -2);
                        safeHandlerThread.start();
                    }
                    f18555jd = new jpo(safeHandlerThread.getLooper());
                }
                handler = f18555jd;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx() {
        LinkedList linkedList;
        synchronized (f18554cm) {
            try {
                synchronized (jpo) {
                    LinkedList<Runnable> linkedList2 = wqx;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    jd().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void jpo(Runnable runnable, boolean z10) {
        try {
            Handler handlerJd = jd();
            synchronized (jpo) {
                try {
                    wqx.add(runnable);
                    if (z10) {
                        handlerJd.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        handlerJd.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
