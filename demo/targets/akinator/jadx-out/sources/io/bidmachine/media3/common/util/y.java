package io.bidmachine.media3.common.util;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final g f60807a;

    /* renamed from: b, reason: collision with root package name */
    public final v f60808b;

    /* renamed from: c, reason: collision with root package name */
    public final x f60809c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f60810d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f60811e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f60812f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f60813g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f60814h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f60815i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f60816a;

        /* renamed from: b, reason: collision with root package name */
        public gn.u f60817b = new gn.u();

        /* renamed from: c, reason: collision with root package name */
        public boolean f60818c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f60819d;

        public a(Object obj) {
            this.f60816a = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return this.f60816a.equals(((a) obj).f60816a);
        }

        public int hashCode() {
            return this.f60816a.hashCode();
        }

        public void invoke(int i10, w wVar) {
            if (this.f60819d) {
                return;
            }
            if (i10 != -1) {
                this.f60817b.add(i10);
            }
            this.f60818c = true;
            wVar.invoke(this.f60816a);
        }

        public void iterationFinished(x xVar) {
            if (this.f60819d || !this.f60818c) {
                return;
            }
            gn.v vVarBuild = this.f60817b.build();
            this.f60817b = new gn.u();
            this.f60818c = false;
            xVar.invoke(this.f60816a, vVarBuild);
        }

        public void release(x xVar) {
            this.f60819d = true;
            if (this.f60818c) {
                this.f60818c = false;
                xVar.invoke(this.f60816a, this.f60817b.build());
            }
        }
    }

    public y(Looper looper, g gVar, x xVar) {
        this(new CopyOnWriteArraySet(), looper, gVar, xVar, true);
    }

    public final void a() {
        if (this.f60815i) {
            io.bidmachine.media3.common.util.a.checkState(Thread.currentThread() == this.f60808b.getLooper().getThread());
        }
    }

    public void add(Object obj) {
        io.bidmachine.media3.common.util.a.checkNotNull(obj);
        synchronized (this.f60813g) {
            try {
                if (this.f60814h) {
                    return;
                }
                this.f60810d.add(new a(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void clear() {
        a();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f60810d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).release(this.f60809c);
        }
        copyOnWriteArraySet.clear();
    }

    public y copy(Looper looper, x xVar) {
        return copy(looper, this.f60807a, xVar);
    }

    public void flushEvents() {
        a();
        ArrayDeque arrayDeque = this.f60812f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        v vVar = this.f60808b;
        if (!vVar.hasMessages(1)) {
            vVar.sendMessageAtFrontOfQueue(vVar.obtainMessage(1));
        }
        ArrayDeque arrayDeque2 = this.f60811e;
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

    public void queueEvent(int i10, w wVar) {
        a();
        this.f60812f.add(new androidx.browser.customtabs.h(new CopyOnWriteArraySet(this.f60810d), i10, wVar, 8));
    }

    public void release() {
        a();
        synchronized (this.f60813g) {
            this.f60814h = true;
        }
        Iterator it = this.f60810d.iterator();
        while (it.hasNext()) {
            ((a) it.next()).release(this.f60809c);
        }
        this.f60810d.clear();
    }

    public void remove(Object obj) {
        a();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f60810d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f60816a.equals(obj)) {
                aVar.release(this.f60809c);
                copyOnWriteArraySet.remove(aVar);
            }
        }
    }

    public void sendEvent(int i10, w wVar) {
        queueEvent(i10, wVar);
        flushEvents();
    }

    @Deprecated
    public void setThrowsWhenUsingWrongThread(boolean z10) {
        this.f60815i = z10;
    }

    public int size() {
        a();
        return this.f60810d.size();
    }

    public y(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, g gVar, x xVar, boolean z10) {
        this.f60807a = gVar;
        this.f60810d = copyOnWriteArraySet;
        this.f60809c = xVar;
        this.f60813g = new Object();
        this.f60811e = new ArrayDeque();
        this.f60812f = new ArrayDeque();
        this.f60808b = ((q0) gVar).createHandler(looper, new af.f(this, 3));
        this.f60815i = z10;
    }

    public y copy(Looper looper, g gVar, x xVar) {
        return new y(this.f60810d, looper, gVar, xVar, this.f60815i);
    }
}
