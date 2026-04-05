package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ironsource.C3290je;
import com.ironsource.C3422r4;
import com.ironsource.T9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class IronSourceThreadManager {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f36644a;

    /* renamed from: c, reason: collision with root package name */
    private static final Handler f36646c;

    /* renamed from: d, reason: collision with root package name */
    private static final T9 f36647d;

    /* renamed from: e, reason: collision with root package name */
    private static final T9 f36648e;

    /* renamed from: f, reason: collision with root package name */
    private static final T9 f36649f;

    /* renamed from: g, reason: collision with root package name */
    private static final o f36650g;

    /* renamed from: h, reason: collision with root package name */
    private static final o f36651h;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: b, reason: collision with root package name */
    private static final Handler f36645b = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36652a = new a();

        public a() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3290je invoke() {
            return new C3290je(0, null, null, 7, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends f0 implements kv.a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36653a = new b();

        public b() {
            super(0);
        }

        @Override // kv.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T9 invoke() {
            T9 t92 = new T9("managersThread");
            t92.start();
            t92.a();
            return t92;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        f36646c = new Handler(handlerThread.getLooper());
        T9 t92 = new T9("mediationBackground");
        t92.start();
        t92.a();
        f36647d = t92;
        T9 t93 = new T9("adapterBackground");
        t93.start();
        t93.a();
        f36648e = t93;
        T9 t94 = new T9("publisher-callbacks");
        t94.start();
        t94.a();
        f36649f = t94;
        f36650g = q.lazy(a.f36652a);
        f36651h = q.lazy(b.f36653a);
    }

    private IronSourceThreadManager() {
    }

    private final C3290je a() {
        return (C3290je) f36650g.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, List<? extends Runnable> tasks) throws InterruptedException {
        e0.checkNotNullParameter(tasks, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = tasks.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
        Iterator<? extends Runnable> it3 = tasks.iterator();
        while (it3.hasNext()) {
            postMediationBackgroundTask$default(INSTANCE, new com.ironsource.environment.thread.a(0, it3.next(), countDownLatch), 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C3422r4.d().a(e10);
        }
    }

    public final Handler getInitHandler() {
        return f36646c;
    }

    public final T9 getSharedManagersThread() {
        return (T9) f36651h.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f36644a;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f36648e.b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            f36647d.b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        e0.checkNotNullParameter(action, "action");
        f36645b.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f36644a = z10;
    }

    private final boolean a(Runnable runnable) {
        return f36644a && a().getQueue().contains(runnable);
    }

    public final void postAdapterBackgroundTask(Runnable action, long j10) {
        e0.checkNotNullParameter(action, "action");
        if (f36644a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f36648e.a(action, j10);
        }
    }

    public final void postMediationBackgroundTask(Runnable action, long j10) {
        e0.checkNotNullParameter(action, "action");
        if (f36644a) {
            a().schedule(action, j10, TimeUnit.MILLISECONDS);
        } else {
            f36647d.a(action, j10);
        }
    }

    public final void postOnUiThreadTask(Runnable action, long j10) {
        e0.checkNotNullParameter(action, "action");
        f36645b.postDelayed(action, j10);
    }

    public final void postPublisherCallback(Runnable action, long j10) {
        e0.checkNotNullParameter(action, "action");
        f36649f.a(action, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, CountDownLatch latch) {
        e0.checkNotNullParameter(it, "$it");
        e0.checkNotNullParameter(latch, "$latch");
        it.run();
        a(latch);
    }

    private static final void a(CountDownLatch latch) {
        e0.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }
}
