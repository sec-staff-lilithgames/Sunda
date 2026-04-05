package io.odeeo.internal.u0;

import io.odeeo.internal.u0.e3;
import io.odeeo.internal.u0.h2;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i2 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a<E> extends m<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2 f66859c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2 f66860d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: io.odeeo.internal.u0.i2$a$a, reason: collision with other inner class name */
        public class C0670a extends io.odeeo.internal.u0.b<h2.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66861c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f66862d;

            public C0670a(Iterator it, Iterator it2) {
                this.f66861c = it;
                this.f66862d = it2;
            }

            @Override // io.odeeo.internal.u0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h2.a<E> computeNext() {
                if (this.f66861c.hasNext()) {
                    h2.a aVar = (h2.a) this.f66861c.next();
                    Object element = aVar.getElement();
                    return i2.immutableEntry(element, Math.max(aVar.getCount(), a.this.f66860d.count(element)));
                }
                while (this.f66862d.hasNext()) {
                    h2.a aVar2 = (h2.a) this.f66862d.next();
                    Object element2 = aVar2.getElement();
                    if (!a.this.f66859c.contains(element2)) {
                        return i2.immutableEntry(element2, aVar2.getCount());
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h2 h2Var, h2 h2Var2) {
            super(null);
            this.f66859c = h2Var;
            this.f66860d = h2Var2;
        }

        @Override // io.odeeo.internal.u0.h
        public Set<E> a() {
            return e3.union(this.f66859c.elementSet(), this.f66860d.elementSet());
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean contains(Object obj) {
            return this.f66859c.contains(obj) || this.f66860d.contains(obj);
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            return Math.max(this.f66859c.count(obj), this.f66860d.count(obj));
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<E> d() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<E>> e() {
            return new C0670a(this.f66859c.entrySet().iterator(), this.f66860d.entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f66859c.isEmpty() && this.f66860d.isEmpty();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b<E> extends m<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2 f66864c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2 f66865d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<h2.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66866c;

            public a(Iterator it) {
                this.f66866c = it;
            }

            @Override // io.odeeo.internal.u0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h2.a<E> computeNext() {
                while (this.f66866c.hasNext()) {
                    h2.a aVar = (h2.a) this.f66866c.next();
                    Object element = aVar.getElement();
                    int iMin = Math.min(aVar.getCount(), b.this.f66865d.count(element));
                    if (iMin > 0) {
                        return i2.immutableEntry(element, iMin);
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h2 h2Var, h2 h2Var2) {
            super(null);
            this.f66864c = h2Var;
            this.f66865d = h2Var2;
        }

        @Override // io.odeeo.internal.u0.h
        public Set<E> a() {
            return e3.intersection(this.f66864c.elementSet(), this.f66865d.elementSet());
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            int iCount = this.f66864c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.min(iCount, this.f66865d.count(obj));
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<E> d() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<E>> e() {
            return new a(this.f66864c.entrySet().iterator());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c<E> extends m<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2 f66868c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2 f66869d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<h2.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66870c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Iterator f66871d;

            public a(Iterator it, Iterator it2) {
                this.f66870c = it;
                this.f66871d = it2;
            }

            @Override // io.odeeo.internal.u0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h2.a<E> computeNext() {
                if (this.f66870c.hasNext()) {
                    h2.a aVar = (h2.a) this.f66870c.next();
                    Object element = aVar.getElement();
                    return i2.immutableEntry(element, c.this.f66869d.count(element) + aVar.getCount());
                }
                while (this.f66871d.hasNext()) {
                    h2.a aVar2 = (h2.a) this.f66871d.next();
                    Object element2 = aVar2.getElement();
                    if (!c.this.f66868c.contains(element2)) {
                        return i2.immutableEntry(element2, aVar2.getCount());
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h2 h2Var, h2 h2Var2) {
            super(null);
            this.f66868c = h2Var;
            this.f66869d = h2Var2;
        }

        @Override // io.odeeo.internal.u0.h
        public Set<E> a() {
            return e3.union(this.f66868c.elementSet(), this.f66869d.elementSet());
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean contains(Object obj) {
            return this.f66868c.contains(obj) || this.f66869d.contains(obj);
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            return this.f66869d.count(obj) + this.f66868c.count(obj);
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<E> d() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<E>> e() {
            return new a(this.f66868c.entrySet().iterator(), this.f66869d.entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f66868c.isEmpty() && this.f66869d.isEmpty();
        }

        @Override // io.odeeo.internal.u0.i2.m, java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public int size() {
            return io.odeeo.internal.v0.a.saturatedAdd(this.f66868c.size(), this.f66869d.size());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d<E> extends m<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h2 f66873c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h2 f66874d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends io.odeeo.internal.u0.b<E> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66875c;

            public a(Iterator it) {
                this.f66875c = it;
            }

            @Override // io.odeeo.internal.u0.b
            public E computeNext() {
                while (this.f66875c.hasNext()) {
                    h2.a aVar = (h2.a) this.f66875c.next();
                    E e10 = (E) aVar.getElement();
                    if (aVar.getCount() > d.this.f66874d.count(e10)) {
                        return e10;
                    }
                }
                return a();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b extends io.odeeo.internal.u0.b<h2.a<E>> {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f66877c;

            public b(Iterator it) {
                this.f66877c = it;
            }

            @Override // io.odeeo.internal.u0.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h2.a<E> computeNext() {
                while (this.f66877c.hasNext()) {
                    h2.a aVar = (h2.a) this.f66877c.next();
                    Object element = aVar.getElement();
                    int count = aVar.getCount() - d.this.f66874d.count(element);
                    if (count > 0) {
                        return i2.immutableEntry(element, count);
                    }
                }
                return a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h2 h2Var, h2 h2Var2) {
            super(null);
            this.f66873c = h2Var;
            this.f66874d = h2Var2;
        }

        @Override // io.odeeo.internal.u0.i2.m, io.odeeo.internal.u0.h
        public int c() {
            return w1.size(e());
        }

        @Override // io.odeeo.internal.u0.i2.m, io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            int iCount = this.f66873c.count(obj);
            if (iCount == 0) {
                return 0;
            }
            return Math.max(0, iCount - this.f66874d.count(obj));
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<E> d() {
            return new a(this.f66873c.entrySet().iterator());
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<E>> e() {
            return new b(this.f66873c.entrySet().iterator());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class e<E> implements h2.a<E> {
        @Override // io.odeeo.internal.u0.h2.a
        public boolean equals(Object obj) {
            if (obj instanceof h2.a) {
                h2.a aVar = (h2.a) obj;
                if (getCount() == aVar.getCount() && io.odeeo.internal.t0.p.equal(getElement(), aVar.getElement())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.odeeo.internal.u0.h2.a
        public abstract /* synthetic */ int getCount();

        @Override // io.odeeo.internal.u0.h2.a
        public abstract /* synthetic */ Object getElement();

        @Override // io.odeeo.internal.u0.h2.a
        public int hashCode() {
            Object element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // io.odeeo.internal.u0.h2.a
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            return count == 1 ? strValueOf : j1.o2.g(count, strValueOf, " x ");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements Comparator<h2.a<?>> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f66879a = new f();

        @Override // java.util.Comparator
        public int compare(h2.a<?> aVar, h2.a<?> aVar2) {
            return aVar2.getCount() - aVar.getCount();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class g<E> extends e3.j<E> {
        public abstract h2<E> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return a().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return a().remove(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().entrySet().size();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class h<E> extends e3.j<h2.a<E>> {
        public abstract h2<E> a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof h2.a) {
                h2.a aVar = (h2.a) obj;
                if (aVar.getCount() > 0 && a().count(aVar.getElement()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof h2.a) {
                h2.a aVar = (h2.a) obj;
                Object element = aVar.getElement();
                int count = aVar.getCount();
                if (count != 0) {
                    return a().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i<E> extends m<E> {

        /* renamed from: c, reason: collision with root package name */
        public final h2<E> f66880c;

        /* renamed from: d, reason: collision with root package name */
        public final io.odeeo.internal.t0.v<? super E> f66881d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements io.odeeo.internal.t0.v<h2.a<E>> {
            public a() {
            }

            @Override // io.odeeo.internal.t0.v
            public boolean apply(h2.a<E> aVar) {
                return i.this.f66881d.apply(aVar.getElement());
            }
        }

        public i(h2<E> h2Var, io.odeeo.internal.t0.v<? super E> vVar) {
            super(null);
            this.f66880c = (h2) io.odeeo.internal.t0.u.checkNotNull(h2Var);
            this.f66881d = (io.odeeo.internal.t0.v) io.odeeo.internal.t0.u.checkNotNull(vVar);
        }

        @Override // io.odeeo.internal.u0.h
        public Set<E> a() {
            return e3.filter(this.f66880c.elementSet(), this.f66881d);
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int add(E e10, int i10) {
            io.odeeo.internal.t0.u.checkArgument(this.f66881d.apply(e10), "Element %s does not match predicate %s", e10, this.f66881d);
            return this.f66880c.add(e10, i10);
        }

        @Override // io.odeeo.internal.u0.h
        public Set<h2.a<E>> b() {
            return e3.filter(this.f66880c.entrySet(), new a());
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int count(Object obj) {
            int iCount = this.f66880c.count(obj);
            if (iCount <= 0 || !this.f66881d.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<E> d() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h
        public Iterator<h2.a<E>> e() {
            throw new AssertionError("should never be called");
        }

        @Override // io.odeeo.internal.u0.h, io.odeeo.internal.u0.h2
        public int remove(Object obj, int i10) {
            r.a(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.f66880c.remove(obj, i10);
            }
            return 0;
        }

        @Override // io.odeeo.internal.u0.i2.m, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, io.odeeo.internal.u0.h2
        public q3<E> iterator() {
            return w1.filter(this.f66880c.iterator(), this.f66881d);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j<E> extends e<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final E f66883a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66884b;

        public j(E e10, int i10) {
            this.f66883a = e10;
            this.f66884b = i10;
            r.a(i10, "count");
        }

        @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
        public final int getCount() {
            return this.f66884b;
        }

        @Override // io.odeeo.internal.u0.i2.e, io.odeeo.internal.u0.h2.a
        public final E getElement() {
            return this.f66883a;
        }

        public j<E> nextInBucket() {
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k<E> implements Iterator<E> {

        /* renamed from: a, reason: collision with root package name */
        public final h2<E> f66885a;

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<h2.a<E>> f66886b;

        /* renamed from: c, reason: collision with root package name */
        public h2.a<E> f66887c;

        /* renamed from: d, reason: collision with root package name */
        public int f66888d;

        /* renamed from: e, reason: collision with root package name */
        public int f66889e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f66890f;

        public k(h2<E> h2Var, Iterator<h2.a<E>> it) {
            this.f66885a = h2Var;
            this.f66886b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66888d > 0 || this.f66886b.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f66888d == 0) {
                h2.a<E> next = this.f66886b.next();
                this.f66887c = next;
                int count = next.getCount();
                this.f66888d = count;
                this.f66889e = count;
            }
            this.f66888d--;
            this.f66890f = true;
            return this.f66887c.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            r.a(this.f66890f);
            if (this.f66889e == 1) {
                this.f66886b.remove();
            } else {
                this.f66885a.remove(this.f66887c.getElement());
            }
            this.f66889e--;
            this.f66890f = false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class l<E> extends v0<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final h2<? extends E> f66891a;

        /* renamed from: b, reason: collision with root package name */
        public transient Set<E> f66892b;

        /* renamed from: c, reason: collision with root package name */
        public transient Set<h2.a<E>> f66893c;

        public l(h2<? extends E> h2Var) {
            this.f66891a = h2Var;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.p0, io.odeeo.internal.u0.x0
        /* renamed from: c */
        public h2<E> delegate() {
            return this.f66891a;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> d() {
            return Collections.unmodifiableSet(this.f66891a.elementSet());
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public Set<E> elementSet() {
            Set<E> set = this.f66892b;
            if (set != null) {
                return set;
            }
            Set<E> setD = d();
            this.f66892b = setD;
            return setD;
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public Set<h2.a<E>> entrySet() {
            Set<h2.a<E>> set = this.f66893c;
            if (set != null) {
                return set;
            }
            Set<h2.a<E>> setUnmodifiableSet = Collections.unmodifiableSet(this.f66891a.entrySet());
            this.f66893c = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return w1.unmodifiableIterator(this.f66891a.iterator());
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.p0, java.util.Collection, io.odeeo.internal.u0.h2
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public int setCount(E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public int add(E e10, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public int remove(Object obj, int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.u0.v0, io.odeeo.internal.u0.h2
        public boolean setCount(E e10, int i10, int i11) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class m<E> extends io.odeeo.internal.u0.h<E> {
        public m() {
        }

        @Override // io.odeeo.internal.u0.h
        public int c() {
            return elementSet().size();
        }

        @Override // io.odeeo.internal.u0.h, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, io.odeeo.internal.u0.h2
        public Iterator<E> iterator() {
            return i2.a((h2) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, io.odeeo.internal.u0.h2
        public int size() {
            return i2.b((h2<?>) this);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    public static boolean a(h2<?> h2Var, Object obj) {
        if (obj == h2Var) {
            return true;
        }
        if (obj instanceof h2) {
            h2 h2Var2 = (h2) obj;
            if (h2Var.size() == h2Var2.size() && h2Var.entrySet().size() == h2Var2.entrySet().size()) {
                for (h2.a aVar : h2Var2.entrySet()) {
                    if (h2Var.count(aVar.getElement()) != aVar.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int b(Iterable<?> iterable) {
        if (iterable instanceof h2) {
            return ((h2) iterable).elementSet().size();
        }
        return 11;
    }

    public static boolean c(h2<?> h2Var, Collection<?> collection) {
        io.odeeo.internal.t0.u.checkNotNull(collection);
        if (collection instanceof h2) {
            collection = ((h2) collection).elementSet();
        }
        return h2Var.elementSet().retainAll(collection);
    }

    public static boolean containsOccurrences(h2<?> h2Var, h2<?> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        for (h2.a<?> aVar : h2Var2.entrySet()) {
            if (h2Var.count(aVar.getElement()) < aVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> o1<E> copyHighestCountFirst(h2<E> h2Var) {
        h2.a[] aVarArr = (h2.a[]) h2Var.entrySet().toArray(new h2.a[0]);
        Arrays.sort(aVarArr, f.f66879a);
        return o1.a(Arrays.asList(aVarArr));
    }

    public static <E> h2<E> difference(h2<E> h2Var, h2<?> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        return new d(h2Var, h2Var2);
    }

    public static <E> h2<E> filter(h2<E> h2Var, io.odeeo.internal.t0.v<? super E> vVar) {
        if (!(h2Var instanceof i)) {
            return new i(h2Var, vVar);
        }
        i iVar = (i) h2Var;
        return new i(iVar.f66880c, io.odeeo.internal.t0.w.and(iVar.f66881d, vVar));
    }

    public static <E> h2.a<E> immutableEntry(E e10, int i10) {
        return new j(e10, i10);
    }

    public static <E> h2<E> intersection(h2<E> h2Var, h2<?> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        return new b(h2Var, h2Var2);
    }

    public static boolean removeOccurrences(h2<?> h2Var, Iterable<?> iterable) {
        if (iterable instanceof h2) {
            return removeOccurrences(h2Var, (h2<?>) iterable);
        }
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= h2Var.remove(it.next());
        }
        return zRemove;
    }

    public static boolean retainOccurrences(h2<?> h2Var, h2<?> h2Var2) {
        return b((h2) h2Var, h2Var2);
    }

    public static <E> h2<E> sum(h2<? extends E> h2Var, h2<? extends E> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        return new c(h2Var, h2Var2);
    }

    public static <E> h2<E> union(h2<? extends E> h2Var, h2<? extends E> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        return new a(h2Var, h2Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> h2<E> unmodifiableMultiset(h2<? extends E> h2Var) {
        return ((h2Var instanceof l) || (h2Var instanceof o1)) ? h2Var : new l((h2) io.odeeo.internal.t0.u.checkNotNull(h2Var));
    }

    public static <E> j3<E> unmodifiableSortedMultiset(j3<E> j3Var) {
        return new s3((j3) io.odeeo.internal.t0.u.checkNotNull(j3Var));
    }

    public static <E> boolean b(h2<E> h2Var, h2<?> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        Iterator<h2.a<E>> it = h2Var.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            h2.a<E> next = it.next();
            int iCount = h2Var2.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                h2Var.setCount(next.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }

    @Deprecated
    public static <E> h2<E> unmodifiableMultiset(o1<E> o1Var) {
        return (h2) io.odeeo.internal.t0.u.checkNotNull(o1Var);
    }

    public static <E> boolean a(h2<E> h2Var, Collection<? extends E> collection) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(collection);
        if (collection instanceof h2) {
            return a((h2) h2Var, a(collection));
        }
        if (collection.isEmpty()) {
            return false;
        }
        return w1.addAll(h2Var, collection.iterator());
    }

    public static boolean removeOccurrences(h2<?> h2Var, h2<?> h2Var2) {
        io.odeeo.internal.t0.u.checkNotNull(h2Var);
        io.odeeo.internal.t0.u.checkNotNull(h2Var2);
        Iterator<h2.a<?>> it = h2Var.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            h2.a<?> next = it.next();
            int iCount = h2Var2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                h2Var.remove(next.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }

    public static <E> boolean a(h2<E> h2Var, h2<? extends E> h2Var2) {
        if (h2Var2 instanceof io.odeeo.internal.u0.e) {
            return a((h2) h2Var, (io.odeeo.internal.u0.e) h2Var2);
        }
        if (h2Var2.isEmpty()) {
            return false;
        }
        for (h2.a<? extends E> aVar : h2Var2.entrySet()) {
            h2Var.add(aVar.getElement(), aVar.getCount());
        }
        return true;
    }

    public static boolean b(h2<?> h2Var, Collection<?> collection) {
        if (collection instanceof h2) {
            collection = ((h2) collection).elementSet();
        }
        return h2Var.elementSet().removeAll(collection);
    }

    public static int b(h2<?> h2Var) {
        long count = 0;
        while (h2Var.entrySet().iterator().hasNext()) {
            count += r4.next().getCount();
        }
        return io.odeeo.internal.w0.d.saturatedCast(count);
    }

    public static <E> boolean a(h2<E> h2Var, io.odeeo.internal.u0.e<? extends E> eVar) {
        if (eVar.isEmpty()) {
            return false;
        }
        eVar.a((h2<? super Object>) h2Var);
        return true;
    }

    public static <E> int a(h2<E> h2Var, E e10, int i10) {
        r.a(i10, "count");
        int iCount = h2Var.count(e10);
        int i11 = i10 - iCount;
        if (i11 > 0) {
            h2Var.add(e10, i11);
            return iCount;
        }
        if (i11 < 0) {
            h2Var.remove(e10, -i11);
        }
        return iCount;
    }

    public static <E> boolean a(h2<E> h2Var, E e10, int i10, int i11) {
        r.a(i10, "oldCount");
        r.a(i11, "newCount");
        if (h2Var.count(e10) != i10) {
            return false;
        }
        h2Var.setCount(e10, i11);
        return true;
    }

    public static <E> Iterator<E> a(h2<E> h2Var) {
        return new k(h2Var, h2Var.entrySet().iterator());
    }

    public static <T> h2<T> a(Iterable<T> iterable) {
        return (h2) iterable;
    }
}
