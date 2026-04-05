package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class q4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f15128h = new ga(0);

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f15129i = new ga(2);

    /* renamed from: b, reason: collision with root package name */
    private final String f15131b;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f15135f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f15136g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15130a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f15132c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f15133d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f15134e = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(Object obj);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(boolean z10, Object obj, Object obj2);
    }

    public q4(String str) {
        this.f15131b = str;
    }

    public String toString() {
        String str;
        if (!this.f15133d) {
            str = "Waiting";
        } else if (this.f15134e) {
            str = "Success -> " + this.f15135f;
        } else {
            str = "Failed -> " + this.f15136g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    public static q4 a(String str, Object obj) {
        return new q4(str).b(obj);
    }

    public q4 b(Object obj) {
        a(true, obj, (Object) null);
        return this;
    }

    public boolean c() {
        return this.f15133d;
    }

    public boolean d() {
        return this.f15133d && !this.f15134e;
    }

    private Runnable c(Executor executor, b bVar) {
        return new androidx.browser.customtabs.g(this, 20, executor, bVar);
    }

    public q4 a(Object obj) {
        a(false, (Object) null, obj);
        return this;
    }

    public String b() {
        String str = this.f15131b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new s8(22, this, bVar));
        } catch (Throwable th2) {
            a(th2);
        }
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new q9(runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z10, Object obj, Object obj2) {
        if (z10) {
            runnable.run();
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new q9(aVar, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z10, Object obj, Object obj2) {
        if (z10) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f15130a) {
            try {
                if (!this.f15133d) {
                    this.f15132c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object a() {
        k1.a(d());
        return this.f15136g;
    }

    private void a(boolean z10, Object obj, Object obj2) {
        synchronized (this.f15130a) {
            try {
                if (this.f15133d) {
                    return;
                }
                this.f15135f = obj;
                this.f15136g = obj2;
                this.f15134e = z10;
                this.f15133d = true;
                Iterator it = this.f15132c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f15132c.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f15134e, this.f15135f, this.f15136g);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    private void a(Throwable th2) {
        k1.a(th2);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.D0;
        if (kVar != null) {
            kVar.E().a("Promise", "PromiseCallback: " + b(), th2);
        }
    }
}
