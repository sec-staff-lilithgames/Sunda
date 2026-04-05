package com.google.android.exoplayer2.util;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f28419a;

    /* renamed from: b, reason: collision with root package name */
    public final z f28420b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f28421c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f28422d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f28423e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f28424f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f28425g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f28426h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28427i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f28428a;

        /* renamed from: b, reason: collision with root package name */
        public o f28429b = new o();

        /* renamed from: c, reason: collision with root package name */
        public boolean f28430c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f28431d;

        public a(Object obj) {
            this.f28428a = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f28428a.equals(((a) obj).f28428a);
        }

        public int hashCode() {
            return this.f28428a.hashCode();
        }

        public void invoke(int i10, a0 a0Var) {
            if (this.f28431d) {
                return;
            }
            if (i10 != -1) {
                this.f28429b.add(i10);
            }
            this.f28430c = true;
            a0Var.invoke(this.f28428a);
        }

        public void iterationFinished(b0 b0Var) {
            if (this.f28431d || !this.f28430c) {
                return;
            }
            p pVarBuild = this.f28429b.build();
            this.f28429b = new o();
            this.f28430c = false;
            b0Var.invoke(this.f28428a, pVarBuild);
        }

        public void release(b0 b0Var) {
            this.f28431d = true;
            if (this.f28430c) {
                this.f28430c = false;
                b0Var.invoke(this.f28428a, this.f28429b.build());
            }
        }
    }

    public c0(Looper looper, d dVar, b0 b0Var) {
        this(new CopyOnWriteArraySet(), looper, dVar, b0Var, true);
    }

    public final void a() {
        if (this.f28427i) {
            com.google.android.exoplayer2.util.a.checkState(Thread.currentThread() == this.f28420b.getLooper().getThread());
        }
    }

    public void add(Object obj) {
        com.google.android.exoplayer2.util.a.checkNotNull(obj);
        synchronized (this.f28425g) {
            try {
                if (this.f28426h) {
                    return;
                }
                this.f28422d.add(new a(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        a();
        this.f28422d.clear();
    }

    public c0 copy(Looper looper, b0 b0Var) {
        return copy(looper, this.f28419a, b0Var);
    }

    public void flushEvents() {
        a();
        ArrayDeque arrayDeque = this.f28424f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        z zVar = this.f28420b;
        if (!zVar.hasMessages(0)) {
            zVar.sendMessageAtFrontOfQueue(zVar.obtainMessage(0));
        }
        ArrayDeque arrayDeque2 = this.f28423e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public void queueEvent(int i10, a0 a0Var) {
        a();
        this.f28424f.add(new androidx.browser.customtabs.h(new CopyOnWriteArraySet(this.f28422d), i10, a0Var, 3));
    }

    public void release() {
        a();
        synchronized (this.f28425g) {
            this.f28426h = true;
        }
        Iterator it = this.f28422d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).release(this.f28421c);
        }
        this.f28422d.clear();
    }

    public void remove(Object obj) {
        a();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f28422d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f28428a.equals(obj)) {
                aVar.release(this.f28421c);
                copyOnWriteArraySet.remove(aVar);
            }
        }
    }

    public void sendEvent(int i10, a0 a0Var) {
        queueEvent(i10, a0Var);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.f28427i = z10;
    }

    public int size() {
        a();
        return this.f28422d.size();
    }

    public c0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, d dVar, b0 b0Var, boolean z10) {
        this.f28419a = dVar;
        this.f28422d = copyOnWriteArraySet;
        this.f28421c = b0Var;
        this.f28425g = new Object();
        this.f28423e = new ArrayDeque();
        this.f28424f = new ArrayDeque();
        this.f28420b = ((d1) dVar).createHandler(looper, new af.f(this, 1));
        this.f28427i = z10;
    }

    public c0 copy(Looper looper, d dVar, b0 b0Var) {
        return new c0(this.f28422d, looper, dVar, b0Var, this.f28427i);
    }
}
