package io.odeeo.internal.u0;

import io.odeeo.internal.u0.h2;
import io.odeeo.internal.u0.o1;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x2<E> extends o1<E> {

    /* renamed from: g, reason: collision with root package name */
    public static final x2<Object> f67185g = new x2<>(n2.create());

    /* renamed from: d, reason: collision with root package name */
    public final transient n2<E> f67186d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f67187e;

    /* renamed from: f, reason: collision with root package name */
    public transient q1<E> f67188f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b extends u1<E> {
        public b() {
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return x2.this.contains(obj);
        }

        @Override // io.odeeo.internal.u0.u1
        public E get(int i10) {
            return x2.this.f67186d.c(i10);
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x2.this.f67186d.c();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f67190a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f67191b;

        public c(h2<?> h2Var) {
            int size = h2Var.entrySet().size();
            this.f67190a = new Object[size];
            this.f67191b = new int[size];
            int i10 = 0;
            for (h2.a<?> aVar : h2Var.entrySet()) {
                this.f67190a[i10] = aVar.getElement();
                this.f67191b[i10] = aVar.getCount();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            o1.b bVar = new o1.b(this.f67190a.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.f67190a;
                if (i10 >= objArr.length) {
                    return bVar.build();
                }
                bVar.addCopies(objArr[i10], this.f67191b[i10]);
                i10++;
            }
        }
    }

    public x2(n2<E> n2Var) {
        this.f67186d = n2Var;
        long jD = 0;
        for (int i10 = 0; i10 < n2Var.c(); i10++) {
            jD += n2Var.d(i10);
        }
        this.f67187e = io.odeeo.internal.w0.d.saturatedCast(jD);
    }

    @Override // io.odeeo.internal.u0.o1
    public h2.a<E> a(int i10) {
        return this.f67186d.b(i10);
    }

    @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.h2
    public int count(Object obj) {
        return this.f67186d.get(obj);
    }

    @Override // io.odeeo.internal.u0.d1
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
    public int size() {
        return this.f67187e;
    }

    @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.d1
    public Object writeReplace() {
        return new c(this);
    }

    @Override // io.odeeo.internal.u0.o1, io.odeeo.internal.u0.h2
    public q1<E> elementSet() {
        q1<E> q1Var = this.f67188f;
        if (q1Var != null) {
            return q1Var;
        }
        b bVar = new b();
        this.f67188f = bVar;
        return bVar;
    }
}
