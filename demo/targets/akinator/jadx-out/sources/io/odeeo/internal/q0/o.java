package io.odeeo.internal.q0;

import android.os.Looper;
import android.os.Message;
import io.odeeo.internal.q0.l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o<T> {

    /* renamed from: a, reason: collision with root package name */
    public final d f65904a;

    /* renamed from: b, reason: collision with root package name */
    public final n f65905b;

    /* renamed from: c, reason: collision with root package name */
    public final b<T> f65906c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T>> f65907d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque<Runnable> f65908e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque<Runnable> f65909f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65910g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a<T> {
        void invoke(T t10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b<T> {
        void invoke(T t10, l lVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f65911a;

        /* renamed from: b, reason: collision with root package name */
        public l.b f65912b = new l.b();

        /* renamed from: c, reason: collision with root package name */
        public boolean f65913c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f65914d;

        public c(T t10) {
            this.f65911a = t10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f65911a.equals(((c) obj).f65911a);
        }

        public int hashCode() {
            return this.f65911a.hashCode();
        }

        public void invoke(int i10, a<T> aVar) {
            if (this.f65914d) {
                return;
            }
            if (i10 != -1) {
                this.f65912b.add(i10);
            }
            this.f65913c = true;
            aVar.invoke(this.f65911a);
        }

        public void iterationFinished(b<T> bVar) {
            if (this.f65914d || !this.f65913c) {
                return;
            }
            l lVarBuild = this.f65912b.build();
            this.f65912b = new l.b();
            this.f65913c = false;
            bVar.invoke(this.f65911a, lVarBuild);
        }

        public void release(b<T> bVar) {
            this.f65914d = true;
            if (this.f65913c) {
                bVar.invoke(this.f65911a, this.f65912b.build());
            }
        }
    }

    public o(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).invoke(i10, aVar);
        }
    }

    public void add(T t10) {
        if (this.f65910g) {
            return;
        }
        io.odeeo.internal.q0.a.checkNotNull(t10);
        this.f65907d.add(new c<>(t10));
    }

    public o<T> copy(Looper looper, b<T> bVar) {
        return new o<>(this.f65907d, looper, this.f65904a, bVar);
    }

    public void flushEvents() {
        if (this.f65909f.isEmpty()) {
            return;
        }
        if (!this.f65905b.hasMessages(0)) {
            n nVar = this.f65905b;
            nVar.sendMessageAtFrontOfQueue(nVar.obtainMessage(0));
        }
        boolean zIsEmpty = this.f65908e.isEmpty();
        this.f65908e.addAll(this.f65909f);
        this.f65909f.clear();
        if (zIsEmpty) {
            while (!this.f65908e.isEmpty()) {
                this.f65908e.peekFirst().run();
                this.f65908e.removeFirst();
            }
        }
    }

    public void queueEvent(int i10, a<T> aVar) {
        this.f65909f.add(new androidx.browser.customtabs.h(new CopyOnWriteArraySet(this.f65907d), i10, aVar, 4));
    }

    public void release() {
        Iterator<c<T>> it = this.f65907d.iterator();
        while (it.hasNext()) {
            it.next().release(this.f65906c);
        }
        this.f65907d.clear();
        this.f65910g = true;
    }

    public void remove(T t10) {
        Iterator<c<T>> it = this.f65907d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            if (next.f65911a.equals(t10)) {
                next.release(this.f65906c);
                this.f65907d.remove(next);
            }
        }
    }

    public void sendEvent(int i10, a<T> aVar) {
        queueEvent(i10, aVar);
        flushEvents();
    }

    public int size() {
        return this.f65907d.size();
    }

    public o(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f65904a = dVar;
        this.f65907d = copyOnWriteArraySet;
        this.f65906c = bVar;
        this.f65908e = new ArrayDeque<>();
        this.f65909f = new ArrayDeque<>();
        this.f65905b = dVar.createHandler(looper, new af.f(this, 2));
    }

    public final boolean a(Message message) {
        Iterator<c<T>> it = this.f65907d.iterator();
        while (it.hasNext()) {
            it.next().iterationFinished(this.f65906c);
            if (this.f65905b.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }
}
