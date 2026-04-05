package com.bytedance.adsdk.jd;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class au<T> {
    public static Executor jpo = Executors.newCachedThreadPool();

    /* renamed from: cm, reason: collision with root package name */
    private final Handler f17226cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Set<ju<T>> f17227jd;
    private volatile Cif<T> my;
    private final Set<ju<Throwable>> wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class jpo extends FutureTask<Cif<T>> {
        public jpo(Callable<Cif<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                au.this.jpo((Cif) get());
            } catch (InterruptedException | ExecutionException e10) {
                au.this.jpo(new Cif(e10));
            }
        }
    }

    public au(Callable<Cif<T>> callable) {
        this(callable, false);
    }

    public synchronized au<T> cm(ju<Throwable> juVar) {
        this.wqx.remove(juVar);
        return this;
    }

    public synchronized au<T> jd(ju<T> juVar) {
        this.f17227jd.remove(juVar);
        return this;
    }

    public synchronized au<T> wqx(ju<Throwable> juVar) {
        try {
            Cif<T> cif = this.my;
            if (cif != null && cif.jd() != null) {
                juVar.jpo(cif.jd());
            }
            this.wqx.add(juVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public au(Callable<Cif<T>> callable, boolean z10) {
        this.f17227jd = new LinkedHashSet(1);
        this.wqx = new LinkedHashSet(1);
        this.f17226cm = new Handler(Looper.getMainLooper());
        this.my = null;
        if (!z10) {
            jpo.execute(new jpo(callable));
            return;
        }
        try {
            jpo((Cif) callable.call());
        } catch (Throwable th2) {
            jpo((Cif) new Cif<>(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Cif<T> cif) {
        if (this.my == null) {
            this.my = cif;
            jpo();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized au<T> jpo(ju<T> juVar) {
        try {
            Cif<T> cif = this.my;
            if (cif != null && cif.jpo() != null) {
                juVar.jpo(cif.jpo());
            }
            this.f17227jd.add(juVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    private void jpo() {
        this.f17226cm.post(new Runnable() { // from class: com.bytedance.adsdk.jd.au.1
            @Override // java.lang.Runnable
            public void run() {
                Cif cif = au.this.my;
                if (cif == null) {
                    return;
                }
                if (cif.jpo() != null) {
                    au.this.jpo((au) cif.jpo());
                } else {
                    au.this.jpo(cif.jd());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(T t10) {
        Iterator it = new ArrayList(this.f17227jd).iterator();
        while (it.hasNext()) {
            ((ju) it.next()).jpo(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.wqx);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ju) it.next()).jpo(th2);
        }
    }
}
