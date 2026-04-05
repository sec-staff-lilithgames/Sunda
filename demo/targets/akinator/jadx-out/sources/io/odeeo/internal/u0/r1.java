package io.odeeo.internal.u0;

import io.odeeo.internal.u0.c3;
import io.odeeo.internal.u0.j1;
import io.odeeo.internal.u0.n1;
import io.odeeo.internal.u0.q1;
import io.odeeo.internal.u0.s1;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class r1<K, V> extends n1<K, V> implements d3<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: h, reason: collision with root package name */
    public final transient q1<V> f67032h;

    /* renamed from: i, reason: collision with root package name */
    public transient r1<V, K> f67033i;

    /* renamed from: j, reason: collision with root package name */
    public transient q1<Map.Entry<K, V>> f67034j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<K, V> extends n1.c<K, V> {
        @Override // io.odeeo.internal.u0.n1.c
        public Collection<V> a() {
            return r2.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c put(Object obj, Object obj2) {
            return put((a<K, V>) obj, obj2);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public r1<K, V> build() {
            Collection collectionEntrySet = this.f66969a.entrySet();
            Comparator<? super K> comparator = this.f66970b;
            if (comparator != null) {
                collectionEntrySet = p2.from(comparator).a().immutableSortedCopy(collectionEntrySet);
            }
            return r1.a(collectionEntrySet, this.f66971c);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> put(K k10, V v10) {
            super.put((a<K, V>) k10, (K) v10);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c putAll(Object obj, Iterable iterable) {
            return putAll((a<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c putAll(Object obj, Object[] objArr) {
            return putAll((a<K, V>) obj, objArr);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(K k10, Iterable<? extends V> iterable) {
            super.putAll((a<K, V>) k10, (Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(K k10, V... vArr) {
            return putAll((a<K, V>) k10, (Iterable) Arrays.asList(vArr));
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(e2<? extends K, ? extends V> e2Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : e2Var.asMap().entrySet()) {
                putAll((a<K, V>) entry.getKey(), (Iterable) entry.getValue());
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b<K, V> extends q1<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public final transient r1<K, V> f67035c;

        public b(r1<K, V> r1Var) {
            this.f67035c = r1Var;
        }

        @Override // io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f67035c.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // io.odeeo.internal.u0.d1
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f67035c.size();
        }

        @Override // io.odeeo.internal.u0.q1, io.odeeo.internal.u0.d1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public q3<Map.Entry<K, V>> iterator() {
            return this.f67035c.f();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c3.b<r1> f67036a = c3.a(r1.class, "emptySet");
    }

    public r1(j1<K, q1<V>> j1Var, int i10, Comparator<? super V> comparator) {
        super(j1Var, i10);
        this.f67032h = a(comparator);
    }

    public static <K, V> r1<K, V> a(e2<? extends K, ? extends V> e2Var, Comparator<? super V> comparator) {
        io.odeeo.internal.t0.u.checkNotNull(e2Var);
        if (e2Var.isEmpty() && comparator == null) {
            return of();
        }
        if (e2Var instanceof r1) {
            r1<K, V> r1Var = (r1) e2Var;
            if (!r1Var.l()) {
                return r1Var;
            }
        }
        return a(e2Var.asMap().entrySet(), comparator);
    }

    public static <V> q1.a<V> b(Comparator<? super V> comparator) {
        return comparator == null ? new q1.a<>() : new s1.a(comparator);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> r1<K, V> copyOf(e2<? extends K, ? extends V> e2Var) {
        return a(e2Var, (Comparator) null);
    }

    public static <K, V> r1<K, V> of() {
        return e0.f66725k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(a.b.e(i10, "Invalid key count "));
        }
        j1.b bVarBuilder = j1.builder();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException(a.b.e(i13, "Invalid value count "));
            }
            q1.a aVarB = b(comparator);
            for (int i14 = 0; i14 < i13; i14++) {
                aVarB.add((q1.a) objectInputStream.readObject());
            }
            q1 q1VarBuild = aVarB.build();
            if (q1VarBuild.size() != i13) {
                throw new InvalidObjectException(j1.o2.j(object, "Duplicate key-value pairs exist for key "));
            }
            bVarBuilder.put(object, q1VarBuild);
            i11 += i13;
        }
        try {
            n1.e.f66973a.a((c3.b<n1>) this, (Object) bVarBuilder.build());
            n1.e.f66974b.a((c3.b<n1>) this, i11);
            c.f67036a.a((c3.b<r1>) this, (Object) a(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        c3.a(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ d1 get(Object obj) {
        return get((r1<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r1<V, K> n() {
        a aVarBuilder = builder();
        q3 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.put((a) entry.getValue(), entry.getKey());
        }
        r1<V, K> r1VarBuild = aVarBuilder.build();
        r1VarBuild.f67033i = this;
        return r1VarBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ d1 replaceValues(Object obj, Iterable iterable) {
        return replaceValues((r1<K, V>) obj, iterable);
    }

    public Comparator<? super V> valueComparator() {
        q1<V> q1Var = this.f67032h;
        if (q1Var instanceof s1) {
            return ((s1) q1Var).comparator();
        }
        return null;
    }

    public static <K, V> r1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().putAll((Iterable) iterable).build();
    }

    public static <K, V> r1<K, V> of(K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((r1<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.n1
    public r1<V, K> inverse() {
        r1<V, K> r1Var = this.f67033i;
        if (r1Var != null) {
            return r1Var;
        }
        r1<V, K> r1VarN = n();
        this.f67033i = r1VarN;
        return r1VarN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((r1<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Set get(Object obj) {
        return get((r1<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ Set replaceValues(Object obj, Iterable iterable) {
        return replaceValues((r1<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2
    public q1<Map.Entry<K, V>> entries() {
        q1<Map.Entry<K, V>> q1Var = this.f67034j;
        if (q1Var != null) {
            return q1Var;
        }
        b bVar = new b(this);
        this.f67034j = bVar;
        return bVar;
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public q1<V> get(K k10) {
        return (q1) io.odeeo.internal.t0.o.firstNonNull((q1) this.f66960f.get(k10), this.f67032h);
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public q1<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public q1<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> r1<K, V> of(K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        return aVarBuilder.build();
    }

    public static <K, V> r1<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        j1.b bVar = new j1.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            q1 q1VarA = a(comparator, entry.getValue());
            if (!q1VarA.isEmpty()) {
                bVar.put(key, q1VarA);
                size += q1VarA.size();
            }
        }
        return new r1<>(bVar.build(), size, comparator);
    }

    public static <K, V> r1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        return aVarBuilder.build();
    }

    public static <K, V> r1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        aVarBuilder.put((a) k13, (K) v13);
        return aVarBuilder.build();
    }

    public static <V> q1<V> a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return q1.copyOf((Collection) collection);
        }
        return s1.copyOf((Comparator) comparator, (Collection) collection);
    }

    public static <K, V> r1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        aVarBuilder.put((a) k13, (K) v13);
        aVarBuilder.put((a) k14, (K) v14);
        return aVarBuilder.build();
    }

    public static <V> q1<V> a(Comparator<? super V> comparator) {
        if (comparator == null) {
            return q1.of();
        }
        return s1.a(comparator);
    }
}
