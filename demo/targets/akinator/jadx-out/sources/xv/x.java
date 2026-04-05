package xv;

import cw.q;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f93898a;

    /* renamed from: b, reason: collision with root package name */
    public int f93899b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f93900c;

    /* renamed from: d, reason: collision with root package name */
    public ExecutorService f93901d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f93902e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f93903f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f93904g;

    public x() {
        this.f93898a = 64;
        this.f93899b = 5;
        this.f93902e = new ArrayDeque();
        this.f93903f = new ArrayDeque();
        this.f93904g = new ArrayDeque();
    }

    @tu.f
    /* renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m8009deprecated_executorService() {
        return executorService();
    }

    public final q.a a(String str) {
        Iterator it = this.f93903f.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            q.a aVar = (q.a) it.next();
            if (kotlin.jvm.internal.e0.areEqual(aVar.getHost(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f93902e.iterator();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            q.a aVar2 = (q.a) it2.next();
            if (kotlin.jvm.internal.e0.areEqual(aVar2.getHost(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final void b(ArrayDeque arrayDeque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f93900c;
        }
        if (c() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final boolean c() {
        int i10;
        boolean z10;
        yv.i.assertLockNotHeld(this);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f93902e.iterator();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
                while (it.hasNext()) {
                    q.a aVar = (q.a) it.next();
                    if (this.f93903f.size() >= this.f93898a) {
                        break;
                    }
                    if (aVar.getCallsPerHost().get() < this.f93899b) {
                        it.remove();
                        aVar.getCallsPerHost().incrementAndGet();
                        kotlin.jvm.internal.e0.checkNotNull(aVar);
                        arrayList.add(aVar);
                        this.f93903f.add(aVar);
                    }
                }
                i10 = 0;
                z10 = runningCallsCount() > 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (executorService().isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                q.a aVar2 = (q.a) arrayList.get(i10);
                aVar2.getCallsPerHost().decrementAndGet();
                synchronized (this) {
                    this.f93903f.remove(aVar2);
                }
                q.a.failRejected$okhttp$default(aVar2, null, 1, null);
                i10++;
            }
            Runnable runnable = this.f93900c;
            if (runnable != null) {
                runnable.run();
                return z10;
            }
        } else {
            int size2 = arrayList.size();
            while (i10 < size2) {
                ((q.a) arrayList.get(i10)).executeOn(executorService());
                i10++;
            }
        }
        return z10;
    }

    public final synchronized void cancelAll() {
        try {
            Iterator it = this.f93902e.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ((q.a) it.next()).getCall().cancel();
            }
            Iterator it2 = this.f93903f.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                ((q.a) it2.next()).getCall().cancel();
            }
            Iterator it3 = this.f93904g.iterator();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(it3, "iterator(...)");
            while (it3.hasNext()) {
                ((cw.q) it3.next()).cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void enqueue$okhttp(q.a call) {
        q.a aVarA;
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        synchronized (this) {
            this.f93902e.add(call);
            if (!call.getCall().getForWebSocket() && (aVarA = a(call.getHost())) != null) {
                call.reuseCallsPerHostFrom(aVarA);
            }
        }
        c();
    }

    public final synchronized boolean executed$okhttp(cw.q call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        return this.f93904g.add(call);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        try {
            if (this.f93901d == null) {
                this.f93901d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), yv.i.threadFactory(yv.i.f96668b + " Dispatcher", false));
            }
            executorService = this.f93901d;
            kotlin.jvm.internal.e0.checkNotNull(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void finished$okhttp(q.a call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        call.getCallsPerHost().decrementAndGet();
        b(this.f93903f, call);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.f93900c;
    }

    public final synchronized int getMaxRequests() {
        return this.f93898a;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.f93899b;
    }

    public final synchronized List<j> queuedCalls() {
        List<j> listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f93902e;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(arrayDeque, 10));
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((q.a) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.f93902e.size();
    }

    public final synchronized List<j> runningCalls() {
        List<j> listUnmodifiableList;
        try {
            ArrayDeque arrayDeque = this.f93904g;
            ArrayDeque arrayDeque2 = this.f93903f;
            ArrayList arrayList = new ArrayList(uu.q0.collectionSizeOrDefault(arrayDeque2, 10));
            Iterator it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((q.a) it.next()).getCall());
            }
            listUnmodifiableList = Collections.unmodifiableList(uu.y0.plus((Collection) arrayDeque, (Iterable) arrayList));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        } catch (Throwable th2) {
            throw th2;
        }
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.f93903f.size() + this.f93904g.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.f93900c = runnable;
    }

    public final void setMaxRequests(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(a.b.e(i10, "max < 1: ").toString());
        }
        synchronized (this) {
            this.f93898a = i10;
        }
        c();
    }

    public final void setMaxRequestsPerHost(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException(a.b.e(i10, "max < 1: ").toString());
        }
        synchronized (this) {
            this.f93899b = i10;
        }
        c();
    }

    public final void finished$okhttp(cw.q call) {
        kotlin.jvm.internal.e0.checkNotNullParameter(call, "call");
        b(this.f93904g, call);
    }

    public x(ExecutorService executorService) {
        this();
        this.f93901d = executorService;
    }
}
