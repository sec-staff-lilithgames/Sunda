package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class e<E> extends h<E> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient n2<E> f66717c;

    /* renamed from: d, reason: collision with root package name */
    public transient long f66718d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends e<E>.c<E> {
        public a() {
            super();
        }

        @Override // io.odeeo.internal.u0.e.c
        public E a(int i10) {
            return e.this.f66717c.c(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends e<E>.c<h2.a<E>> {
        public b() {
            super();
        }

        @Override // io.odeeo.internal.u0.e.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h2.a<E> a(int i10) {
            return e.this.f66717c.b(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f66721a;

        /* renamed from: b, reason: collision with root package name */
        public int f66722b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f66723c;

        public c() {
            this.f66721a = e.this.f66717c.a();
            this.f66723c = e.this.f66717c.f66981d;
        }

        public abstract T a(int i10);

        public final void a() {
            if (e.this.f66717c.f66981d != this.f66723c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f66721a >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tA = a(this.f66721a);
            int i10 = this.f66721a;
            this.f66722b = i10;
            this.f66721a = e.this.f66717c.h(i10);
            return tA;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            r.a(this.f66722b != -1);
            e.this.f66718d -= r0.f66717c.i(this.f66722b);
            this.f66721a = e.this.f66717c.a(this.f66721a, this.f66722b);
            this.f66722b = -1;
            this.f66723c = e.this.f66717c.f66981d;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iA = c3.a(objectInputStream);
        a(3);
        c3.a(this, objectInputStream, iA);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        c3.a(this, objectOutputStream);
    }

    public abstract void a(int i10);

    public void a(h2<? super E> h2Var) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        int iA = this.f66717c.a();
        while (iA >= 0) {
            h2Var.add(this.f66717c.c(iA), this.f66717c.d(iA));
            iA = this.f66717c.h(iA);
        }
    }

    @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
    public final int add(E e10, int i10) {
        if (i10 == 0) {
            return count(e10);
        }
        io.odeeo.internal.t0.u.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iA = this.f66717c.a(e10);
        if (iA == -1) {
            this.f66717c.put(e10, i10);
            this.f66718d += i10;
            return 0;
        }
        int iD = this.f66717c.d(iA);
        long j10 = i10;
        long j11 = iD + j10;
        io.odeeo.internal.t0.u.checkArgument(j11 <= 2147483647L, "too many occurrences: %s", j11);
        this.f66717c.b(iA, (int) j11);
        this.f66718d += j10;
        return iD;
    }

    @Override // io.odeeo.internal.u0.h
    public final int c() {
        return this.f66717c.c();
    }

    @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f66717c.clear();
        this.f66718d = 0L;
    }

    @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
    public final int count(Object obj) {
        return this.f66717c.get(obj);
    }

    @Override // io.odeeo.internal.u0.h
    public final Iterator<E> d() {
        return new a();
    }

    @Override // io.odeeo.internal.u0.h
    public final Iterator<h2.a<E>> e() {
        return new b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, io.odeeo.internal.u0.h2
    public final Iterator<E> iterator() {
        return i2.a((h2) this);
    }

    @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
    public final int remove(Object obj, int i10) {
        if (i10 == 0) {
            return count(obj);
        }
        io.odeeo.internal.t0.u.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iA = this.f66717c.a(obj);
        if (iA == -1) {
            return 0;
        }
        int iD = this.f66717c.d(iA);
        if (iD > i10) {
            this.f66717c.b(iA, iD - i10);
        } else {
            this.f66717c.i(iA);
            i10 = iD;
        }
        this.f66718d -= i10;
        return iD;
    }

    @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
    public final int setCount(E e10, int i10) {
        r.a(i10, "count");
        int iRemove = i10 == 0 ? this.f66717c.remove(e10) : this.f66717c.put(e10, i10);
        this.f66718d += i10 - iRemove;
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public final int size() {
        return io.odeeo.internal.w0.d.saturatedCast(this.f66718d);
    }

    @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
    public final boolean setCount(E e10, int i10, int i11) {
        r.a(i10, "oldCount");
        r.a(i11, "newCount");
        int iA = this.f66717c.a(e10);
        if (iA == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                this.f66717c.put(e10, i11);
                this.f66718d += i11;
            }
            return true;
        }
        if (this.f66717c.d(iA) != i10) {
            return false;
        }
        if (i11 == 0) {
            this.f66717c.i(iA);
            this.f66718d -= i10;
        } else {
            this.f66717c.b(iA, i11);
            this.f66718d += i11 - i10;
        }
        return true;
    }
}
